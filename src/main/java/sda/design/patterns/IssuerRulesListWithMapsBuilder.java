package sda.design.patterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IssuerRulesListWithMapsBuilder {

    public static List<Map<String,String>> getIssuerRules() {
        Map<String, String> rule1 = new HashMap<>();
        rule1.put("name", "MasterCard");
        rule1.put("prefix", "52");
        rule1.put("length", "16");

        Map<String, String> rule2 = new HashMap<>();
        rule2.put("name", "American Express");
        rule2.put("prefix", "34");
        rule2.put("length", "15");

        List<Map<String, String>> result = new ArrayList<>();
        result.add(rule1);
        result.add(rule2);
        return result;
    }

    public static List<IIssuerRule> getIssuerRulesAsMaps() {
        List<Map<String, String>> rules = getIssuerRules();

//        List<IIssuerRule> result =
//                rules.stream().map(x -> new MapToIssuerRuleAdapter(x))
//                .collect(Collectors.toList());
//
        List<IIssuerRule> result = new ArrayList<>();
        for (Map<String, String> rule : rules) {
            result.add(new MapToIssuerRuleAdapter(rule));
        }

        return result;
    }
}
