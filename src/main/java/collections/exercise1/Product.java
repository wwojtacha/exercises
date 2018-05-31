package collections.exercise1;

public class Product {
    private final String name;
    private final double priceNetto;
    private final ProductTax tax;

    public Product(String name, double priceNetto, ProductTax tax) {
        this.name = name;
        this.priceNetto = priceNetto;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getPriceNetto() {
        return priceNetto;
    }

    public ProductTax getTax() {
        return tax;
    }

    public double countPriceBrutto(){
        if (tax.getValue() == 0.05){
            return this.getPriceNetto() * 1.05;
        }else if(tax.getValue() == 0.08){
            return getPriceNetto() * 1.08;
        }else if(tax.getValue() == 0.23){
            return this.getPriceNetto() * 1.23;
        }else{
            return this.getPriceNetto();
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", priceNetto=" + priceNetto +
                ", tax=" + tax +
                '}';
    }
}
