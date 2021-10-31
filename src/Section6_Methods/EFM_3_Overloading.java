package Section6_Methods;

import java.util.Scanner;

public class EFM_3_Overloading
{
    public static void main(String[] args)
    {
        int kullaniciSecimi = -1;    // kullanicinin girdigi secimi saklamak ve kullanmak icin degisken tanimladim ve
                                     // icine hic kullanilmayacak bir deger atadim, dongude kullanacagim icin donguden
                                     // once tanimlamam gerekiyor ancak asil atamasini dongu icerisinde yapacagiz

      /*  while (kullaniciSecimi != 0) // kullaniciya menuyu surekli gosterebilmek icin dongu tanimladik
            kullaniciSecimi = menuGoster();  // kullnici secimini tanimladigim degiskenime atadim
      */
        // ayni seyi for ile de yapabiliriz
        for (; ; )
        {
            kullaniciSecimi = menuGoster();

            if (kullaniciSecimi == 0)
                break;


            Scanner tara = new Scanner(System.in);

            System.out.println("Lutfen Birinci Sayiyi Giriniz: ");
            int birinciSayi = tara.nextInt();

            System.out.println("Lutfen Ikinci Sayiyi Giriniz: ");
            int ikinciSayi = tara.nextInt();

            switch (kullaniciSecimi)
            {
                case 1:
                    ikiSayiyiCarp(birinciSayi,ikinciSayi);
                    break;

                case 2 :
                    int toplam = ikiSayininToplaminiBul(birinciSayi,ikinciSayi);
                    System.out.println("Girilen Sayilarin Toplami: " + toplam);
                    break;

                case 3:
                    ikiSayininKuvvetiniBul(birinciSayi,ikinciSayi);
                    break;

                case 4:
                    double toplamDouble = ikiSayininToplaminiBul(5.9,8.8);
                    System.out.println("Girilen Double Sayilarin Toplami: " + toplamDouble);
                    break;

                case 5:
                    String sonuc = isaretBelirteci(5);
                    System.out.println("Sonuc: " + sonuc);
                    break;

            }

        }
    }

    private static String isaretBelirteci(int i)
    {
        if(i>0)
        {
            return "Pozitif";
        }
        else if(i==0)
        {
            return "Sayi Sıfıra Esittir";
        }
        else if(i<0)
        {
            return "Negatif";
        }
        else // bunu yazmazsak bize kiziyor, ya ben ustteki durumlara giremezsem ne yapacagim bana onu soyle diyor,
        {    // aslinda olasi baska bir durum yok biz bunu biliyoruz ama program bilmiyor
            return " "; // ille bana bir return ver diyor
        }
    }


    public static void ikiSayininKuvvetiniBul(int birinciSayi, int ikinciSayi)
    {
        double sonuc = Math.pow(birinciSayi,ikinciSayi);
        System.out.println(birinciSayi + "'nin " + ikinciSayi + "'nci kuvveti: " + sonuc);
    }

    public static int ikiSayininToplaminiBul(int birinciSayi, int ikinciSayi) // overloading - method isimleri birebir ayni ancak aldiklari parametreleri farkli
    {
        int toplam = birinciSayi + ikinciSayi;
        return toplam;
    }

    public static double ikiSayininToplaminiBul(double birinciSayi, double ikinciSayi) // overloading
    {
        double toplam = birinciSayi + ikinciSayi;
        return toplam;
    }

    public static void ikiSayiyiCarp(int birinciSayi, int ikinciSayi)
    {
        System.out.println("Girilen Sayilarin Carpimi: " + (birinciSayi*ikinciSayi));
    }

    public static int menuGoster ()
    {
        System.out.println("***** MENU *****");
        System.out.println("1. Ikı Sayinin Carpimini Bul");
        System.out.println("2. Ikı Sayinin Toplamini Bul");
        System.out.println("3. Ikı Sayinin Kuvvetini Bul");
        System.out.println("4. Ikı Double Sayinin Toplamini Bul");
        System.out.println("5. Sayinin Isaretini Bul");
        System.out.println("Cikmak Icin 0'i Tuslayiniz");

        System.out.print("Please Enter Your Transaction number:");
        Scanner tara = new Scanner(System.in);//Scanner Class'indan nesne olusturduk, nesnenin adi-> tara
        //tara nesnesi ile Scanner Class'inin icine girilir ve non-static methodlara erisilebilir
        //tara isimli kalici kapi olustu Scanner Class'ina girebilmek icin
        //int secim = new Scanner(System.in).nextInt(); // secim isimli degisken yalnizca bu method icinde yasar. Main in bundan haberi olmaz
        int secim = tara.nextInt();//bir degeri degiskene atamak gibi

        //return tara.nextInt(); // bu da dogru -> obje.methodIsmi
        //return new Scanner(System.in).nextInt(); // -> obje.methodIsmi

        //bir methodta sadece 1 return olur ve en sonda olur
        return secim;               // Main in haberi olmasi icin icin bu degeri return ile geri dondurmeliyiz
        // Methodumuza return koyacaksak VOID yapamayiz, return hata verir



    }

    /* Bir methodun geri donus tipi (void,int, double, etc...) signature kavramina dahil degildir
     Ornegin;
    public static int carp (int a)
    {
        return 1;
    }
    public static int carp (double a)
    {
        return 2;
    }
    Burada iki methodun geri donus tipi ayni olmasina ragmen aldigi parametreler farklidir bu yüzden java bize kizmaz
    Cunku dedigimiz gibi overloading te signature a bakariz geri donus tipine degil
    sen bana int deger verirsen ustteki methodu calistirir sana int 1 degerini dondururum,
    bana double verirsen alttaki methodu calistirir integer 2 degerini dondururum diyur
    ANCAK
    public static int carp (int a)
    {
        return 1;
    }
    public static double carp (int a)
    {
        return 2.0;
    }
    Simdi java bize kizdi. Cunku integer bir deger girdik ve java hangisini calistiracagi konusunda karisiklik yasiyor

    OVERLOADING KURALLARI
    Methodlarin isimleri bire bir ayni olacak
    parametre sayilari veya parametre turleri farkli olacak
    geri dondurulan degerin ne oldugu ummrumuzda degil


     */

}
