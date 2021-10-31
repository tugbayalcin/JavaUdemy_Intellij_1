package Section4_ControlStructures;
import java.util.Scanner;
public class BolumSonuOdev
{
    public static void main(String[] args)
    {
        //<editor-fold desc="Soru1">

        // SORU1: Kulanicidan aldiginiz degerlere gore vucu kitle indeksini hesaplayiniz
        // Vucut Kitle Indeksi: kilo(kg) / ((boy(cm)/100) karesi)

        System.out.println("Vucut kitle Indeks Programina Hosgeldiniz");

        Scanner index = new Scanner(System.in);

        System.out.println("Kilonuzu kg Cinsinden Giriniz: " );
        double kilo = index.nextDouble();
        System.out.println("Boyunuzu cm Cinsinden Giriniz: " );
        int boy = index.nextInt();
        double cmToMetre = boy/100.0;
        double vucutKitleIndeksi = kilo / (Math.pow(cmToMetre,2));
        System.out.println("Girilen Boy ve Kilo Degeri İcin Vucut Kitle Indeksi: " + vucutKitleIndeksi);

        if(vucutKitleIndeksi<15)
        {
            System.out.println("Cok Ciddi Derecede Dusuk Kilolu");
        }
        else if(vucutKitleIndeksi>15 && vucutKitleIndeksi<16 )
        {
            System.out.println("Ciddi Derecede Dusuk Kilolu");
        }
        else if(vucutKitleIndeksi>16 && vucutKitleIndeksi<18.5 )
        {
            System.out.println("Dusuk Kilolu");
        }
        else if(vucutKitleIndeksi>18.5 && vucutKitleIndeksi<25 )
        {
            System.out.println("Normal-Saglikli Kilolu");
        }
        else if(vucutKitleIndeksi>25 && vucutKitleIndeksi<30 )
        {
            System.out.println("Fazla Kilolu");
        }
        else if(vucutKitleIndeksi>30 && vucutKitleIndeksi<35 )
        {
            System.out.println("1. Dereceden Hafif Obez");
        }
        else if(vucutKitleIndeksi>35 && vucutKitleIndeksi<40 )
        {
            System.out.println("2. Dereceden Ciddi Obez");
        }
        else if(vucutKitleIndeksi>40 )
        {
            System.out.println("3. Dereceden Cok Ciddi Obez");
        }

        //</editor-fold>

        //<editor-fold desc="Soru2">

        // SORU 2: Kucuk bir piyango oyunu tasarlayiniz.
        // Sistem 2 basamakli bir sayi uretmeli ve kullanici da bu sayiyi tahmin etmeli
        // Eger kullanici sayiyi tam olarak dogru bilirse 10000TL;
        // Eger kullanici sayinin basamaklarini bilirse yani 56 yerine 65 derse 5000TL;
        // Eger kullanici sansli sayinin yalnizca bir basamagini bilirse 1000TL kazanir.

        int sansliSayi = (int)(Math.random() * 99 + 1 ); // 1 ile 100 arasi sayi uretir
        System.out.println("Lutfen Tahmininizi Giriniz: " );
        int tahminEdilenSayi = index.nextInt();

        int sansliSayiBirinciBasamak = sansliSayi/10 ;
        int sansliSayiIkinciBasamak = sansliSayi%10 ;

        int tahminEdilenSayiBirinciBasamak = tahminEdilenSayi/10 ;
        int tahminEdilenSayiIkinciBasamak = tahminEdilenSayi%10 ;

        if(sansliSayi==tahminEdilenSayi)
        {
            System.out.println("Tebrikler 10000TL Kazandiniz. Sansli Sayi: " + sansliSayi + " Tahmininiz: " + tahminEdilenSayi);
        }
        else if(sansliSayiBirinciBasamak==tahminEdilenSayiIkinciBasamak && sansliSayiIkinciBasamak==tahminEdilenSayiBirinciBasamak)
        {
            System.out.println("Tebrikler 5000TL Kazandiniz. Sansli Sayi: " + sansliSayi + " Tahmininiz: " + tahminEdilenSayi);
        }
        else if(sansliSayiBirinciBasamak==tahminEdilenSayiBirinciBasamak || sansliSayiBirinciBasamak==tahminEdilenSayiIkinciBasamak || sansliSayiIkinciBasamak==tahminEdilenSayiBirinciBasamak|| sansliSayiIkinciBasamak==tahminEdilenSayiIkinciBasamak)
        {
            System.out.println("Tebrikler 1000TL Kazandiniz. Sansli Sayi: " + sansliSayi + " Tahmininiz: " + tahminEdilenSayi);
        }
        else
        {
            System.out.println("Uzgunuz, Kaybettiniz, Lutfen Tekrar Deneyin. Sansli Sayi: "+ sansliSayi + " Tahmininiz: " + tahminEdilenSayi);
        }

        //</editor-fold>

    }
}
