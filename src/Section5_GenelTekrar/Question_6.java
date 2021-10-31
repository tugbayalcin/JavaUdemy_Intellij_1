package Section5_GenelTekrar;

public class Question_6
{
    public static void main(String[] args)
    {
        // 1''den 10'e kadar olan sayilari sira ile ve aralarinda virgul olacak sekilde yazan bir uygulamayi for dongusu ile yaziniz
        // 1,2,3,....10 10 dan sonra virgul olmasin

        for(int i=1; i<=10 ; i++)
        {
            System.out.print(i); // println yani line her yazdirmadan sonra bir alt satira gecer
            if (i!=10)
            {
                System.out.print(","); // yan yana yazdirmak sitiyorsam yalnizca print kullanmaliyim
            }
        }


    }
}
