package Section5_GenelTekrar;

import java.util.Scanner;

public class Question_14
{
    public static void main(String[] args)
    {
        // Girilen bir metnin palindrome olup olmadigini kontrol eden programi yaziniz
        // Tersten de okunusu ayni olan kelimelere palindrom kelimeler denir. kacak gibi

        Scanner tara = new Scanner(System.in);
        System.out.println("Lutfen Bir Kelime Giriniz:");
        String kelime = tara.nextLine();

        int altSinir = 0;
        int ustSinir = kelime.length() -1 ;  // kelime.length yapisi kelimenin kac karakterden olutugunu bize soyler
                                             // kullanacagimiz indeksler 0 dan baslayacak ve kelime.length ise 1 den baslatacagi icin -1 yaparak ikisini esitlemeye calisiyoruz
        boolean palindromMu = true;

        while(altSinir<ustSinir)
        {
            if(kelime.charAt(altSinir) != kelime.charAt(ustSinir))
            {
                palindromMu = false;
                break;
            }
            altSinir++;
            ustSinir--;

        }
        if (palindromMu)
        {
            System.out.println(kelime + " Kelimesi Bir Palindromdur");
        }
        else
        {
            System.out.println(kelime + " Kelimesi Bir Palindrom Degildir");
        }

    }
}
