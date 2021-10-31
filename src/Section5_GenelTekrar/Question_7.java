package Section5_GenelTekrar;
import java.util.Scanner;
public class Question_7
{
    public static void main(String[] args)
    {
        // Klavyeden girilen bir sayinin faktoriyelini alan bir uygulama yaziniz
        Scanner tara = new Scanner(System.in);

        System.out.println("Faktoriyeli Hesaplanacak Sayiyi Giriniz: ");
        int sayi = tara.nextInt();
        long carpim = 1;
        for(int sayac =1; sayac<=sayi; sayac++)
        {
            carpim = carpim *sayac;
        }
        System.out.println("Girilen Sayinin Faktoriyeli: " + carpim);

        // carpim degiskenini int yaparsan icine sıgabilecek en buyuk sayıya kadar hesaplar
        // daha buyuk sayilari da hesaplamak istedigimiz icin long sectik
        // 50 yazdigimizda - li bir deger gorecegiz
        // bunun anlami aslinda olusan sayiyi tutamadigi ve istedigimiz cevaptan baska bir cevap gosterdigidir

    }
}
