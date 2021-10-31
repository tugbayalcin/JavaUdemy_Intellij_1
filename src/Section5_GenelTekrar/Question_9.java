package Section5_GenelTekrar;

import java.util.Scanner;

public class Question_9
{
    public static void main(String[] args)
    {
        // 100'luk sistemde verilen notlari harfli sistemde gosteren bir uygulama yaziniz

        Scanner tara = new Scanner(System.in);
        System.out.println("Lutfen Notunuzu Giriniz: ");
        int not = tara.nextInt();

        if(not<=100 && not>=84)
        {
            System.out.println("Notunuzun Harf Notu Karsiligi AA'dir");
        }
        else if(not<=83 && not>=77)
        {
            System.out.println("Notunuzun Harf Notu Karsiligi AB'dir");
        }
        else if(not<=76 && not>=71)
        {
            System.out.println("Notunuzun Harf Notu Karsiligi BA'dir");
        }
        else if(not<=70 && not>=66)
        {
            System.out.println("Notunuzun Harf Notu Karsiligi BB'dir");
        }
        else if(not<=65 && not>=61)
        {
            System.out.println("Notunuzun Harf Notu Karsiligi BC'dir");
        }
        else if(not<=60 && not>=56)
        {
            System.out.println("Notunuzun Harf Notu Karsiligi CB'dir");
        }
        else if(not<=55 && not>=50)
        {
            System.out.println("Notunuzun Harf Notu Karsiligi CC'dir");
        }
        else if(not<=49 && not>=46)
        {
            System.out.println("Notunuzun Harf Notu Karsiligi CD'dir");
        }
        else if(not<=45 && not>=40)
        {
            System.out.println("Notunuzun Harf Notu Karsiligi DC'dir");
        }
        else if(not<=39 && not>=33)
        {
            System.out.println("Notunuzun Harf Notu Karsiligi DD'dir");
        }
        else if(not<=32 && not>=0)
        {
            System.out.println("Notunuzun Harf Notu Karsiligi FF'dir");
        }



        // IKINCI YOL - SWİTCH CASE İLE
        // Switch Case de aralik belirtemedigimiz icin alınan notu 10 a bolersek 90-100 aralıgında not alan bir
        // ogrenci icin case sayisi 9 olacaltir

        int notDegeri = 0, notSinir =0;
        System.out.println("Notunuzu Giriniz");
        notDegeri = tara.nextInt();
        notSinir = notDegeri/10;

        if(notDegeri==100)  // casede 100 icin deger yazmazsak boyle yapmaliyşiz
        {
            notSinir=9;
        }

        switch (notSinir)
        {
            case 10:
                System.out.println("Notunuz AA");
                break;
            case 9:
                System.out.println("Notunuz AA");
                break;

            case 8:
                System.out.println("Notunuz BA");
                break;
            case 7:
                System.out.println("Notunuz BB");
                break;

            case 6:
                System.out.println("Notunuz BC");
                break;
            case 5:
                System.out.println("Notunuz CB");
                break;

            case 4:
                System.out.println("Notunuz CC");
                break;
            case 3:
                System.out.println("Notunuz CD");
                break;

            case 2:
                System.out.println("Notunuz DC");
                break;
            case 1:
                System.out.println("Notunuz DD");
                break;

            case 0:
                System.out.println("Notunuz FF");
                break;
        }
    }
}
