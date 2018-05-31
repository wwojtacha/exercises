package collections.exercise1;

public class MainBill {
    public static void main(String[] args) {
        Product product1 = new Product("kakao", 8.56, ProductTax.VAT23);
        Product product2 = new Product("maslo", 6.66, ProductTax.VAT23);
        Product product3 = new Product("książka", 19.99, ProductTax.VAT8);
        Product product4 = new Product("wódka", 15.00, ProductTax.NO_VAT);
        Product product5 = new Product("buty", 55.64, ProductTax.VAT5);

        Bill bill = new Bill();
        bill.addToCart(product1);
        bill.addToCart(product2);
        bill.addToCart(product3);
        bill.addToCart(product4);
        bill.addToCart(product5);

        bill.printProductsList();

        System.out.println("Netto sum: " + bill.sumNettoBill());
        System.out.println("Brutto sum: " + bill.sumBruttoBill());
        System.out.println("Tax sum: " + bill.sumTaxBill());


    }
}
