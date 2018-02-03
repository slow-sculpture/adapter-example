package sda.design.patterns;

public class IssuerRule implements IIssuerRule {
    private String issuerName;
    private String prefix;
    private int length;

    public IssuerRule(String issuerName, String prefix, int length) {
        this.issuerName = issuerName;
        this.prefix = prefix;
        this.length = length;
    }

    @Override
    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
