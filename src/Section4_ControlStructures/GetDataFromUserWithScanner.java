package Section4_ControlStructures;
import java.util.Scanner; // sinif kullaniyoruz, kullnabilmek icin icinde oldugu package i import etmeliyiz

public class GetDataFromUserWithScanner
{
    public static void main(String[] args)
    {
        // Scanner sinifi ile kullanicinin konsoldan veri girmesi sağlanir
        Scanner tara = new Scanner(System.in);
        int kullanicininGirdigiSayi = tara.nextInt(); // tara.next yazinca altta diger veri turlerine nasil erisecegin de cikiyor
        System.out.println("Kullanicinin Girdigi Deger: " + kullanicininGirdigiSayi);

        double kullaniciDouble = tara.nextDouble();
        System.out.println("Kullanicinin Girdigi Double Deger: " + kullaniciDouble); // terminale double deger yazarken virgul kullan

        String isim = tara.next(); // tara.next girilen metnin yalnizca ilk kelimesini algilar, tamamini algilasin istiyorsak tara.nextLine secmeliyiz
        System.out.println("Kullanicinin Girdigi Isim: " + isim);

        tara.nextLine(); // duzgun calissin diye bos calistiriyorum
        String metin = tara.nextLine();
        System.out.println("Kullanicinin Girdigi Metin: " + metin);
        // art arda next/nextLine kullanirssan beklemedigin sonuc elde edebilirsin
        // mesela burada bizden iki kere metin yazmamizi beklemedi
        // eger her iki satirda da nextLine kullanmis olsa idik bu sorunu cozmus oluruz
        // eger next. turevlerinde boyle bir hata aliyorsan yapacagin en onemli cozum calismayan next. dan once onu alıp bir satirda bos calistirmak olacaktir

        char harf = tara.next().charAt(0); // char icin next.char yapisi yok, yalnizca 1 karakter harf girecegimiz icin next olarak kullaniyoruz
        // ancak program bize kiziyor,  string charlardan olusmus bir nesnedir. bu yüuzden next.charAt methodunu kullaniyoruz.
        // yazdigimiz kelimenin kacinci harfini istiyorsak 0 dan baslayarak indeks numarasi kullaniriz
        System.out.println("Girilen harf: " + harf);

    }
}
