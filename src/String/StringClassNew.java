package String;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringClassNew
{
    public static void main(String[] args)
    {

       // lengthMethodu(); // Girilen karakterin sayisini dondurur ---int dondurur
       // isEmptyMethodu(); // Dizenin bos olup olmadigini kontrol eder ---boolean
       // charAtMethodu(); // indeksi verilen karakteri dondurur ---char
       // getCharsMethodu(); // Karakterleri bir dizeden bir karakter dizisine kopyalar ---void
       // getBytesMethodu(); // Dizeyi byte dizisine kopyalar ve her karakterin ascıı kodunu diziye ekler ---byte[]
       // equalsMethodu(); // Iki dizeyi karsilastirir ---boolean
       // equalsIgnoreCaseMethodu(); // Buyuk-kucuk harfe iliskin hususları goz ardi ederek iki dizeyi karsilastirir ---boolean
       // compareToMethodu(); // Iki dizeyi sozlukbilimsel olarak karsilastirir ---int
       // indexOfMethodu(); // Istenilen karakterin indeksini verir ---int
       // substringMethodu(); // Stringleri parcalamaya yarar ---string
       // concatMethodu(); // Stringleri birlestirmeye yarar ---string
       // replaceMethodu(); // Dize icerisinde karakter ya da karakter gruplarini degistirmeye yarar ---string
       // containsMethodu(); // dize icerisinde arama yapmayi saglar ---boolean
       // splitMethodu(); // Dizeyi alt dizelere boler ---String[]
       // toLoweCase_toUpperCase(); // Dizeyi kucuk veya buyuk harflere donusturur ---string
       // trimMethodu(); // Dizenin basindaki ve sonundaki bosluklari siler ---string
       // stripMethodu(); // Dizenin basindaki ve sonundaki bosluklari siler ---string
       // isBlankMethodu(); // Dizenin bos olup olmadigini veya bosluktan olusup olusmadigini kontrol eder ---boolean
       // toCharArray(); // Dizenin elemanlarini char olarak alip char dizisnde tutar ---char[]
       // valueOfMethodu(); // Primitive datalari string e donusturur ---string
       // copyValueOfMethodu(); // Char diziyi stringe donusturur ---string
       // repeatMethodu(); // Dizeyi tekrarli yazdirmayi saglar ---string
       // sayisalDegerlerinStringlereCevrilmesi();
       // stringlerinSayisalDegerlereCevrilmesi();


    }




    private static void lengthMethodu()
    {
        // StringName.length(); seklinde kullanilir
        // Girilen dizenin uzunlugunu verir
        // Indexler 0'dan basladigi icin saymaya da 0'dan baslar
        // Bosluklar da sayilir

        String str = "Hello World";
        System.out.println(str + "′un karakter sayisi: " + str.length());
    }
    private static void isEmptyMethodu()
    {
        // Dizenin uzunlugunun 0 olup olmadigini kontrol eder
        // Boolean(true-false) deger dondurur

        String str1= "";
        System.out.println("str1 icin cevap: "+ str1.isEmpty());
        String str2= " "; // burada dizemiz yalnizca bosluk karakterinden olusuyor, yani bos degil
        System.out.println("str2 icin cevap: "+ str2.isEmpty());
        String str3= "Hello World";
        System.out.println("str3 icin cevap: "+ str3.isEmpty());
    }
    private static void charAtMethodu()
    {
        // Dize icerisindeki indeksi verilen ifadeyi dondurur
        // Diziler uzerinde islem yapmaya benzer
        // Indekslerin 0'dan basladigi unutulmamalidir

        String str = "Java Programlama";
        System.out.print(str.charAt(0)+ " ");
        System.out.println(str.charAt(5));

        // Asagidaki kod dizisi bize girilen string ifadeyi harf harf ayirip alt alta yazdirir
        String str1="Programlama";
        int i;

        for(i=0; i<str1.length(); i++)
        {
        System.out.println("");
        System.out.println(str1.charAt(i));
        }
    }
    private static void getCharsMethodu()
    {
        // signature:  getChars( int  srcBeginIndex,  int  srcEndIndex,  char [] hedef,  int  dstBeginIndex)
        // Dizenin her bir elemanini char olarak alir ve bir char dizisine atar

        String str = "Hello World";
        char[] dizi = new char[str.length()];
        str.getChars(0,str.length(),dizi,0);
        for(int i=0;i<dizi.length; i++)
            System.out.print(dizi[i] + ",");
    }
    private static void getBytesMethodu()
    {
        // Dizenin her bir elemaninin sirasiyla ascii kodunu alir ve bir bayte dizesine kopyalar

        String str = "Hello World";
        byte[] dizi = null;
        dizi = str.getBytes();
        for(int i=0;i<dizi.length; i++)
            System.out.print(dizi[i] + ",");

    }
    private static void equalsMethodu()
    {
        // Iki stringin ayni olup olmadigini kontrol etmek icin kullanilir
        // Karsilastirma metinsel(icerik) olarak yapilir

        String str1= "Hello World"; // String Pool'da
        String str2= "Hello World"; // String Pool'da
        String str3= str2; // String Pool'da
        String str4 = new String("Hello World"); // Heap'te
        String str5 = new String("Hello World"); // Heapte baska bir kutuda, yani == ile bakarsak false degeri aliriz
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str4.equals(str5));
        // hepsi true dondurecek cunkü bellekte farkli yerlerde bile olsalar icerikleri ayni
    }
    private static void equalsIgnoreCaseMethodu()
    {
        // Bu method da equals gibi karsilastirma methodudur
        // Tek farki karsilastirma yapmadan once butun karakterleri kucuk harfe cevirip sonrasinda karsilastirma yapmasidir
        // Boylece buyuk-kucuk harf duyarliligindan kaynaklanacak sorunlar ortadan kalkmis olur
        String str1 = "Hello World";
        String str2 = "hello world";
        System.out.println(str1.equalsIgnoreCase(str2));
    }
    private static void compareToMethodu()
    {
        // Dizeleri karsilastirmanin bir yolu da compareTo methodudur
        // 1.equals: Deger esitligini kontrol eder (mantiksal olarak esitler mi)
        // 2.compareTo: ASCII degerlerine bakarak kiyaslama yapar
        // 3.==: Referance esitligini kontrol eder (aynı obbject mi degil mi)

        // -1: Ilk string daha kucukse
        //  0: Stringlerin degerleri esitse
        // +1: Ilk string daha buyukse

        String s1="deneme";
        String s2="deneme";
        String s3="desen";
        s1.compareTo(s2); // 0 sonucunu dondurdu.
        s1.compareTo(s3); // -1 sonucunu dondurdu.
        s3.compareTo(s1); // 1 sonucunu dondurdu.
    }
    private static void indexOfMethodu()
    {
        // Dizede bulunan herhangi bbir karakterin indeksini verir
        // Indekslerin 0'dan basladigi unutulmamalidir

        String str = "Hello World";
        System.out.println("W harfi dize icinde " + str.indexOf('W') + ". sirada yer alir");
    }
    private static void substringMethodu()
    {
        // Stringleri parcalara ayirmamiz gerektiginde kullaniriz
        // Iki farkli kullanimi vardir
        // Tek parametreli kullanim: Girilen sayidan sonrasini boler
        // Çift parametreli kullanim: Girilen sayilar arasindsa kalan karakter dizisini alir

        String str= "ıkızler burcu bu hafta cok sanssidir";
        System.out.println(str.substring(3)); // 3. indisten itibaren yazdiracak
        System.out.println(str.substring(7,17)); // 7. indisten baslayip 16. indis dahil yazdiracak

    }
    private static void concatMethodu()
    {
        // Iki stringi birlestirmeyi saglar.
        // Println methodlarinda kullandigimiz + operatorunun yerine kullanilabilir

        String s = "Birinci cümlemiz. ";
        String s2 = "İkinci cümlemiz. ";
        String s3 = s.concat(s2);
        System.out.println(s3);
    }
    private static void replaceMethodu()
    {
        // Dize icerisindeki karakter ya da karakter gruplarini degistirmeye yarar

        String s = "Bu bir Matematik Yazısıdır";
        System.out.println(s.replace("Yazısıdır","İşlemidir"));

        String str= "Hekko Workd";
        System.out.println(str.replace('k','l'));
    }
    private static void containsMethodu()
    {
        // Dize icerisinde aramma yapmamizi saglar

        String s = "Bu Bir String Yazısıdır.";
        System.out.println(s.contains("String") + "\n" + s.contains("metin"));
    }
    private static void splitMethodu() // calismiyor
    {
        // Belirtilen karakter ile karsilasildiginda dizeyi bolup her bir parcayi yeni bbir dizinin elemani yapar

        String str= "Google, kurulmasından sonraki ilk 10 yıl içinde karbon nötr olmayı başaran ilk büyük şirket oldu. İkinci 10 yılımızda ise %100 yenilenebilir enerji kullanan ilk şirket olduk. 2030'a kadar karbonsuz faaliyet gösteren ilk büyük şirket olmayı hedefliyoruz.";
        String[] dizi= str.split(".");
        for (int i=0; i< dizi.length; i++)
            System.out.println(dizi[i]);
    }
    private static void toLoweCase_toUpperCase()
    {
        // toLowerCase: Dizedeki tum harfleri kucuk yapar
        // toUpperCase: Dizedeki tum harfleri buyuk yapar

        String str = "Hello World";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
    private static void trimMethodu()
    {
        // Dizenin basindaki veya sonundaki bosluk ve tablari siler

        String s = "\t Bu bir Matematik Yazısıdır";
        System.out.println(s);
        System.out.println(s.trim());
    }
    private static void stripMethodu()
    {
        // Dizenin basindaki ve sonundaki bosluklari siler
        // stripLeading : Dizenin basindaki bosluklari kaldirir
        // stripTrailing : Dizenin sonundaki bosluklari kaldiri

        String str= "       Hello World       ";
        System.out.println(str.strip());
        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());
    }
    private static void isBlankMethodu()
    {
        // Dizenin tamamen bos veya bosluk karakterinden olusup olusmadigini kontrol eder
        // Asagidaki durumlarda true, diger durumlarda false dondurur

        String str = "";
        String str1 = " ";
        String str2 = "             ";
        System.out.println(str.isBlank());
        System.out.println(str1.isBlank());
        System.out.println(str2.isBlank());

        String str3 ="Hello World";
        System.out.println(str.isBlank()); // false

    }
    private static void toCharArray()
    {
        // Dizenin her bir elemanini alip char a donusturur ve bir char dizisinde sirasi ile tutar

        String str= "Hello World";
        char[] dizi = str.toCharArray();
        for(int i=0; i<dizi.length; i++)
            System.out.print(dizi[i] + ",");
    }
    private static void valueOfMethodu()
    {
        // int,long,bool,char,float,double, object ve chsr dizxisini string e donudturur

        boolean b=false;
        char c='a';
        char[] dizi = null;
        int i=0;
        long l=10;
        float f=10.7f;
        double d=14.3d;
        String donusmus_b=String.valueOf(b);
        String donusmus_c=String.valueOf(c);
        String donusmus_i=String.valueOf(i);
        String donusmus_l=String.valueOf(l);
        String donusmus_f=String.valueOf(f);
        String donusmus_d=String.valueOf(d);

        System.out.println(donusmus_b);
        System.out.println(donusmus_c);
        System.out.println(donusmus_i);
        System.out.println(donusmus_l);
        System.out.println(donusmus_f);
        System.out.println(donusmus_d);





    }
    private static void copyValueOfMethodu()
    {
        // Char dizisinin elemanlarini sirasi ile birlestirerek stringe donudturur
        // toChararray in tersi gibi dusunebilirsin

        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
        System.out.println("Returned String: " + myStr2);
    }
    private static void repeatMethodu()
    {
        // Dizeyi parametre olarak girilen sayi kadar tekrar yazar

        String str = "Hello World, ";
        System.out.println(str.repeat(3));
    }
    private static void sayisalDegerlerinStringlereCevrilmesi()
    {
        // valueOf methodu ile

        float fl = (float) 5.2;
        String str = String.valueOf(fl);

        // toString methodu ile

        int a = 5;
        double b = 5.3;

        String str1 = Integer.toString(a);
        String str2 = Double.toString(b);

        System.out.println(str1 + " " + str2);

    }
    private static void stringlerinSayisalDegerlereCevrilmesi()
    {
    String str = "5";
    String str2 = "4.3";

    int a = Integer.parseInt(str);
    double b = Double.parseDouble(str2);

    System.out.println(a + " " + b);
    System.out.println(a + b);
}



}
