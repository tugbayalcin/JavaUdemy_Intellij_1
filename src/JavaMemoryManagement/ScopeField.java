package JavaMemoryManagement;

import java.util.Date;

public class ScopeField
{
    int a = 5;
    String s="tugba";
    Date dateObjesi=new Date();

    public static void main(String[] args)
    {
        int a = 10;
        String s="tugba";
        Date dateObjesi=new Date();
        System.out.println(a);
        System.out.println(new ScopeField().a);
    }
    public void method01()
    {
        int a = 10;
        String s="tugba";
        Date dateObjesi=new Date();
    }

}
