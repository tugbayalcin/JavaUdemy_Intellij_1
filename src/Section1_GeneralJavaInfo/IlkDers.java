package Section1_GeneralJavaInfo;//PACKAGE:  burasi package adi


public class IlkDers // CLASS/SINIF:
            //.java file'inin icinde sadece bir tane public class olabilir
            // public classin adi dosyanin adiyla ayni olmak zorunda
            // burasi class ismi. package adindan sonra gelir. public olmali ve dosya adiyla ayni olmali
    {

    public static void main(String[] args) //METHOD
        // Classin icinde ise methodlar olur, main method javanın tetikleyici(calistirici) methodudur
        // Yani java compiler main methodun icindekileri calistirir.
        // Bir sinifin calismasi icin main isimli bir methoda sahip olmasi gereklidir.
        // Burası butun uygulamanin baslangic noktasidir
        // Methodlar suslu parantezlerin icine yazilir
        {
            System.out.println("HelloWorld");
            // console'a hello world yaz diyen komuttur
            // ; ile birbirinden ayrilan her bir komut dizilimine statement denir
            // ; un kullanim amaci statement'lari sonlandirmaktir
            // System: class adidir. out: system classinin icindeki bir objedir. println: ise bir methoddur.
            // Komut sıralamasının bu şekilde olması önemlidir
            System.out.println("Ben javayı harikulade öğreneceğim");
            System.out.print("Tugba Yalcin");
            System.out.print("Java Dersleri\n");
            System.out.println("İlk projemizi yazdık, hayırlı olsun");
            System.out.println("Harika iş çıkardın, tebrikler\n");
            // Print: sonuclari yan yana yazdirir
            // Println: Kendinden sonrakilerden baslamak uzere her bir sonucu bir satira yazdirir
            // \n: Satirin sonuna eklediginde su demek olur, bu satiri yazdirdikten sonra bir alt satira gec
        }

    }