package GenelTekrar_Section1to9;

public class Section_1
{
    public static void main(String[] args)
    {
        int deg1 = 1;
        /*
        PRIMITIVE DEGİSKEN DECLARE VE INITIALIZE EDİLDİ
        NEREDE: STACKTE
      */
        SampleTest sample = new SampleTest(1,2);
        /*
            REFERENCE TIPLI DEGİSKEN DECLARE VE INITIALIZE EDİLDİ -->OBJE
            NEREDE: DECLARE ISLEMI STACKTE, INITIALIZE ISLEMI HEAPTE
         */

        int deg2;
        /*
            PRIMITIVE DEGİSKEN DECLARE EDILDI --> STACKTE
            STACKTE KUTU OLUSTU
            ETIKETINDE DEG2 YAZIYOR
            KUTUNUN ICINDE INT TIPINDE BIR VERI TUTULACAK

         */
        deg2=5;
        /*
            PRIMITIVE DEGİSKEN INITIALIZE EDILDI --> STACKTE
            KUTUNUN ICINE 5 DEGERI KONULDU

         */
        SampleTest sample1;
        /*
            REFERENCE TIPLI DEGİSKEN DECLARE EDILDI -->OBJE
            NEREDE: STACKTE
            STACKTE BIR KUTU OLUSTU
            KUTUNUN ETIKETI SAMPLE1
            STACKTEKİ SAMPLE1 KUTUSU ARTIK PRİMİTİVE TİPTE BİR VERİ TUTMAYACAK
            SAMPLETEST TIPINDE BIR OBJENIN REFERENCE ADRESINI TUTACAK

         */
        sample1 = new SampleTest(3,4);
        /*
            REFERENCE TIPLI DEGISKEN INITIALIZE EDILDI -->OBJE --> HEAPTE
            YANI NEW KELIMESI ILE HEAPTE BBIR KUTU OLUSTU
            KUTUNUN ICINDE X VE Y DEGISKENLERI VAR
            PARAMETRE OLARAK GIRILEN 3 ILE 4 DEGERLERİ DEGISKENLERE VERILDI
            BU KUTUNUN ADRESİ, REFRERANCE NUMARASI DA STACKTEKI SAMPLE1 ADLI KUTUNUN ICINE KONDU

         */
        SampleTest sample2 = new SampleTest(4,5); // AYNI CLASSA AIT YENI BIR REFERENCE TIPLI DEGİSKEN DECLARE VE INITIALIZE EDİLDİ -->OBJE
        sample2.x = 5; // OLUSAN OBJE ARACILIGI ILE CLASSA GIRILDI VE CLASSTA YER ALAN PRIMITIVE DEGISKENIN TUTTUGU DEGER DEGISTIRILDI
    }
}
class SampleTest // CLASS
{
    public int x; // INSTANCE VARIABLE
    public int y;

    public SampleTest(int i, int j) // CONSTRUCTOR
    {
        this.x=i;
        this.y=j;
    }
}
