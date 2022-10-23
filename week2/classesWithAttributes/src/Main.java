public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        //


        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

        /*
        CONSTRUCTOR
        Aslında her class'ın içinde mevcuttur. Class ile aynı isme sahiptir.
        public class Product{
            public Product(){ ---->constructor methodu...void int yazılmaz sadece sınıf ile aynı isme sahiptir.
            }
        }


        */
    }
}