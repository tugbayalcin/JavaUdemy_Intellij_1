package Section2_Variables;

public class BolumSonuOdev
{
    public static void main(String[] args)
    {
        // ODEV 1:
        // integer bir degisken olusturup icine metin olarak olusturulmus olan
        // -String stringDegiskeni = "150";- ifadesini atayip yenşiden yazdiririn
        // Sonrasında olusan int degeri yeniden string e cevirerek yazdir

        String stringDegiskeni = "150"; // String degiskeni metin ifade eden yapilar icin kullandigimiz degiskendir
                                        // Cift tirnak icerisine rakam veya yazı ekleyebiliriz
                                        // Metin ifadesinin buyuklugu önceden belli olamayacagi icin bellekte kaplayacagi yer bilinemez
                                        // Dolayisi ile String degiskeni primitive degiskenlerden degildir
                                        // Boyle veri tiplerine referans tipli veri turu denir

     // int integerDegiskeni = stringDegiskeni; boyle diyemiyorum, elmayla armutu eslestirmek gibi oluyor
                                // cünkü string degiskeninin türü string, integer degil
        int integerDegiskeni1 = Integer.parseInt(stringDegiskeni);  // 1. yol
        // Burada devreye wrapper class giriyor
        // Wrapper class integer degerinin max min bie degerlerini gosterdigi gibi baska islevlerde de isimize yarar
        // Yazdigimiz kod şu demek:  Bana bir string deger ver, parantezlerin icine yaz ve ben yapabiliyorsam onu integer a donustureyim
        // Tabiki de "tugba" gibi bir deger ise int e donusturmesini bekleyemeyiz
        int integerDegiskeni2 = Integer.valueOf(stringDegiskeni); // 2. yol
        // stringDegiskeni : Parametredir
        // parseInt ve valueOf : Methodlardir
        System.out.println("Integer Degiskeni 1 : " + integerDegiskeni1);
        System.out.println("Integer Degiskeni 2 : " + integerDegiskeni2);

        // stringDegiskeni = integerDegiskeni1; Elmalarla armutlaaar
        stringDegiskeni = String.valueOf(integerDegiskeni1);
        System.out.println("String degiskeninin son degeri: " + stringDegiskeni);

        System.out.println("**************");


        // ODEV 2:
        // int sayi1 = 5/3; float sayi2 = 5f/3f;  double sayi3 = 5d/3d; ifadelerini hesapla

        int sayi1 = 5/3 ;
        float sayi2 = 5f/3f ; // Float virgulden sonra 7 basamak saklayabilir
        double sayi3 = 5d/3d ; // Double sonsuza kadar gidebilir ancak son basamagi yuvarlama kurallarına uygun olarak yuvarlıyor

        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);

        System.out.println("**************");


        // ODEV 3:
        // System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        // System.out.println(1.0 - 0.9); ifadelerini yazdir

        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); // 0.5 degerini gormeyi umuyorum
        System.out.println(1.0 - 0.9); // 0.1 degerini gormeyı umuyorum

        // 0.500000000001 yazdi : yazabildigi kadar basamak yazdiktan sonra son basamagi 1 e yuvarladi
        // 0.099999999998 yazdi : yazabildigi kadar basamak yazdiktan sonra son basamagi 8 e yuvarladi

        // Ozetle noktali ifadelerde istedigim hassas sonucu vermiyor
        // Virgulden sonra 2 basamak al, 3 absamak al diye cozebiliriz, ileriki derslerde ogrenecegiz


        System.out.println("**************");


        // ODEV 4:
        // Verilen ifadeleri yazdir ve gor

        int number1 = 1; // amacimiz bu iki sayinin ortalamasini bulup double turde saklamak
        int number2 = 2;

        double ortalama = (number1 + number2) / 2; // 1.5 beklerken 1.0 yazdirdi
        System.out.println("ortalama1: " + ortalama); // cunku f veya d demedigimiz icin  int olarak islem yaptı

        double ortalama2 = (number1 + number2) / 2.0;  // (2.0 veya 2d yazabilirsin)
        System.out.println("ortalama1: " + ortalama2); // 1.5 bekliyorduk ve yazdirdi cunku double int i ezdi

        double ortalama3 = (double)(number1 + number2) / 2; // bu satır type casting yaptigi icin yine double olarak cikti verir

    }
}
