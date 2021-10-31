package Section3_Operators;

public class BolumSonuOdev
{
    public static void main(String[] args)
    {
        // ODEV1:
        // Bir int deger olustur ve bu degiskene bir saniye degeri ata
        // Ardindan bu saniyenin kac dakika ve saniyeye denk geldigini yazdir
        // Ornek: 1200 degeri icin 220 dk 0 sn yazmali

        int saniye = 1250;
        int dakika = saniye / 60;
        int kalanSaniye = saniye % 60; // saniye mod 60: bolumden kalani verecek
        System.out.println("Girdiginiz " + saniye + " saniye = " + dakika + " dakika ve " + kalanSaniye + " saniyeye esittir");


        // ODEV2:
        // Bir double degisken olustur ve bu degiskende fahrenheit cinsinden sicakligi sakla
        // Ardindan bu degerin kac celcius oldugunu hesapla
        // Ornek: 100 degeri icin 37.777778 gibi bir deger elde etmelisin
        // Formul: celcius = 5/9*(fahrenheit-32)

        double fahrenheit = 100.0d;
        double celcius = (5.0 / 9.0) * (fahrenheit - 32); // !!! (5/9) degeri int olarak kabul edilip 0 aliniyor sonuc 0 cikiyor !!!
        System.out.println("Girdiginiz " + fahrenheit + " fahrenheit = " + celcius + " celciusa esittir");


        // ODEV3:
        // Bir yil degerinin artik yil olup olmadigini hesaplayin
        // Bir yilin artik olmasi icin 400 veya (4 ile modu 0 olmali ancak 100 ile modu 0 olmamali)
        // Ornek: 4100 false deger vermeli

        int yil = 4100;
        boolean artikYil = (yil % 400 == 0) || (yil % 4 == 0 && yil % 100 != 0);

        if(artikYil)
        {
            System.out.println("Girdiginiz " + yil + " yili artik yildir");
        }
        else
        {
            System.out.println("Girdiginiz " + yil + " yili artik yil degildir");
        }
    }
}
