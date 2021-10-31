package Section3_Operators;
import java.util.Scanner;

public class Op2_AritmaticOperators
{
    public static void main(String[] args)
    {
        int sayi1 = 20 ;
        int sayi2 = 40;

        System.out.println("Sayi1: " + sayi1 + " Sayi2: " +sayi2 + " Toplamlari: " + (sayi1+sayi2));
        // Parantez icindeki + isareti int olan iki sayiyi toplarken,
        // Parantez disindakiler metinsel ifadeleri yan yana yazdirmaya yarar
        System.out.println("Sayi1: " + sayi1 + " Sayi2: " +sayi2 + " Farklari: " + (sayi1-sayi2));
        // Parantez bize islem omceligi saglar
        // Once cikarma islemini yap sonra metinlerin yanina yaz der
        System.out.println("Sayi1: " + sayi1 + " Sayi2: " + sayi2 + " Carpimlari: " + (sayi1*sayi2));
        System.out.println("Sayi1: " + sayi1 + " Sayi2:" +  sayi2 + " Bolumleri: " + ((double)sayi1/(double)sayi2));
        // (double)(sayi1/sayi2) yaptigimda olmadi
        // sayilardan herhangi birinin basina double koyman yeterli
        System.out.println("Sayi1: " + sayi1 + " Sayi2: " +sayi2 + " Modlari: " + (sayi1%sayi2));



    }
}

