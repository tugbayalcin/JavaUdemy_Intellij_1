package Section5_GenelTekrar;
import java.util.Scanner;
public class Question_1
{
    public static void main(String[] args)
    {
        // SORU: Klavyeden girilen 3 sayinin ortalamasini alan bir program yaziniz.

        Scanner tara = new Scanner(System.in);

        System.out.println("Lutfen Birinci Sayiyi Giriniz: ");
        int sayi1= tara.nextInt();

        System.out.println("Lutfen Ikinci Sayiyi Giriniz: ");
        int sayi2= tara.nextInt();

        System.out.println("Lutfen Ucuncu Sayiyi Giriniz: ");
        int sayi3= tara.nextInt();


        double ortalama = (sayi1+sayi2+sayi3)/3.0;
        System.out.println("Girilen Sayilarin Ortalamasi: " + ortalama);
        System.out.printf("Yuvarlanmis Ortalama: "+ "%.2f", ortalama); // bu satir ile ciktimizi belli bir formatta yazdirabiliyoruz,
        // ortalama degiskeninin virgulden sonra 22 basamagini yazdir demek printf ve %.2f
    }
}
