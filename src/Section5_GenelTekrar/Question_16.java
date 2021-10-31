package Section5_GenelTekrar;

public class Question_16
{
    public static void main(String[] args)
    {
        // 1 + 2 + 4 + 7 + 11 + 16 + 20 + 23 + 25 + 26 + 28 + 31 + 35 = ?
        // isleminin sonucunu bulan java programini yaziniz

        int artis = 0;
        boolean yonArtiyorMu = true;
        int toplam = 0;


        for(int i =1; i<=35; i=i+artis)
        {
            System.out.print(i);
            toplam = toplam + i;
            if(i != 35)
            {
                System.out.print(" + ");
            }
            else
            {
                System.out.println(" = " + toplam);
            }

            if ((artis <=4) && yonArtiyorMu == true)
                {
                artis++;
                if(artis==5)
                {
                    yonArtiyorMu = false;
                    continue; // artis degeri 5 oldugunda ekrana yazdirma es gec demek
                }
            }
            else
            {
                artis--;
                if(artis==1)
                {
                    yonArtiyorMu = true;
                    continue;
                }
            }
        }


    }
}
