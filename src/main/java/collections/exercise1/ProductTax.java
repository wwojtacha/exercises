package collections.exercise1;

public enum ProductTax {

    VAT8(0.08), VAT23(0.23), VAT5(0.05), NO_VAT(0.0);
    private double value;

    ProductTax(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
