public class ProductManager {
    public void Add(Product product){ //Parantez içerisinde class içinde başka bir class kullanabiliriz
        //JDBC kodları ile veritabanına kaydedilecek. İleride öğrenilecek
        System.out.println(product.getName()+" veritabanına eklendi...");
    }


}
