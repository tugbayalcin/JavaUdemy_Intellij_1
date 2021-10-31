package Section5_GenelTekrar;

import java.util.Scanner;

public class Question_13
{
    public static void main(String[] args)
    {
        // Kullanicidan aldiginiz iki integer degerin en buyuk ortak bolenini bulan uygulamayi yaziniz
        // ornegin 14 ve 35 sayilari icin ebob = 7 olmalidir

        Scanner tara = new Scanner(System.in);

        System.out.println("Birinci Sayiyi Giriniz: ");
        int sayi1 = tara.nextInt();

        System.out.println(":Ikinci Sayiyi Giriniz: ");
        int sayi2 = tara.nextInt();

        int ebob =1;
        int kontrol = 2;

        while(kontrol <= sayi1 && kontrol <= sayi2) // ???
        {
            if ((sayi1 % kontrol == 0) && (sayi2 % kontrol == 0)) {
                ebob = kontrol;
            }
            kontrol++;
        }

        if (ebob == 1)
        {
            System.out.println(sayi1 + " ve " + sayi2 + " Aralarinda Asaldir");
        }
        else
        {
            System.out.println(sayi1 + " ve " + sayi2 + " Sayilarinin En Buyuk Ortak Boleni " + ebob + "'dir.");
        }

    }
}
