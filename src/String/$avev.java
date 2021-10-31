package String;

import org.w3c.dom.ls.LSOutput;

import java.math.MathContext;

public class $avev
{

    // class icine direk yazilabilenler sunlardir


    //String s1="10";
    //String s1=new String("10");

    static int sayi=10;
    static String s1=String.valueOf(sayi);

    static String s2=new String("10");
     String s3=new String("10");//String s3="10";

    //bu zamana kadar class icinde declaration+initilazing yaptik

    //bana s1 degerini yazdirir misin consolda
    public  static void main(String[] args)
    {
        System.out.println(s1);
        System.out.println(s2);

        $avev obje=new $avev();
        System.out.println(obje.s3);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(obje.s3.hashCode());
        System.out.println(s1.hashCode()==s2.hashCode() && s1.hashCode()==obje.s3.hashCode());

        System.out.println(s1==s2);
        System.out.println(s2== obje.s3);

        String isim1="tuba";
        String isim2="tuba";
        System.out.println(isim1==isim2);//true
        System.out.println(isim1.hashCode());//3571328
        System.out.println(isim2.hashCode());//3571328

        System.out.println("denemeeeee");
        Abc abcobj = new Abc();
        System.out.println(abcobj); // hashcode yazdirildi
        String s7 = new String();
        s7="jhhgj";
        System.out.println(s7); // icerik yazdirildi
    }

}
class Abc
{
    int a =5;

    @Override
    public String toString() {
        return "Abc{" +
                "a=" + a +
                '}';
    }
}
