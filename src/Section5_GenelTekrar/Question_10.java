package Section5_GenelTekrar;

public class Question_10
{
    public static void main(String[] args)
    {
        // Carpim tablosunu olusturan bir uygulama yaziniz

        for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=10; j++)
            {
                System.out.print( i + "*" + j + "=" + (i*j) + "\t"); // 1 tablık yani 3 birimlik bosluk birak demek
            }
            System.out.println(); // 1'ler bittikten sonra alt satira gecmeyi sağlar
        }
    }
}
