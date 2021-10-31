package Section6_Methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args)
    {

        // ARRAY-DIZILER

        int sayilar[] = new int[10]; // integer deger tutmasini istedigim icin int yazdim
                                      // dizimin adini ve bir dizi oldugunu belirtmek icin [] yazdim
                                      // heap alanindan kendime yer almak icin new yazdim
                                      // heap'te saklayacagim veri turunu ve kac eleman saklayacagimi yaziyorum
        int[] sayilar2 = new int[10]; // bu sekilde
        int []sayilar3 = new int[10]; // veya bu sekilde de yazabilirsin sorun yok
        int []sayilar4;               // sayilar4 dizisi tanimlandi, stack'da yeri var ama heap'te henuz yok, atama yapilmadi
        int []sayilar5 = {1,2,3,4,5}; // burada ise 5 elemanli dizi elemanlariyla birlikte tamamen tanimlandi

        // ancak onceden tanimlanmis ama atamasi yapilmamis diziye atama yapmak istiyorsak bunu artik indeksleri kullanarak yapmaliyiz
        sayilar[0] = 1;
        sayilar[1] = 2;
        sayilar[2] = 3;
        sayilar[3] = 4;
        sayilar[4] = 5; // 10 elemanli olarak tanimladigimiz sayilar dizisine ilk 5 elemanini atadik

        // peki 11. elemani atamaya kalkarsak ne olur
        // sayilar[11] = 11; // compiler bize kizmadi ancak editor dedi ki Array index is out bounds exception yani dizi indexin sinirlarin disinda diyor
        // sayilar4[0] =3;   // burada program bize kizdi, cunku biz dizi adimizi tanimladik ama diziyi initialize etmedik, yani new diyerek heap ten yer almadik
        // sayilar4 = {1,2,3};  // burada da bize kiziyor. once dizimi tanimlayayim sonra direk veri atayayim diyemiyoruz. ya su sekilde yapacaksin
        int sayilar6[] = {1,2,3};
        // ya da sayilar4 gibi stackten yer alip biraktiysan new diyerek heapten de yer alarak eleman eklemek zorundasin.
        sayilar4 = new int[5];
        sayilar4[0]= 1;  // sayilar4 = {1,2,3,4,5}; diyerek tum diziyi tanimlayamiyoruz, tek tek indis yardimiyla tanimlama yapmak zorundasin


        // MY DARLİNG EMRE TEACHER :) //

        String myStringArray[] = new String[10]; // 10 String degisken tutan dizi-array tanimlandi, ve heap bellekte icinde 10 tane kucuk kutu olan bir obje olustu.
        // heap memoryde icinde string degerler tasiyan ARRAY icin bir obje olustu.
        // = ifadesinin sol tarafi stack memoryde olustu
        // = ifadesinin sag tarafi heap memoryde olustu
        // string elemanlar tanimlarken her bir elemani cift tirnak icinde yazmayi unutmuyoruz

        int myIntArray[]; // int degisken tutabilen bir array tanimlandi stack memoryde  - kutusu yok heap'te
        myIntArray= new int[10]; // myIntArray adinda bir kutu olustu heap memoryde, icinde 10 tane int deger tutabilecek sirasiyla kucuk kutular var
        // ve bu kucuk kutularin hicbirine deger atanmadi.o yuzden her birinde default int degeri olan 0 degeri vardir


        float myFloatArray[] = new float[]{1.0f,2.0f,3f,4F}; // 5 tane deger tutacak olan diziyi elemanlari ile birlikte tanimladik

        double myDoubleArray[] = {1,2.0,3d,4.0D,5D};// = ifadesinin solu -> stack memoryde icinde double degerler tutabilecek myDoubleArray isimli bir array degisken tanimlandi
        // = ifadesinin sagi -> heap memory'de myDoubleArray isimli bir obje olustu. bu objenin icindeki kucuk kutularin sayisi 5 dir
        // sirasiyla 1.0 2.0 3.0 4.0 5.0 double degerlerinin tasirlar.
        // yani myDoubleArray kutusunun icinde sirasiyla 5 kutu olustu ve her birine deger atandi.
        // yani new ile object olusturulmus gibi oldu

        double myDoubleArray2[] = myDoubleArray; //stackte myDoubleArray2 isimli double degerler tutabilen array tanimlandi.
        // objesi yok heapte
        // myDoubleArray= new double[10]; diyerek heapte bir obje olusturabiliriz(bu obje 10 kucuk kutudan olusur)
        // ya da direk double myDoubleArray2[]={1.0,2.0,3.0}; diyerek olusturabilirdik
        // ya da heap memoryde hazir olusmus bir objeyi kullanabilirdik
        // stackteki myDoubleArray isimli degisken, heapteki 5 kutulu bir objeye refere etmektedir
        // hadi gidelim stackteki myDoubleArray2 isimli degisken de  myDoubleArray isimli degiskenin heap memoryde refere ettigi objeye refere etsin




        // SORU 1: 10 elemanli bir diziye eleman olarak dizi indeksinin karesini atayan uygulamayi yaziniz

        int yeniDizi[] = new int[10];
        for(int index=0; index<yeniDizi.length; index++) // index<10 da diyebiliriz. dongu sayisi belli oldugu icin for kullandik
        {
            yeniDizi[index] = (int) Math.pow(index,2);  // index * index de yazabilirsin. pow methodu double deger dondurdugu icin type casting yaptik
            // dizi program calisinca olustu. ancak bizim gorebilmemiz icin yazdirmamiz gerekiyor
            System.out.println("Eleman: " + yeniDizi[index]);
        }

        // SORU 2: Kullanicidan hangi ayda olundugu bilgisini alip ilgili ay degerini yazdirin. Ay adlarini bir dizide saklayin

        // String aylar[] = new String[12]; Boyle yapabilirsin ama pek mantikli olmaz
        String aylar[] = {"Ocak","Subat", "Mart", "Nisan", "Mayis", "Haziran", "Temmuz", "Agustos", "Eylul", "Ekim", "Kasim", "Aralik" };
        Scanner tara = new Scanner(System.in); // new ile heap alanindan yer satin aldik, manzarali :)
        System.out.println("Lütfen Hangi Ayda Oldugumuzu Rakam Ile Giriniz: ");
        int ay = tara.nextInt() ;
        System.out.println("Icinde Bulundugumuz Ay: " + aylar[ay-1]);

        // SORU 3: Kullanicidan kac tane sayinin ortalamasini bulmasini istedigini sorun ve buna bagli olarak aldiginiz
        // degerleri bir dizide saklayin. Veri alma islemi bittikten sonra tum sayilari ve ortalamasini ekrana yazdirin.

        // yukaridaki ornekte zaten kullanicidan veri almamizi saglayan bir sinif kullandigimiz icin  burada yeniden olusturmuyoruz
        System.out.println("Kac Tane Sayinin Ortalamasini Bulmak Istiyoprsunuz: ");
        int sayi = tara.nextInt();
        int sayiGrubu[] = new int[sayi];
        double ortalama = 0;
        for(int i=0; i<sayi; i++)
        {
            System.out.println((i+1) + ". Sayiyi Giriniz:");
            sayiGrubu[i]= tara.nextInt();
            ortalama = ortalama+sayiGrubu[i];

        }
        System.out.println("Girilen Sayilarin Ortalamasi: " + (ortalama/sayi));




    }
}
