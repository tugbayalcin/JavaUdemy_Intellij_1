package Section4_ControlStructures; // Kontrol Yapilari

// Programin akisini yonlendiren yapilardir
// Aksi belirtilmedigi surece uygulama ilk ifadeden son ifadeye dogru sirayla calisir
// Programlama dillerinde bu akisi degistirebilen ve bir ifadenin kac kere calisacagini belirleyen komutlar bulunur
// Bunlar sirayla;
// 1.Karsilastirma ifadeleri: if, if-else, switch case
// 2.Dongu ifadeleri: while, do-while, for
// 3.Dallanma ifadeleri: break, continue, return
// 4.Istisna ifadeler: try ,catch, finally, throw

public class ConditionalStatements // Karsilastirma Ifadeleri

        // if, if-else, if-else if-else
        // Sart ve secime bagli olarak calisan yapilardir
        // Bu kavramlarin kosul kisimlarinda mutlaka geriye true vaya false deger dondurecek bir operator veya degisken olmalidir

{
    public static void main(String[] args)
    {
       ifElse();
       ternary();
       switchCase();
    }
    //<editor-fold desc="ConditionalStatements">

        public static void ifElse()
        {

            int sayi1 = 10, sayi2 = 5;

            if (sayi1 > sayi2) {
                System.out.println("Sayi1, sayi2'den buyuktur");
            } else if (sayi1 < sayi2) {
                System.out.println("Sayi1, sayi2'den kucuktur");
            } else {
                System.out.println("Sayi1, sayi2'ye esittir");
            }
            System.out.println("Program Sonlandi");

            // !!!DIKKAT!!!
            // if sayi > 0 {System.out.println("Bu ifade hatalidir"); : if ten sonra parantez olmali ve sart buraya yazilmalidir
            // if (sayi > 0); {System.out.println("Bu ifade hatalidir"); : compile hatasi vermemz ama istenilen sonucu da uretmez

            int sayi = 10;
            if (sayi > 5) ; // Noktali virgul olmamali !!! artik alttaki kod blogu if'e ait degil
            {
                System.out.println("Sayi 5'ten buyuktur");
            }
            // Burada compailer hatasi almadan program calisacaktir ama dogru sonuc vermeyecektir ve sen hatani bulamayacaksin
            // Hatta sayi degiskenine 3 degerini versekb bile program calisip sayi 5'ten buyuktur yazdiracaktir
            // Cunku burada buyuk bir mantik hatasi vardir
            // statement dişi bir satiri ; ile kapatirsak program  bagimsiz bir sekilde alt satirdan calismaya devam eder
            // if in icine baktı, true ya da false oldugunu belirledi, ; ü görünce if ile isi bitti ve alt satırdan devam etti

            // DIKKAT
            // if'den sonra tek satirli bir statement geliyorsa {} kullanmak zorunlu degildir
            // Eger ayni blok icinde art arda if kullanilmis ise, else en yakindaki if icin kullanilir

            if (sayi1 > sayi2)
                if (sayi1 > 0)
                    System.out.println("Ikinci if calisti");
                else
                    System.out.println("Else kismi calisti");
            // buradaki else sayi1>0 icin calisir
            // eger birinci if ile ilgili olmasini istiyorsak {} kullanmaliyiz

            // DIKKAT
            // Art arda if else if else if gibi bir ihtiyac varsa switch case yapisini tercih edebilirsiniz

            // if(ciftMi == true) ifadesi ile if(ciftMi)ifadesi ayni anlama gelir.
            // if icine boolean degiskeni direk koyabilirsin, conditiona gerek yok

            boolean sonuc = true;
            if (sonuc == true) // sarardi bozardi diyor ki zaten true burasi
            {

            }
            if (sonuc) // yukarida yazdigimizla ayni sey demek
            {

            }
        }

        public static void ternary() // Kisa if
        {
            int a=10, b=6 ,c=0;
            if(a>b)
            {
                c=a-b;
            }
            else
            {
                c=a+b;
            }
            System.out.println("C'nin degeri: " +c); // tum bunlari tek satirda yaptirabiliriz

            c= (a>b) ? (a-b) : (a+b); // burada ? if yerine gecer : ise else yerine gecer
                                      // (a>b) ise sagimdakini esittirin soluna ata demektir
            System.out.println("C'nin degeri: " +c);


        }

        public static void switchCase()
        {
            // noktali ifadelerde switch kullanilmaz
            // aralik ifadesi belirtemeyiz

            int haftaninKacinciGunu = 3;
            if (haftaninKacinciGunu == 1) {System.out.println("Pazartesi");}
            else if(haftaninKacinciGunu ==2) {System.out.println("Sali");}
            else if (haftaninKacinciGunu==3) {System.out.println("Carsamba");}
            else if (haftaninKacinciGunu==4) {System.out.println("Persembe");}
            else if (haftaninKacinciGunu==5) {System.out.println("Cuma");}
            else if (haftaninKacinciGunu==6) {System.out.println("Cumartesi");}
            else if (haftaninKacinciGunu==7) {System.out.println("Pazar");}

            // switch case yapisi
            switch (haftaninKacinciGunu)
            {
                case 1: System.out.println("Pazartesi"); break; // break komutu dogru sonuca ulastiktan sonra sistemden cikmayi saglar
                case 2: System.out.println("Sali"); break;
                case 3: System.out.println("Carsamba"); break;
                case 4: System.out.println("Persembe"); break;
                case 5: System.out.println("Cuma"); break;
                case 6: System.out.println("Cumartesi"); break;
                case 7: System.out.println("Pazar"); break;
                default: System.out.println("Yanlis bir gun degeri girildi"); // olmasi gereken parametre disinda bir deger girildiginde calisir
            }
            System.out.println("Switch'ten cikildi");

            // switch case kullanirken dikkat!
            // kosula baglanan degisken double veya float olamaz cunku bu degiskenler (noktadan sonra) yaklasik deger verir tam kesinlik saglayamaz
            // degiskenlerin hangi aralikta oldugu incelenemez
            // sadece char, short, byte, veya int degerler kullanilabilir
            // break keywordu kullanilmasi zorunlu degildir ancak kosulun saglandigi case den sonra cikmak ve bloktaki diger kodlarin yazdirilmasini engellemek istiyorsak kullanmaliyiz
            // herhangi bir sart saglanmaz veya bir case icine girilemez ise, varsa default blogu calistirilir

        }

    //</editor-fold>

}









