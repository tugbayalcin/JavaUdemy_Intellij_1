package Section2_Variables;
        // Degisken adı rakam ile baslayamaz
        // Büyük kücük harf duyarliligi vardir
        // Degisken adinda ilk kelime kucuk ikincisi ise buyuk harf ile baslarsın
        // Degisken adi icerisinde Reserved word ler kullanilmaz
        // Ayni kod blogu icinde ayni isimli iki degisken adi tanimlayamazsin
        // Degisken adı bosluk veya ozel karakter gibi ifadeler iceremez
        // Degisken tanimlarken: degisken türü degisken adi= verecegimiz deger; int sayi=10 gibi

public class Variables // konumuz - class'imiz
{
    public static void main(String[] args)

    // Bir method classin malidir
    // Static = ben classin maliyim beni her yerden tani

    {
        // Compiler baslar
        // Kodlarimizi yazacagimiz yer burasidir. 1. methodumuz daima main methoddur
        // Burasi main methodun basidir - compiler baslar
        // Kendime yeni bir method olusturup adina integerInfo verdim.
        // Artık bu methodun icindeki(yani suslu parantezin icindeki) tum kodlarin temsilcisi integerInfo Methodudur


        //<editor-fold desc="package-class-method cagirma iliskisi">
         /*

        //Section2_Variables.Variables.integerInfo();  - AYNI PACKAGE;TEYSEN BU YOLU DENEME
        Variables.integerInfo();//method adi ile cagirilir
        integerInfo();//yukardaki satir ile ayni

        byteInfo();//2. method adi ile cagrildi

        Tugba.info();
        //Section2_Variables.Tugba.info(); - compile-time error- yani java compiler ben bunu calistirmam diyip kirmizi yakiyor
         */

        //</editor-fold>


        // Package-Class-Method Cagirma Iliskisi
        // Main methodun sonu
        // Compiler durur

        // Asagida yer alan methodlar halihazirda Variables Class inin icerisinde, yani Variables Clasinin mali
        // Class.methodName() ile cagirmana gerek yok
        // Dogrudan method adi yazarak cagirabilirsin

        byteInfo();
        shortInfo();
        integerInfo();
        longInfo();
        floatInfo();
        doubleInfo();
        charInfo();
        booleanInfo();

        // Asagidaki ifadeler tam sayi veri türlerinin ozelliklerini yazdirir

        System.out.println("Byte in en kucuk degeri:" + Byte.MIN_VALUE + " Byte in en buyuk degeri:" + Byte.MAX_VALUE + " Kac bit: " + Byte.SIZE);
        System.out.println("Short un en kucuk degeri:" + Short.MIN_VALUE + " Short un en buyuk degeri:" + Short.MAX_VALUE + " Kac bit: " + Short.SIZE);
        System.out.println("Integer in en kucuk degeri:" + Integer.MIN_VALUE + " Integer in en buyuk degeri:" + Integer.MAX_VALUE + " Kac bit: " + Integer.SIZE);
        System.out.println("Long un en kucuk degeri:" + Long.MIN_VALUE + " Long un en buyuk degeri:" + Long.MAX_VALUE + " Kac bit: " + Long.SIZE);

        // Asagidaki ifadeler ondalikli veri türlerinin ozelliklerini yazdirir

        System.out.println("Float in en kucuk degeri:" + Float.MIN_VALUE + " Float in en buyuk degeri:" + Float.MAX_VALUE + " Kac bit: " + Float.SIZE);
        System.out.println("Double in en kucuk degeri:" + Double.MIN_VALUE + " Double in en buyuk degeri:" + Double.MAX_VALUE + " Kac bit: " + Double.SIZE);

        // Asagidaki ifadeler alfasayisal veri turlerinin ozelliklerini yazdirir

        System.out.println(Character.MIN_VALUE);
        System.out.println(Boolean.FALSE);

        // non-static olan methodu static main methodtan direk cagiramazsin.
        // Bu yuzden olusturdugumuz methodlari main method icerisinden cagirarak calistirmak istiyorsak
        // Methodu static yapmak zorundayiz
        // public, static, private, protected keywordleri birer sifattir, methoda sifat katar
        // Static bir method static yada non-static bir methodun icinden cagirilabilir

        // Burasi Class seviyesi = classin icindesin
        // Classin icindeki her sey static olanlari tanir

        // Method icine method tanimlayamazsin ancak cagirabilirsin



    }
     //<editor-fold desc="PrimitiveDataTypes">
        public static void NumericDataTypes ()
        {
            // Numerik/Rakamsal veri tipleri ilkel(primitive) veri tiplerinden biridir.
            // Genel olarak primitive veri tipleri bellekte sabit yer tutarlar.
        }

        static void byteInfo()
        {
            // Hafizada 8 bitlik yer kaplar
            //-128 ile 127 arasindaki degerleri alabilir
            //NumericDataTypes(); // methodun icinden baska method cagirilabilir
            byte a;
            a = 1;
            System.out.println(a);
        }

        private static void shortInfo ()
        {
            // Hafizada 16 bitlik yer kaplar
            // -32768 ile 322767 arasindaki degerleri alabilir
            short b;
            b = 128;
            System.out.println(b);
        }

        protected static void integerInfo ()
        {
            // Hafizada 32 bitlik yer kaplar
            // -2.147.483.648 ile 2.147.483.647 arasindaki degerleri alabilir
            // Parantezin icindeki tum kodlarin temsilcisi integerInfo Methodudur
            int c;
            c = 040114;
            System.out.println(c);

            int birinciSayi = 15; // degiskenimi tanimladim ve ona hemencecik deger atadim
            int ikinciSayi;     // degiskenimi tanimladim ama degerini daha sonra atayacagim
            ikinciSayi = 30;      // bir ust satirda tanimladigim degiskenime simdi deger atiyorum
            birinciSayi = 45;     // bundan sonra birinciSayi adli degiskenimin degerini 45 al dedim
            int sayi1 = 10, sayi2 = 20; // tek satirda birden fazla degisken tanımladım.
            // degiskenleri virgül ile ayırıp statement sonunu ; ile kapattim!
            System.out.println("Birinci Sayinin Degeri:" + birinciSayi);
            System.out.println("Ikinci Sayinin Degeri" + ikinciSayi + " Sayi1=" + sayi1 + " Sayi2=" + sayi2);
        }

        public static void longInfo ()
        {
            // Hafizada 64 bitlik yer kaplar
            // -9.223.372.036.854.775.808 ile 9.223.372.036.854.775.807 arasindaki degerleri alabilir
            long d;
            d = 53438017;
            System.out.println(d);
        }

        public static void floatInfo ()
        {
            // Hafizada 32 bitlik yer kaplar
            // Cok buyuk sayilari bununla yazabilirsin
            // Ondalik sayilari float ile saklanir
            // Degerin sonuna f veya F koymalisin
            // Koymazsan varsayilan olarak double atanir
            float e;
            e = 1.68f;
            System.out.println(e);

        }

        public static void doubleInfo ()
        {
            // Hafizada 64 bitlik yer kaplar
            // Coook buyuk sayilari bununla yazabilirsin
            // Daha buyuk ondalik sayilar double ile saklanir
            // Degerin sonuna d veya D koymalisin
            // Koymasan bile javanin varsayilan atamasi double dir
            double f;
            f = 12.76898d;
            System.out.println(f);
        }

        public static void charInfo ()
        {
            // Hafizada 16 bitlik yer kaplar
            // Java'da tek tirnak icinde tek bir basit karakterin saklanmasi icin kullanilan veri tipidir
            // char bir harf = 'e', char bir sayi ='4' olabilir
            // a isimli degiskene tek tirnak icinde 4 degeri atanirsa artik bu tam sayi olan 4 degil bir karakter olarak algilanir
            // Bir char degiskenine ilk atama yapilmazsa java otomatik olarak '\u0000' degerini atar
            char harf;
            harf = 'e';
            System.out.println("Harf: " + harf);

            // Asagida integer icine char tanimlamis olarak gorunuyoruz fakat program hata vermiyor
            // Consol ciktisina baktıgimizda ise cok farkli bir durum goruyoruz
            // Bunun sebebi burada saklanan verinin aslinda harfin kendisi degil harfin karsilik geldigi unicode degeri olmasidir
            int integerDeger = 'B';
            System.out.println("Integer Deger: " + integerDeger);
        }

        public static void booleanInfo()
        {
            // Bellekte 1 bit yer kaplar
            // Sadece turue veya false degerini alan bir veri turudur
            // Ilk atama yapilmazsa varsayilan olarak false degeri atanir
            boolean sonuc = true;
            System.out.println("Boolean sonuc degiskeninin degeri : " + sonuc);
            sonuc = false;
            System.out.println("Boolean sonuc degiskeninin degeri: " + sonuc);

            /*
            int sayi; // sayi degiskenini tanimladim ancak henuz deger atamadim
            int sayi2 = sayi+1; // tanimli ama deger atanmamis degiskeni kulanarak yeni bir degisken tanimladim
            System.out.println("Boolean sonuc2 degiskeninin degeri : "+sayi);
             */

            /* Daha once tanimlanmis ama deger atanmamis degiskenleri kullanmak istedigimizde
            javanin otomatik deger atadigini soylemistik. Ama burada sandigimiz gibi sayi degiskeni
            otomatik olarak 0 degerini almadi ve sayi2 degiskenine 0+1=1 demedi.
            Bunun sebebi kodumuzun method icinde yazilmis olması. Degisken bir method icinde tanimlanmis ise
            mutlaka ilk deger atamasi yapilmalidir. Yoksa program hata verir.
            Ancak degisken bir class icinde tanimlanmis ise ilk deger atamasi yapılmayan degiskenler
            varsayilan deger ile islem gorur.
             */


        }

        //</editor-fold>


}



