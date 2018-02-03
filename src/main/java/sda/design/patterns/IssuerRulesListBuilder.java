package sda.design.patterns;

import java.util.ArrayList;
import java.util.List;

public class IssuerRulesListBuilder {
    public static List<IIssuerRule> getIssuerRules() {
        List<IIssuerRule> issuerRules = new ArrayList<>();
        issuerRules.add(new IssuerRule("Master Card", "51", 16));
        issuerRules.add(new IssuerRule("Visa","4",16));
        return issuerRules;
    }
}
