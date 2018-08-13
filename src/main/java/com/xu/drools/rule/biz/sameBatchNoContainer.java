package com.xu.drools.rule.biz;

import com.xu.drools.entity.Container;
import com.xu.drools.entity.Item;
import com.xu.drools.entity.Operation;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用kmodule的方式调用drools
 * /resources/META-INF/kmodule.xml
 */
public class sameBatchNoContainer {

	public static void main(final String[] args) {
		KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
		System.out.println("------------------------------------------------rule : sameBatchNoContainer");
		System.out.println(kc.verify().getMessages().toString());
		execute(kc);
	}

	private static void execute(KieContainer kc) {
		KieSession ksession = kc.newKieSession("bizKS");

		//
		Container container = new Container();
		container.setIdentify("容器");

		Item item1 = new Item("1排1列", "2010-01-01");
		Item item2 = new Item("1排1列", "2010-01-01");
		Item item3 = new Item("1排1列", "2010-01-01");
		List list = new ArrayList();
		list.add(item1);
		list.add(item2);
		list.add(item3);
		container.setItemList(list);

		Item sameBatch = new Item("1排1列", "2010-01-01");
		Item diffBatch = new Item("1排1列", "2010-01-02");


		Operation op = new Operation();
		op.setOperation(Boolean.FALSE);

		ksession.insert(container);
		ksession.insert(sameBatch);
		ksession.insert(op);
		ksession.fireAllRules();

//		QueryResults results = ksession.getQueryResults("op");
		System.out.println("op: " + op.toString());
		ksession.dispose();
	}
}
