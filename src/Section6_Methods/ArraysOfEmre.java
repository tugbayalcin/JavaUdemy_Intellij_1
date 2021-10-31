package Section6_Methods;
import java.util.Arrays;

public class ArraysOfEmre
{
    public static void main(String[] args)
    {
        defaultArrayValues(); // varsayilan dizi degerleri
        readressingAnObject(); //cagrildi,kullanildi

        //primitive verilerde pass-by-value (degerin kopyasiyla oyna)
        int num1=10, num2=20;
        num1=num2;//num2 kutusunun icindeki 20 degerinin kopyasini al 3. bir kutuya koy
        //num1 kelimesi de 3. kutuyu temsil etsin ve 3. kutunun icine 20 degeri konsun
        // 1. kutunun icinde 10 degeri var ama onu temsil eden hic bir degisken yok - yani cop oldu

        //pass-by-reference (degerin direk kendisiyle oyna)
        int[] sayilar1={1,2,3}, sayilar2={4,5,6};
        System.out.println(Arrays.toString(sayilar1)); // [1,2,3]
        sayilar1[0]=100;
        System.out.println(Arrays.toString(sayilar1)); // [100,2,3]

        System.out.println(Arrays.toString(sayilar2)); // [4,5,6]
        sayilar2[0]=200;
        System.out.println(Arrays.toString(sayilar2)); // [200,5,6]

        sayilar1=sayilar2;//stackteki sayilar1 kutusunun icindeki reference numarasi heap bellekte icinde 1 2 3 yazan integer arrayi temsil ederdi.
                        //ama artik sayilar2 kutusunun icindeki reference numrarasi sayilar1 kutusunun icndeki reference numarasiyla ayni olsun
                        //yani stackte yeni 3. bir kutu olustu ve bu kutunun icindeki reference numarasi 2. kutu ile ayni
                        //ve stacteki 3.kutuyu sayilar1 kelimesi temsil etsin
                        //stackteki 1.kutu etikestsiz kaldi(icinde heapteki 1. arrayin reference numarasi var)
        //bundan sonra artik olay su;
        //stackte sayilar1 ve sayilar2 diye 2 tane kutu var
        //2 sinin de icinde ayni reference numarasi var, 2 si de heapteki 2. arraye, yani icinde 456 olan arraya bizi goturur
        //heapteki 1. array cop oldu ona ulasilmaz, yani yolu olmayan koy oldu , cop oldu
        //stackteki 1.kutu da cop oldu cunku etiketsiz kaldi

        //artik stackteki bu 2 degisken heapteki 2. arrayin kaderilye oynar
        System.out.println(Arrays.toString(sayilar1)); // [200,5,6]
        System.out.println(Arrays.toString(sayilar2)); // [200,5,6]

        sayilar1[1]=1000;
        System.out.println(Arrays.toString(sayilar1)); // [200,1000,6]
        System.out.println(Arrays.toString(sayilar2)); // [200,1000,6]

        sayilar2[2]=3000;
        System.out.println(Arrays.toString(sayilar1)); // [200,1000,3000]
        System.out.println(Arrays.toString(sayilar2)); // [200,1000,3000]



    }

    public static void defaultArrayValues()
    {
        //DEFAULT ARRAY VALUES
        int a1[] = new int[2]; //listenin içi boş
        a1=null;//stack'teki a1 kutusu beni heapteki hic bir integer arraya goturmesin, yani icinde herhangi bir reference numarasi olmasin
        System.out.println(a1);//null - burdaki null degeri stackteki a1 kutusunun icinden geldi
        System.out.println(Arrays.toString(a1));//null - toString() methodundan geliyor

        a1=new int[3]; //yeniden  aynı identifier ile array olusturdum  [0, 0, 0]
        System.out.println("stackteki a1 kutusunun icinde yer alan reference numarasi=" +a1);
        System.out.println("Heapte yeri olan ama default integer degerleri olan a1:" + Arrays.toString(a1));



        String[] a2 = new String[2]; //listenin içi boş
        System.out.println(a2);//stackteki a2 kutusunun icindeki reference numarasini yazar
        System.out.println(Arrays.toString(a2));//[null, null]


        char[] a3 = new char[2]; //listenin içi boş
        double[] a4 = new double[2]; //listenin içi boş
        float[] a5 = new float[2]; //listenin içi boş
        boolean[] a6 = new boolean[2]; //listenin içi boş
        long[] a7 = new long[2]; //listenin içi boş
        short[] a8 = new short[2]; //listenin içi boş
        var a9 =new String [2]; //listenin içi boş ??

        // var reserved keyword'u tum veri tiplerini temsil eder.
        var var1=1;
        var var2="abc";


        for (int i = 0; i < a2.length; i++)
        {
            System.out.println( a1[i]+"- " + a2[i] + "- " + a3[i]
                    + " -" + a4[i] + "- " + a5[i] + "- " + a6[i]
                    + "- " + a7[i] + " -" + a8[i]+"- "+a9[i]);
            //0 null-  -0.0 0.0 false 0 0 null
        }

        System.out.println(Arrays.toString(a1));//[0,0,0]
        //FOREACH ILE ARRAYE ELEMAN ATADIK
        int sayi=0;
        for(int i:a1)//i a1'in icindeki kutularin da icndeki degerleri temsil eder -FOREACH LOOP
        {
            //[0,0,0]
            //pass-by-value
            //arrayin icinedeki 1. kutuya git, kutunun icindeki 0 degerinii kopyala ve i ye ata
            //kutunun icindeki degerimn kendisiyle direk oynamiyorsun, kopyasiyla oynuyorsun
            sayi+=10;// sayi=sayi+10;
            i=sayi;
            System.out.println(i);

            //System.out.println(i=sayi);

            //[10,0,0] - ilk loop
            //[10,20,0] - 2. loop
            //[10,20,30] - 3.loop 3.kuya gitti
        }
        System.out.println(Arrays.toString(a1));//[0,0,0]
        int sayi11=0;
        for(int i=0;i<a1.length;i++)
        {
            //pass-by-reference
            sayi11+=10;
            a1[i]=sayi11;//arrayin icindeki 1. kutuya git degerini degistir
            System.out.println("a1 arrayininin "+i+". indexine deger atandi ->" +a1[i]);
        }
        System.out.println(Arrays.toString(a1));//[10,20,30]

        //WHILE ILE ilk elemani yazdirma 2. elemandan sonrasini da yazdirma
        int sayi2=0;
        while(sayi2<a1.length)//a1.length 3 tur
        {

            if(sayi2==0)
            {
                sayi2++;
                continue;//donguden cikma break gibi DEGIL - LOOP'A DEVAM ET- AMA ILK DONGUYU ATLA
            }

            System.out.println("a1 arrayinin "+sayi2+". indexi-> "+a1[sayi2]);
            sayi2++;
            if(sayi2==2)
                break;//while loop'tan cik
        }



    }

    public  static void readressingAnObject()//olusturuldu
    {

        //methodlarin icindeki varible-segiskenlere yerel-local variable denir
        //ve local variable'lar kesinlikle ve kesinlikle initialized olmak zorundalar
        //yani = bir sey olmasi gerek

        int a=0;//stackte a adinda kutu olusrtu, int degeri tutma kabiliyeti var ama ici bos
        System.out.println(a);

        //readdressing an object
        int[] sew0=null;//stack'te sew0 adinda kutu var, bu kutu int array reference numarasi tutma kabiliyeti var
        System.out.println(sew0);

        int[] sew={1,2,3};
        System.out.println(sew);//stackte sew kutusunun icinde reference numarasi var
        System.out.println(Arrays.toString(sew));//[1, 2, 3]
        //sew isimli stacte bir kutu olustu, icinde reference numarasi var
        //bu reference numarasini takip edersek bizi heap bellekteki icinde 3tane kutu olan arraya goturur

        int[] sew2=sew;//stackte sew2 isimli bir kutu olustu, icine int arrayinin reference numarsinin tutabilir.
        //heapte yani bir array olusutur bunu da sew2'ye atamak yerine
        //int[] sew2=new int[]{1,2,3}; ya da int[] sew2={1,2,3}; yerine
        //heapte hazir bulunan icinde 3 tane int tutabilen bir array var, bu arrayi stackteki sew temsil ediyor ama
        //sew2 de temsil etsin. yani stackteki 2 kutunun icinde de heapteki 3 kutulu arrayin reference numarasi olsun
        System.out.println(Arrays.toString(sew2));//[1, 2, 3]


        sew2=new int[5];//sonrasinda istersem derimki, stackteki sew2 kutusu artik yeni bir arrayi temsil etsin, ='den sonra 5 kutulu array olusturdum
        System.out.println(Arrays.toString(sew2));//[0, 0, 0, 0, 0]


    }



}
