package Section6_Methods;

import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Arrays;

public class BolumSonuOdev
{
    public static void main(String[] args)
    {
        // soru_1();
        // soru_2();
        // soru_3();
        //soru_4();
        soru_5();
        soru_6();
        // soru_7();
        // soru_8();

        //seninle ebob ve ekok nasil bulunur mantigina baktikya dun, satir satir o mantikta calisan
        //ebob ve ekok methodlarin hayirli olsun Mukemmel methodlar yazdim
        //yavas yavas bakarsin kodlara- olmadi senle beraber debugging(satir satir bakma) yapariz
        //  note: yarin gorusuruz sen zaten misil misil uyuyorsun :)



    }

    //<editor-fold desc="MethodsOfSolution_1">

    public static void soru_1()
    {
         /* 100 elemanli bir dizi olusturun ve bu dizinin tum elemanlarini rastgele olacak sekilde uretin.
           Bu islemden sonra dizideki elemanlarin ortalamasini hesaplayarak bu ortalamanin altinda kac tane eleman
           oldugunu yazdirin
        */
        int[] rastgeleDizi = new int[100];

        for(int i = 0; i<rastgeleDizi.length; i++)
        {
            int uretilenEleman = (int)(100*Math.random());
            rastgeleDizi[i]=uretilenEleman;
        }
        diziYazdir(rastgeleDizi);
        diziOrtalama(rastgeleDizi);
        ortalamayiGectiMi(rastgeleDizi);
    }
    public static void diziYazdir(int[] dizi)
    {
        for (int i:dizi)
        {
            System.out.print(i + ",");
        }
    }
    public static double diziOrtalama(int[] dizi)
    {
        int toplam =0;
        double ortalama=0.0;
        for(int i=0; i<dizi.length; i++)
        {
            toplam +=dizi[i];
        }
        ortalama = (double)(toplam/dizi.length);
        System.out.println("\n Verilen Dizinin Elemanlarinin Ortalamasi: " + ortalama);
        return ortalama;
    }
    public static void ortalamayiGectiMi(int[]dizi)
    {
        double ortalama = diziOrtalama(dizi);
        int sayi =0;
        for(int i=0; i<dizi.length; i++)
        {
            if(dizi[i]<ortalama)
            {
                sayi++;
            }
        }
        System.out.println("\n Verilen Dizide Dizi Ortalamasi Altinda Kalan Eleman Sayisi: " + sayi);
    }
    //</editor-fold>

    //<editor-fold desc="MethodsOfSolution_2">

    public static void soru_2()  // cozum
    {
        /*
        Her bir elemani rastgele olusturulmus 3x2 lik bir matriste bulunan sayilarin toplamini yazdiran program yaziniz.
        Ayrica bu matriste yer alan en kucuk ve en buyuk sayiyi da mesaj olarak gosterin.
        */

        int[][] matris= matrixOlustur(3,2);//matrix 1 kere olustu ve yeni bir degere atandi- sabit elimizde artik bir matris var
        matrisYazdir(matris);
        matrisElemanlariniTopla(matris);
        matrisinMinimumElemani(matris);
        matrisinMaksimumElemani(matris);

        // Bu methodu olustururken Emre'mden yardim aldim, birlikte yazdik
    }
    public static int[][] matrixOlustur(int satirSayisi, int sutunSayisi)//2 boyutlu int array return eden method
    {
        int[][] matris = new int[satirSayisi][sutunSayisi];//kaca kaclik girerse user o olusuru
        for(int satir=0; satir<matris.length; satir++ )
        {
            for(int sutun=0; sutun<matris[satir].length; sutun++)
            {
                int eleman = (int) (10*Math.random());
                matris[satir][sutun] = eleman;
            }
        }
        //olusan matrixi return et
        return matris;

    }
    public static void matrisYazdir(int[][] dizi)
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
    public static void matrisElemanlariniTopla(int[][] dizi)
    {
        int genelToplam =0;//sadece en basta 0 olsun
        for(int satir=0; satir<dizi.length; satir++ )
        {
            int satirToplam=0;// her satira baslmadan once sifirlansin
            for(int sutun=0; sutun<dizi[satir].length; sutun++)
            {
                genelToplam= genelToplam + dizi[satir][sutun];
                satirToplam +=dizi[satir][sutun];
            }
            System.out.println(satir+1+". satirdaki elemanlarin toplami ->"+satirToplam);
        }
        System.out.println("Matris Elemanlarinin Toplami: " + genelToplam);
    }
    public static void matrisinMinimumElemani(int[][] dizi)
    {
        int minimumEleman = dizi[0][0];//satirin ilk elemanina en kucuk muamelesi yapalim
        for(int satir=0; satir<dizi.length; satir++ )//satirlari gezer
        {
            for(int sutun=0; sutun<dizi[satir].length; sutun++)//sutunlari gezer
            {
                if(dizi[satir][sutun]<minimumEleman)//satirin diger elemanlariyla karsilastiralim
                {
                    minimumEleman=dizi[satir][sutun];//satirdaki baska bir deger satirin ilk degerinden kucukse onu minimum degere atayalim
                }
            }
        }
        System.out.println("Matrisin Minimum Elemani: " + minimumEleman);
    }
    public static void matrisinMaksimumElemani(int[][] dizi)
    {
        int maksimumEleman = dizi[0][0];//ilk satir ve ilk sutundeki eleman en buyuk muamelesi gorsun
        for(int satir=0; satir<dizi.length; satir++ )
        {
            for(int sutun=0; sutun<dizi[satir].length; sutun++)
            {
                if(dizi[satir][sutun]>maksimumEleman)//MAX elaman deidigmiz baska bir elemandan kucuk olursa
                {
                    maksimumEleman=dizi[satir][sutun];//artik enbuyuk unvani yeni degerin olsun
                }
            }
        }
        System.out.println("Matrisin Maksimum Elemani: " + maksimumEleman);
    }

    //</editor-fold>

    //<editor-fold desc="MethodsOfSolution_3">

    public static void soru_3()
    {
        /*
          Iskambil destesini dizlier ile olusturun. Sonrasinda bu destedeki elemanlari karistirin ve de ilk kullaniciya
          hangi  kartin geldigini ekrana yazdirin
        */

        // bir iskambil destesi 52 karttan olusur
        // 4 farkli kart turu vardir -- kupa, maca, karo,sinek
        // as,2,3,4,5,6,7,8,9,joker,kiz,papaz

        String kartTurleri[] = {"Kupa","Maça","Karo","Sinek"};
        String kartNumaralari[] = {"As","2","3","4","5","6","7","8","9","10","J","Q","K"};
        // kart numaralarini iceren dizimizi da string tanimliyoruz, cunku aralarinda bazi ozel isimler var
        int deste[]= new int[52]; // 52 tane kartimi tutacak destemi dizi olarak olusturdum

        desteyiOlustur(deste);
        desteyiKaristir(deste);
        desteyiGoster(deste,kartTurleri,kartNumaralari);


    }
    public static void desteyiKaristir(int[] deste)
    {
        for(int i=0; i<deste.length; i++)
        {
            int rastgeleIndex = (int)(Math.random() * deste.length);
            int gecici = deste[i];
            deste[i] = deste[rastgeleIndex];
            deste[rastgeleIndex]= deste[gecici];

        }
    }
    public static void desteyiGoster(int[] deste,String[] kartTurleri,String[] kartNumaralari)
    {
        // desteyi goster methodumda i yi i<deste.length yaparsam düm desteyi, i<4 yaparsam ilk  karti gösterir

        for(int i=0; i<4; i++)
        {
            String kartTuru =kartTurleri[deste[i]/13]; // her bir turde 13 adet kart var
            String kartNumarasi =kartNumaralari[deste[i] % 13]; // mod aldik cunku bu islem sonucu max 12 ye kadar bir deger verecek

            System.out.println(kartTuru +" "+ kartNumarasi); // bu destede 0-12 eleman arasi kupa,13-25 arasi maca, etc... buna gore duzenleyelim

        }
    }
    public static void desteyiOlustur(int[] deste)
    {
        for(int i=0; i<deste.length; i++)
        {
            deste[i] =i; // destenin indekste bulunan elemanina indeks numarasini ata

        }
    }


    //</editor-fold>

    //<editor-fold desc="MethodsOfSolution_4">

    public static void soru_4()
    {
        /*
           Verilen iki sayinin en kucuk ortak katini bulan uygulamayi yaziniz. 1.YOL
           Ekok(s1,s2) * ebob(s1,s2) = (s1*s2);  2.YOL
           formulune uygun olacak sekilde bulunuz
        */

        // 1.YOL
        Scanner sayi = new Scanner(System.in);

        System.out.println("Lütfen Birinci Sayiyi Giriniz:");
        int a= sayi.nextInt();

        System.out.println("Lütfen Ikinci Sayiyi Giriniz:");
        int b= sayi.nextInt();

        int klasikekok = klasikekokbul(a,b);
        System.out.println(a + " ile " + b +"'nin ekoku:" + klasikekok);
        System.out.println("*******");

        //System.out.println(ekokbul(a,b));
        //System.out.println(10);

        // 2.YOL

        ekokBul(a, b);
        int ekok = ekokBul(a,b);
        int ebob = ebobBul(a,b);
        System.out.println("ebob:" +ebob);
        System.out.println("ekok:" +ekok);


    }
    // 1.YOL
    public static int klasikekokbul(int a, int b)
    {
        int buyuk = Math.max(a,b); // burada yapmak istedigim sey, girilen sayilardan hangisinin daha buyuk oldugunu bulmak
        int ekok =0;

        for(int i= buyuk; i<=a*b; i++) // buyuk sayidan baslayarak, girilen sayilarin carpimina kadar bazi kontroller yapacagiz
        {
            if (i%a ==0 && i%b ==0)
            {
                ekok=i;
                break;
            }
        }
        return ekok;
    }
    // 2.YOL
    private static int ekokBul(int a, int b)
    {
        // ebob(a,b)*ekok(a,b)=a*bb formul
        int ekok = (a*b)/ebobBul(a,b);
        return ekok;
    }
    private static int ebobBul(int a, int b)
    {
        int ebob =1;
        int kontrol = 2;

        while(kontrol <= a && kontrol <= b) // ???
        {
            if ((a % kontrol == 0) && (b % kontrol == 0)) {
                ebob = kontrol;
            }
            kontrol++;
        }

        if (ebob == 1)
        {
            System.out.println(a + " ve " + b + " Aralarinda Asaldir");
        }
        else
        {
            //System.out.println(a + " ve " + b + " Sayilarinin En Buyuk Ortak Boleni " + ebob + "'dir.");
        }
        return ebob;
    }

    //</editor-fold

    //<editor-fold desc="MethodsOfSolution_5">

    public static void soru_5()
    {
        /*
          Kullanicinin girdigi ogrenci sayisi ve kullanicinin girdigi toplam soru sayisina bagli olarak, ogrencilerin
          soruya verdigi cevaplari tutan bir matris duzenleyin. Bu degerleri rastgele olarak olusturun
          Degerler A,B,C,D,E olmali

          Bir de dogru cevaplkari tutan tek boyutlu bir diziniz olsun. Bu da rastgele olusturulmali

          Sonrasinda bu degerleri karsilastirarak her bir ogrencinin kac dogru ve yanlisi oldugunu gosteren programi
          yaziniz

        */
        Scanner sayi = new Scanner(System.in);

        System.out.println("Lütfen Ogrenci Sayisini Giriniz:");
        int ogrenciSayisi= sayi.nextInt();

        System.out.println("Lütfen Soru Sayisini Giriniz:");
        int soruSayisi= sayi.nextInt();


        char[][] tumCevaplar = matrisOlustur(ogrenciSayisi,soruSayisi);
        matrisYazdir(tumCevaplar);

        char[] cevapAnahtari = new char[soruSayisi];
        cevapAnahtariOlustur(cevapAnahtari);
        System.out.print("Cevap Anahtari:");
        diziYazdir(cevapAnahtari);

        ogrencileriDegerlendir(cevapAnahtari,tumCevaplar);

    }
    public static char[][] matrisOlustur(int satirSayisi, int sutunSayisi)//2 boyutlu int array return eden method
    {

        char[][] matris = new char[satirSayisi][sutunSayisi];//kaca kaclik girerse user o olusuru
        for(int satir=0; satir<matris.length; satir++ )
        {
            for(int sutun=0; sutun<matris[satir].length; sutun++)
            {
                char eleman = cevapOlustur();
                matris[satir][sutun] = eleman;
            }
        }
        //olusan matrixi return et
        return matris ;

    }
    public static char cevapOlustur() // parametre almasına gerek yok
    {
        // char a='A'; diye bir degisken tanimlar ve yazdirirsak konsolda A seklinde bir cikti goruruz
        // int a='A'; diye tanimlayip yazdirirsak da A rakaminin husky degerinin konsola yazildigini goruruz
        // A icin bbu deger 65, B icin 66, ... , E icin 69 dur

        int rastgeleSayi = 65 + (int)(Math.random()*5);
        // 0 1 2 3 4 sayilarini elde edebilmek icin Math.random i 5 ile carptik
        // Bize lazim olan husky degerlerini elde edebilmek icinse üretilen sayilari 65 ile topladik

        char uretilenSecenek = (char)rastgeleSayi; // urettigimiz husky sayinini geri char a donusturduk

        return uretilenSecenek;
        // bu method her kullanildiginda bbana A,B,C,D,E seceneklerinden birini uretecektir
    }
    public static void matrisYazdir(char[][] dizi)
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
    public static void diziYazdir(char[] dizi)
    {
        for (char i:dizi)
        {
            System.out.print(i + ",");
        }
        System.out.println("\n");
    }
    private static void cevapAnahtariOlustur(char[] dizi)
    {

        for(int i=0; i<dizi.length; i++)
        {
            dizi[i]=cevapOlustur();
        }
    }
    private static void ogrencileriDegerlendir(char[] dizi, char[][] matris) // cevap anahtari - tum cevaplar
    {
        for(int satir=0; satir<matris.length; satir++ )
        {
            int dogruCevapSayisi =0;
            for(int sutun=0; sutun<matris[satir].length; sutun++)
            {
                if(matris[satir][sutun]== dizi[sutun])
                {
                    dogruCevapSayisi++;
                }
            }
            System.out.println((satir+1) + ". Siradaki Ograncinin Dogru Cevap Sayisi:" + dogruCevapSayisi);
        }
    }


    //</editor-fold>

    //<editor-fold desc="MethodsOfSolution_6">

    public static void soru_6()
    {
        /*
           Bilgisayar 1 ile 100 arasında rastgele 10 sayı üretiyor. Üretilen sayıları bir dizi içerisine kayıt edin.
           Sonrasında diziye kayıt edilen sayıları herhangi bir sıralama algoritması ile sıralayın ve sonrasında ekrana
           çıktı verin
        */




    }


    //</editor-fold>

    //<editor-fold desc="MethodsOfSolution_7">

    public static void soru_7()
    {
          /*
        girilen matrisin her bir elemanini 10 arttirarak yeni bir matris olusturan method yaz, (copy matris). geri matris dondursun
         yeni bir degiskene ata parametre matris. eski mstris elimde kalacak (pass by value)
        */
        //SORU7 -> Soru2'de olusturaln matris'i kullanarak yeni matris olustur, ilk matrisin elemanlari sabir kalsin

        System.out.println("\n*********main");
        int[][] mainMatrix = matrixOlustur(3,3);//ilk matrisimiz
        matrisYazdir(mainMatrix); // ilk ana matrisim bu

        System.out.println("\n*******first copy");//\n -> alt satira gec sonra yildizlari koy
        int[][] copyMatrix = manuelMatrixCopy(mainMatrix); // methodun icindeki kopya matrisimi return ettim ve copyMatrix isimli degiskene atadim
        matrisYazdir(copyMatrix); // kopya matrisimi tek basina yazdiriyorum

        System.out.println("\n*******copy plus 10");
        copyMatrix=matrisElemaniArttir(copyMatrix,10); // copyMatrisimi methodun icine yolla
        //methodun icinde hic kopyalama yapma, yolladigim matrisin ta kendisini degistir ve onu return et
        // yazdirabilmek icin de tekrardan stackteki ayni degiskenin icine ata(reference numarasi degismedi)
        matrisYazdir(copyMatrix); // bakalim matrisimizin elemanlari 10 artmis mi - evet

        //10 arttirmanin 2. yolu
        System.out.println("\n*******2.copy plus 10");
        elemaniArttirVoidMethod(copyMatrix,10);//copyMatrisin kendisinde degisiklik yapilir ve yazdirilir method icinde

        System.out.println("\n*******main degismis mi, hayir");
        matrisYazdir(mainMatrix); // bakalim bu olaydan ana matrisimiz etkilenmis mi - hayir an ile copy matrisin
        //stackte tuttuklari reference numaralari farkli - yani heapte refer ettikleri arrayler de farkli

        System.out.println("\n*******copy matris 10 arttirdiktan sonra ilk copy duruyor mu, hayiiir");
        matrisYazdir(copyMatrix); // bakalim copy matrisimiz sonsuza kadar degismis mi - buna ne gerek var ya 113 te yazdirmissin zaten

        int[][]newCopyMatris=manuelMatrixCopyAndArtis(copyMatrix,100,"cikarma");//methodun icine copyMatrisimi yolla
                                                                                    //methodun icinde bu mu marisi kopyala
                                                                                    //method icinde kopyalanmis matrisin degerlerini 50 arttir
                                                                                    //ve onu return et
        System.out.println("\n*******copy switch - newCopyArray");//stackteki 3. degisken, ve ve heapteki yeni 3. matris
        matrisYazdir(newCopyMatris);

        System.out.println("\n********copyMatris");//stackteki 2. degisken, yani heapteki 2. matris
        matrisYazdir(copyMatrix);




        //ELIMIZDEKILERLE FARKLI BIR TARZ DENEYELIM

        System.out.println("ana matris ***********");
        System.out.println(Arrays.deepToString(mainMatrix));//2-dimensional arrayleri yazdirir
        matrisYazdir(mainMatrix);
        System.out.println(Arrays.toString(mainMatrix));//1-dimensional arrayleri gosterir
        System.out.println(Arrays.toString(new int[]{1,2,3}));//heap'e bu array olustu ve yalnizca ilk seferde kullanilir bir daha uasilamz1-dimensional arrayleri gosterir

        int i=0;
        while(i<1)
        {
            System.out.println("hosgeldiniz lutfen menuden bir islem giriniz!\n1->toplama\n2->cikarma\n3->carpma\n4->bolme");
            Scanner scan=new Scanner(System.in);//scan -> kullanicidanVeriAlScannerClassiObjesi
            String userInput=scan.nextLine();//scan ile Scanner Class'inin icne girdim ve nextLine() methodunun calistiridm
            //kullanici islemi yazicak ve yazdigi yaziyi userInput degiskenine aticam
            System.out.println(userInput);
            System.out.println("lutfen sectiginiz islemin rakamini giriniz");
            int deger=scan.nextInt();
            System.out.println(deger);

            // elimizdekilerle kullanici menusu yapalim:
            int[][] matrisX;
            switch(userInput)
            {
                case "toplama":

                    matrisX= manuelMatrixCopyAndArtis(mainMatrix, deger, userInput);//heap'imdeki mainMatrisin kopyasini            // matrisX degiskenine ata- heapte yeni matris var yani
                    // matrisX degiskenine ata- heapte yeni matris var yani
                    //HARDCODING'ten kurtulduk, artk farkli farkli degerler parametre olarak yollanabilir
                    //while looptan cikmak icin
                    matrisYazdir(matrisX);//yeni matrisimizi yazdir -- bunun icinde icice loop var
                    i++;
                    break;
                case "cikarma":
                    matrisX= manuelMatrixCopyAndArtis(mainMatrix, deger, userInput);
                    matrisYazdir(matrisX);
                    i++;
                    break;
                case "carpma":
                    matrisX= manuelMatrixCopyAndArtis(mainMatrix, deger, userInput);
                    matrisYazdir(matrisX);
                    i++;
                    break;
                case "bolme":
                    matrisX= manuelMatrixCopyAndArtis(mainMatrix, deger, userInput);
                    matrisYazdir(matrisX);
                    i++;
                    break;

            }

        }
    }
    public static int[][] manuelMatrixCopy(int[][] mainMatrix)
    {
        int [][] copyMatrix = new int[mainMatrix.length][mainMatrix[0].length];
        for(int satir=0; satir<mainMatrix.length; satir++)
        {
            for(int sutun =0; sutun<mainMatrix[satir].length; sutun++)
            {
                copyMatrix[satir][sutun]=mainMatrix[satir][sutun];
            }
        }
        return copyMatrix;
    }

    //pass by reference :Metoda gönderilen parametrenin referansının gönderildiği parametre aktarım şeklidir.
    // Metot içinde parametrenin değeri değiştiğinde ilk değeride değişir.
    public static int[][] matrisElemaniArttir(int[][] matris,int artisMiktari)
    {
        //buraya gonderdigim arrayde kalici degisiklik yap

        for(int satir=0; satir<matris.length; satir++)
        {
            for(int sutun=0; sutun<matris[satir].length; sutun++)
            {
                matris[satir][sutun] = (matris[satir][sutun] + artisMiktari);
            }
        }
        return matris;//ve matrisin ta kendisini geri dondur
    }

    private static void elemaniArttirVoidMethod(int[][] disardanGelenMatris, int artisMiktari)
    {
        //buraya gonderdigim arrayde kalici degisiklik yap

        for(int satir=0; satir<disardanGelenMatris.length; satir++)
        {
            for(int sutun=0; sutun<disardanGelenMatris[satir].length; sutun++)
            {
                disardanGelenMatris[satir][sutun] = (disardanGelenMatris[satir][sutun] + artisMiktari);
            }
        }
        matrisYazdir(disardanGelenMatris);//tekrardan icice for loop yazip matrisi yazdirmak yerine bu isi yapan benim olustrudugum method yapsin

    }

    //pass by value : Metoda gönderilen parametrenin bir kopyasının tutularak gönderildiği parametre aktarım şeklidir.
    // Yani metot içinde parametrenin değeri değiştiğinde ilk değeri değişmez.
    // Değişiklik sadece metot scope içinde görülür
    public static int[][] manuelMatrixCopyAndArtis(int[][] mainMatrix,int sayi,String islemTarzi)
    {
        //methoda methodumu yolla ve kopyasini cikar
        //kopyasina deger+20, deger-10 gibi islemler yaparak atama yap
            int [][] methodIciCopyMatris = new int[mainMatrix.length][mainMatrix[0].length];
            for(int satir=0; satir<mainMatrix.length; satir++)

            {
                for(int sutun =0; sutun<mainMatrix[satir].length; sutun++)
                {
                   switch (islemTarzi)
                   {
                       case "toplama" : methodIciCopyMatris[satir][sutun]=mainMatrix[satir][sutun] + sayi; break;
                       case "cikarma" : methodIciCopyMatris[satir][sutun]=(mainMatrix[satir][sutun] - sayi); break;
                       case "carpma" : methodIciCopyMatris[satir][sutun]=mainMatrix[satir][sutun] * sayi; break;
                       case "bolme" : methodIciCopyMatris[satir][sutun]=((mainMatrix[satir][sutun]) / sayi); break;
                       default:
                           System.out.println("Tanimsiz islem girilmistir. Ve method sonlandirilmistir");
                           return null; // obje donduren bir method oldugu icin return null dedik, int dondurseydi return 0 derdik
                         //  break; // break beni sadece switch ten cikarir, loop donmeye devam eder, tekrar tekfrar switche girerim
                   }

                }
            }
            return methodIciCopyMatris;// ve kopya arrayi dondur, methoda yolladigim arrayi DEGIL

    }

    //</editor-fold>

    //<editor-fold desc="MethodsOfSolution_8">

    public static void soru_8()
    {
       /*
           Verilen iki sayinin en kucuk ortak katini bulan uygulamayi yaziniz.
           Ekok(s1,s2) * ebob(s1,s2) = (s1*s2);
           formulune uygun olacak sekilde bulunuz
        */
       // asalSayiDizisi(30);
        //kullanicidan 2 sayil alinir.
        //ondan sonra bu 2 sayidan buyuk olan asal sayilari bul methoduna yollanir
        //kucuk sayiya kadar olan tum asaly sayilari bir tane diziye konur
        //sonrasinda bu asal sayilardan hangisi hem kucuk hem buyuk sayimizi bolebiliyorsa
        //bu asali al baska bir diziye koy
        //2. dizimizin elemanlarini carp ve ebobu bul

        //2 integer inputs taken by user
        Scanner sayi = new Scanner(System.in);

        System.out.println("Lütfen Birinci Sayiyi Giriniz:");
        int a= sayi.nextInt();

        System.out.println("Lütfen Ikinci Sayiyi Giriniz:");
        int b= sayi.nextInt();

        //greater input is assigned into min variable
        int max= returnMax(a,b);

        //return prime numbers untill the max input
        int[] primeNumbers=returnPrimes(max);//array return eder

        //lets display=goruntule our array
        System.out.println("max degerimize kadar olan asal sayilari arrayde depoladik");
        diziYazdir(primeNumbers);


        //simdi elimizdeki asal sayilarla min ve max sayilarimizi bolelim ve duruma gore yenizi dizi olusturulim
        int ebobDeger=findEbob(primeNumbers,returnMax(a,b),Math.min(a,b));//elimizdeki asal sayilari tutan diziyi, girdi olan 2 sayiyi methodun icine yolluyoruz
        //findEbob(returnPrimes(min),a,b);//boylr de olur

       //ebob degerimizi yazdiralim
        System.out.println();
        System.out.println(a+" sayisi ile "+b+" sayisinin ebobu -> "+ebobDeger);//ebob 10 degil hata yapti
        System.out.printf("%d sayisi ile %d sayisini ebobu -> %d",a,b,ebobDeger);//ebob 10 degil hata yapti

        int ekokDeger=findEkok(primeNumbers,returnMax(a,b),Math.min(a,b));
        System.out.printf("\n%d sayisi ile %d sayisini ekoku -> %d",a,b,ekokDeger);//ebob 10 degil hata yapti


        int ekokDeger2=findEkok2(ebobDeger,returnMax(a,b),Math.min(a,b));
        System.out.printf("\n%d sayisi ile %d sayisini ekoku -> %d",a,b,ekokDeger2);//ebob 10 degil hata yapti
        //printf methodu alt satira gecirmez print() gibidir


        //EBOB-EKOK Transactionlarini arraylist ile yapalim!!!
        ArrayList<Integer> asalSayilarArraylist=returnPrimesInArraylist(returnMax(a,b));
        ebobDeger=findEbob( asalSayilarArraylist, returnMax(a,b), Math.min(a,b));//ebobDegeri yukarda tanimladim
        //ve stackteki ebobDeger degiskeni stackte yeni olusan icinde int dger olan baska bir kutuya etiket oldu

        //arraylistimizi bi gorelim
        //ARRAYLISTLERI DISPLAY ETMEK COK BASITTIR - hem abob degerimizi dondurelim hem de arraylisitmizi bi ekranda gorelim
        System.out.println("\nPrime Number iceren arraylistimiz:");
        System.out.println(asalSayilarArraylist);// Arraylerde ==> sout(Arrays.toString(arrayName))

        //EBOB'umuzu yazdirma
        System.out.println("Arraylis ile ebob -> "+findEbob( returnPrimesInArraylist(returnMax(a,b)), returnMax(a,b), Math.min(a,b)));//sout(intDeger); -50
        System.out.println("ArrayList İle Ebob:" + ebobDeger);

        aralarinAsalMi(findEbob( asalSayilarArraylist, returnMax(a,b), Math.min(a,b)));// == aralarindaAsalMi(intDeger);

    }


    public static int returnMax(int a, int b)
    {
        return (a>b)?a:b;// ternary kullanimi
    }
    public static int[] returnPrimes(int maxSayi)//7 11 girerse ve ekokunu bulmak istersek elimizde 11e kadar asal sayilarin listesi olamli
    {
        //return an array with prime numbers till the our min parameter
       int[] primeNumbers=new int[maxSayi];//local degisken
       int index=0;//local

        for(int i=2; i<=maxSayi; i++ )//11 max sayi dahil
        {
            boolean asalMi = true;
            for(int j=2; j<i; j++)
            {
                if ((i % j) == 0)  // herhangi bir sayi ile modu 0 ise, o sayiya tam bolunuyordur ve asal degildir demektir
                {
                    asalMi = false;
                    break;//icteki for'dan cikiyor
                }

            }

            if(asalMi)
            {
                //primeNumbers[index]=i;   //2 rakamini dizimize koy
                primeNumbers[index]=i;
                index++;//index 1 olsun
            }
        }

        //return primeNumbers;
        //1.yol
      //  return resizeArray(primeNumbers);//integer dizi dondurduk -Arrayin sonundaki sifilardan kurtulmak istiyorum

        //2.yol
        //ilk olarak
        int asalSayiAdeti=asalSayiAdeti(primeNumbers);//primeNumbers dizimdeki asal sayilarin sayisini bul
        //2. olarak arraycopy methodu ile yeni array olustur
        int [] sadecePrimeNumbers=new int[asalSayiAdeti];
        System.arraycopy(primeNumbers,0,sadecePrimeNumbers,0, asalSayiAdeti);
        //anaDizini 0. index'inden basla, kopyaDizimin de 0. indexinden yapistirmaya basla, toplamda asalsayiadeti kadar kopy+pasteyap

        //3. olarak yeni arryaimi retrun et
        return sadecePrimeNumbers;
    }
    public static int[] resizeArray(int[] array)//bunu retrunPrimes methodununun icinde kullandim
    {
        int asalSayiAdedi=asalSayiAdeti(array);
        int[] sadeceAsalSayilar=new int[asalSayiAdedi];

        for(int i=0; i<sadeceAsalSayilar.length;i++)
        {
           sadeceAsalSayilar[i]=array[i];
        }
        return sadeceAsalSayilar;
    }
    static int asalSayiAdeti(int[] array){
        int asalSayiAdedi=0;
        for(int i=0; i<array.length;i++)
        {
            if(array[i]==0)
                break;
            else
                asalSayiAdedi++;
        }
        return asalSayiAdedi;
    }//bunu resizeArray() icinde kullandim - arrayimizi yolladik methoda ve icindeki adsalsayilarin adedini geri dondurucek bu mthod
    private static int findEbob(int[] primeNumbers, int max, int min)
    {
        int ebob=1;
        //tek tek elimizdeki asal sayilar ile 2 sayimizida bolucez mod alalım
        for (int i=0; i<primeNumbers.length;i++)//mesela 10 elemanli icinde asal sayilarimiz olan arrayi bastan sona gez
        {
            if(primeNumbers[i]==0)
                break;//eger diziyi gezerken 0 ile karsilasirsak diziyi gezmekten vazgec ve loop"u bitir

            else//eger dizinin icindeki i nin temsil ettigi sayi 0 degilse
            {
                //bu sefer sartlarmizi uygulayabiliriz
                if(max%primeNumbers[i]==0 && min%primeNumbers[i]==0)//eger buyuk ve kucuk sayi da asal sayiya tam bolunurse
                {
                    //sayilarimiz 50 ve 100 - 2 asali her ikisini de boler
                    int ikisiniDeBolerMi=0;
                    while(min%primeNumbers[i]==0 || max%primeNumbers[i]==0)//elimdeki asal sayi min ve ya sayisi tam bolene kadar devam et
                    {

                        if(max%primeNumbers[i]==0){
                            max=max/primeNumbers[i];//100/2=50    50/2=25 25/5=5 5/5=1
                            ikisiniDeBolerMi++;
                        }
                        if(min%primeNumbers[i]==0)
                        {
                            min=min/primeNumbers[i];//50/2=25      25 25/5=5 5/5=1
                            ikisiniDeBolerMi++;
                        }
                        if(ikisiniDeBolerMi%2==0){
                            ebob=ebob*primeNumbers[i];//bu asal sayilari birbirleriyle carp ve ebob degiskeninde tut
                            if(min==1)
                                return ebob;
                        }
                    }

                }

            }
        }
        return ebob;// karıstı
    }
    public static int findEkok(int[] primeNumbers, int max, int min)
    {
        int ekok=1;
        //tek tek elimizdeki asal sayilar ile 2 sayimizida bolucez mod alalım
        for (int i=0; i<primeNumbers.length;i++)//mesela 10 elemanli icinde asal sayilarimiz olan arrayi bastan sona gez
        {
            if(primeNumbers[i]==0)
                break;//eger diziyi gezerken 0 ile karsilasirsak diziyi gezmekten vazgec ve loop"u bitir

            else//eger dizinin icindeki i nin temsil ettigi sayi 0 degilse
            {
                //bu sefer sartlarmizi uygulayabiliriz

                    //sayilarimiz 50 ve 100 - 2 asali her ikisini de boler
                    while(min%primeNumbers[i]==0 || max%primeNumbers[i]==0)//elimdeki asal sayi min ve ya sayisi tam bolene kadar devam et
                    {

                        if(max%primeNumbers[i]==0){
                            max=max/primeNumbers[i];//100/2=50    50/2=25 25/5=5 5/5=1
                        }
                        if(min%primeNumbers[i]==0)
                        {
                            min=min/primeNumbers[i];//50/2=25      25 25/5=5 5/5=1
                        }

                        ekok=ekok*primeNumbers[i];//bu asal sayilari birbirleriyle carp ve ekok degiskeninde tut

                    }
            }
        }
        return ekok;//
    }
    static int findEkok2(int ebob,int max,int min)
    {

        int ekok=max*min/ebob;

        return ekok;
    }


    //EBOB EKOK ISLEMLERINDE, ARRAYLIST ICIN METHODLARIMIZ
    public static ArrayList<Integer> returnPrimesInArraylist(int maxSayi)//max sayi yi loop icin koyduk arraylistin hafizasi icin degil
    {
        //icinde integer degerler tutabilen arraylist olustruduk
        //primeNumbers degisgeni(kelimesi) stackte, arraylistin kendisi heapte
        ArrayList<Integer> primeNumbers=new ArrayList<>();

        for(int i=2; i<=maxSayi; i++ )// max sayi dahil tek tek rakamlari gez asallari kap arrayliste koy
        {
            boolean asalMi = true;
            for(int j=2; j<i; j++)
            {
                if ((i % j) == 0)  // herhangi bir sayi ile modu 0 ise, o sayiya tam bolunuyordur ve asal degildir demektir
                {
                    asalMi = false;
                    break;//icteki for'dan cikiyor
                }

            }

            if(asalMi)//eger asalsa
            {
                //arraylistin icine koy
                primeNumbers.add(i);//i nin temsil ettigi asal sayiyi arrayliste ekle
            }
        }

        return primeNumbers;//arraylisti returnledik
    }
    public static int findEbob(ArrayList<Integer> primes, int max, int min)//arraylist ve 2 tane int deger kabul eden methodumuz
    {
        //ALGORITHMA AYNI- SADECE DATASTRUCTURE'imiz, yani depomuz farkli, array degil arraylist kullaniyoruz
        //NOTE ->  arrayName.length == arrayListName.size()
        int ebob=1;

        //tek tek elimizdeki asal sayilar ile 2 sayimizida bolucez mod alalım
        for (int i=0; i<primes.size();i++)//mesela 10 elemanli icinde asal sayilarimiz olan arrayi bastan sona gez
        {

            //bu sefer sartlarmizi direk uygulayabiliriz
            //NOTE -> arrayName[i] == arrayListName.get(i)  - arraylistimin i. indexindeki elemanini getir demek
            if(max%primes.get(i)==0 && min%primes.get(i)==0)//eger buyuk ve kucuk sayi da asal sayiya tam bolunurse
            {
                //sayilarimiz 50 ve 100 - 2 asali her ikisini de boler
                int ikisiniDeBolerMi=0;
                while(min%primes.get(i)==0 || max%primes.get(i)==0)//elimdeki asal sayi min ve ya sayisi tam bolene kadar devam et
                {

                    if(max%primes.get(i)==0){
                        max=max/primes.get(i);//100/2=50    50/2=25 25/5=5 5/5=1
                        ikisiniDeBolerMi++;
                    }
                    if(min%primes.get(i)==0)
                    {
                        min=min/primes.get(i);//50/2=25      25 25/5=5 5/5=1
                        ikisiniDeBolerMi++;
                    }
                    if(ikisiniDeBolerMi%2==0){
                        ebob=ebob*primes.get(i);//bu asal sayilari birbirleriyle carp ve ebob degiskeninde tut
                        if(min==1)
                            return ebob;
                    }
                }



            }
        }

        return ebob;//integer deger return edecek
    }
    public static void aralarinAsalMi(int ebobDegeri)
    {
        //if else yazmadim - ternary kullandim - ebob 1 se sunu yaz degilse sunu yaz dedim
        System.out.println((ebobDegeri==1?"Aralrinda asaldirlar!" : "Aralarinda asal degiller!"));
    }






    //</editor-fold


}
