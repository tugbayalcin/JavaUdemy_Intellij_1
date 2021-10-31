package String;

import java.util.Formatter;
import java.util.Locale;

public class StringFormatMethodu
{
    //<editor-fold desc="String Formatter Method Notes ">

    // Bu method ciktilarimizi bicimlendirerek istedigimiz formatta yazilmasini saglar
    // Eger method icine parametre vermez isek java varsayilan olarak Locale.getDefault() methodunu kullanir ??

    // Bu method icin 2 tur kullanim vardir
    // birincisi:
    public static String format(String format, Object... args)
    {
        return new Formatter().format(format, args).toString();
    }
    // ikincisi:
    public static String format(Locale locale, String format, Object... args)
    {
        return " ";  // burayi ben yazdim
    }
    // burada parametreler su sekildedir:
    // locale: format() yontemine uygulanacyerel ayari belirtir
    // format: stringin formatini belirtir, format kurallari % ile yazilmaya baslanir, bunun icin bir tablo mevcuttur
    // args: ??
    // method geriye formatlanmis, bicimlendirilmis, string ifadeleri dondurur

    /*
    Birkac formatlama kısaltmasini soyle siralayabiliriz:
    s dizeleri biçimlendirir.
    d ondalık tam sayıları biçimlendirir.
    f kayan noktalı sayıları biçimlendirir.
    t tarih/saat değerlerini biçimlendirir.
     */

    //</editor-fold>

    public static void main(String[] args)
    {
        // Bakiniz: https://www.javatpoint.com/java-string-format

        example1();
        example2();
        example3();

    }
    public static void example1()
    {
        String name="sonoo";
        String sf1=String.format("name is %s",name); // iki string ifadeyi birlestirdi ?
        String sf2=String.format("value is %f",32.33434); // string ve double ifadeyi birlestirdi
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0

        System.out.println(sf1); // cikti: name is sonoo
        System.out.println(sf2); // cikti: value is 32,33430
        System.out.println(sf3); // cikti:            32,334340000000 // virgulden sonra 12 basamak yazdirdi, deger olmayan basamaklari 0 ile doldurdu
    }
    public static void example2()
    {
        // Bu method cesitli veri turlerini destekler ve bunlari bir string olarak formatlar(bicimlendirir). Ornege bakalim:
        String str1 = String.format("%d", 101);          // Integer value
        String str2 = String.format("%s", "Amar Singh"); // String value
        String str3 = String.format("%f", 101.00);       // Float value
        String str4 = String.format("%x", 101);          // Hexadecimal value
        String str5 = String.format("%c", 'c');          // Char value
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
    public static void example3()
    {
        // Bicimlendirme disinda herhangi bir degerde gebislik, dolgu, vb ayarlar da yapabiliriz.
        // Bir tamsayi icin genislik ve  dolguyu  ayarladigimiz bir ornek yapalim:
        String str1 = String.format( "%d" ,  101 ); // benim integer bir 101 degerim var: cikti 101 olur
        String str2 = String.format( "|%10d|" ,  101 );  // Tamsayı uzunluğunu belirtme, mutlak deger cubuklarinin icine 10 karakterlik alan acar, sayiyi sag tarafina yazar
        String str3 = String.format( "|%-10d|" ,  101 ); // Belirtilen genişlikte sola yaslama
        String str4 = String.format( "|% d|" ,  101 );
        String str5 = String.format( "|%010d|" ,  101 ); // Sıfırlarla doldurma
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }




}
