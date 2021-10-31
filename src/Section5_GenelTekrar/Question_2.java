package Section5_GenelTekrar;
import java.util.Scanner;
public class Question_2
{
    public static void main(String[] args)
    {
        // Klavyeden kenarlari girilen bir ücgenin cesidini veren uygulamayi yaziniz

        Scanner tara = new Scanner(System.in);

        System.out.println("Lutfen Birinci Kenar Uzunlugunu Giriniz: ");
        int kenar1= tara.nextInt();
        System.out.println("Lutfen Ikinci Kenar Uzunlugunu Giriniz: ");
        int kenar2= tara.nextInt();
        System.out.println("Lutfen Ucuncu Kenar Uzunlugunu Giriniz: ");
        int kenar3= tara.nextInt();

        if((kenar1==kenar2) && (kenar2==kenar3))
        {
            System.out.println("Kenar Uzunlugunu Girilen Ucgen Bir Eskenar Ucgendir ");
        }
        else if((kenar1==kenar2 && kenar1!=kenar3) || (kenar1==kenar3 && kenar1!= kenar2 || (kenar2==kenar3 && kenar2!=kenar1)))
        {
            System.out.println("Kenar Uzunlugunu Girilen Ucgen Bir Ikızkenar Ucgendir ");
        }
        else if((kenar1!=kenar2) && (kenar1!= kenar3) && (kenar2!=kenar3))
        {
            System.out.println("Kenar Uzunlugunu Girilen Ucgen Bir Cesitkenar Ucgendir ");
        }

        // burada kolaylik olmasi adina 1. kosul icin eskenar, 2. kosul icin cesitkenar ve sonuncuya hic kosul yazmadan
        // yalnizca else durumu ile ikizkenar ucgeni yazdirabilirsin


    }
}
