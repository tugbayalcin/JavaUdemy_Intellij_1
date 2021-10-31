package Section3_Operators;

public class Op3_RelationalOperators // Iliskisel Operatorler
{
    public static void main(String[] args)
    {
        // Javada 6 adet iliskisel operator bulunur
        // Bunlarin temel amaci degiskenleri birbiri ile karsilastirmaktir
        // Karsilastirma sonucunda true veya false deger doner

        int s1=10, s2=11;
        // s1==s2 : s1 ve s2 yi karsilastirir, esitse true esit degilse false dondurur
        // s1<s2  : s1 ve s2 yi karsilastirir, eger s1 s2'den kucukse true dondurur
        // s1>s2  : s1 ve s2 yi karsilastirir,eger s1 s2'den buyukse true dondurur
        // s1<=s2 : s1 ve s2 yi karsilastirir,eger s1 s2'den kucuk veya esit ise true dondurur
        // s1>=s2 : s1 ve s2 yi karsilastirir,s1 s2'den buyuk veya esit ise true dondurur
        // s1!=s2 : s1 ve s2 yi karsilastirir, eger s1 s2'2ye esit degilse true dondurur

        // != : esit degilse demek

        // Geriye dondurulen true veya false degerleri ile programmimizi kontrol etmek, akisina yön vermek icin
        // if anahtar sozcugu ile kosullar yazilabbilir

        System.out.println("s1 esit mi s2'ye: " + (s1==s2));
        System.out.println("s1 kucuk mu s2'den: " + (s1<s2));
        System.out.println("s1 buyuk mu s2'den: " + (s1>s2));
        System.out.println("s1 kucuk veya esit mi s2'ye: " + (s1<=s2));
        System.out.println("s1 buyuk veya esit mi s2'ye: " + (s1>=s2));
        System.out.println("s1 esit degil mi s2'ye: " + (s1!=s2));

        // if komutunda komut ici true ise süslü parantez ici calısır
        // if komutunun ici false ise en yakın else komutu true kabul edilerek calistirilir

        if(s1==s2)
        {
            System.out.println("s1 ve s2 esittir");
        }
        else
        {
            System.out.println("s1 ve s2 esit degildir"); // burası false ise süslü parantez ici calisir
        }

        if(s1<s2)
        {
            System.out.println("s1 kucuktur s2'den");
        }
        else
        {
            System.out.println("s1 kucuk degildir s2'den");
        }

        if(s1>s2)
        {
            System.out.println("s1 buyuktur s2'den");
        }
        else
        {
            System.out.println("s1 buyuk degildir s2'den");
        }

        if(s1<=s2)
        {
            System.out.println("s1 kucuk veya esittir s2'den");
        }
        else
        {
            System.out.println("s1 buyuktur s2'den");
        }

        if(s1>=s2)
        {
            System.out.println("s1 buyuk veya esittir s2'den");
        }
        else
        {
            System.out.println("s1 kucuktur s2'den");
        }

        if(s1!=s2)
        {
            System.out.println("s1 esit degildir s2'ye");
        }
        else
        {
            System.out.println("s1 esittir s2'ye");
        }

    }
}