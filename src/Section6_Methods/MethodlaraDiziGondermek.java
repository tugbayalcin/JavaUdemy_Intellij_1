package Section6_Methods;

public class MethodlaraDiziGondermek
{
    //Java'da  “pass-by-reference” or “pass-by-value” konusudur
    //pass by reference -> reference veri tipleriyle oynarken onlarin kendisiyle oynariz
    //pass by value     -> primitive veri tiplerinin kopya dagerleriyle(vslue=deger) oynamak



    //okuma yap bu konuda
    //section 7 ye gecmeden anlaman ve isini kolaylastiricak mukemmel guzel bir konudur
    //ben sana o yuzden 7'ye gecme dedim
    //stack -heap - string pool depolarinin calismasini anla
    //garbage collector oku - kapatiyorum bir sey diyon mu i love you so do I , ME TOO,
    //ilk kez karislastigin reference veri tiplerinden biri olan array'in nasil depolandigini yani reference veri tiplerinin nasil depolandigini anla
    //bu classin adi passbyvalue_passbyreference da olabilirdi, bu konuyu da oku ustteki 2 satirla ilgili
    //primitivr ve reference veri tiplerinin nasil dolandigini kullanildigini anlatiyor, ustteki satirlar ise nsil depolandigni anlatiyor
    //:) :*
    //bence cok guzel gidiyorsun bunlari anladiktan sonra OOP object-oriented principles CONCEPT'ler cerez gibi gelir
    //inheritance-polimorphism-encapsulation-abstraction- interface-composition-aggregation gibi concept konulari
    //bunu bitirince zaten 2 yildiz olacaksin :)amin:)
    //collections- farkli farkli data-structure'lar(list,map,tree)+ txt, excel okuma yazma, veri kullanma kaydetme san 3. yildizi verecek
    //exceptionlarin yonetilmesi, errorlarin yonetilmesi, database'e baglanma, arkada ayni anda 3-4 tane compiler calistirip(thread kullanimi) 4. yildiz
    //javaci olan tubanin functional programlama ile muthi java kodlari yazmasi 5.yildiz olacak

    //sonra git ve github:) sonra
    //maveni ilk kursta tani, mantigini kavra, selenium ile kullan, sonra tester gozuyle degil developer gozuyle ele alicaz
    //cunku devops skill'lerinden biridir, jenkins ile calisir, bir tester olarak kurstaki bilgin yeter ama herseyin arka planini anlamak
    //seni farkli bir test muhendisi yapacak ben alacak 5 yıldız taniki baska yolu yok cunku sen benim ogrencimsin :)first student

    public static void main(String[] args)
    {
        // DİZİLERİN METHODLARA GONDERILMESİ

        // Methodlarimiza primitive verileri parametre olarak gecebilecegimiz gibi dizileri de parametre olarak gecebiliriz.
        // Burada dikkat edilmesi gereken metotlara dizideki degerlerin kopyasi degil referanslari gider.
        //array primtive veri tipi degildir, reference veri tipidir
        //reference veri tipleri reference numaralariyla temsil edilirler,
        //uzerlerinde yapilan degisikler kalici olur
        // O yuzden method icinde yapilacak degisiklikler dizinin kendisinde yapilmis sayilir. ???kafam degisiklik konusunda karisti

        // Primitive tiplerde ise methodlara sadece degerin kopyasi gonderiliyordu
        //mesela -> sayilar[2] sayilar dizinin 2. index'indeki 3. kutusu - bu deger integer'dir - yani ilkeldir
        //bunun uzerinde oynama yapilamaz, ancak kopyasini aliriz kopyasiyla oynariz

        // Methodlar geriye dizi de dondurebilir. Asagidaki method parametre olarak aldigi bir dizinin elemanlarini ters
        // yonde iceren bir dizi olusturur

        /* public static int[] tersiniAl(int[] dizi)
    {
        int[] sonuc = new int[dizi.length];
        for(int i=0, j= sonuc.length; i< dizi.length; i++ ,j--)
        {
            sonuc[j] = dizi[i];
        }
        return sonuc;
    }
  */
        int sayilar[] = {1,2,3};//heapte bir array var ve icinde 3 tane kutu var
        //arrayin reference numarasi stackte sayilar kutusunda tutulur
        //heapteki array'in icindeki 3 tane int kabul eden kutunun da reference numarasi vardir
        //yani 1 int degeri array'in ilk kutusunda yer alir ve ilk kutunun da bir reference numarasi vardir- bunu sistem otomati k atar
        //ilk kutunun numarasi aslinda index degil mi? -> evet

        // diziGoster(sayilar);


        //burasi bekledigimiz gibi calismiyor
        System.out.println("Method'dan Once Index 0: " + sayilar[0]);//1 - sayilar[0] ifadesi sayilar dizisinin ilk kutusuna bizi goturur, icinde 1 degeri vardir
        degeriBirArttir(sayilar[0]);// bu methodun icinden 2 degeri gelir, hemen alttaki sout ifadesinin aynisi degerBirArttir methodun icinde yazili old. icin
        // System.out.println(++sayilar[0]);//2
                                            //sayilar arrayinin ilk kutusunun icindeki 1 degerini 1 arttir, sonra console'da yazdir
                                            //int ilkel veri tipi old. icin bu yapilan degisiklik kalici olmaz
                                            //sayilar[0] kutusunun kaderiyle oynamaz
                                            //sadece derizki sayilar[0] kutusunun icindeki degerin aynisindan(kopyasindan) bana da versene
        System.out.println("Method'dan Sonra Index 0: " + sayilar[0]);//1


        //burasi bekledigimiz gibi calisiyor, cunku hangi arrayim icinde calisacagimizi 3 alt satirda soyluyoruz
        System.out.println("Dizi Degerlerini Arttirmadan Once: " );
        diziGoster(sayilar);
        diziDegerleriniBirArttir(sayilar);//heapteki sayilar isimli int kabul eden arrayimi bu methodun icine yolla ve degisiklik yap diyoruz
        System.out.println("Dizi Degerlerini Arttirdiktan Sonra: " );
        diziGoster(sayilar);

        toplaminiBul(5,7,10,11,15,13,17);
        toplaminiBul(1);
        toplaminiBul(1,3,5,7); // bu method ile istedigim sayida elemani toplatip yazdirabiliyorum
    }
    // METHODA DIZI GONDERMEK
    private static void toplaminiBul(int ... parametreListesi) // bu su demek, ben kullanicinin kac tane deger girecegini bilmiyorum, sen kac tane girdigine bak ve girdigi degerleri bir dizide toplayarak islem yap
    {
        int toplam =0;
        for (int oAnkiSayi:parametreListesi)  // : dan sonra nereyi gezecekse onu yaziyoruz, methodumuzun icinde nerede gezecegi yaziyor
        {
            // toplam = toplam + oAnkiSayi;
            toplam += oAnkiSayi; // ust satirla ayni islemi yapiyor (2.yol)
        }
        System.out.println("Girilen Parametre Listesinin Birinci Elemani: " + parametreListesi[0]); // ayni zamanda girilen sayilari teker teker yazdirabilirim
        // cunku bu liste sanki bir diziymis gibi davraniyor ama aslinda degil
        System.out.println("Girilen Parametrelerin Toplami: " + toplam);
    }

    public static void diziDegerleriniBirArttir(int[] sayilar)
    {
        //1. kotu yol,  e-leman sayisi az oldugu icin yaptik

        sayilar[0]++;//1 -> 2
        sayilar[1]++;//2 -> 3
        sayilar[2]++;//3 -> 4

        /*
        2.yol
        for (int i:sayilar)
            System.out.println(i++);//her eleman sirasiyla 1 articak

        3.yol
        for(int i=0; i<sayilar.length;i++)
            System.out.println("Sayilar Dizisinin"+i+".inci indexi 1 arttirildi ->"+sayilar[i]);
         */


    }

    public static void degeriBirArttir(int i)
    {
        System.out.println(++i);//i'yi ilk once 1 arttir, sonra console'da yazdir
        //arrayin icindeki ilk kutu sayilar[0] icindeki int 1 degerini bu methodun icine yolladim
        //bu degeri artik i temsil etmeli mi?


        //goruyoruzki 8 primitive data type'lar(byte,short,int,long,double,float,boolean,char) reference data type,lar gibi temsil edilemezler
        //yukaridaki i ifadesi sayilar[0] kutusunu refer etmez(temsil etmez)
        //sadece ve sadece sayilar[0] kutusunun icindeki 1 degerini temsil eder
        //suan burada i ile oynayayim 10 arttirayim yazdirayim 11 degeri yazilir console'da
        //bu islem sayilar[0] kutusunu etkilemez
        //method bittikten sonra sayilar[0] kutusunun icinde yine 1 degeri olacak

        //arrayin kendisi bir reference veri tipidir ve methodun icine yollanir
        //dizi kelimesi sayilar isimli arrayimizi temsil eder ve diziler kelimesi ile yaptigimiz her degisiklik
        //sayilar dizimizin icini de degistiri

        //i++; // calistirdigimizda bir etkisinin olmadigini, index 0'in methoddan once de sonra da 1 oldugunu goruyoruz

    }

    public static void diziGoster(int[] dizi) // burada onemli olan tanimlanan dizi adi ile buraya cagirilan adin ayni olmasi degil, buradaki ad ile foreach in gezecegi ismin ayni olmasi
    {
        for (int i:dizi)//dizi kelimesinin temsil ettigi sayilar arrayinin icine gir, icindeki her bir kutuyu i temsil etsin
        {
            //i yi, arrayin icindeki kutulari sirasiyla yazdir
            System.out.println("Eleman:" + i);//her seferinde sirasiyla dizi kelimesinin temsil ettigi heapteki sayilar isimli int array'in
            //elemani yazilicak
        }
    }

}
