package Section6_Methods;

public class Methods
{
    public static void main(String[] args)
    {
        /*
        System.out.println("***** MENU *****");  // amacim kullaniciya bir menu gostermek
        System.out.println("1. Iki Sayinin Toplamini Bul"); // kullanici bir islem yapip menuye geri donerek defalarca girip cikabilir
        System.out.println("2. Iki Sayinin Farkini Bul"); // her seferinde bu kod blogunu tekrar yazip main methodu kodlara bogamam
        System.out.println("3. Iki Sayinin Carpimini Bul"); // yeni bir method tanimlayarak nasil yapacagimizi gorelim
        */
        menuGoster();
        sayilariTopla(10,15); // methodumuz parametreli oldugu icin buraya islem yapilmasini istedigimiz degerleri girmeliyiz
        sayilariTopla(3,5);
        sayilariTopla(4,7);

        int sayi =5;
        sayiyiDegistir(sayi);  // yeni bir method tanimlamaya calisiyorum. Bu iki satiri yazdiktan sonra ALT ENTER a basarsam program benim yerime otomatik olarak olusturacak
        System.out.println("Sayinin Degeri: " + sayi); // burada merak ettigim sey ben x i degistirdikce method icinde tanimladigim sayi degiskeni degisecek mi, yoksa x; sayinin yalnizca bir kopyasi mi
                                                       // 5 yazdirdi, demek ki kopyasiymis,  degiskenin kendisi degil tuttugu deger islem yapmaya gonderilmis
        sayilarinFarkiniBul(10,6); // alt enter yapinca girdigim 10 ve 6 nin  integer oldugu algilandi ve method integer sayilar uzerine kuruldu
        // geriye dondurmeyi soyle gorebiliriz
        System.out.println("Dondurulmus Fark: "+ sayilarinFarkiniBul(10,6)); // burada hem method icindeki soutprintln satirini yazdiracak hem de return un geri dondurdugu degeri dondurulmus fark olarak yazacak

        int donulenDeger = sayilarinFarkiniBul(10,6); // methodun dondurdugu degeri degiskene atadik
        System.out.println("Donulen Deger: " + donulenDeger);

        // Math.random(); Parametre almayan ve double return eden Math Class'inin icindeki public bir method
        // biz return yazmiyoruz ama Math classinin dokumantasyonuna baktiginda calisan kodlarin arasinda return oldugunu goreceksin
        double rastgeleSayi = Math.random();//gecici bir depo double deger tasiyan, ben bunu aldim kalici depoya koydum
        //Math Class'ininn icinde random() adinda bir method var
        System.out.println("Uretilen Rastgele Sayi: "+ rastgeleSayi);
        System.out.println("Uretilen Rastgele Sayi: "+ (100*Math.random())); // degiskene atamadan da dogrudan kullanabiliriz, ayni sonucu verir
        //0.01*100 ile 0.99*100 arasinda bir deger dondurur - yani 1-100 arasi deger
        //random() methodu 0.01 ile 0.99 arasinda bir deger dondurur

        int a=8;//kalici depo - stack memory'de a kutusu olustu icine 8 deger ikondu

        //Hadi kendi class'imizin kedni method'unu cagiralim!!!BYE
        System.out.println(ExampleForMethods.substraction(10,5));//gecici bir depo oldu //ilk  methodun icinde sout yazicak, sonra return degeri
        System.out.println(8);//8 sembolu gecici depo
        System.out.println(a);//8

    }

    // Parametre Almayan ve Geriye Deger Donduren Method-1
    public static float returnFloat()
    {

        return 10.0f;

    }

    // Parametre Alan ve Geriye Deger Donduren Method-2
    public static int sayilarinFarkiniBul(int a, int b) // methodumun geriye deger dondurmesini istiyorsam icinde return olmali ve VOID yazan yerde geriye donecek degerin turu yazmali, INT,DOUBLE, ETC
    {
        System.out.println("Sayilarin Farki: " + (a-b));
        return (a-b); // geriye deger dondurmek su demek; main mmethodda bu methodu calistirdigin satira a-b yi yaz demek
    }

    // Parametre Almayan ve Geriye Deger Dondurmeyen Method-3
    public static void menuGoster() // VOID, bu method geriye deger dondurmeyecek demek, yani icinde return ifadesi yok, yazarsan hata alirsin
    {
        System.out.println("***** MENU *****");
        System.out.println("1. Iki Sayinin Toplamini Bul");
        System.out.println("2. Iki Sayinin Farkini Bul");
        System.out.println("3. Iki Sayinin Carpimini Bul");
        System.out.println("3. Iki Sayinin Bolumunu Bul"); // degisiklik yapmamiz gerektiginde yalnizca methodun icine gidip kolayca yapabiliyoruz

    }

    // Parametre Alan ve Geriye Deger Dondurmeyen Method-4
    public static void sayilariTopla(int birinciSayi, int ikinciSayi)
    {
        /* burada methodu şoyle tanimlaresak;

        int s1 =5; int s2 =10;
        System.out.println("Toplam: " + (s1+s2));

        bu method yalnizca sabit olan, onceden atanmis  5 ve 10 degeri icin calisacaktir
        ancak ben bu methodu daha islevsel hale getirmek ve daha sonra istedigim her sayi cifti icin calistirmak istiyorum
        o zaman methodumu parametreli tanimlamaliyim
        method adindan sonra gelen() parantezlerin icine parametre yazilir
        parametremizin nasil olmasini istiyorsak ilk tanimlamada belirtmeliyiz (int,double, etc)
        boylece daha sonra o methodu kullanmak istedigimizde icine yazmamiz beklenen degerin hangi cinsten olmasi gerektigini bize soyleyecektir

         */
        System.out.println("Toplam: " + (birinciSayi+ikinciSayi));

    }

    //
    public static void sayiyiDegistir(int x) // otomatik olustugunda x yerine sayi yaziyordu, yazmak zorunda degil, ben x yazdim, x demek sayi demek program bunu anlayacak
    {
        x = x+10;
        System.out.println("Gonderilen Sayinin 10 Fazlasi: " + x);
    }



}
