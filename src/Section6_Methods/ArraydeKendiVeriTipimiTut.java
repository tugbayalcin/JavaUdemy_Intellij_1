package Section6_Methods;
import java.util.Arrays;


//KONU -> ARRAYIN ICINDE SADECE 8 TANE ILKE VERI DEGIL; AYNI ZAMANDA REFERENCE VERI TIPI OLAN HERHANGI BIR VERI DE SAKLANABILIR
//NOTE: SECTION7'de bu konunun her seyinini gorcen zaten hadi bay kolay gelsin you too
public class ArraydeKendiVeriTipimiTut
{
    public static void main(String[] args) {

        int[] intDegerlerArrayi=new int[10];//heapteki arrayin icinde 10 tane ilkel int veri tipi degeri tutulabilir


        //heap bellektee 3 tane ogrenci objesi olusturulim - her birinin icinde de 3 tane veri var
        Ogrenci emre=new Ogrenci(24,"emre",90);
        Ogrenci tuba=new Ogrenci(26,"tuba",100.0d);
        Ogrenci emine=new Ogrenci(24,"emre",95.0);

        //peki 100 tane ogrencim olursa 100 tane Ogrenci objesi tek basina heapte takilsin mi, duzensiz olur
        //hepsini alalimogrenci veri tipi depolayabilen bir arraya atalim

        Ogrenci[] ogrencilerArrayi=new Ogrenci[5];//heapteki arrayin icinde 5 tane reference ogrenci veri tipi tutulabilir.
        ogrencilerArrayi[0]=emre;//ogrenciobjesi tutabilen arrayin ilk kutusuna emre ogrenci objesini koy
        ogrencilerArrayi[1]=tuba;
        ogrencilerArrayi[2]=emine;

        System.out.println(Arrays.toString(ogrencilerArrayi));//arrayin tum kutularinin icindeki degerleri yazdirdi
        //her kutu obje tutar icinde obje varsa objenin reference numarasini yazdirdik, yoksa null yazdirdi

        for(int i=0; i< ogrencilerArrayi.length;i++)
        //for loop ile arrayin icindeki 5 kutuyu da yazadirialim - yukardakinin aynisini yapar
        {
            System.out.println("Ogrenciler Arrayinin "+ i+". indexi ->"+ogrencilerArrayi[i]);
        }

    }

}

class Ogrenci
{
    //ogreci objemin icinde 3 tane veri var
    int yas;//suan 0
    String isim;//null
    double mathNotu;//0.0

    public Ogrenci(int a,String b, double c)//new den sonra gelen Ogrenci() ifadesi budur - Ogrenci(24,"emre",90);
    {
        //kullanicidan alacagim verileri tek tek ogrenci objemin icindeki ktulara verilere aticam
        this.yas=a;
        this.isim=b;
        this.mathNotu=c;
    }

    @Override
    public String toString()
    { // bundan sonra ogrenci objesinin= nerede yazdirmak istersen iste, obje reference numarasi degil objenin icin yazilacak
        return "Ogrenci{" +
                "yas=" + yas +
                ", isim='" + isim + '\'' +
                ", mathNotu=" + mathNotu +
                '}';
    }
}
