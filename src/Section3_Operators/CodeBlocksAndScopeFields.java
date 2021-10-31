package Section3_Operators;

public class CodeBlocksAndScopeFields // Yasam Alani
{
    public static void main(String[] args)
    {
        int seviye1Block1 = 1;
        { // Block actik
            System.out.println(seviye1Block1); // Blockun icinde degiskenim tanimli
            int seviye2Block1 = 21;
            { // Bir block daha actik, her iki degisken de hala burada tanimli
                System.out.println(seviye1Block1);
                System.out.println(seviye2Block1);

              //  System.out.println(seviye3Block1); burada calismaz, cunku henuz tanimlanmadi bile

                int seviye3Block1 = 31;
                { // Bir blok daha actik, simdiye kadar tanimladigimiz tum degiskenler bu blokta tanimli
                    System.out.println(seviye1Block1);
                    System.out.println(seviye2Block1);
                    System.out.println(seviye3Block1);

                }
                System.out.println(seviye3Block1);
                // burada da tanimli, kodlar yukaridan asagiya dogru calisir ve buraya geldigimde ust satirda
                // tanimlanmis oldugu icin calisir
            }
        }
        int seviye1Block2 = 12;
        {
            System.out.println(seviye1Block1);
            System.out.println(seviye1Block2);
            // Yalnbizca seviye1 olanlar bu bolckun icinde tanimli oldu
        }
    }
}
