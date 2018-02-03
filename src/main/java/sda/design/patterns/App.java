package sda.design.patterns;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<IIssuerRule> issuerRules = IssuerRulesListBuilder.getIssuerRules();
        List<IIssuerRule> issuerRules2 = IssuerRulesListWithMapsBuilder.getIssuerRulesAsMaps();

        issuerRules.addAll(issuerRules2);

        for(IIssuerRule issuerRule : issuerRules) {
            System.out.println(issuerRule.getIssuerName());
            System.out.println(issuerRule.getPrefix());
            System.out.println(issuerRule.getLength());
            System.out.println();
        }

        System.out.println();
    }


}
