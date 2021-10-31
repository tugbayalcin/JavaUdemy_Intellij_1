package Section2_Variables;

public class TypeCasting
{
    // Javada kucuk olan veri tipi otomatik olarak buyuk veri tipine donusturulur
    // int a=7 degerinin aynı zamanda long a=7 olmasi gibi
    // ancak buyuk veritipleri kucuk veri tipine donusturulurken type casting yapilmalidir
    public static void main(String[] args)
    {
        castingPractice();
        castingPractice_2();

    }

    private static void castingPractice_2()
    {
        int sayi1 =  10;
        double noktaliSayi1 = 25.52;

        /*
        noktaliSayi = sayi;
        System.out.println("Noktali sayinin degeri: "+ noktaliSayi  );
        // Burada bir sikinti olmadan atama yapildi.
        // Yalnizca noktaliSayi degiskeni double oldugu icin 10 yerine 10.0 yazdirdi
        // Şimdi tam tersini deneyelim
        */

       /*
        sayi = noktaliSayi; // uyumsuz veri turu diyerek hata verdi
                            // hata cozumune baktigimizda bize soyle bir yol gosterir -> cast to int
       */

        sayi1 = (int) noktaliSayi1; // bu su demek, cevirebildigin kadar double olan sayimi integer a cevir
        // cikti olarak bize tam sayi verir -> 25

        // simdi isi biraz daha karmasik hale getirelim

        int sayi2 = 11;
        float noktaliSayi2 = 130.8f; // burada f yazmazsan sayi otomatik olarak double algilanir

        byte byteSayi = 5;
        byteSayi = (byte) noktaliSayi2;
        System.out.println("Byte sayinin degeri: "+ byteSayi);

        // cikti olarak -126 gibi yapyanlis bir sonuc göruyoruz
        // bunun sebebi byte in en fazla 127 ye kadar sayi saklayabiliyor olmasi
        // böylece yanlis sonuc elde etmis olduk
        // bu konuya cok cok dikkat et


        // Integer.parsInt() : elimdeki ifadeyi yapabildigin kadar integer a cevir demek 1.yol
        // Integer.valueOf() : elimdeki ifadeyi yapabildigin kadar integer a cevir demek 2.yol

        // String.valueOf() : elimdeki ifadeyi yapabildigin kadar string e cevir demek
    }

    private static void castingPractice() {

        //ILKEL VERILERI -> ILKEL VERILERE DONUSTUME - CASTING

        //numerical primitive data types - kesirli numeric data types( float double)
        //auto-casting- yani biz casting yapmiyoruz compiler kendisi anlayabiliyor.
        //CASTING YAPABILMEMIZIN SEBEBI BUNLARIN HEPSININ Annesi Number Class'idir
        byte b = 1;
        short s = b;
        int i = s;
        i=b; i=s; i=(int)10.0f;

        long l = i;//64 bits
        l=b; l=s; l=i;

        float f=l;//32bits
        f=b; f=s; f=i; f=l;

        double d=l;
        d=b; d=(byte)1; d=s; d=(short)1; d=i; d=l; d=f;



        //senin yaptigin casting
        double d2 = 10;
        float f2 = (float) d2;
        long l2= (long) f2;
        int i2 =(int)l2; // manuel olarak casting yapmazsan kiziyor
        short s2= (short)i2;
        byte b2=(byte)s2;



        //deneme-practice
        double d3=(byte)(short)(int)(long)(float)10;

        byte b3=10;
        b3=(byte)(short)(int)(long)(float)(double)10;

        //auto-casting
        d=f=l=i=s=b;// byte->shotr->int->long->float->double 'a dondur- kisacasi d=1; demek istedik
    }
}
