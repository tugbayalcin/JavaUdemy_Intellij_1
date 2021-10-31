package Section4_ControlStructures;
import java.util.Scanner;
public class Ternary
{
    public static void main(String[] args)
    {
        ternary();
    }
    //<editor-fold defaultstate="collapsed" desc=" ternary ">

    static public void ternary ()
    {
        System.out.println("W3Adda - Java Ternary Operator.");
        String result =new String(  (10 > 15) ? "Greater" : "Smaller "     );
        String result2="emre".equals("emre") ? "same" : "different" ;
        System.out.println("result:"+result + "  result2:"+result2); //result:Smaller   result2:same

        System.out.println( 5 >= 0 ? ( 5 >=10 ? "positive" : "digit") : "negative number "); //if ( if  else) else - digit

        int num=-5;
        String result3 =new String(num>=0 ? ( num >=10 ? "positive number" : "digit") : num==0 ? "zero" :  num<0 ? "negative" : "positive");
        String ternary= String.valueOf(num > 0 ? num +": is +" : num < 0 ? num + ": is - " : num==0 ? num  : "num is not a number"  );
        //1 tane bile int cıkabilebildiği için String.valueOf() yanar
        System.out.println(ternary);
        //if ( if  else)   else [if else (if else ) ]
        System.out.println("result3:"+result3);


        Scanner scan= new Scanner(System.in);
        System.out.println("write down a word to test if its first letter is upper or lower");
        char ch=scan.next().charAt(0);
        String result4= ch<='z' && ch>='a' || ch<='Z' && ch>='A' ? ch<=122 && ch>=97 ? "LOWERCASE" : "UPPERCASE"  : ch <= 57 && ch >=48 ? "ch is an digit" : "dont enter special character";
        //a:97 z:122 A:65 Z:90      IF ilk sembol harf ise(IF küçük harf ise lowercase değilse ELSE uppercase) ELSE not letter

        System.out.println(result4);


    }

    // </editor-fold>
}
