package collections.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private List<Product> productsBought = new ArrayList();



    public List getProductsBought() {
        return productsBought;
    }

    public void addToCart(Product product){
        productsBought.add(product);
    }

    public void printProductsList(){
        for (Product product : productsBought) {
            System.out.println(product);
        }

    }
        public double sumNettoBill(){
           double sumNetto = productsBought.stream().mapToDouble(product -> product.getPriceNetto()).sum();
            return Math.round(sumNetto * 100d) / 100d;
        }

    public double sumBruttoBill(){
        double sumBrutto = productsBought.stream().mapToDouble(product -> product.countPriceBrutto()).sum();
        return Math.round(sumBrutto * 100d) / 100d;
    }

    public double sumTaxBill(){
        double sumTax = sumBruttoBill() - sumNettoBill();
        return Math.round(sumTax * 100d) / 100d;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "productsBought=" + productsBought +
                '}';
    }
}
