package Section6_Methods;

public class ExampleForMethods

{
    public static void main(String[] args)
    {
        //basliyoruz

        //RETURN TYPE YOK, METHOD VOID, geriye bir sey dondurmez, sadece methodun icindekiler yapilir,yazdirilir
        addition(5,10);//method adi yazdim toplama, boyle bir method olmadigi icin hata verdi
                    //sonra bana secenek sundu istersen sana static addition() method olusturabilirim diye
                    //alt+enter
                    //methodun icindeki sout 5+10=15 YAZDI

        //bir sey return etmeyen, signature'inda void keyword'u bulunduran methodlar sout icine direk yazilamazlar.
        //System.out.println(addition(5,10));   //compiler hata verdi bu programi hic calistirma yesil oka hic basma hata vericem diyor
                                                //cunku addition(5,10) bir sey return etmiyor,
                                                //YANI GECICI BIR DEPO DEGIL!!!



        //RETURN TYPE INT, hem methodun icindekiler yapilir,yazdirilir hem de method bitmeden bir deger dondurulur

        //olumsuz senario-1
        substraction(20,5);//15 YAZDI - methodun icindeki sout tan geldi  VE
                                    // 15 RETURN ETTI ama hic bir degiskene atanmadi yani return edilen sayi kullanilmadi, yazilmadi

        //olumlu scenario-2
        int substraction= substraction(10,1);//methodun icine girdik ilk olarak sout(10-1) yazdirdik- yani 9
                                                    // bu method 10-1 yapip 9 return etti, 9 degerini de substraction isimli int'e atadik
                                                    //artik stack memory'de substraction diye bir kutu onun icinde 9 degeri var
                                                    //bu uzun yol, degeri elimizde kalici olarak tutmak istersek bir degiskene atariz

        System.out.println(substraction);//simdi ise substraction variable'in icindeki 9'u yazdiriyoruz - 9 yazdirdi


        //daha kisa olumlu scenario-3
        System.out.println(substraction(10,2));//ilk methodun icine girdi yukardan asagi complier gezmee basladi
        //sout(10-2) calisti ve console'da 8 yazdi
        //sonra asagi geldi 10-2 -> 8 int degerini return ettik
        //herhangi bir degiskene(variable'a) ATAMADAN direk console'da yazdirdik

        //yani soyle dusunebilirz substraction(10,2); ifadesi 8 int degerini tutan gecici bir depo
        //ister kalici olsun diye bir degisken olustur(declaration) ve icine bu 8 degerini koy(assign=ata)
        //istersen sout yardimiyla direk yazdir




      }

    public static int substraction(int i, int i1)
    {
        System.out.println(i-i1);//- console'da YAZACAK
        //println() methodunun gorevi parantezinin icindeki console'da yazdirmaktir.

        return i-i1;// int degerini dondurecek, YAZDIRMAYACAK

    }//burada compiler bize kiziyor bu method int return etmeli unutma diyor



    private static void addition(int i, int i1) //2 tane int parameters alan method
    {
        //gonderecegim 2 sayiyi topla sonra sout ile yaz
        System.out.println(i+i1);//

    }
}
