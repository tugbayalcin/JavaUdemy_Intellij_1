package Section5_GenelTekrar;
import java.util.Scanner;
public class Question_12
{
    public static void main(String[] args)
    {
        // Kullanicidan surekli olarak sayi alan ve de kullanici 0'a bastiginda girdigi sayilarin carpimini
        // sonuc olarak gosteren programi yaziniz

        Scanner tara = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz, Cikmak Icin 0'i Tuslayiniz:  ");
        int sayi= tara.nextInt();
        int carpim=1;
        boolean hemenCikildiMi = true;

        while(sayi != 0)
        {
            carpim = carpim * sayi;
            System.out.println("Lutfen Bir Sayi Giriniz, Cikmak Icin 0'i Tuslayiniz:  ");
            sayi = tara.nextInt();
            hemenCikildiMi = false;

        }
        if(hemenCikildiMi)
        {
            System.out.println("Uygulamadan Hemen Ciktiniz ");
        }
        else
        {
            System.out.println("Girdiginiz Sayilarin Carpimi: " + carpim);
        }




    }
}
