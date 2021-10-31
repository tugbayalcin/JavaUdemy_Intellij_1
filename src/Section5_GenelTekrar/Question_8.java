package Section5_GenelTekrar;

import java.util.Scanner;

public class Question_8
{
    public static void main(String[] args)
    {
        // Asagida tanimi verilen f(x,y) fonksiyonunu klavyeden girilen x ve y degerleri icin hesaplayiniz
        // x>0 , y<0 ise f(x,y) = 4x+2y+4
        // x>0 , y=0 ise f(x,y) = 2x-y+3
        // x<0 , y>0 ise f(x,y) = 3x+4y+3

        Scanner tara= new Scanner(System.in);
        int fonksiyon =0;

        System.out.println("Bir x degeri Giriniz: ");
        int x = tara.nextInt();

        System.out.println("Bir y degeri Giriniz: ");
        int y = tara.nextInt();

        if(x>0 && y<0)
        {
            fonksiyon = (4*x) + (2*y) + 4;
            System.out.println("x= " + x + "ve y= " + y + " Icin Fonksiyonun Aldigi Deger: " +fonksiyon);
        }
        else if (x>0 && y==0)
        {
        fonksiyon = (2*x)-y+3;
        System.out.println("x= " + x + " ve y= " + y + " Icin Fonksiyonun Aldigi Deger: "+fonksiyon);
        }
        else if (x<0 && y>0)
        {
            fonksiyon = (3*x)+ (4*y) + 3;
            System.out.println("x= " + x + " ve y= " + y + " Icin Fonksiyonun Aldigi Deger: "+fonksiyon);
        }
        else
        {
            System.out.println("x= " + x + " ve y= " + y + " Icin Fonksiyon Tanimli Degildir ");
        }

    }
}
