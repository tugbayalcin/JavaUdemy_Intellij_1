package Section6_Methods;

public class VarargsKullanimi
{
    public static void main(String[] args)
    {
        Varargs();
    }
    //<editor-fold defaultstate="collapsed" desc="Varargs(method)">

    public static void Varargs()
    {
        /*bir methodumuz var
        public static void abc(int a ,int b){}
        public static void abc(int a ,int b, int c ){}//overloading
        public static void abc(int a ,int b, int c, int d ){}//overloading
        eger hep aynı primitive data type i aticaksak hep overloadingle
        uğrasmayalım ne kadar deger atıcaksak varargs yöntemi ile atayalım
        */

        Varargs(1,2,3);
        Varargs(1,2,3,4);

        printName("Ali");
        printName("Ali", "Kahraman");
        printName("Ali", "Can", "Kahraman");

        valueChar("Character: ",'a');
        valueChar("Character: ",'a', 'b');
        return;


    }

    public static void Varargs(int ...a)//
    {

        System.out.println(a[0]);// 1 parametrelerin indexleri olur
        System.out.println(a[1]);// 2 parametrelerin indexleri olur
        System.out.println(a[2]);// 3 parametrelerin indexleri olur
        System.out.println("Number of arguments: " + a.length);

        // using for each loop to display contents of a
        for (int i: a)
            System.out.print(i + " ");
        System.out.println();


    }

    public static void printName(String... n) {
        for(String w: n) {
            System.out.print(w + " ");
        }
        System.out.println("");
    }

    public static void valueChar(String s, int g, char... c) {
        for(char w: c) {
            System.out.print(s);
            System.out.print(w);
        }
        System.out.println("");
    }

    public static void valueChar2(String s,int i ,char... c) {
        //3noktalı varargs özelliği sadece bir tane olabilir ve en sonda olmak zorunda
    }

    /*
     public static void method(String... gfg, int... q)
        {
            Compile time error as there are two varargs
            bir methodun parametrelerinden sadece birinde varargs ozelligi olabilir
        }
        */




    // </editor-fold>

    }

