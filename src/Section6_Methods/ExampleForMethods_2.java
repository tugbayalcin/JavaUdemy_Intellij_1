package Section6_Methods;

import java.util.Scanner;

public class ExampleForMethods_2
{
    static Scanner tara; //declaration - olusturma, kutunun ici bos
    int a; // burada a isimli degisken tanimlayip atama yapmadigimiz gibi, yukaridaki satirda da bir nesne olusturup atama yapmadan tutuyoruz

    public static void main(String[] args)
    {
        int kullaniciSecimi = -1;    // kullanicinin girdigi secimi saklamak ve kullanmak icin degisken tanimladim ve icine hic kullanilmayacak bir deger atadim, dongude kullanacagim icin donguden once tanimlamam gerekiyor ancak asil atamasini dongu icerisinde yapacagiz
        tara=new Scanner(System.in);
      /*  while (kullaniciSecimi != 0) // kullaniciya menuyu surekli gosterebilmek icin dongu tanimladik
            kullaniciSecimi = menuGoster();  // kullnici secimini tanimladigim degiskenime atadim
      */
        // ayni seyi for ile de yapabiliriz
        for (;; )
        {
            kullaniciSecimi = menuGoster();
            if(kullaniciSecimi==0)
                break;//for loop'tan cik ve main methodunun icinden devam et

            /* toplu satir commentleme!!!
            Eger ctrl / yaparsan secili her satirin basina // koyarak satir commani olusturuyor
            Eger ctrl shift / yaparsan da /* koyarak command blogu olusturuyor */

            //switc'in islem onceligi okuma yap

            switch (kullaniciSecimi)//sartli yapilar
            {
                case 0://yukardaki if oldugu icin 0 girildiginde yukardaki calisicak ve compiler switch'e hic bir  zaman erisemeyecek
                    System.exit(0);//29. satirda compiler programi sonlandirir
                    break;//switc'ten cik

                case 1:

                    System.out.println("Lutfen Birinci Sayiyi Giriniz: ");
                    int birinciSayi = tara.nextInt();

                    System.out.println("Lutfen Ikinci Sayiyi Giriniz: ");
                    int ikinciSayi = tara.nextInt();
                    ikiSayiyiCarp(birinciSayi,ikinciSayi);
                    break;//switch'ten cik

                case 2 :

                    System.out.println("Lutfen Birinci ve ikinci Sayiyi Giriniz: ");

                    int toplam = ikiSayiyiTopla(tara.nextInt(), tara.nextInt());
                    System.out.println("Girilen Sayilarin Toplami: " + toplam);
                    break;

                case 3:
                    //   int ikinciSayi = tara.nextInt();
                    ikiSayininKuvvetiniBul(sayiGir(1),sayiGir(2));//1 ve 2 yazdik -> 1. sayiyi ve 2. sayiyi gir demek istedik
                    break;

                case 4:
                    ikiSayininKuvvetiniBul(sayiGir(1,10),sayiGir(2,20));//overloading var
                    //1. sayi 10 olsun , 2.sayi 20 olsun dedik biz kendimiz degerleri sabitledik kullanicidan istemedik
                    //buna hardcoding denir - hard kodlama yaptik, tercih edilmez
                    //kullanican her seferinde elle deger girmesini isteseydik dinamik coding- dinamik kodlama yapmis olurduk
                    break;

                case 5://dinamik kodlama yapma case'i

                    System.out.println("Birinci ve Ikınci Sayiyi Giriniz: ");
                    ikiSayininKuvvetiniBul(sayiGir(1, tara.nextInt()),sayiGir(2,tara.nextInt()));//overloading var
                    //kullanici 1.sayiyi console'dan girsin
                    //kullanici 2. sayiyi console'dan girsin

                    break;
                default:
                    System.out.println("Your input is "+kullaniciSecimi+", Please Enter a valid transaction number(0-3)");
            }//switch sonu

        }//loop sonu


        System.out.println("The Program terminated!!! - Program sonlandirildi!!!");


    }//main methodun sonu
    /**sayiGir
     * @author tugbayalcin
     * @deprecated
     */

    /**
     *
     * @param i  kacinci sayiyi girdigimizi temsil eder
     * @param i1 hangi sayiyi girdigimizi temsil eder
     * @return aciklama cumlesi yazar + girdigimiz sasyiyi dondurur.
     */
    private static int sayiGir(int i, int i1) {

        System.out.println( i +". Sayi Girildi: ");
        tara=new Scanner(System.in);
        return i1;//kullanican alinan int degeri return et
    }

    /**
     *
     * @param a kacinci sayiyi girdigimizi temsil eder 1 girersek 1.sayi 2 girersek 2. sayiyii giriniz yazar.
     * @return a input taken from user - kullanicidan alinan inputu dondurur
     *
     */
    private static int sayiGir(int a)
    {
        System.out.println("Lutfen "+ a +". Sayiyi Giriniz: ");
        tara=new Scanner(System.in);
        // int birinciSayi = tara.nextInt();
        //return birinciSayi;
        return tara.nextInt();//kullanican alinan int degeri return et
    }

    public static void ikiSayininKuvvetiniBul(int birinciSayi, int ikinciSayi)
    {
        double sonuc = Math.pow(birinciSayi,ikinciSayi);
        System.out.println(birinciSayi + "'nin " + ikinciSayi + "'nci kuvveti: " + sonuc);
    }

    public static int ikiSayiyiTopla(int birinciSayi, int ikinciSayi)
    {
        int toplam = birinciSayi + ikinciSayi;
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
            System.out.println("4. Ikı Sayinin Kuvvetini Bul");
            System.out.println("5. Ikı Sayinin Kuvvetini Bul");

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

}
