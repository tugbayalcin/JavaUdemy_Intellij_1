package Section6_Methods;

public class Foreach
{
    public static void main(String[] args)
    {
        // FOREACH //
        // Daha once dizi elemanlarini for dongusu ile gezmistik
        // Dizi elemanlarini okumak icin cok daha kullanisli foreach adinda bir yapi vardir
        // Eger index ile isimiz yoksa ve sadece dizi elemanlarini gormek şstiyorsak bu yapiyi kullanabiliriz
      /*
        for (int oAnkiSayi:diziAdi)
        {
            System.out.println(oAnkiSayi);
        }
        seklinde bir kullanimi vardir. foreach yazinca format otomatik olarak olusur
        */

        int sayilar[] = {1,5,7,-9,62};
        for(int i=0; i<sayilar.length; i++)
        {
            System.out.println("Eleman: " + sayilar[i]);
        }

        for (int oAnkiSayi:sayilar)
        {
            System.out.println("Foreach Icin Eleman: " + oAnkiSayi);
        }

        String isimler[] = {"Tugba", "Emre", "Asel", "Borusko", "SariKiz"};

        diziYazdir(isimler); //  methodumun diziyi tanimasi icin dizi adini parametre olarak eklemem gerek
    }

    public static void diziYazdir(String dizi[]) // dizimi methopduma tanitiyorum, sana string degerlerden olusan bir dizi gondericem onu tani diyorum

  //  main methodda isimler adi ile tanimladigim dizim diziYazdir methodumda dizi adi ile cagirilmis
    {
        for (String isim:dizi)
        {
            System.out.println("Method Foreach Isim: " + isim);
        }
    }
}


