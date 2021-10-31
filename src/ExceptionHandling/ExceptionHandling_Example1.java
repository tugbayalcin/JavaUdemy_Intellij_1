package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_Example1
{
    // Lutfen Ziyaret Ediniz: https://neslihansezerblog.com/2018/08/14/java-egitimleri-19-javada-hata-yakalama/
    // Lutfen Ziyaret Ediniz: https://medium.com/s%C4%B1f%C4%B1rdan-i%CC%87leri-d%C3%BCzeye-java-e%C4%9Fitim-serisi/hata-yakalama-exception-handling-5a3db9b4a183
    public static void main(String[] args)
    {
        /*
          * Java'da Exception yapisi hatalarimizi daha rahat gorebilmemize olanak saglayan bir yapidir.

          * Exception; runtime da yani program calistiginda meydana gelen hatalardir
            Javada tum hatalar classlar tarafindan temsil edilir, yani bir hata olustugunda bir hata objesi olusturulur.
            Java dilinde tüm hatalarin atasi Throwable classidir. Throwable classinin iki tane dogrudan alt classi bulunur,
            Exception ve Error.
            Error classi dogrudan bizim kodumuzla ilgili olmayan JVM ile ilgili hatalar icin kullanilir ve bu hatalar kontrolumuz disindadir.
            Exception classi ise dogrudan yazdigimiz kodla ilgili bizim kontrolumuzde olan hatalar icin kullanilir.

          * Javada hata yakalama bes anahtar kelime ile yonetilir; try, catch, throw, throws ve finally.
            Hata acisindan izlemek istedigimiz kodlari try bloguna yazmaliyiz.
            try blogu icerisinde bir hata olusursa bu hata firlatilir. Firlatilan hatayi catch blogu yakalar.
            Sistem tarafindan olusturulan hatalar otomatik olarak firlatilir fakat bazi durumlarda bizim de manuel olarak hata fırlatmamız gerekir,
            Bu durumda throw ifadesi kullanilir. Bazi durumlarda yazdigimiz methodun hangi hataları firlatabilecegini method imzasinda belirtmemiz gerekir.
            Bu durumda throws ifadesi kullanilir. Bir try blogundan sonra hata olsun olmasin mutlaka yapilmasi gereken bir is varsa o da finally blogunda yapilir.

          * try ve catch blogunun genel yapisi asagidaki gibidir.
            try tek basina kullanilabilir ama catch ifadesi sadece try ile birlikte kullanılabilir.

        try
        {
            // Normal Şartlar Altında Çalışması Gereken Kod Dizini
        }

        catch(ExceptionType1 e)
        {
           // Hata1 Oluştuğunda Uygulanacak Kod Dizini
        }
        catch(ExceptionType2 e)
        {
           // Hata2 Oluştuğunda Uygulanacak Kod Dizini
        }

        finally
        {
            //Hata Olsa Da Olmasa Da Çalışması Gereken Kod Dizini
        }

         * try blogu icerisinde bir hata olustugu zaman hatadan sonraki try blogu icinde kalan kod isletilmez.
           O noktadan itibaren kodun akisi olusan hata ile en cok uyumlu olan catch bloguna gecer.
           O nedenle catch blogunu olustururken hata tipi secimi onemlidir. catch bloguna olusan hatanın objesi verilir
           ve blok icerisinde hata islenir.

         * Eger hicbir hata olusmaz ise kod akisi en son catch ifadesinden sonraki kod parcasiyla devam eder.
           catch blokları yalnizca ilgili hata olustugu zaman calistirilir.

        */

        // Klavyeden girilen iki sayiyi birbirine bolen program ile bir ornek yapalim:
        try
        {
            Scanner klavye=new Scanner(System.in);
            System.out.println("Birinci Sayıyı Giriniz :");
            int sayi1=klavye.nextInt();
            System.out.println("İkinci Sayıyı Giriniz");
            int sayi2=klavye.nextInt();

            double sonuc=sayi1/sayi2;

        }
        catch(Exception Hata) // Catch methodunda hatayi yakalamasi icin exception kodunu kullaniyoruz.
                              // Exception kodundan sonra istedigimiz kelimeyi ya da harfi yazabiliriz.
                              // Ancak ekrana hatayi yazdirmak istedigimizde de tanimladigimiz kelimeyi kullanmamız gerekir.
        {
            System.out.println("Karşılaşılan Hata : " + Hata);
        }
        // Klavyeden 5 ve e girdigimizde aldigimiz hata: java.util.InputMismatchException
        // İkinci sayiyi int degerinde girmek yerine string olarak girdik. Bu hatanın karsılıgı ise Java’da InputMismatchException methodudur.

        // Klavyeden 5 ve 0 girdigimizde aldigimiz hata: java.lang.ArithmeticException: / by zero
        // İkinci sayiyi 0 olarak girdigimizde tanimsiz bir sonuc elde edileceginden yukaridaki gibi hata verecektir.
        // Bu hatanın karsiligi ise Java’da ArithmeticException methodudur.

        // Ayni Kod Blogu ExceptionHandling_Example2 deki gibi de yazilabilir. Gidip inceleyiniz




    }
}

