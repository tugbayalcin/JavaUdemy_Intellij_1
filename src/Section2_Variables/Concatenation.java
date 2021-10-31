package Section2_Variables;

public class Concatenation
{
    public static void main(String[] args)
    {
        concatenationPractice();
        concatenation();
    }

    private static void concatenationPractice()
    {


        //String Class'inin icindeki valueOf() methodlarini (overloading) casting icin kullanabiliriz
        //ilkel verileri + reference verilerini stringe donusturme -> String.valueOf();


        //WRAPPER CLASSlarinin icindeki parseMethodlarini kullanarak casting yapabilriz
        //ilkel verileri INTEGER'a donusturme -> Integer.parseInt();
        //ilkel verileri Double'a donusturme -> Double.parseDouble();
        //ilkel verileri INTEGER'a donusturme -> Integer.parseInt();


        // CONCATENATİON: Birlestirme Operatorleri

        // concat methodu


        String name="tuba";
        String sname="yalcin";

        String fullname=name.concat(sname); // 2 ifadeyi birlestirdik
        String a= name.concat(sname).concat("123"); // 2 den fazla ifadeyi birlestirdik 1.yol
        String fullname2=name.concat(sname.concat(name)); // 2 den fazla ifadeyi birlestirdik 2. yol

        // Burada name.concat(sname)  de artik bir stringtir
        // string.string gibi oluyor
        // bunu yapabilmemizin sebebi string in her daim obje olması (heapte olmasi)
        // int.int yapamayiz
        // yapabilmek icin heap e atip objeye donusturmeliyiz -->Boxing
        // new Integer(1)+new Integer(2)+new Intgwer(3) // ancak burasi cöp, cunku etiketi yok, kullan at
        /*
        Integer obje1=new Integer(1);
        …
        ….
        Obje1+2+3
        */
        // yukaridaki blok integer i obje yapti ve cop degil, etiketi var


    }

    public static void concatenation()
    {
        //soldan saga calisir, herhangi bir string gorene kadar operator tanimli oldugu gorevini yapar
        // ancak stringle karsilasirsa elindeki degeri string olarak yazdirmak zorundadir

        System.out.println("3"+4);//34
        System.out.println("3"+4+5);//345
        System.out.println("3"+(4+5));//39
        System.out.println(3+4+"5");//75
        System.out.println(3+4+"5"+6);//756
        System.out.println(3*4+"5"+6/2);//1253
        System.out.println("3*4"+5+6);//3*456

        String sk  = String.valueOf(54);
        System.out.println(sk + 123);//54123 cunku sk degiskeni bir stringtir
        System.out.println("emre"+1+2+3);//emre123
        System.out.println(1+2+3+"emre"+4);//6emre4

        // Bu öngörülemeyen çıktı, operatörlerin aynı önceliğe sahip olması koşuluyla,
        // derleyicinin verilen ifadeyi soldan sağa doğru değerlendirmesi gerçeğinden kaynaklanmaktadır.


        System.out.println(2 + 0 + 1 + 6 + "GeeksforGeeks");
        // 2,0,1 ve 6'nın 9'a eşit olan toplamını yazdırır
        // Cikti: 9GeeksforGeeks

        System.out.println("GeeksforGeeks" + 2 + 0 + 1 + 6);
        // Başlangıçta string ile karşılaştığı için 2016 olan 2,0,1 ve 6'nın birleşimini yazdırır. Temel olarak,
        // Dizeler, tamsayılardan daha yüksek bir döküm önceliğine sahip oldukları için önceliklidir.
        // Cikti: GeeksforGeeks2016


        System.out.println(2 + 0 + 1 + 5 + "GeeksforGeeks" + 2 + 0 + 1 + 6);
        //Yukarıda verilen örneklere göre 2,0,1 ve 6'nın birleşimini yaparken 2,0,1 ve 5'in eklenmesini yazdırır.
        // Cikti: 8GeeksforGeeks2016


        System.out.println(2 + 0 + 1 + 5 + "GeeksforGeeks" + (2 + 0 + 1 + 6));
        // ( )'nin + üzerindeki önceliğine bağlı olarak hem 2,0,1 ve 5 hem de 2,0,1 ve 6'nın toplamını yazdırır.
        // Bu nedenle ( )'deki ifade önce hesaplanır ve daha sonra ileri değerlendirme yapılır.
        // Cikti: 8GeeksforGeeks9

    }
}
