package Section6_Methods;

import java.util.Scanner;

public class Vize
{
    public static void main(String[] args)
    {
       // vizeSorusu1();
       // vizeSorusu2();
        vizeSorusu3();
    }

    //<editor-fold desc="VizeSorusu_1">
    public static void vizeSorusu1()
    {
        // SORU: 5x5 bir matris olusturun. Ve bu matrisin elemanları 0-9 arasinda rastgele sayilar olsun.
        // Bu matrisi ekrana yazdirin ve capraz elemanlarin toplamini gosteren programi yaziniz.
        Scanner tara = new Scanner(System.in);

        System.out.println("Lutfen Matrisin Satir Sayisini Giriniz:");
        int satir = tara.nextInt();

        System.out.println("Lutfen Matrisin Sutun Sayisini Giriniz:");
        int sutun = tara.nextInt();

       int[][] matris= matrisOlustur(satir,sutun);
        matrisGoster(matris);
        asalKosegenToplami(matris);
        yedekKosegenToplami(matris);

    }
    public static int[][] matrisOlustur(int satirSayisi, int sutunSayisi)
    {
        int matris[][]=new int[satirSayisi][sutunSayisi];

        for(int satir=0; satir<matris.length; satir++)
        {
            for(int sutun=0; sutun<matris[satir].length; sutun++)
            {
                int eleman = (int)(Math.random()*10); // 0-9 arasi sayi ürettik
                matris[satir][sutun]= eleman;
            }
        }
        return matris;
    }
    public static void matrisGoster(int[][] matris)
    {
        for(int satir=0; satir<matris.length; satir++)
        {
            for(int sutun=0; sutun<matris[satir].length; sutun++)
            {
                System.out.print(matris[satir][sutun] +"\t");

            }
            System.out.println();
        }
    }
    public static int asalKosegenToplami (int[][] matris)
    {
       int toplam=0;
       // toplam += matris[i][i]; // 2.YOL daha kisa ve kolay ve pratik
        for(int satir=0; satir<matris.length; satir++)
        {
            for(int sutun=0; sutun<matris[satir].length; sutun++)
            {
                if(satir==sutun)
                {
                    toplam+=matris[satir][sutun];
                }

            }
        }
        System.out.println("Verilen Matrisin Asal Kosegenindeki Elemanlari Toplami:" +toplam);
       return toplam;
    }
    public static int yedekKosegenToplami (int[][] matris)
    {
        int toplam=0;
        for(int satir=0; satir<matris.length; satir++)
        {
            for(int sutun=0; sutun<matris[satir].length; sutun++)
            {
                if(satir+sutun==4) // aradigim elemanlar (1,5),(2,4),(3,3),(4,2),(5,1) oldugundan hepsinin indis toplami 6dir. ve bu kosulu saglayan baska eleman yoktur
                {
                    toplam+=matris[satir][sutun];
                }

            }
        }
        System.out.println("Verilen Matrisin Yedek Kosegenindeki Elemanlari Toplami:" +toplam);
        return toplam;
    }

    //</editor-fold>

    //<editor-fold desc="VizeSorusu_2">
    public static void vizeSorusu2()
    {
        // Decimal(ondalik) sayilari binary(0,1) formatina ceviren java programini yaziniz.
        // Program 30 sayisi icin 1 1 1 1 0 ciktisini uretmeli, String kullanabilirsiniz.

        // bir sayi binary formata cevirilirken bolme-2 methodu kullanilir ve cikan sonuc tersten yazilir.
        // bolme-2 methodu: sayiyi 2 ye bolup kalanini kenara yazarsin, bolumu 2 ye bolup kalani kenara yazarak bolum 1
        // olana kadar devam edersin

        Scanner veri = new Scanner(System.in);

        System.out.println("Donusturulecek Sayiyi Giriniz:");
        int donusturulecekSayi = veri.nextInt();

        bolme2Methodu(donusturulecekSayi);
    }
    public static String bolme2Methodu (int sayi)
    {


        String binarySayi = ""; // soruda string kullanabilirsiniz demisti
        if(sayi==0)
        {
            binarySayi = "0"; // metin olarak atadik, burasi asla yazdirilamayacak, while icinde ilk atamasini aldiktan sonra 0 sonsuza kadar yol olmaya mahkum olacak
        }
        while (sayi>0)
        {
            int kalan = sayi % 2;
            binarySayi = kalan + binarySayi; // binarySayi string oldugu icin burada + isareti toplama degil yanina yazma gorevi gorecek
            // yani kalan + binarySayi !=  binarySayi + kalan
            // biz kalani her defasinda sol tarafina yazdirmek istiyoruz(kalanlari tersten yazmmak istiyoruz)
            sayi=sayi/2;
        }
        System.out.println("Girilen Sayinin Binary Formu:" + binarySayi);


        return binarySayi;
    }


    //</editor-fold>

    //<editor-fold desc="VizeSorusu_3">
    public static void vizeSorusu3()
    {
        // Kucuk x harfini kullanarak buyuk bir X cizen programi yaziniz
        // Mesela satir sayisi olarak 5 alan bir program sunu cizmeli
        /*
              x     x
               x   x
                 x
               x   x
             x       x
        */

        Scanner veri = new Scanner(System.in);

        System.out.println("Satir Sayisini Giriniz:");
        int satirSayisi = veri.nextInt();


       char[][] buyukX = resimliMatrisOlustur(satirSayisi);
        matrisYazdir(buyukX);
        System.out.println("*********");
        hocaninCozumu();
    }

    public static char[][] resimliMatrisOlustur(int satirSayisi) // 1.YOL: ben yaptım
    {
        char matris[][]=new char[satirSayisi][satirSayisi];
        char kucukx= 'x';
        char bosluk= ' ';

        for(int satir=0; satir<matris.length; satir++)
        {
            for(int sutun=0; sutun<matris[satir].length; sutun++)
            {
               // (satir==sutun) ? (matris[satir][sutun]= kucukx) : (matris[satir][sutun]=bosluk ); // ternary
               // (satir+sutun==satirSayisi-1) ? (matris[satir][sutun]=kucukx) : (matris[satir][sutun]=bosluk); // ternary
                if(satir==sutun || satir+sutun==satirSayisi-1)
                {
                    matris[satir][sutun]=kucukx;
                }
                else
                {
                    matris[satir][sutun]=bosluk;
                }




            }
        }
        return matris;
    }
    public static void matrisYazdir(char[][] dizi) // 1.YOL: ben yaptım
    {
        for (int satir = 0; satir < dizi.length; satir++) // satirlari gezen for dongusu
        {
            for (int sutun = 0; sutun < dizi[satir].length; sutun++)  // sutunlari gezen for dongusu
            {
                System.out.print(dizi[satir][sutun] + "\t");
            }
            System.out.println();
        }
    }
    public static void hocaninCozumu() // 2. YOL:  bence daha guzel
    {
        Scanner veri = new Scanner(System.in);

        System.out.println("Satir Sayisini Giriniz:");
        int satirSayisi = veri.nextInt();

        for(int satir=0; satir<satirSayisi; satir++) {
            for (int sutun = 0; sutun < satirSayisi; sutun++)
            {
                if (satir == sutun || sutun == (satirSayisi - satir - 1)) //sorunun en onemli kismi burasi
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }


    //</editor-fold>



}
