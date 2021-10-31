package Section5_GenelTekrar;

import java.util.Scanner;

public class Question_15
{
    public static void main(String[] args)
    {
        // Kullanicidan aldiginiz integer degere kadar olan tum asal sayilari yazdiran programi yaziniz
        // 10 icin ekranda 2,3,5,7 degerleri olmalidir

        printPrimes();
    }

    public static void printPrimes()
    {

        Scanner tara = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz");
        int sayi = tara.nextInt();




        for(int i =2; i<=sayi; i++ )
        {
            boolean asalMi = true;
            for(int j=2; j<i; j++)
            {
                if((i % j) == 0)  // herhangi bir sayi ile modu 0 ise, o sayiya tam bolunuyordur ve asal degildir demektir
                {
                    asalMi = false;
                    break;
                }

            }
            if(asalMi)
            {
                System.out.print(i + ",");
            }

        }
    }
}
