package sda.design.patterns;

import java.util.Map;

public class MapToIssuerRuleAdapter implements IIssuerRule {
    private Map<String, String> rule;

    public MapToIssuerRuleAdapter(Map<String, String> rule) {
        this.rule = rule;
    }

    @Override
    public String getIssuerName() {
        return rule.get("name");
    }

    @Override
    public String getPrefix() {
        return rule.get("prefix");
    }

    @Override
    public int getLength() {
        return Integer.parseInt(rule.get("length"));
    }
}
