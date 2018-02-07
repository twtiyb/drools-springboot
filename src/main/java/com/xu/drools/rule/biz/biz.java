package com.xu.drools.rule.biz;

import com.xu.drools.bean.Trade;
import com.xu.drools.bean.TradeRequest;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;

/**
 * 使用kmodule的方式调用drools
 * /resources/META-INF/kmodule.xml
 */
public class biz {

    public static void main(final String[] args) {
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        System.out.println("------------------------------------------------rule_1");
        System.out.println(kc.verify().getMessages().toString());
        execute(kc);
    }

    private static void execute(KieContainer kc) {
        //定义规则模板
//        TemplateRule templateRule = new TemplateRule();
//        templateRule.setDes("满${total_fee}减${add_fee}");
//        templateRule.setParamJson("{\n" +
//                "\t“total_fee”:0\n" +
//                "\t\"add_fee\":0\n" +
//                "}");
//        templateRule.setDevRuleName("package.order.xxx.drl");
//        templateRule.setName("xxx");
//        templateRule.setTemplateId("1");
//
//
//        //用户规则
//        UserRule userRule = new UserRule();
//        userRule.setRuleId("1");
//        userRule.setUserId("小贝壳");
//
//        List<UserRuleDetail> ruleDetailList = new ArrayList<>();
//        UserRuleDetail detail = new UserRuleDetail();
//
//        detail.setParamJson("{\n" +
//                "\t“total_fee”:300\n" +
//                "\t\"add_fee\":-29\n" +
//                "}");
//        detail.setRule(templateRule);
//        ruleDetailList.add(detail);
//
//        userRule.setDetailList(ruleDetailList);



        KieSession ksession = kc.newKieSession("bizKS");

        Trade trade1 = new Trade();
        trade1.setSellerId("1");
        trade1.setTotalFee(600D);
        trade1.setTradeId("1");
        System.out.println("之前："+trade1.getTotalFee());
//        Trade trade2 = new Trade();
//        trade2.setSellerId("1");
//        trade2.setTotalFee(200D);
//        trade2.setTradeId("1");

        TradeRequest request = new TradeRequest();
        request.setTotolFee(500D);
        request.setAdd_fee(-100D);
        request.setNum(0);

//        TradeRequest request2 = new TradeRequest();
//        request2.setTotolFee(300D);
//        request2.setAdd_fee(-50D);
//
//        TradeRequest request3 = new TradeRequest();
//        request3.setTotolFee(100D);
//        request3.setAdd_fee(-10D);

        ksession.insert(trade1);
//        ksession.insert(trade2);
        ksession.insert(request);
//        ksession.insert(request2);
//        ksession.insert(request3);

        ksession.fireAllRules();

        QueryResults results = ksession.getQueryResults("return1");
         System.out.println("we have " + results.size() + " effect");

        ksession.dispose();
        System.out.println("之后："+trade1.getTotalFee());

    }
}
