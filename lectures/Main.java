public class Main 
{
    public static void main(String[] args) 
    {
        Product product = new Product("Twix", 100);
        System.out.println(product);

        VendingMachine vendingMachine = new VendingMachine();
        // VendingMachine.addProduct(product);
        Bottle bottle = new Bottle("Aqwa", 111, 2);
        System.out.println(bottle);
    }
}
