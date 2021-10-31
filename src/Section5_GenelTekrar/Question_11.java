package Section5_GenelTekrar;

import java.util.Scanner;

public class Question_11
{
    public static void main(String[] args)
    {
        // Sicak Soguk oyunu yapalim.Sistem 100 e kadar bir sayi uretsin. Kullsnici bu sayiyi tahmin etmeye calissin.
        // Kullanicinin girdigi degere gore kullaniciyi arttir veya azalt diye uyaralim.
        // Kullanici sayiyi bulana kadar tahmin istemeye devam edelim ve sayiyi buldugunda kac denemeden sonra buldugunu belirtelim

        Scanner tara = new Scanner(System.in);

        int sansliSayi = (int) (Math.random()*101); // type casting yapildi, 0-100 arasi sayi uretildi
        int sayac=1;

        for(sayac=1; ;sayac++) // kosul olusturmadik ve boylece sonsuz dongu elde ettik, biz dur demedikce durmayacak
        {
            System.out.println("Lutfen Tahmininizi Giriniz: ");
            int tahmin = tara.nextInt();

            if(tahmin<sansliSayi)
            {
                System.out.println("Lutfen Tahmininizi Arttirarak yeniden Giriniz:");
            }
            else if(tahmin>sansliSayi)
            {
                System.out.println("Lutfen Tahmininizi Azaltarak yeniden Giriniz:");
            }
            else if(sansliSayi==tahmin)
            {
                System.out.println("Tebrikler! " +sayac +". Tahminde Bildiniz");
                break; // programa dur komutunu burada verdim, sonsuz donguden cikildi
            }

        }



    }

}


