package Section3_Operators;

import java.util.Scanner;

public class Op1_UnaryOperators
{
}
class IncrementDecrementOperators // Arttirma ve Azaltma Operatorleri
{
    public static void main(String[] args)
    {
        practice();   // calling method
        practice_2();
        practise_3();
        practise_4();

        // ++ ve -- operatorleri degiskende bulunan degeri 1 arttirmaya veya azaltmaya yarar
        // Ancak degiskenin sagında veya solunda olmasi buyuk onem tasir
        // sayi++ : once degerini hesaplar sonra arttirir
        // ++sayi : once degerini arttirir sonra hesaplar
        // sayi-- : once degerini hesaplar sonra azaltir
        // --sayi : once degerinin hesaplar sonra azaltir

        int sayi1 = 10 ; // Hafizada sayi1 e 10 degeri verildi
        int sayi2 = ++sayi1 ; // sayi1, 1 arttırılarak sayi 2 ye atandı. Bu esnada sayi1 degistirilmis oldu, artik sayi1 in degeri 11
        int sayi3 = sayi1-- ; // sayi1 11 idi, sayi3 e 11 olarak atandi, ardindan 1 azaltildi, boylece sayi3=11, sayi1=10 oldu

        // !!! Burada yapilan islemler yalnizca atama degil, direkt olarak sayi1 in degerini de degistiriyor !!!

        System.out.println("Sonuc: " + (sayi1)+(--sayi2)+(sayi3++)); // bu sekilde birakirsan sayilari metin gibi yan yana yazar
        System.out.println("Sonuc: " + ((sayi1)+(--sayi2)+(sayi3++))); // etrafina bir parantez daha koyarsan, parantezin icinde matematiksel toplama yapar

        System.out.println("tugba " + "yalcin"); // buradaki + metinleri birlestirir
        System.out.println(sayi1+sayi2); // her iki deger de int oldugu icin buradaki + toplama yapar
        System.out.println("tugba " + (sayi1+sayi2)); // parantez ici toplama islemi yaparken dısaridaki + metin birlestirme yapar


    }
    public static void practice()
    {
        int sayi = 0; // 0 yazdirmali
        System.out.println(sayi);

        sayi++; // 1 yazdirmali
        System.out.println(sayi);

        sayi--; // 0 yazdirmali
        System.out.println(sayi);

        ++sayi; // 1 yazirmali
        System.out.println(sayi);

        --sayi;// 0 yazdirmali
        System.out.println(sayi);
    }
    public static void practice_2()
    {
        int variable1 = 10; // degisken tanimlandi(declaration) ve 10 degeri atandi (assigned)
        int variable2 ; // stack bellekte variable 2 etiketiyle 1 kutu olustu, icinde henuz deger yok, bos
        variable2 = variable1; // variable 1 degerinin icindeki 10 u al variable 2 ye de koy diyor
        variable2 = variable1++; // variable 1 degerinin icindeki 10 u al variable 2 ye de koy ardindan variable 1 i git 11 yap ve oyle kal diyor
        variable2 = ++variable1; // variable1 degerini (yani 11 i ) 1 arttir (12 yap)  ayni zamanda bu 12 degerini variable 2 nin icine de koy

        int t; // declaration-tanimlama
        t= 10; // Initializing-baslatma / assign a value- bir deger atama
    }

    public static void practise_3()
    {
        for(;;)   // infinity loop - sonsuz dongu : cunku deger yok, sart yok
        {
            Scanner scan = new Scanner(System.in); // bu satir ile userdan deger girmesini istemek icin Scanner Class indan obje olustur
            System.out.println("Enter a Number: (type '0' to break the loop) ");
            int a = scan.nextInt(); // integer a degiskeninin userdan alacagin degeri koy, sayi disinda bir deger girilirse hata olusur ve program durur
            System.out.println(a); // ayni zamanda bu degeri konsolda bi yazdir da gorek

            // bu dongu 5'e kadar 10'a kadar degil sonsuza kladar gider
            // bu yuzden bir sart yazalim
            // mesela kullanici 0 girene kadar bu dongu tekrarlasin

            if(a==0)
            {
                System.out.println("Practise_3: ");
                break;   // user 0 girerse for loop icinden cik, loop u bitir demek
            }

        }
    }

    public static void practise_4()
    {
        double sum = 0;
        for(double d=0; d<=0;)
        {
            d+=0.5;  //   increment islemini yukarida parantezde degil, loop icinde yaptik
            sum+=d;  //   0.5  2.0   5.5
            System.out.println("sum:" + sum);

        }
    }
}
