public class Main {
    public static void main(String[] args) {

        String mesaj=("Bugün hava çok güzel...");
        String yeniMesaj=sehirVer();

        int sayi=topla(11,12);
        System.out.print(sayi+" ");
        System.out.println(sehirVer());
        System.out.println(topla2(2,3,7,8,9));


    }
    public static void ekle(){
        System.out.println("Eklendi");

    }

    public static void sil(){
        System.out.println("Silindi");

    }
    public static void güncelle(){
        System.out.println("Güncellendi");

    }
    public static int topla2(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;

        }
        return toplam;
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static String sehirVer(){
        return "Elazığ";
    }
}