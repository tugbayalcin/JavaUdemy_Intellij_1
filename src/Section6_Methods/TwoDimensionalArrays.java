package Section6_Methods;

public class TwoDimensionalArrays // IKI BOYUTLU DIZILER
{
    public static void main(String[] args)
    {
        //<editor-fold desc="Iki Boyutlu Diziler/Notlarim">

        // Diziler ayni turde verileri tutan bir yapidir demistik
        // Iki  boyutlu diziler de aslinda elemanlari da dizi olan dizilerdir
        // Yani dizi tutan dizilerdir
        // Matematikteki matris sistemini iki boyutlu dizi kullanarak olusturabiliriz
        // Ayrica bir tablodak verileri belirtmek icin de iki boyutlu dizilerden yararlaniriz
        // FORMUL: veritipi [][] diziAdi = new veritipi[satir sayisi][sutun sayisi]
        //         int [][] sayilar = new int [2][3];
        // ifadesi 2 satirli 3 sutunlu bir matris demektir

        /*
        Borc Tablosu    Emre    Hasan     Ali
        Emre             0       100      200
        Hasan           350       0       250
        Ali             150      500       0
        */

        // int[][] borclar = {{0,100,200},{350,0,250},{150,500,0}};
        // Hasan'in Ali'ye borcu icin borclar[1,2] demmek yeterli (index 0''dan baslar)

        // Iki boyutlu bir dizide her bir satir aslinda baska bir diziyi tutan dizidir
        // borclar[0].length -> 3 elemanli bir dizidir
        // O yuzden her bir satir farkli elemanli diziler de tutabilir
        // int[][] degisikElemanSayiliDizi = new int[5]; -> bu su demek 5 satirli, yani 5 tane diziden olusan bir dizim var
        // degisikElemanSayiliDizi[0] O= new int[5]; -> 1. satirimda 5 elemanli bir dizim var
        // degisikElemanSayiliDizi[1] O= new int[4]; -> 2. satirimda 4 elemanli bir dizim var
        // degisikElemanSayiliDizi[2] O= new int[3]; -> 3. satirimda 3 elemanli bir dizim var
        // degisikElemanSayiliDizi[3] O= new int[2]; -> 4. satirimda 2 elemanli bir dizim var
        // degisikElemanSayiliDizi[4] O= new int[1]; -> 5. satirimda 1 elemanli bir dizim var

        // Bu dizilerin elemanlarini gezerken ic ice for donguleri kullanilabilir;
        /*
        for (int satir =0; satir<dizi.length; satir++)
        {
            for (int sutun =0; sutun<dizi[satir].length; sutun++)
            {
                System.out.println("Eleman: " + dizi[satir][sutun]);
            }
        }
         */

        // dizi.length : satir sayisini verir
        // dizi[0].length : 0. satirdaki sutun sayisini verir

        //</editor-fold>

        // 2x3 luk bir matris icin;
        int[][] sayilar = new int[2][3];
        sayilar[0][0] = 1; // tek tek index kullanarak tanimlama
        sayilar[0][1] = 2; // bence cok kotu kod
        sayilar[0][2] = 3;
        sayilar[1][0] = 4;
        sayilar[1][1] = 5;
        sayilar[1][2] = 6;

        // 3x3 luk bir matris icin;
        int[][] sayilar2 = {{1,2,3},{4,5,6},{7,8,9}}; // tek seferde tanimlama
        String[] isimler = {"Emre","Hasan","Ali"};

        for (int satir =0; satir<sayilar.length; satir++) // satirlari gezen for dongusu
        {
            for (int sutun =0; sutun<sayilar[satir].length; sutun++)  // sutunlari gezen for dongusu
            {
                System.out.println(satir + ". Satirin" + sutun + ". Sutunundaki Deger: " + sayilar[satir][sutun]);
            }
        }

        System.out.println("\n ************* \n");

        // borclar tablosunu yazalim
        int [][] borclar = {{0,100,200},{350,0,250},{150,500,0}};
        for (int satir =0; satir<borclar.length; satir++) // satirlari gezen for dongusu
        {
            for (int sutun =0; sutun<borclar.length; sutun++)  // sutunlari gezen for dongusu
            {
               if(satir != sutun)
               {
                   int alacak = borclar[satir][sutun] - borclar[sutun][satir];
                   if (alacak < 0)
                   {
                       System.out.println(isimler[satir] + "'nin" + isimler[sutun] + "'den Alacagi: " +(- alacak));
                   }

               }
            }
        }

    }
}
