package Section4_ControlStructures;

public class ReturnIfadesi
{
    public static void main(String[] args)
    {
        method1();
        method1(10);

      String toplam =  method1(1,2);
        System.out.println(toplam);
    }

    public static void method1()
    {
        System.out.println("void methodlar return etmezler ama return; ifadesi alabilirler");

        return;

        /*
        System.out.println("return ifadesinden sonra compiler methoddan cikar." +
                "yani return type olan methodlardaki gibi returnden sonra bir sey yazilmaz." +
                "Compiler kirmizi yakar (Compiler-Time Error)");

         */
    }
    public static void method1(int a)
    {
        System.out.println("void methodlar return etmezler ama return; ifadesi alabilirler");

        if(a==10)
        {
            return;
        }

        System.out.println("return; ifadesi ile karsilasirsa compiler methoddan cikar");
    }
    public static String method1(int x, int y)
    {
        if(x==0)
          //  return; // x==0 olursa methoddan cik, hicbir sey dondurme diyemeyiz, geri dondurmek zorunda olan bir method hicbir sey dondurmazse hata verir
            return null; // x==0 olursa methoddan cik, hicbir sey dondurme diyemeyiz
                         // method return type oldugu icin kesinlikle bir deger dondurmeli
                         // ise yaramaz bir deger dondurmesi icin ise DEFAULT DEGERINI return edebiliriz
                         // int olsaydi return 0; , double olsaydi return 0.0; ,derdim
        else
            return ("x ile y nin toplami: "+ x+y);
    }
}
