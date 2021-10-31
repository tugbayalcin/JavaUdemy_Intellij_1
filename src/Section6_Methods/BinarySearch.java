package Section6_Methods;


public class BinarySearch
{
    public static void main(String[] args)
    {
        // DIZI ELEMANLARININ YER DEGISTIRMESI

        // BINARY SEARCH
        // Binary Search Methodunu kullanmanin ilk kosulu dizi elemanlarinin sirali olmasidir.
        int[] sayilar = {1,9,5,2,7,9,60,120,55,-9};
        selectionSortSiralama(sayilar);
        diziYazdir(sayilar);
        int sonuc = binarySearch(sayilar,55);
        System.out.println(" Sonuc: "+sonuc);

    }

    public  static int binarySearch(int[] dizi, int aranacakEleman)
    {
        int enDusukIndex = 0;
        int enYuksekIndex = dizi.length-1;

        while (enYuksekIndex >= enDusukIndex)
        {
            int ortaIndeks = (enDusukIndex + enYuksekIndex) /2;
            if(aranacakEleman < dizi[ortaIndeks])
            {
                enYuksekIndex = ortaIndeks -1 ; // ortaIndeksin kendisinde de olmadigini bildigimiz icin 1 cikardir,
                                                // kendisinde olsa idi zaten sayimi bulmus olurdum
            }
            else if(aranacakEleman == dizi[ortaIndeks])
            {
                return ortaIndeks; // arananan elemanin bulundugu indexi dondurur
            }
            else
            {
                enDusukIndex = ortaIndeks+1;
            }
        }
        return enDusukIndex - 1; // bu satir sayesinde aradigimiz eleman dizide yoksa program bizde - bir sayi verir
    }
    public static void selectionSortSiralama(int[] dizi)
    {
        // Bu methodun calisma mantigi sudur;
        // Dizinin 0. indisinde bulunan elemani en kucuk eleman kabul eder
        // Ve sirayla bu elemani diger elemanlarla karsilastirmaya baslar
        // kendinden kucuk bir sayi buldugunda o sayi ile 0. indisteki sayiyi yer degistirir
        // 0. indise en kucuk sayi gelene kadar bu islem devam ever
        // ardindan sira 1. indise gelir ve islemler tekrarlanir

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
    public static void diziYazdir(int[] dizi)
    {
        for (int i:dizi)
        {
            System.out.print(i + ",");
        }
    }
}
