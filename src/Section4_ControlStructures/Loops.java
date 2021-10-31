package Section4_ControlStructures;

public class Loops // Donguler
{
    // Bazi kod bloklarinin tekrar tekrar calistirabilmemize yarar
    // 3 tanedir.
    // for: tekrar sayisinin bellioldugu durumlarda kullanilir
    // while: tekrarlanacak ifade bir kosula bagli ise kullanilir
    // do-while: while ile benzer durum icin kullanilir

    public static void main(String[] args)
    {
        forDongusu();
        whileDongusu();
        doWhileDongusu();
        breakKomutu();
        continueKomutu();
        returnKomutu();
    }
    //<editor-fold desc="Loops-Donguler">

        public static void forDongusu()
        {
            // tekrar sayisinin belli oldugu durumlarda kullanilir
            /* for(ilk atama ; dongu calismasinin sarti ; her calisma sonrasi ne olacak );
             for (int i = 0; i<10; i++) {} */
            // bu kod blogu her calistirildiktan sonra i degeri 1 arttirilir ve son durumdaki i degeri sarti sagliyorsa
            // (i<10) kod tekrar calistirilir

            for (int i=0; (i<10); i++)
            {
                System.out.println("Tugba Yalcin");
            }
            // i nin yasam alani yalnizca dongu icindedir. dongu öncesi ve sonrasinda yasamaz
            // eger i yi dongu disinda tanimlamis olsaydin hem yasardi hem de dongu icinde  ve sonrasinda da kullanabilirdin

            for (int i = 0, j = 0; (i + j < 10); i++, j++) // buraya ;  koymaya kalkma sakin
            {
                // calistirilacak ifade buraya yazilir, herhangi bir kod blogu olabilir
            }

            /*
            for (;;) // degisken tanimi yok, sart yok, atama yok. Herhangi bir kontrol yok, sonsuza kadar calisir Infinitive Loop
            {
                System.out.println("Asel");
            }
            */


        }
        public static void whileDongusu()
        {
            int sayi =10;
            while (sayi<20) // bu ifade true oldugu surece calisir
            {
                System.out.println("Merhaba sayi: " + sayi);
                sayi++; // buradan sonra sayi degiskeninin degeri 21
            }
            for (int i=10; i<20; i++)
            {
                System.out.println("For dongusu merhaba sayi: " + i);
            }
        }
        public static void doWhileDongusu()
        {
           int s1=0;
            do
            {
                System.out.println("Hellöööö s1: " + s1);
                s1++;
            }
            while (s1<5);

            // kodum ilk once bi calissin da sarta ondan sonra bakilsin diyorsam do while kullanirim
            // while da ise sarta once bakip ardindan kod calistirilir
        }
        public static void breakKomutu()
        {
            // etiketli ve etiketsiz olmmak uzere iki cesittir
            // etiketsiz break ile donguden cikabiliriz
            // etiketli break kullaniminda ise etiketledigimiz donguyu sonlandirabiliriz

            for(int i =0; i<10; i++ )
            {
                System.out.println("i'nin degeri: " + i); // yazdirmma komutunun kosuldan ve breakten once mi sonra mi oldugu cok onemli
                if(i==4)
                {
                    break;  // i degeri  e esit oldugu an donguden cikilir
                }
            }
            // etiket kullanımı

            distakiFor: // dongumuzu isimlendirmis olduk
            for (int a=0; a<5; a++)
            {
                ictekiFor:
                for(int b=0; b<3; b++)
                {
                    System.out.println("a: " + a + " b: " + b);
                    if(a==1 && b==2) // yalnizca break yazarsam burayi sonlandirir, cunku burasi icin tanimli
                    {
                        break distakiFor; // ismi ile cagirdigim for u durduracak

                    }
                }
            }



        }
        public static void continueKomutu()
        {
            for(int i=0; i<5; i++)
            {
                if (i==2)
                {
                    continue; // i=2 degeri icin kodu calistirmadi ama sonraki degerler icin calistirmaya devam etti
                }
                System.out.println("i degeri :" +i);

            }
        }
        public static void returnKomutu()
        {
            for(int i=0; i<5; i++)
            {
                if (i==2)
                {
                    return; // amaci ilgili donguden degil ilgili methoddan cikmaktir, returnden sonra kod yazilmaz, yazilirsa da calismaz
                }
                System.out.println("return degeri :" +i);

            }
            for(int i=0; i<5; i++) // returnden dolayi bu kismin ciktisini goremiyoruz
            {
                if (i==2)
                {
                    continue; // i=2 degeri icin kodu calistirmadi ama sonraki degerler icin calistirmaya devam etti
                }
                System.out.println("i degeri :" +i);

            }
        }

    //</editor-fold>
}
