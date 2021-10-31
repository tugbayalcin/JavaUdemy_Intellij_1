package GenelTekrar_Section1to9;

public class parseInt_valueOf_karsilastirmasi
{
    public static void main(String[] args)
    {
        int sayi = 5;
        String stringSayi = "7";
        String stringKelime = "Sekiz";

        //<editor-fold desc="FARK 1"

        /*
            FARK 1:
                Integer.valueOf() methodu parametre olarak hem String hem de Integer degisken kabul ederken,
                Integer.parseInt() methodu sadece String kabul eder. Bundan dolayi tam sayi parametresi gecmeye
                calistigimizda hata aliriz
         */
        //</editor-fold>
        System.out.println(Integer.valueOf(sayi)); // parametre olarak integer deger aldi --> cikti:5
        // System.out.println(Integer.parseInt(sayi)); bu satir hata verdi cunku parseInt methodu parametre olarak yalşnizca String kabul eder

        // System.out.println(Integer.valueOf(stringKelime)); // parametre olarak string kelime aldi --> ERROR
        // System.out.println(Integer.parseInt(stringKelime)); // parametre olarak string kelime aldi --> ERROR

          /*
               NOTE: Parametre olarak string kabul ediyor olmasi kelimeleri integera cevirebilecegi anlamina gelmiyor
               cift tırnaklar arasina yazilan rakamsal ifadelerin, integera cevirilecegi anlamina geliyor
          */
        System.out.println(Integer.valueOf(stringSayi)); // parametre olarak String sayi aldi --> cikti:7
        System.out.println(Integer.parseInt(stringSayi)); // parametre olarak String sayi aldi --> cikti:7



        //<editor-fold desc="FARK 2"

        /*
            FARK 2:
                Integer.valueOf() methodu geriye bir Integer objesi dondururken,
                Integer.parseInt() methodu ise int tipinde bir primitive dondurur
         */
        //</editor-fold2
        // methodlarin uzerine gelip, acilan bilgi ekranindan geri donuz tipini gorebilirsin



        //<editor-fold desc="FARK 3"

        /*
            FARK 3:
                Integer.valueOf() methodu parametre olarak bir karakter aldiginda onun unıcode degerini dondurur
                Integer.parseInt() methodu parametre olarak string alıyor ancak tek bir karakter girildiginde
                bunu uyumsuz tur olarak algilar ve hate verir
         */
        //</editor-fold>
        char s1 = 's';
         System.out.println(Integer.valueOf(s1)); // DIKKAT: burada tanımlama char olarak yapilmali. ve char tek tirnak icinde tanimlanir
         // System.out.println(Integer.parseInt(s1)); --> ERROR


    }
}
