package Section1_GeneralJavaInfo;//1.SEVIYE


//Package>>>Class=interface>>>degisken=method=class=interface>

//PACKAGE LEVEL

interface abc{}
class abb{}

//public class dosya adiyla ayni olmak zorunda, otomatik olusur
public class PackageClassMethodRelationships//dis class -2 SEVIYE
{
    //class'in icinde instance variable - class'in ozellikleri - 3.SEVIYE
    String name="tuba";//bir degisken-variable classin malidir - attribute,property,instance variable
    public int age=25;
    private String schoolName="ist uni.";


    //class'in icinde METHODLAR olabilir -3. SEVIYE
    public static void method1()// turuncular - reserved keyword of java language
    {
        int a=10; // methodun malidir, methodun disindan kullanilamaz - local variable  - 4.LEVEL
    }

        int a =6; // diyebilirim cunku ust satırdaki a yalnizca bulundugu method ıcınde yasar. method dısından dogrudsan cagırılamaz, ancak methodla birlikte kullanilabilir
    public void method2()
    {

    }

    private void method3()
    {

    }


    //class'in icinde INNER CLASSLAR OLABILIR - 4. seviyede
     class IcClass // inner class - member class- bu DisClassin malidir, cunku icindedir
    {
        void icClassMethodu()// 5. level
        {//IcClClass'in mali

            class icClassinIcindekiMethodunLocalClassi//ustteki methodun mali - 6. level
            {

            }

        }
    }

    final static class StaticIcClass// static innner classtic
    {
        // normal(dis) classlar yalnizca public ve default olabilirken, inner classlar abstract veya final olabilir,
        // yalnizca hem abstract hem final olamaz
    }


    //classin icinde INNER INTERFACE olabilir
    interface Interface1{

    }


}//DisClass'in sonu





//PACKAGE LEVEL -level1
//buraya varible yazamazsin
//buraya method yazamazsin

class DisClass2//level2
{


}
