package Section5_GenelTekrar;
import java.util.Scanner;
public class Question_3
{
    public static void main(String[] args)
    {
        // Klavyeden girilen vize ve final notlarina gore ogrencinin dersi gecip gecmedigini soyleyen bir uygulama yaziniz
        // Gecme Notu:50, Vizenin %40'i ve Finalin %60'i alinacaktir

        Scanner tara = new Scanner(System.in);

        System.out.println("Lutfen Vize Notunuzu Giriniz: "); // sinavdn 75.6 alma ihtimaline karsi double tanimladik
        double vizeNotu= tara.nextDouble(); // double alacaksan next.Double kullanmayi unutma
        System.out.println("Lutfen Final Notunuzu Giriniz: ");
        double finalNotu= tara.nextDouble();

        int gecmeNotu = 50;
        double ortalama = (vizeNotu*40/100.0) + (finalNotu*60/100.0);

        if(ortalama>=gecmeNotu)
        {
            System.out.println("Tebrikler! Dersi Başari Ile Gectiniz. Ortalamaniz: " + ortalama);
        }
        else
        {
            System.out.println("Uzgunuz! Dersi Gecemediniz. Ortalamaniz: " +ortalama);
        }



    }
}
