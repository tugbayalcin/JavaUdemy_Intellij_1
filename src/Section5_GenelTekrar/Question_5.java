package Section5_GenelTekrar;
import java.util.Scanner;
public class Question_5
{
    public static void main(String[] args)
    {
        // 1'den 100'2e kadar olan sayilarin toplamini bulan uygulamayi yaziniz
        // kullanicinin girdigi iki deger arasindaki sayilarin toplamini hesaplayan uygulamayi yaziniz

        Scanner tara= new Scanner(System.in);
        int i= 0;
        int toplam=0;
        System.out.println("Alt Sinir Icin Bir Sayi Giriniz: ");
        int altSinir = tara.nextInt();
        System.out.println("Ust Sinir Icin Bir Sayi Giriniz: ");
        int ustSinir = tara.nextInt();

        for(i=altSinir; i < ustSinir ; i++)
        {
            toplam=toplam+i;
        }
        System.out.println(altSinir + " ile " +ustSinir + " arasindaki sayilarin toplami: " + toplam);




    }
}
