package String;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Locale;

public class PrintfKullanimi
{
    public static void main(String[] args)
    {
        //<editor-fold desc="Printf() Notes">
        // printf() methodu da StringFormatter() methodu gibi string ifadeleri bicimlendirmeyi saglar
        // Bu method Java.io.PrintStream  classinin bir methodudur
        // string ifademizi bicimlendirmek icin bu methodu 2 sekilde kullanabiliriz;

        /*
            Bazi veri turlerinin donusturme anahtar harfleri
            s dizeleri biçimlendirir.
            d ondalık tam sayıları biçimlendirir.
            f kayan noktalı sayıları biçimlendirir.
            t tarih/saat değerlerini biçimlendirir.

            Opsiyonel Donusturuculer
            [flags] : Tam sayi ve kayan nokta sayilari bicimlendirmek icin kullanilir.
            [width] : Alan genisligini belirtir, ciktiya yazilan minimum karakter sayisini temsil eder
            [.precision] : Kayan noktali degerlerin ciktisi alinirken kesinlik basamak sayisini belirtir
                           Ayrica bir string ogesinden cikarilacak alt stringin uzunlugunu tanimlamak icin kullanilabilir


         */
        //</editor-fold>
        // Bknz: https://www.baeldung.com/java-printstream-printf

        //1.Satir Ayirici
        // String ifadeyi farkli satirlara bolmek icin %n belirteci kullanilir.
        // %N ayiricisi Printf() otomatik olarak ana bilgisayar sisteminin dogal hat ayirici ekleyecektir.
        System.out.printf("baeldung%nline%nterminator");

        // 2.BOOL BICIMLENDIRILMESI
        // Bool degerleri bicimlendirmek icin %b bicimi kullanilir
        // Girilen deger turue ise true dondurur, degilse false dondurur
        // Buyuk hafr bicimlendirmek icin B kullanilir
        System.out.printf("%b%n", null);
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 5.3);
        System.out.printf("%b%n", "random text");

        // 3.STRING BICIMLENDIRMESİ
        // Basit bir string ifadeyi bicimlenditmek icin %s bicimi kulanilir
        // Ek olarak dizeyi buyuk harf yapabiliriz
        System.out.printf("'%s' %n", "baeldung");
        System.out.printf("'%S' %n", "baeldung");
        // Ayrıca, minimum uzunluk belirtmek için bir genişlik belirtebiliriz :
        System.out.printf("'%15s' %n", "baeldung");
        // Dizemizi sola yaslamamiz gerekirse, – bayragini kullanabiliriz :
        System.out.printf("'%-10s' %n", "baeldung");
        // bir kesinlik belirterek ciktimizdaki karakter sayisini sinirlayabiliriz :
        System.out.printf("%2.2s", "Hi there!");
        // %x.ys sözdizimindeki ilk x  sayısı dolgudur . y  karakter sayısıdır.

        // 4.CHAR BICIMLENDIRME
        // %c nin sonucu bir unicode karakteridir
        System.out.printf("%c%n", 's'); // kucuk c sonucu kucuk harfle yazar
        System.out.printf("%C%n", 's'); // buyuk c sonucu buyuk harfle yazar

        // 5.INTEGER BICIMLENDIRME
        // printf() methodu %d ile byte, short,int,long ve BigInteger degerlerini bicimlendirir
        System.out.printf("simple integer: %d%n", 10000L); // cikti: simple integer: 10000
        // Ayrica sonuclarimizi yerel ayarlar ile de bicimlendirebiliriz, poarametre kısmına opsiyonel olan [flag] bicimlendiricisini kullaniriz
        System.out.printf(Locale.US, "%,d %n", 10000); // amerikadaki yerel bicimlendirme
        System.out.printf(Locale.ITALY, "%,d %n", 10000); // italyadaki yerel bicimlendirme

        // 6.FLOAT VE DOUBLE BICIMLENDIRMESI
        // ondalikli bir sayiyi bicimlendirmek icin %f bicimini kullaniriz
        System.out.printf("%f%n", 5.1473);
        // Hassasiyeti kontrol edelim:
        System.out.printf("'%5.2f'%n", 5.1473); // burada sayinin genisligini 5, ondalik kismin uzunlugunu 2 olarak tanimliyoruz
        // Burada ayni zamandan onceden tanimlanmis olarak sayinin basinda bir bosluk vardir
        // Ciktimizin bilimsel gosterimde olmasi icin sadece e-donusturme karakterini kullanmaliyiz
        System.out.printf("'%5.2e'%n", 5.1473);

        // 7.ZAMAN BICIMLENDIRME
        // H , M , S karakterleri Date girdisinden saat, dakika ve saniyelerin çıkarılmasından sorumludur .
        // L , N buna göre milisaniye ve nanosaniye cinsinden zamanı temsil eder.
        // p, am/pm biçimlendirmesini ekler.
        // z saat dilimi farkını yazdırır.
        Date date = new Date();
        System.out.printf("%tT%n", date); // cikti: 13:51:15
        // Daha detayli bicimlendirme icin farkli zaman dilimlerini ayarlayabiliriz
        System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date); // cikti: hours 13: minutes 51: seconds 15

        // 8.TARIH BIUCIMLENDIRME
        // A haftanın tam gününün çıktısını alır.
        // d ayın iki basamaklı gününü biçimlendirir.
        // B tam ay adı içindir.
        // m iki basamaklı bir ayı biçimlendirir.
        // Y yılı dört haneli olarak verir.
        // y yılın son iki basamağını verir.
        // Haftanin gununu ve ardindan ayi gostermek istedigimizde:
        System.out.printf("%1$tA, %1$tB %1$tY %n", date);  // cikti: Thursday, November 2018
        // sınuclarimizin rfamamini sayisal bicimde elde etmek istedigimizde A,B,Y yerine d,m,y koyariz
        System.out.printf("%1$td.%1$tm.%1$ty %n", date); // cikti: 22.11.18

        // DAHA GELİSMİS BICIMLENDIRME ICIN DateTımeFormatter kullanilabilir











    }
}
