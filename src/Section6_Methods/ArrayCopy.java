package Section6_Methods;

public class ArrayCopy // Dizilerin Kopyalanmasi
{
    public static void main(String[] args)
    {
       // MANUEL KOPYALAMA

        int[] anaDizi= {1,7,9,10};
        int[] kopyaDizi = new int[anaDizi.length];

        for(int index=0; index<anaDizi.length; index++) // for dongusuyle dizimi gezip yaptirmak istedigim islemlerin her bir eleman icin yapilmasini sagliyorum
        {
            kopyaDizi[index] = anaDizi[index]; // kopya dizimin index elemanina ana dizimin index elemanini atiyorum
        }
        // dizinin kendisini sout diyerek yazdiramiyoruz. Ancak her bir indeksini girerek yazdirabiliriz veya foeach kullaniriz
        for (int sayi:kopyaDizi)
        {
            System.out.println("Manuel Kopya Dizi Elemani:" + sayi);
        }
        System.out.println("**********");

        // ARRAYCOPY METHODU ILE KOPYALAMA

        int[] kopyaDizi2 = new int[anaDizi.length];
        System.arraycopy(anaDizi,0,kopyaDizi2,0, anaDizi.length);
        diziYazdir(kopyaDizi2);
        System.out.println("**********");
        // System classinin icinden arraycopy methodunu cagirdik
        // bu mmethod icine parametre olarak sirasiyla;
        // kopyalanacak dizi, kopyalanmaya baslanacak ilk eleman, kopya dizi, kopya dizinin hangi elemanina kopyalanacak, kac tane kopyalanacak verilerini alir
        // bu bilgiye method uzerine gelince cikan kutudan erisebilirsin


        int[] denemeDizi = new int[anaDizi.length];
        int sayi1 = 10;
        int sayi2 = 0;
        sayi2=sayi1; // sayi2 de artik 0 yok, sayi1 in degeri olan 10 var
        // bunu diziler icin de yapmaya calisalim
        denemeDizi= anaDizi; // hata almadik, bakalim deneme dizisini yazdirdigimizda ne gorecegiz (yalnizca referansini paylasti!!)
        // 1,7,9,10 // 1,7,9,10
        diziYazdir(denemeDizi);
        System.out.println("**********");
        diziYazdir(anaDizi);
        // su anda her iki dizi de ayni elemanlari yazdirdi, bu dizilerin kopyalandigi anlamina mi geliyor bakalim

        anaDizi[0]=100; // anaDizinin 0. elemanini 100 ile degistirdik
        System.out.println("anaDizi'deki Ilk Eleman Degistirildi");
        diziYazdir(anaDizi);
        System.out.println("**********");
        System.out.println("denemeDizi'si Yazdiriliyor");
        diziYazdir(denemeDizi); // deneme dizisinin de ilk elemani da degisti

        int[] tersiOlusturulmusDizi = tersiniOlustur(anaDizi);
        System.out.println("100,7,9,10 Degerleri Ters Sirada Diziye Atandi.");
        diziYazdir(tersiOlusturulmusDizi);

    }
    // parametre olarak aldigi degerin tersini yazdiran bir method olusturalim
    public static int[] tersiniOlustur(int[] dizi)
    {
       int[] tersDizi = new int[dizi.length];

        for(int i=0, j=dizi.length-1; i<dizi.length;i++,j--)
        {
            tersDizi[j]=dizi[i];
        }
        return(tersDizi);
    }
    public static void diziYazdir(int[] yazdirilacakDizi)
    {
        for (int sayi:yazdirilacakDizi)
        {
            System.out.println("Method Kopya Dizi Elemani:" + sayi);
        }
    }
}
