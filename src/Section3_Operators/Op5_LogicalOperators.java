package Section3_Operators;

public class Op5_LogicalOperators // Koşullu-Mantıksal Operatorler
{
    public static void main(String[] args)
    {
        // Matematikteki 've, veya, degil' ifadelerinin javada karsiligidir
        // Bu operatorler de sonuc olarak true veya false degerini dondurur
        // && : ve(and) : True olmasi icin her iki degiskenin de true olmasi gerekir, aksi halde false dondurur
        // ||: veya(or) : False olmasi icin her iki degiskenin de false olmasi gerekir, aksi halde true dondurur
        // ! : degil( ) : Onundeki ifadenin tersini verir

        boolean deger1 = true;
        boolean deger2 = false;

        System.out.println("deger1 ile deger2 and durumu:  " + (deger1 && deger2));
        System.out.println("deger1 ile deger2 or durumu:  " + (deger1 || deger2));

        int benimYasim = 27;
        int onunYasi= 24;

        if(benimYasim < 30 && onunYasi > 20)
        {
            // if icerisi true && true = true oldugundan {} icerisindeki kod blogu calisacak
            System.out.println("Birinci ifade calisti");
        }

        if(benimYasim < 24 && onunYasi > 24)
        {
            // if icerisi false || false = false oldugundan {} icerisindeki kod blogu calismayacak
            System.out.println("Ikinci ifade calisti");
        }
        else
        {
            System.out.println("Ikinci ifadenin else blogu calisti");
        }
    }
}
