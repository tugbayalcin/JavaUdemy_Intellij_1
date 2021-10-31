package JavaMemoryManagement;
import java.util.Date;

public class Memory
{
    public static void main(String[] args)
    {
        // LUTFEN ZİYARET EDİNİZ: https://fatihbozik.github.io/heap-stack //
    }
}
class MyClass
    // bu class 2 ilkel degisken, 1 string dgisken, 1 obje ve 5 method dan olusyor
    // methodlar icerisinde local variable lar var
    // ve ayrica methıdlarin icinde class'in direk property'si olan instance variable lar var
{

    int i=10;  // i ve d adinda 2 ilkel degisken stackte olustu
    double d=0d;
    String s="Str"; // s adindaki degisken ise stackte reference tutar ve degerin kendisi heap icindeki String Pool'da tutulur
    Date dateObjesi=new Date();

    public static void main(String[] args)
    {

        int i=10;
        double d=0d;
        String s="Str";
        Date dateObjesi;
        dateObjesi=new Date();


    }

    public static void method1()
    {
        int i=10;
        double d=0d;
        String s="Str";
        Date dateObjesi;
        dateObjesi=new Date();

    }

    public static void method2()
    {
        int i=10;
        double d=0d;
        String s="Str";
        Date dateObjesi;
        dateObjesi=new Date();
    }

    public static void method3()
    {
        int i=10;
        double d=0d;
        String s="Str";
        Date dateObjesi;
        dateObjesi=new Date();
    }

    public static void method4()
    {
        int i=10;
        double d=0d;
        String s="Str";
        Date dateObjesi;
        dateObjesi=new Date();
    }


	/*
,	soru -> ilkel instance variablelar(i,d) stackte nerde tutulur, yari ilkel yari reference tipli olan olan, heapin icinde string poolda tutulan s instance variable + reference tipli dateObjesi nasil depolanir
	soru2-> ayni sekilde methodlarin icindeki ilkel veri tipleri(byte,short,int,long,char,boolean....) +
			yari referenceyari ilkel olan string +
			reference tipli veriler(new Math(), new Integer, new Date(), new Student() gibi)
			stackte,heapte,string poolda nasil depolanir.
	note -> SEN ZATEN STACK HEAP STRING POOL MANTIGINI BILIYORSUN,  CLASS'larin METHOD'larin bu bellekleri nasil kullanidigini arastir,oku BANA ANLATACAKSIN ONAY VERIRSEM SECTION8'e gecebilirsin.
	*/



}
