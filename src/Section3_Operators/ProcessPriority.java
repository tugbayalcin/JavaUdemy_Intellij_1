package Section3_Operators;

public class ProcessPriority // Islem Onceligi
{
    public static void main(String[] args)
    {
        // 1. () : Once parantez ici hesaplanir
        // 2. ++ ve -- : Eger degiskenden once ise
        // 3. carpma ve bolme
        // 4. toplama ve cikarma
        // 5. = : atama islemi
        // 6. ++ ve -- : eger degiskenden sonra ise

        int sayi1 = 15;
        int sayi2 = 5;
        int sonuc = 0;

        sonuc = (sayi1 + sayi2*2 - sayi2) + sayi2 - sayi1*4  + sayi1 ; // -20
        System.out.println("Sonuc 1: " + sonuc);

        sonuc = (sayi1 * sayi2 + 4/2) + sayi1++ * sayi2 + sayi1 ; // 168
        // Burada sayi1*sayi isleminden sonra sayi1 i bundan boyle 16 yap demek
        // sayi1*sayi2+1 demek degil
        System.out.println("Sonuc 2: " + sonuc);





    }
}
