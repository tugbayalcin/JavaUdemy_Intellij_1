package Section4_ControlStructures;

public class JavaMathClass
{
    public static void main(String[] args)
    {
        // javanin standart siniflarindandir
        // yani kullanmak icin ekstra bir packeage import etmemize gerek yok (java.lang package ında yer alir)
        // matematiksel islemleri daha kolay yapmamiz icin bazi methodlar ve sabitler icerir
        // random sayilar uretmek istiyorsak kullanabiliriz

        System.out.println("Pi Sayisi: " + Math.PI);
        System.out.println("E Sayisi: " + Math.E);

        System.out.println("Verilen Sayinin Mutlak Degeri: " + Math.abs(-5));
        System.out.println("Verilen Sayinin Yuvarlanmis Hali: " + Math.ceil(7.3)); // yalnizca bir ust sayiya yuvarlar
        System.out.println("Verilen Sayinin Istenen Kuvveti: " + Math.pow(2,3)); // once ussu alinacak sayi, sonra istenen kuvvet yazilir
        System.out.println("Verilen Sayinin Karekoku " + Math.sqrt(16));
        System.out.println("Verilen Sayilardan Hangisi Daha Buyuk " + Math.max(7,16));
        System.out.println("Verilen Sayilarda Hangisi Daha Kucuk " + Math.min(7,16));

        // Math.random(); // 0 ile 1 arasinda double degerler uretir. asla 1 olmaz

        int onaKadarRastgeleSayi = (int)(Math.random() * 11);
        System.out.println("Rastgele Uretilen Sayi: " + onaKadarRastgeleSayi);


        int ikiyeKadarSayiUret = (int)(Math.random() * 2 + 1);
        System.out.println("Rastgele Uretilen Sayi 2 : " + ikiyeKadarSayiUret);

        // eger rastgele uretilecek sayilarin arasinda 0'in da olmasini istiyorsak Math.random() * (ust sinir +1)
        // eger rastgele uretilecek sayilarin arasinda 0'in  olmasini istemiyorsak Math.random() * (ust sinir) +1


    }
}
