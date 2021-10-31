package Section2_Variables;

public class TypesOfOperators
{
    public static void main(String[] args)
    {
        // OPERATOR: Toplama, cikatrma gibi islemleri yapmamizi saglayan sembollerdir: +,-,*, vs
        // OPERAND: Operatorlerin uygulandigi degerlerdir. Ornegin carpma islemi icin 5*2 orneginde iki operand vardır.Bunlar soldan 5 ve sagdan 2'dir
        // UNARY OPERATOR: Tek operanda uygulanan operatorlere unary operator denir. (x=-x deki - operatoru gibi)
        // BINARY OPERAND: Iki operanda uygulanan operatorler binary operatordur. (3+4=7 deki + operatoru gibi )
        // TERNARY: Uc operanda uygulanan operatorler ternary operatordur. (a?b:c gibi, if in kısa hali)

        // OPERATOR ONCELIK TABLOSU: Section2 icerisinde OperatorOncelikTablosu.png dosyasina bakiniz

        //


        UnaryOperators(); // Tekil operandli islemler
        ArithmeticOperators(); // Aritmetik islem yapan operatorlerdir [+,-,*,/,%] --5 tane
        RelationalOperators(); // Iliskisel Operatorler [==,!=,<,>,<=,>=] --6 tane
        AssignmentOperators(); // Atama Operatorleri [ =, +=, -=, *=, /=, %=] --6 tane
        LogicalOpretaors(); // Mantıksal Operatorler [&&,||,!] --3 tane
        TernaryOperators(); // Uclu Kosul Operatoru bool?deger donduren ifade 1: deger donduren ifade2]
        ShiftOperators(); // Kaydirma Operatoru ??
        BitwiseOperators(); // ??



    }
    public static void UnaryOperators()
    {
        int x = 5;
        System.out.println(x); // 5 yazdirilacak
        x++;
        // ++ operatoru degiskenden sonra kullaniliyorsa; once degiskenin var olan degerini kullan, ardindan arttirma islemini yap demek
        System.out.println(x); // 6 yazdirilacak
        ++x;
        // ++ operatoru degiskenden once kullaniliyorsa; once degiskenin degerini 1 arttir ardindan yeni degerei ile islem yap demek
        System.out.println(x); // 7 yazdirilacak

        x--;
        // -- operatoru degiskenden sonra kullaniliyorsa; once degiskenin var olan degerini kullan, ardindan azaltmma islemini yap demek
        System.out.println(x); // 6 yazdirilacak
        --x;
        // -- operatoru degiskenden once kullaniliyorsa; once degiskenin var olan degerini 1 azalt, ardindan yeni degeri ile islem yap demek
        System.out.println(x); // 5 yazdirilacak

    }
    public static void ArithmeticOperators()
    {
        double x = 100.5;
        int y = 25;
        System.out.println("x + y = " + (x + y)); // toplama
        System.out.println("x - y = " + (x - y)); // cikarma
        System.out.println("x * y = " + (x * y)); // carpma
        System.out.println("x / y = " + (x / y)); // bolme
        System.out.println("x % y = " + (x % y)); // mod alma/kalan bulma
    }
    public static void RelationalOperators()
    {
        // Iliskisel (relational) operatorler iki degiskenin degerlerini karsilastirir.
        // ==, !=, >, < , >=, <= operatörleridir. Sonucunda boolean deger döndürürler.

        int x = 12;
        int y = 18;
        boolean sonuç;
        sonuç = (x > y);
        System.out.println("x > y = " + sonuç);
        sonuç = (x < y);
        System.out.println("x < y = " + sonuç);
        sonuç = (x <= y);
        System.out.println("x <= y = " + sonuç);
        sonuç = (x >= y);
        System.out.println("x >= y = " + sonuç);
        sonuç = (x == y);
        System.out.println("x == y = " + sonuç);
        sonuç = (x != y);
        System.out.println("x != y = " + sonuç);
    }
    public static void AssignmentOperators()
    {
        // Atama Operatorleri degiskenlere deger atamak icin kullanilan operatorlerdir.
        //  =, +=, -=, *=, /=, %= seklindedirler

        int x = 10;
        int y = 12;
        System.out.format("x= %d ve y = %d ise x +=y = %d %n", x, y, x += y);
        System.out.format("x= %d ve y = %d ise x -=y = %d %n", x, y, x -= y);
        System.out.format("x= %d ve y = %d ise x *=y = %d %n", x, y, x *= y);
        System.out.format("x= %d ve y = %d ise x /=y = %d %n", x, y, x /= y);
        System.out.format("x= %d ve y = %d ise x mod=y = %d %n", x, y, x %= y);
    }
    public static void LogicalOpretaors()
    {
        // Degiskenler arasi mantiksal islemleri yapabilmemizi saglar, Boolean deger dondurur.
        // Genellikle dongulerde ve if statementlarda kullanilir
        // 3 tanediler:
        // &&: VE
        // ||: VEYA
        //  !: DEGİL

        int x = 8;
        int y = 5;
        System.out.println("y == x - 3 && 7 > 6 sonucu: " + (y == x - 3 && 7 > 6));
        System.out.println("x >= y && x < y + 3 sonucu: " + (x >= y && x < y + 3));
        System.out.println("x != y || x - y == 5 sonucu: " + (x != y || x - y == 5));
        System.out.println("!(x == 4) && x-2 > y+5 sonucu: " + (!(x == 4) && x - 2 > y + 5));
    }
    public static void TernaryOperators()
    {
        // Uclu kosul operatorudur
        // 3 parametre alan tek operatordur
        // if-else yapisinin kisa hali olarak dusunebiliriz
        // ? ve : simgeleriyle kullanilir
        // ilk deger boolean bir ifade olmali, kosul sonucu gerceklesecek durumlar ise geriye deger dondurecek ifadeler olmalidir
        // kosul?durum1:durum2

        // asagida klasik bir if-else yapisi goruyoruz
        int num = 8;
        String msg = "";
        if(num > 10)
        {
            msg = "Number is greater than 10";
        }
        else
        {
            msg = "Number is less than or equal to 10";
        }
        // simdi bu kod dizisini ternary ile yeniden yazmaya calisalim
        final String msg1 = num > 10
                ? "Number is greater than 10"
                : "Number is less than or equal to 10";

    }
    public static void ShiftOperators()
    {

    }
    public static void BitwiseOperators()
    {

    }
}

