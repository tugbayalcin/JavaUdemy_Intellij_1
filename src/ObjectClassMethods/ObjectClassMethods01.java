package ObjectClassMethods;

import java.util.Objects;
import java.util.jar.JarOutputStream;

public class ObjectClassMethods01
{
    public static void main(String[] args)
    {

        // ONEMLİ: https://javamk.wordpress.com/2014/06/01/tostring-metodu/
        // ONEMLİ: https://javauzmani.wordpress.com/2012/01/09/tostring-metodu/

        // import java.util.Objects;
        // javada Object classini kullanabilmek icin oncelikle yukaridaki gibi import etmeliyiz.
        // Javada bulunan tum classlar bu classtan turemistir.
        // Bu sınıf Files, Arrays gibi tamamen static metodlardan oluşan yardımcı bir sınıftır.
        // (static olmasi herkes tarafindan erisilebilmesine ve herkes icin ayni degerlere sahip olmasina imkan taniyor)
        // Bu sınıf en çok equals, toString ve hashCode metodlarını override etmek için kullanılır.
        // (en cok kullanilan methodlari bunlardir)
        // Turunu bilmedigimiz herhangi bir objeye basvurmak istersek Object Classindan faydalaniriz

        System.out.println(new Boruskom());
        // heapte alan olustu, toString() methodu override edildigi icin sout(obje) dedigimiz icin de icini gorebildik
        //bir daha bu alana erismek, okumak imkansizdir.Cunku bir degiskene reference numarasi konmadi.

        // burayi yazdirdigimizda java ilk once McDonalds classinin icinde toString Methodu var mi ona bakacak
        // eger yok ise bize "ObjectClassMethods.McDonalds@1cd072a9" seklinde bir cikti dondurecek
        // bunun sebebi henuz toString methodu bizim classimizda tanimlanmadi
        // dolayisi ile object classtan gelen default toString methodu bana packageAdi.classAdi@hascode yazdirdi

        // ancak eger ben classimda toString methodunu yazmis isem
        // bana "McDonalds{siparisSaytisi=0, satilanKahveSayisi=0, satilanBurgerSayisi=0}" seklinde bir cikti dondurecek
        // bunun sebebi java bana ben senin objeni aliyorum ve bir diziymis gibi degiskenlerini yazdiriyorum
        // ancak burada ciktimiz tamamen string turundedir
       Boruskom bObj1 = new Boruskom();System.out.println(bObj1);
       Boruskom bObj2 = new Boruskom();System.out.println(bObj2);

        System.out.print("bObj1 ile bObj2 objesi heapte ayni yeri mi temsil ediyor: ");
        System.out.println(bObj1==bObj2);//bu degiskenlerin 2 si de heap'teki ayni alani mi temsil ediyor diye test eder,
                                         // yani referancelari ayniş mi diye bakar - true ya da false dondurur program
        System.out.print("bObj1 ile bObj2 objesinin icerikleri ayni mi: ");
        System.out.println(bObj1.equals(bObj2));//Boruskom Class'ina ait 2 obje olusturdum ve iclerindeki degerler aynimi diye bakacagim
                                                //Boruskom Class'inin icinde override edilmis equals() methodu kullanildi- return type boolean

        System.out.println("Icerikleri equals olan bObj1 ile bObj2 objesinin hashcodelari ayni mi: " + bObj1.hashCode() + "  &&  " + bObj2.hashCode() );

       Boruskom bObj3 = new Boruskom(1);
       Boruskom bObj4 = new Boruskom(1,true);
       Boruskom bObj5 = new Boruskom(3,true);

        System.out.println("bObj1 objesi bObj2 objesine esit mi: " + bObj1.equals(bObj2));
        System.out.println();

        System.out.println(bObj1.equals(bObj3));
        System.out.println(bObj1.equals(bObj4));
        System.out.println("Girilen objeler equals mu: " + bObj1.equals(bObj5));
        System.out.println("Equals olmayan objelerin hashcodelari ayni mi: " + bObj1.hashCode() +"  &&  "+ bObj5.hashCode());



        Asel aselObj=new Asel();// Class icindeki degerler yas:6, name:Boru, vaccinated:true
        System.out.println(aselObj); // Asel classinin icinde toString methodu override edildigi icin, objemizin degerleri yazdirilacak

        //System.out.println(aselObj==bObj1);//2 farkli class'a ait degiskenlerin  heapteki ayni objeyi mi temsil ediyor
                                             //baska bir deyisle stackteki bu 2 degiskenin icinde ayni reference numaralari mi yaziyor diye
                                             //compiler bakmaz DIREK KIRMIZI YAKAR
                                             //Cunku 2 farkli class'in objesi ayni olamaz imkansiz

        //System.out.println(aselObj==(Asel)bObj1);//Casting yapmaya calissam COMPILER KIRMIZI YAKAR cunku;
                                                   //Asel ve Boruskom Classlari kardes degillerdir ya da baba-cocuk iliskisi yoktur
                                                   //hic casting yapma
        //Dikey iliskisi olan classlar birbirleri arasinda cast edilebilirken, yatay iliskili classlar edilemezler!!!

        //equals() - override edildi - ayni Class'in 2 farkli objesinin icinin ayni olup olmadigina bakar
        System.out.println(bObj1.equals(aselObj)); // FALSE
        System.out.println(bObj1.objelerEqualsMu(aselObj));//FALSE


        //objelerEqualsMu() - kendim Yazdim - degiskenleri yas-isim-vaccinated olan Boruskom ve Asel classlarinin
        // objelerinin icinin ayni olup olmadigina bakar.

        aselObj.setAge(1);//bObj1'nin yasi adi vaccine durumu ile aselObj'nin bilgileri artik aynidir, simdi bakalim equals'lar mi?
        System.out.println(bObj1.equals(aselObj));//FALSE
        System.out.println(bObj1.objelerEqualsMu(aselObj));//TRUE


        //Boruskom Classina ait obje ile Asel Class'ina ait objelerin vaccinated degiskenlerine atanmis degerleri karsilastirir
        System.out.println(bObj1.boruskom_ve_Asel_ClassinaAitObjelerin_VaccineDurumuEqualsMu(aselObj));//TRUE

       if (bObj1.getName().equals(bObj2.getName()))
       {
           System.out.println("Equal variables:");
           System.out.println(bObj1.getName().hashCode() +"\n" + bObj2.getName().hashCode());
       }

       if(!(bObj1.getName().equals(aselObj.getName())))
       {
           System.out.println("\n Un-equal variables:");
           System.out.println(bObj1.getName().hashCode() +"\n" + aselObj.getName().hashCode());
       }


        //simdilik bu kadari cok fazla - toString() equals() hashcode() anla gec
        //section8'de goruceksin bunlari


        //ODEV-> BUZAMANNA KADARKI TUM CASTING KONULARINI TEKRAR ET.
        //<editor-fold desc="TypeCasting">

        //TYPE CASTING'de AutoBoxing ve UnBoxing Konularini gorduk
        //AutoBoxing : cocuk olan classin kapsami her daim otomatik olarak babasinin kapsamina genisletilebilir
        short s=1;
        int i=s; //autoBoxing - short'ub kapsami int'in kapsaminin alt kumesir
        //oyuzden shortun malini integer'a casting yapmadan direk atayabiliriz

        //AutoBoxing- example2  ->cocuk olan class her daim babasina direk atanabilir, bu yuzden manuel olarak type casting yapilmaz
        byte b=5;
        Object o=b;

        Byte b2=6;
        Object o2=b2;

        String isim="tugba";
        Object o3=isim;

        //unBoxing
        int i2=2;//123456789 de olabilir di
        short s2=(short)i2;//unBoxing - i2 degiskenindeki 2 degeri int'tir, biz onu short olan 2 degerine casting yaptik ve short'a atadik

        //UnBoxing-Example2
        Object o4="asel";//direk string -> object'e donustu, string'in her seyi Objectin bi alt kumesidir cunku

        String isim2=(String)o4;// object class'inin icindeki degerin string oldugunu compiler bilir- oyuzden (String) koymasan da olur dedi
                                // ama boylesi daha dogru
                                // burada  (String) yazmak zorunda degiliz cunku "asel" degeri sadece ve sadece String'e donusturulur
                                // istisnai durum
                                // Ama Ayni durum "1234" degeri icin gecerli degildir. cunku birden fazla  farkli veriye casting olabilir


        Object o5="12";

        byte b3=Byte.parseByte((String)o5);// parseByte Methodu parametre olarak Object Degil String deger kabul eder
                                             //Object olan 1234 degerini String olan 1234 degerine castring yaptik
        short s3=Short.parseShort((String)o5);
        int i3=Integer.parseInt((String)o5);
        long l= Long.parseLong((String)o5);
        String isim3=(String)o5;//burada yukaridaki gibi sari yakmadi - sebebi yukarda aciklandi


        //simdi equals() methodumuza gelelim - yukardaki kodu sen nasil istiyorsan oraya koy
        //</editor-fold>

    }

}

//kisa yolla getter setter da olusur sen olustturusun
//kisa yoldan hizlica constructor olusturma
//onumuze gelen listeden istediklerimizi secmek icin -> ctrl+click
//hepsini secmek icin ctrl+a
//hicbirini secmezsen default constructor olusur


//kisa yolla equals(), toString(), hashCode() methodlarini da olusturma,
// Object Class tum classlarin babasidir, tum cocuklar,classlar onun mallarini,methodlarini,degiskenlerini kullanabilir degistirebilir
class Boruskom
{
    private int age=1;
    private final String name = "Börü";
    private boolean vaccinated = true;

    public Boruskom (){}
    public Boruskom(int age)
    {
        this.age = age;
    }

    public Boruskom(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public Boruskom(int age, boolean vaccinated) {
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Boruskom{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", vaccinated=" + vaccinated +
                '}';
    }

    /**
     *
     * @param o
     * @return
     */
    @Override

    // Bir classin objeleri arasinda kiyaslama yapar
    // Farkli classlar arasinda yapmaz
    // karsilastiracagin sey iki object olmak zorunda
    // ve de bu iki object ayni classta bulunmak zorunda

    // == : reference esitligi
    // equals() : deger esitliği
    public boolean equals(Object o) {//Boruskom o -> deseydik method icindeki casting gerek kalmazdi.
        if (this == o) return true; // burada this ile ifade edilen sey Boruskom Classinin objesi,
                                    // esit mi diye bakilan sey ise bu objelerin referans numarasi
        if (o == null || getClass() != o.getClass()) return false; // method icinde parametre olarak verilen obje bos mu, null mi
                                                                   //
        Boruskom boruskom = (Boruskom) o; // Type Casting (Object Class > Boruskom Classi) buyuk kume kucuk kumeye casting edilir
                                          // Object classindan gelen o, Boruskom classina cast edildi ve boruskom degiskenine atandi
        // Gonderdigim o objesi Object Classinin uyesi ama bakalim daha kucuk class olan Boruskom classinin da uyesi mi
        return age == boruskom.age && vaccinated == boruskom.vaccinated && Objects.equals(name, boruskom.name);
        //return age == boruskom.age && vaccinated == boruskom.vaccinated && name == boruskom.name;
        // bu satirda (this.age eşit mi boruskom.age) VE (this.vaccinated eşit mi boruskom.vaccinated) VE
    }


    //Kendi eleimle yazdigim(yazabilirim sonucta kodlama biliyorum) equals() methodu - hic bir yerde yok - override yapmiyorum
    public boolean objelerEqualsMu(Object kiyasladigimObje)
    {
        if (this == kiyasladigimObje)
            return true;

        if (kiyasladigimObje == null /*|| getClass() != kiyasladigimObje.getClass()*/ )
            return false;
        // method icinde parametre olarak verilen obje bos mu, null mi
        //VEYA
        //BU 2 objenin ait oldugu Class Adi ayni mi - bu kriteri cikardim

        //Boruskom boruskom = (Boruskom) kiyasladigimObje;// bu satiri yazmaz isem, equals methoduna parametre olarak
                                                        //yollayacagim herhanngi bir class'a ait obje Boruskom Class'inin bir
                                                        //objesine donustur/casting yap demiyoruz
        //AMA BUNU YAPMAK ISEK, Farkli bir Class'in icindeki degiskenler ayni olsa bile(age,vaccinated vb.)
        //program bunu anlayamaz
        //kiyaslayacagim objenin icinde hangi degiskenler olabilir ben bilmek istiyorum, yoksa kiyas yapip yapamayacagimi bilemem diyor

        Asel aselObj=(Asel) kiyasladigimObje;

        //YANI -> Sag Click+generate+equals methodu bize hazir ici degistirilmis method verse de
                  // biz yeri geldigin de bunun da icini degitirmek zorunda kalabilriz

        //return age == aselObj.getAge() && name == aselObj.getName() && vaccinated == aselObj.isVaccinated();
        //return this.age == aselObj.getAge() && this.name == aselObj.getName() && this.vaccinated == aselObj.isVaccinated();
        return this.age == aselObj.getAge() && Objects.equals(name, aselObj.getName()) && this.vaccinated == aselObj.isVaccinated();

        //YUIKARIDA-> 2 Farkli objenin icindeki degiskenlerin degerleri karsilastriliyor, 3'u de ayni gorevi ustleniyor.Mesela;
        //return true && true && true ; -> ise true doner   && -> ve demektir  || -> veya demktir
        //return false && false && true; -> ise false doner



    }

    public boolean boruskom_ve_Asel_ClassinaAitObjelerin_VaccineDurumuEqualsMu(Object kiyasladigimObje)
    {
        if (this == kiyasladigimObje)
            return true;

        if (kiyasladigimObje == null /*|| getClass() != kiyasladigimObje.getClass()*/ )
            return false;

        Asel aselObj=(Asel) kiyasladigimObje;// Asel Object Clas'inin cocucgu old. icin type casting olur
        return this.vaccinated== aselObj.isVaccinated();
    }
    /* burada

    {
     ClassName obj1 = new ClassName();
     ClassName obj2 = new ClassName();
     obj1.equals(obj2);
    }

     kod blogunu ornek olarak alirsak 3. satirda this keywordü equals methodunu cagiran obj1 nesnesini temsil eder.
     obj2 nesnesini ise o parametresi temsil eder.

     bu durum this in 3. kullanimidir.
     yani THİS--> Onu cagirip kullanan objeyi temsil eder

       */

    /*
        Herhangi bir objenin default degeri null dir.
        equals methodunun 2. satiri bize diyor ki;
        eger bana verilen obje declaration edilmis ancak initialize edilmemisse yani default olarak null almis ise
        veya karsilastirilan objelerin getter methodlari(okuyucu) methodlari esit degilse false dondur
        getter method geriye degiskenin degerini dondurdugunden burada aslında degiskenler karsilastirilmis olur
    */

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(age, name, vaccinated);
    }
}


class Asel
{
    private int age=6;
    private final String name = "Börü";
    private boolean vaccinated = true;

    public Asel() {//default constructor'imla nesne olustursam elimdeki 6,Boru,true degerleriyle obje olusur
    }

    public Asel(int age, boolean vaccinated) {
        this.age = age;
        this.vaccinated = vaccinated;
    }

    /*
    //name final oldugu icin, constructor ile ya da Setter ile ona deger atanamaz
    public Asel(int age,String name, boolean vaccinated) {
        this.age = age;
        this.name=name;
        this.vaccinated = vaccinated;
    }

     */

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    //setName() yok cunku name is final.
    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "Asel{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", vaccinated=" + vaccinated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asel asel = (Asel) o;
        return age == asel.age && vaccinated == asel.vaccinated && Objects.equals(name, asel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, vaccinated);
    }
}




