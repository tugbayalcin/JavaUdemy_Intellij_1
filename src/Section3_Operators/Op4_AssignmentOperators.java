package Section3_Operators;

public class Op4_AssignmentOperators // Atama Operatorleri
{
    public static void main(String[] args)
    {

        // Toplamda 5 cesit atama operatoru vardir
        // += , -= , *= , /= , %=

        int sayi1 = 10;
        int sayi2 = 20;
        int sonuc = 0;

        sonuc += sayi1; // sonuc = sonuc+sayi1 demek  : bundan sonra sonuc gordugu yere sonuc+sayi1 degerini yazacak
        System.out.println("Sonuc: " + sonuc);       // sonuc=10 oldu

        sonuc -= sayi2; // sonuc = sonuc-sayi2 demek  : bundan sonra sonuc gordugu yere sonuc-sayi2 degerini yazacak
        System.out.println("Sonuc: " + sonuc);       // sonuc=-10 oldu

        sonuc *= sayi1; // sonuc = sonuc*sayi1 demek  : bundan sonra sonuc gordugu yere sonuc*sayi1 degerini yazacak
        System.out.println("Sonuc: " + sonuc);       // sonuc= -100 oldu

        sonuc /= sayi2; // sonuc = sonuc/sayi2 demek  : bundan sonra sonuc gordugu yere sonuc/sayi2 degerini yazacak
        System.out.println("Sonuc: " + sonuc);       // sonuc= -5

        sonuc %= sayi1; // sonuc = sonuc%sayi1 demek  : bundan sonra sonuc gordugu yere sonuc%sayi1 degerini yazacak
        System.out.println("Sonuc: " + sonuc);       // sonuc= -5

        //ODEV//

        double ondalikliSayi = 6.50;
        double odevsonucu = 0;

        odevsonucu++;
        ondalikliSayi *= odevsonucu;
        System.out.println("Sonuc: " + ondalikliSayi);

        //ODEV2//

        int s1=10;
        int s2=6;
        s1++;
        --s2;
        s1*= --s2;
        System.out.println("S1'in son degeri: " + s1);
        System.out.println("S2'in son degeri: " + s2);


    }
}
