public class Main {
    public static void main(String[] args) {
        Product product = new Product("Колбаса", 50);
        Product one = new Product("Йогурт", 30);
        System.out.println(Product.getCount());
        System.out.println(Product.getPrice());
        System.out.println(Product.getAveragePrice());
    }
}
