package Section6_Methods;
import java.util.Arrays;

public class ArraysClass
{
    public static void main(String[] args)
    {
        // ARRAYS CLASS'DA BAZI ONEMLI KULLANIMLAR

        // !!! DİZİLER REFERENCE TİPLİ VERİLER OLDUGUNDAN ASAGİDA KULLANİLAN TUM METHODLAR DİZİNİN KENDİSİNDE KALİCİ
        //     DEGİSİKLİK YAPAR !!!

        int [] sayilar = {8,7,2,-8,14,19,11};
        int [] sayilar2 = {8,7,2,-8,14,19,11};
        System.out.println("Siralama Oncesi Dizi: ");
        diziYazdir(sayilar);

        // Arrays.sort(sayilar); // Arrays.sort methodu dizimizin elemanlarini siralar
        // Arrays.sort(sayilar,2,5); // yalnizca 2. index ile 5. indeks arasini siralar
        Arrays.parallelSort(sayilar); // islemcimde birden fazla cekirdek varsa ve cok elemanli birşi dizi icin siralama
                                      // yapmak istiyorsam bu methodu kullanmak daha efektif
        System.out.println("\nSiralama Sonrasi Dizi: ");
        diziYazdir(sayilar);


       // binary search kullanmadan once diziyi sıralamayi unutma
        Arrays.binarySearch(sayilar,11); // dizide 11 elemani var mi diye bakiyor,
        // ve varsa elemanin bulundugu index degerini bana soyler,
        // eger eleman dizide yok ise negatif bir sayi dondurur ve negatiflikten elemanin dizide olmadigini anlariz
        int sonuc = Arrays.binarySearch(sayilar,11);
        System.out.println("\n Sonuc: "+ sonuc);


        Arrays.equals(sayilar,sayilar2); // girilen iki dizinin ayni mi olduguna bakar
        System.out.println("Sayilar ve Sayilar2 Dizileri Ayni Mi: " + Arrays.equals(sayilar,sayilar2));
        // false dedi. Ama bizim dizilerimiz tipatip ayni idi. neden false dedi
        // cunkü ben sayilar dizimde siralama islemi yaptim ve dizim artik degisti
        // equals olmasi icin eleman sayilari ve yerleri birebir ayni olmalidir


        int[] yeniDizi = new int [20]; // heapteki dizimin kutucuklarina default int degeri olan 0 yazildi
        Arrays.fill(yeniDizi,50); // bu method ile tüm kutucuklara 50 yaz diyorum
        System.out.println("\n Yeni Dizi \n");
        diziYazdir(yeniDizi);

        Arrays.fill(yeniDizi,3,7,95); // bu da 3. ve 7. indexler arasina 95 ata demek
        System.out.println("\n Yeni Dizi \n");
        diziYazdir(yeniDizi);

        // Arrays.compare(); // iki diziyi birbiri ile kiyaslar


    }
    public static void diziYazdir(int[] dizi)
    {
        for (int i:dizi)
        {
            System.out.print(i + ",");
        }
    }
}
