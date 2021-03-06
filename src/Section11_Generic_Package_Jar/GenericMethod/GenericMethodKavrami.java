package Section11_Generic_Package_Jar.GenericMethod;

public class GenericMethodKavrami
{
    public static void main(String[] args)
    {
        String[] isimler = {"tugba","asel","yalcin"};
        Integer[] sayilar = {1,5,7};
        Character[] karakterler = {'a','b','c'};

        stringDiziYazdir(isimler);
        integerDiziYazdir(sayilar);
        charDiziYazdir(karakterler);

        diziYazdir(isimler);
        diziYazdir(sayilar);
        diziYazdir(karakterler);
        // tipki classlarda oldugu gibi burada da en genel class olan object classini kullanarak farkli tipteki diziler
        // icin bir islem uygulamak istedigimde cast sorunu ortaya cikacak, bunu cozsem bile runtime da error alacagim

        genericYazdir(isimler);
        genericYazdir(sayilar);
        genericYazdir(karakterler);
    }
    // diamond geri donus tipinden hemen once kullanilir
    public static <Genel>void genericYazdir(Genel[] dizi) // diamond icine <Genel extend Number> yazilabilir
    {
        for (Genel gecici:dizi)
        {
            System.out.println(gecici);
        }
    }
    public static void diziYazdir(Object[] dizi) // polymorphism
    {
        for (Object gecici:dizi)
        {
            System.out.println(gecici);
        }
    }
    public static void stringDiziYazdir(String[] dizi)
    {
        for (String gecici:dizi)
        {
            System.out.println(gecici);
        }
    }
    public static void integerDiziYazdir(Integer[] dizi)
    {
        for (Integer gecici:dizi)
        {
            System.out.println(gecici);
        }
    }
    public static void charDiziYazdir(Character[] dizi)
    {
        for (Character gecici:dizi)
        {
            System.out.println(gecici);
        }
    }
}
