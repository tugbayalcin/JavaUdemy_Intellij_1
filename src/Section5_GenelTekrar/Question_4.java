package Section5_GenelTekrar;

public class Question_4
{
    public static void main(String[] args)
    {
       // Kendi adinizi ekrana 5 kere yazdiran uygulamayi tum dongulerle yaziniz

        System.out.println("  ");
        int i ; // i olusturuldu
        for (i=0; i<5;i++) // i ye 0 degeri atandi ve her seferinde 1 arttirildi
        {
            System.out.println("For Dongusu " + (i+1) + ". Tur: Tugba Yalcin");
        }
        for (int t=0; t<5;++t) // i tanimlandi ve hemen 0 atandi
        {
            System.out.println("For Dongusu " + (t+1) + ". Tur: Tugba Yalcin");
        }




        System.out.println("  ");
        int j=0;
        while(j<5)
        {
            System.out.println("While Dongusu " + (j+1) + ". Tur: Tugba Yalcin");
            j++;
        }




        System.out.println("   ");
        int k=0;
        do
        {
            System.out.println("Do-While Dongusu " + (k+1) + ". Tur: Tugba Yalcin");
            k++;
        }
        while(k<5);





    }
}
