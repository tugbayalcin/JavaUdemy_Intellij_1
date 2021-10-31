package Section2_Variables;
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class StringBuilder_StringBuffer
{
    public static void main(String[] args)
    {
        // asagidaki kaynak string ile string buffer/builder classlari arasindaki farki daha net anlamamiza yardimci olacaktir
        // https://umiitkose.com/2017/12/string-vs-stringbuilder/

        // simdi StringBuider Class'indaki onemli birkac methoda bakalim
        StringBuilderAppend();
        StringBuilderInsert();
        StringBuilderReplace();
        StringBuilderDelete();
        StringBuilderReverse();
        StringBuilderCapacity();
        StringBuildingEnsureCapacity();

    }
    public static void StringBuilderAppend()
    {
        // Bu method verilen argumani string ile birlestirir. + operatoru veya concat methodu gibi dusunebilirsin
        StringBuilder sb=new StringBuilder("Hello ");
        sb.append("Java");//now original string is changed
        // StringBuilder kutunun icinde degisiklik yaparak calistigi icin artik eski sb degiskenimiz kayboldu
        System.out.println(sb);//prints Hello Java
    }
    public static void StringBuilderInsert()
    {
        // Bu method parametre olarak bir dize ve int deger alir. Bu integer index olarak kullanilir
        // Verilen dizeyi verilen indexte elimizdeki dizeye ekler

        StringBuilder sb=new StringBuilder("Hello ");
        sb.insert(1,"Java");//now original string is changed
        System.out.println(sb);//prints HJavaello
    }
    public static void StringBuilderReplace()
    {
        // Bu method verilen baslangic ve bitis indeksleri arasindaki dizeyi degistirir
        StringBuilder sb=new StringBuilder("Hello");
        sb.replace(1,3,"Java");
        System.out.println(sb);//prints HJavalo
    }
    public static void StringBuilderDelete()
    {
        // Bu method verilen baslangic ve bitis indekleris arasindaki dize parcasini siler
        // Burada dikkat edilmesi gereken sey girilen ilk indeks silme islemine dahil ancak son indeks dahil degildir
        StringBuilder sb=new StringBuilder("Hello");
        sb.delete(1,3);
        System.out.println(sb);//prints Hlo
    }
    public static void StringBuilderReverse()
    {
        // Bu method gecerli dizeyi tersine cevirir
        StringBuilder sb=new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);//prints olleH
    }
    public static void StringBuilderCapacity()
    {
        // Bu method Builder'in mevcut kapasitesini dondurur.
        // Builder in varsayilan kapasitesi 16'dir.
        // Karakter sayisi mevcut kapasitenin ustune cikarsa yeni kapasite su sekilde hesaplanir: (eski kapasite * 2)+2
        // Ornegin eski kapasitemiz 16 ise (16*2)+2=34 olacaktir

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());//default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("Java is my favourite language");
        System.out.println(sb.capacity());//now (16*2)+2=34
    }
    public static void StringBuildingEnsureCapacity()
    {
        // Bu methıd verilen kapasitenin mevcut kapasiteye gore minimum olmasini saglar.
        // Verilen kapasite mevcut kapasiteden buyuk ise kapasiteyi arttirir [ (eski kapasite * 2)+2 kuralina gore yapar ]

        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());//default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("Java is my favourite language");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb.ensureCapacity(10);//now no change
        System.out.println(sb.capacity());//now 34
        sb.ensureCapacity(50);//now (34*2)+2
        System.out.println(sb.capacity());//now 70
    }
}
