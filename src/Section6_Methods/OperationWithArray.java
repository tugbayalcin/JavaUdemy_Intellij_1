package Section6_Methods;

public class OperationWithArray // DIZILER ILE ILGILI ISLEMLER
{
    public static void main(String[] args)
    {
        //<editor-fold desc="Diziler Ile Ilgili Islemler/Notlarim">

        // DIZI ELEMANLARININ YER DEGİSTİRMESİ
        // Dizi elemanlarinin karilmasi, yer degistiriklmesi icin asagidaki kodu kullanabiliriz;

        /*
        for(int i = dizi.length-1; i>0; i--) // bu yalnizca yollardan 1 tanesi, son elemandan baslayarak karistiriyor
        {
            int j = (int)(Math.random() * (i+1)); // Math kutuphanesinin bize rastgele bir yer uretmesini istiyoruz
            double gecici = dizi[i];
            dizi[i] = dizi[j];
            dizi[j] = gecici;
        }
         */

        // DIZIDE ELEMAN ARAMA BINARY SEARCH
        // Dizide istedigimiz bir elemanin olup olmadigini linear olarak arayabiliriz.
        // Bu islemde sirasi ile aranilan elemanin dizide olup olmadigini kontrol ederiz.
        // Kucuk boyutlu dizilerde bu kolayca yapilirken, eleman sayisi cok olan dizilerde oldukca verimsizdir
        // 5000 elemanli bir dizide olmayan bir eleman icin 5000 kere kontrol yapmak gerekir
        // Binary Search ile daha etkin aramalar yapilabilir. Ama binary search yapmak icin dizi elemanlarinin sirali
           // olarak dizide yer almasi gerekir.


        //</editor-fold>

        int[] sayilar = {1,9,5,2,7,9,60,120,55,-9};
        // diziYazdir(sayilar);
        diziYerDegistir(sayilar); // diziler referans tipli veriler oldugu icin yer degistirme methodundan sonra dizimiz kalici olarak degismis olacak
        System.out.println("Yer Degistirme Methodundan Sonra Dizi: ");
        diziYazdir(sayilar);
        selectionSortSiralama(sayilar);
        System.out.println("Siralama Methodundan Sonra Dizi: ");
        diziYazdir(sayilar);


    }
    public static void selectionSortSiralama(int[] dizi)
    {
        // Bu methodun calisma mantigi sudur;
        // Dizinin 0. indisinde bulunan elemani en kucuk eleman kabul eder
        // Ve sirayla bu elemani diger elemanlarla karsilastirmaya baslar
        // kendinden kucuk bir sayi buldugunda o sayi ile 0. indisteki sayiyi yer degistirir
        // 0. indise en kucuk sayi gelene kadar bu islem devam ever
        // ardindan sira 1. indise  gelir ve islemler tekrarlanir

        for(int i=0; i<dizi.length-1; i++)
        {
            // en kucuk elemanin ve indeksinin bulunmasi
            int oAnkiEnKucukSayi = dizi[i]; // i. sayiyi en kucuk sayi kabul ettik
            int oAnkiEnKucukElemaninIndeksi = i;

            for(int j=i+1; j<dizi.length; j++) // i yi en kucuk kabul ettikten sonra bu dongu sayesinde diger elemanlarla karsilastirmasini yapacagiz
            {                                  // bu dongu en kucuk sayi 0. indise gelene kadar devam etmis oluyor,
                                               // her bir indis icin dizi eleman sayisi kadar tekrar tekrar calisarak bunu yapiyor,
                                               // yani ilk elemani sirayla tum diger elemanlar ile karsilastirmis oluyor
                if(oAnkiEnKucukSayi > dizi[j]) // bu su demek: en kucuk sayimdan daha kucuk bir sayi buldum
                {
                    oAnkiEnKucukSayi = dizi[j]; // sayiyi degiskenime aktardim, henüz yer degistirme yapmadim,
                                                // sadece yeni en kücük sayimi hafizamda tuttum
                    oAnkiEnKucukElemaninIndeksi = j; // indeksi degiskenime aktardim, henüz yer degistirme yapmadim,
                                                     // sadece yeni en kücük sayimin indeksini hafizamda tuttum
                }
            }
            if(oAnkiEnKucukElemaninIndeksi != i) // yeni buldugum en kucuk eleman, en kucuk saydigim indekste yer almiyorsa
            {                                    // yer degistirmeyi yapan if burasi
                dizi[oAnkiEnKucukElemaninIndeksi] = dizi[i]; // en kucuk elemani en kucuk indekse koymak icin yer degistiryorum
                dizi[i] = oAnkiEnKucukSayi;
            }
        }
    }

    public static void diziYerDegistir(int[] dizi)
    {
        for (int i = dizi.length-1; i>0; i-- ) // i sayisi dizinin son elemanindan basliyor kuculerek ilerliyor
        {
            int rastgeleIndex = (int) (Math.random() * (i+1)); // Math.random bana 0.000001-0.9999999 arasi sayi uretiyordu,
                                                             // ben bunu (i+1) ile carparak 1 ile dizi.length arasinda int sayi uretmesini sagliyorum
                                                             // uretilen sayi double oldugu icin integer a type casting yaptik
            int gecici = dizi[i]; // gecici elemana, dizinin degistirilecek elemanini atadik, bir nevi kopyaladik
            // bu degiskeni tanimlamamizdaki mantik su;
            // Mesela dizimiz {1,2,3,4} seklinde olsun. Biz bastaki ve sondaki elemanlarin yerlerini degistirmek isteyelim
            // dizi[0] = dizi[4];  gibi bir atama yaptigimizda sondaki eleman ilk elemana atilir ve dizi soyle olur
            // {4,2,3,4}
            // burada sorun su ki ilk elemanimiz olan 1 i ebediyen kaybettik
            // bunu engellemek icin gecici bir degisken tanimlayip ilk elemanimizi bu degiskene kopyalayarak muhafaza ediyoruz
            // ardindan gecici degiskende tuttugumuz bu degeri, atamak istedigimiz indise atayacagiz
            dizi[i] = dizi[rastgeleIndex]; // ilk degistirme islemimizi yaptik, i yi geciciye atmasaydik, bu islem sonrasinda kaybederdik
            dizi[rastgeleIndex] = gecici; // gecicide tuttugumuz elemani alip yerini degistirecek atamayi yaptik

        }
    }

    public static void diziYazdir(int[] dizi)
    {
        for (int i:dizi)
        {
            System.out.print(i + ",");
        }
    }
}
