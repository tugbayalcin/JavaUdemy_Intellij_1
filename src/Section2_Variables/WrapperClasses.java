package Section2_Variables;

public class WrapperClasses
{
    public static void main(String[] args)
    {
        // BOXING: (kutulama): Primitive tipte deklare edilen(tanimlanan) verilerin, bir class sablonu altinda yapilandirilma islemidir
        // Diger bir deyisle primitive bir verinin objelestirilme islemidir
        // Bu islem primitive bir veriye bir obje ile yapilan Sarmalama(Encapsulation) islemidir
        // yani bildigimiz anlamda int primitive degiskeninin Integer wrapper class i int degiskeninin kutulanmis halidir
        // kutulanmak demek, heapte onun icin kutu acilmasi demek
        // heapte yer almak icin obje olmak zorundasin

        // UNBOXING: Boxing isleminin tam tersidir
        // Yani nesne olarak benzetilmis primitif bir veri,tekrardan nesne boyutundan çıkarak ozune doner

        // Her primitive data type'i sarmalayan bir class bulunmaktadir ve veri türünün buyuk harfle baslayan versiyonudur
        // Ornegin int => Integer, double => Double etc..
        // Bu sinif nesneleri null deger alabilir
        // Burada veri turlerimizin alacagi max ve min degerleri icin bu siniflarin kullanimini gorecegiz
        // System.out.println("En büyük integerdeger: " +Integer.MAX_VALUE);
        // System.out.println("En büyük floatdeger: " +Float.MAX_VALUE); etc..

        // Boolean turu haric diger tum verilerin wrapper classlarinda MIN_VALUE ve MAX_VALUE isimli final ve statiic veri elemani vardir.
        // Bu turlerin en bkucuk ve en buyuk degerlerini verir

        // Boolean turu haric diger tum verilerin wrapper classlarinda SIZE isimli final ve static veri elemani vardir
        // Ilgili primitive type in bit cinsinden uzunluk bbilgisini tutar

        // Boolean turu haric diger tum verilerin wrapper classlarinda BYTES isimli final ve static veri elemani vardir
        // Ilgili primitive type in byte cinsinden uzunluk bbilgisini tutar

        // Numeric turlerin parsexxx methodlari vardir. Burada xxx olan yere tur adi yazilir; int, double, etc
        // Bu method string bir ifadeyi istenilen ture cevirir

        int i = 5; // burada i primitive dir, stackte tutulur
        // i. yaparsan methodlara erisemezsin cunku i primitivdir
        // ancak asagidaki ornekte
        Integer j=8; // *** burasi bir wrapper class tanimlamasidir. artik j bir nesnedir ve heapte yer alir
        // j. yazdigimizda classlarin onumuze ciktigini goruruz. bunun sebebi j nin bir obje olarak tanimlanmis olmasidir

        int k = new Integer(6); //
        // bu tanimlamanin int i=5 tanimlamasindan farki yoktur
        // k. dedigim zaman methodlari goremem


        Integer l = new Integer(7); // l objedir, heapte tutulur
        // burada java bize sari yakiyor. Diyor ki unneccessary boxing.
        // Bu su demek sen gereksiz yere primitive bir tipi obje olarak oluşturuyorsun
        // bu tanimlamanin Integer j=8 tanimlamasindan farki yoktur
        // l. dedigimde methodlarin dokuldugunu gorebilirim



    }

}

class WrapperClassMethodlari
{
    public static void main(String[] args)
    {
        typeValue(); // objeyi primitivine donusturur, wrapper ı primitive yapar // galiba artik kullanilmiyor, casting otomatik yapiliyor
        compareTo(); // girilen degerleri buyuk kucuk veya esit mi diye karsilastirir
        equals(); // OVERRİDE EDİLMİS - yalnizca ayni type nesnelerin icerik karsilastirmasini yapar
        valueOf(); // string veya primitive veriyi objeye donusturur
        toStringMethodu(); // OVERRİDE EDİLMİS - objeyi veya primitive datayi stringe cevirmek icin kullaniriz
        parseType("a"); // Stringden primitive ture donusum yapilir
        abs(); //   buradan asagida kalan methodlar ayni zamanda Math classinin methodlari oldugu icin internette kaynak bulamadim
        ceil(); //
        floor(); //
        round(); //
        min(); //
        maxMethodu(); //
        exp(); //
        log(); //
        pow(); //
        sqrt(); //
        sin(); //
        cos(); //
        tan(); //
        asin(); //
        acos(); //
        atan(); //
        toDegrees(); //
        toRadians(); //
        random(); //
    }

    //<editor-fold desc="Methods">
    private static void random() {

    }
    private static void toRadians() {

    }
    private static void toDegrees() {

    }
    private static void atan() {

    }
    private static void acos() {

    }
    private static void asin() {

    }
    private static void tan() {

    }
    private static void cos() {

    }
    private static void sin() {

    }
    private static void sqrt() {

    }
    private static void pow() {

    }
    private static void log() {

    }
    private static void exp() {

    }
    private static void maxMethodu() {

    }
    private static void min() {

    }
    private static void round() {

    }
    private static void floor() {

    }
    private static void ceil() {

    }
    private static void abs(){}
    private static void parseType(String s)
    {
        // Bir string ifadeyi Char haric diger siniflarin primitive tipine cevirir

        boolean b = Boolean.parseBoolean("true");
        System.out.println("Primitive boolean" +b);

        byte b1 = Byte.parseByte("5");
        System.out.println("Primitive byte" +b1);

        short sh = Short.parseShort("1");
        System.out.println("Primitive short" +sh);


        int i = Integer.parseInt("10");
        System.out.println("Primitive int" +i);

        long l = Long.parseLong("68576945796");
        System.out.println("Primitive long" +l);

        float f = Float.parseFloat("534");
        System.out.println("Primitive float" +f);

        double d = Double.parseDouble("10.5");
        System.out.println("Primitive double" +d);

    }
    private static void toStringMethodu()
    {
        // Wrapper objeyi veya primitive datayi stringe cevirmek icin kullaniriz
        // birkac overload u vardir

        Integer I = new Integer(10);
        String s = I.toString();
        System.out.println(s);

        // Her wrapper class asagidaki methodu kullanabilir
        String S = Integer.toString(10);
        System.out.println(S);
        String s1 = Character.toString('a');
        System.out.println(s1);


    }
    private static void valueOf()
    {
        // String veya primitive degiskenlerden wrapper objesi olusturmak istedigimizde valueOf() methodunu kullaniriz
        // valueOf() methodunun 3 overloadu vardir

        // 1. Wrapper.valueOf(String s) : Character Class haricindeki tum wrapper classlarda,
        // verilen dizeyi(stringi) objeye(wrapper class objesi)cevirebilmek icin  bir valueOf() methodu vardir

        // asagida valueOf icine string alıp, hemen onunde yer alan wrapper class in tipinde bir objeye donusturuyor
        // burada onemli olan kisim parametre string olsa dahi rakamlardan olusmalidir

        Boolean B = Boolean.valueOf("true");
        System.out.println("Boolean: "+B);

        Byte Bt = Byte.valueOf("7");
        System.out.println("Byte: "+Bt);

        Short S = Short.valueOf("3");
        System.out.println("Short: "+S);

        Integer I = Integer.valueOf("10");
        System.out.println("Integer: "+I);

        Long L = Long.valueOf("17");
        System.out.println("Long: "+L);

        Float F = Float.valueOf("13.5");
        System.out.println("Float: "+F);

        Double D = Double.valueOf("10.0");
        System.out.println("Double: "+D);

        // Integer i1 = Integer.valueOf("ten");
        // System.out.println("i1: "+i1);
        // Hata veriyor

        // 2. Wrapper.valueOf(String s,int radix):
        // Her ıntegral wrapper classi (bayte,short,integer,long) belirtilen taban ile verilen string icin
        // bir wrapper objesi olusturmak icin asagidaki mmethodu kullanir, taban araligi 2-36 dir

        Integer I1 = Integer.valueOf("1111", 2);
        System.out.println(I1); // burada 1111 stringi 2 lik tabanda integer a cevrilmistir
        Integer I2 = Integer.valueOf("1111", 4);
        System.out.println(I2); // burada 1111 stringi 4 luk tabanda integer a cevirmistir

        // 3. Wrapper.valueOf(primitive p): Tum veri tipleri girilen ilkel tur icin wrapper objesi olusturmak icin asagidaki methodu kullanir

        Boolean Bb = Boolean.valueOf(true);
        System.out.println("Boolean: "+Bb);

        Character Cc = Character.valueOf('a');
        System.out.println("Char: "+Cc);

        Byte Bbb = Byte.valueOf((byte) 2);
        System.out.println("Byte: "+Bbb);

        Short Ss = Short.valueOf((short) 5);
        System.out.println("Short: "+Ss);

        Integer Ii = Integer.valueOf(10);
        System.out.println("Integer: " +Ii);

        Long Ll = Long.valueOf(78);
        System.out.println("Long: "+Ll);

        Float Ff = Float.valueOf(13.7f);
        System.out.println("Float: "+Ff);

        Double Dd = Double.valueOf(10.5);
        System.out.println("Double: "+Dd);


    }
    private static void equals()
    {
        // Iki nesneyi icerik olarak karsilastirir
        // Geriye donus tipi booleandir yani true ve false dondurur
        //

        Boolean booleanObject1 = new Boolean("true");
        Boolean booleanObject2 = new Boolean("true");
        Boolean booleanObject3 = new Boolean("false");
        System.out.println("booleanObject1 ile booleanObject2 esit mi: " + booleanObject1.equals(booleanObject2));
        System.out.println("booleanObject2 ile booleanObject3 esit mi: " + booleanObject2.equals(booleanObject3));

        Character charObject1 = new Character('a');
        Character charObject2 = new Character('b');
        Character charObject3 = new Character('a');
        System.out.println("charObject1 ile charObject2 esit mi: " + charObject1.equals(charObject2));
        System.out.println("charObject1 ile charObject3 esit mi: " + charObject1.equals(charObject3));

        Byte byteObject1 = 5;
        Byte byteObject2 = 6;
        Byte byteObject3 = 5;
        System.out.println("byteObject1 ile byteObject2 esit mi: " + byteObject1.equals(byteObject2));
        System.out.println("byteObject1 ile byteObject3 esit mi: " + byteObject1.equals(byteObject3));

        Short shortObject1 = 6;
        Short shortObject2 = 7;
        Short shortObject3 = 6;
        System.out.println("shortObject1 ile shortObject2 esit mi: " + shortObject1.equals(shortObject2));
        System.out.println("shortObject1 ile shortObject3 esit mi: " + shortObject1.equals(shortObject3));

        Integer intObject1 = new Integer(10);
        Integer intObject2 = new Integer(15);
        Integer intObject3 = new Integer(10);
        System.out.println("integerObject1 ile integerObject2 esit mi: " + intObject1.equals(intObject2));
        System.out.println("integerObject1 ile integerObject3 esit mi: " + intObject1.equals(intObject3));

        Long longObject1 = new Long(7857695);
        Long longObject2 = new Long(7857345);
        Long longObject3 = new Long(7857695);
        System.out.println("longObject1 ile longObject2 esit mi: " + longObject1.equals(longObject2));
        System.out.println("longObject1 ile longObject3 esit mi: " + longObject1.equals(longObject3));

        Float floatObject1 = new Float(10.5f);
        Float floatObject2 = new Float(11.5f);
        Float floatObject3 = new Float(10.5f);
        System.out.println("floatObject1 ile floatObject2 esit mi: " + floatObject1.equals(floatObject2));
        System.out.println("floatObject1 ile floatObject3 esit mi: " + floatObject1.equals(floatObject3));

        Double doubleObject1 = new Double(13.7);
        Double doubleObject2 = new Double(13.4);
        Double doubleObject3 = new Double(13.7);
        System.out.println("doubleObject1 ile double0bject2 esit mi: " + doubleObject1.equals(doubleObject2));
        System.out.println("doubleObject1 ile doubleObject3 esit mi: " + doubleObject1.equals(doubleObject3));

        // aynı typelar arasi karsilastirmanin kolaylikla yapilabildigini gorduk.
        // peki farkli tipleri karsilastirabiliyor muyuz gorelim:

        Integer i1 = 17;
        Double d1 = 17.0d;
        Float f1 = 17.0f;
        Byte b1 = 17;
        Short s1 = 17;
        Long l1 = 17L;

        System.out.println("integer ile double esit mi: " + i1.equals(d1));
        System.out.println("double ile float esit mi: " + d1.equals(f1));
        System.out.println("byte ile short esit mi: " + b1.equals(s1));

        // hepsinde false dondurdu

    }
    private static void compareTo()
    {
        // bu method girilen ayni type dan iki degeri birbiriyle sayisal olarak karsilastirir
        //  0: nesne1 = nesne2 ise
        // -1: nesne1 < nesne 2 ise
        //  1: nesne1 > nesne2 ise

        Byte b1=1;
        Byte b2=2;
        Byte b3=1;
        System.out.println("byte icin");
        System.out.println("kucuk: " + b1.compareTo(b2));
        System.out.println("buyuk: " + b2.compareTo(b1));
        System.out.println("esit: " + b1.compareTo(b3));
        System.out.println();

        Short s1=10;  // -10 yazdirdi ??
        Short s2=20;  //  10 yazdirdi ??
        Short s3=10;
        System.out.println("short icin");
        System.out.println("kucuk: " + s1.compareTo(s2));
        System.out.println("buyuk: " + s2.compareTo(s1));
        System.out.println("esit: " + s1.compareTo(s3));
        System.out.println();

        Integer i1=100;
        Integer i2=200;
        Integer i3=100;
        System.out.println("integer icin");
        System.out.println("kucuk: " + i1.compareTo(i2));
        System.out.println("buyuk: " + i2.compareTo(i1));
        System.out.println("esit: " + i1.compareTo(i3));
        System.out.println();

        Long l1= 1000L;
        Long l2= 2000L;
        Long l3= 1000L;
        System.out.println("long icin");
        System.out.println("kucuk: " + l1.compareTo(l2));
        System.out.println("buyuk: " + l2.compareTo(l1));
        System.out.println("esit: " + l1.compareTo(l3));
        System.out.println();

        Float f1=1.0f;
        Float f2=2.0f;
        Float f3=1.0f;
        System.out.println("float icin");
        System.out.println("kucuk: " + f1.compareTo(f2));
        System.out.println("buyuk: " + f2.compareTo(f1));
        System.out.println("esit: " + f1.compareTo(f3));
        System.out.println();

        Double d1=1.0d;
        Double d2=2.0d;
        Double d3=1.0d;
        System.out.println("double icin");
        System.out.println("kucuk: " + d1.compareTo(d2));
        System.out.println("buyuk: " + d2.compareTo(d1));
        System.out.println("esit: " + d1.compareTo(d3));
        System.out.println();


    }
    private static void typeValue()
    {
        Boolean booleanObject = new Boolean("true");
        boolean degisken = booleanObject.booleanValue();
        System.out.println("booleanObject degiskeninin boolean degeri: " + degisken);


        Character charObject = new Character('a');
        char c = charObject.charValue();
        System.out.println("charObject degiskeninin char degeri: " + c);

        Byte byteObject = 5; // autoboxing
        byte b = byteObject.byteValue();
        System.out.println("byteObject degiskeninin byte degeri: " + b);

        Short shortObject = 6; // autoboxing
        short s = shortObject.shortValue();
        System.out.println("shortObject degiskeninin short degeri: " + s);

        Integer intObject = new Integer(10);
        int i = intObject.intValue();
        System.out.println("intObject  degiskeninin integer degeri: " + i);

        Long longObject = new Long(7857695);
        long l = longObject.longValue();
        System.out.println("longObject degiskeninin long degeri: " + l);

        Float floatObject = new Float(10.5f);
        float f = floatObject.floatValue();
        System.out.println("floatObject degiskeninin float degeri: " + f);

        Double doubleObject = new Double(13.7);
        double d = doubleObject.doubleValue();
        System.out.println("doubleObject degiskeninin double degeri: " + d);

    }

    //</editor-fold>
}

class WrapperHafizaYonetimi
{

}
class Autoboxing // Primitive bir degiskenin wrapper sinif tipine otomatik olarak donusturme islemine denir.
{
    public static void main(String[] args)
    {
        // Ilkel veri turlerinin kendi turlerinden wrapperlara otomatik olarak donusturulmesine boxing yani kutulama denir
        // Bu islemin tam tersine de unboxing, yani kutudan cikarma denir
        // Bu islemin otomatik olarak yapilmasi sayesinde bizim donusum icin ekstra kod yazmamiza gerek kalmaz

        // boxing ornegi
        int a=50;
        Integer a2=new Integer(a);//Boxing --> Constructor yardimi ile primitive datayi wrapper dataya donusturuyoruz ancak version 9'dan beri kullanilmiyor

        Integer a3=5;//AutoBoxing  ,( burada new ile tanimlamasak da a3 bir nesnedir )


        System.out.println(a2+" "+a3);


    }
}

class Unboxing
{
    public static void main(String[] args)
    {
        // unboxing ornegi
        Integer i=new Integer(50); // i obje tipinde tanimlandi
        int b=i; // obje olan i integer olan b ye atandi, tip otomatik olarak int primitiveine dondu -->AUTOUNBOXING
        int c=i.intValue(); // bu sekilde de yapabilirsin ama gereksiz diyor -->UNBOXING
        System.out.println(b);

    }
}
