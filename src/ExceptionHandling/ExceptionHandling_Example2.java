package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_Example2
{
    public static void main(String[] args)
    {
        /*
            * Exception yakalamada SuperClass-SubClass Iliskisi:
              Bir try ifadesinde birden fazla catch blogu kullanabiliyoruz.
              Ve olusan her hatanin javada siniflar ile temsil edildigini de biliyoruz
              Boyle bir durumda aralarinda üst sinif alt sinif iliskisi bulunan hatalarda catch ile once alt siniftaki
              hatayi daha sonra ust siniftaki hatayi yakalamaliyiz.
              Yani her zaman hata siralamasinda ozelden genele dogru gitmeliyiz. Aksi halde compiler hata verir
            * 1.catch(ArithmeticException) --> 2.catch(RuntimeException) --> gibi
        */
        try
        {

            Scanner klavye=new Scanner(System.in);
            System.out.println("Birinci Sayıyı Giriniz");
            int sayi1=klavye.nextInt();
            System.out.println("İkinci Sayıyı Giriniz");
            int sayi2=klavye.nextInt();

            double bolum=sayi1/sayi2;
        }
        catch(ArithmeticException Hata)
        {

            System.out.println("Bir Sayının Sıfıra Bölümü Tanımsızdır. Lütfen Tekrar Sayı Giriniz");

        }
        catch(InputMismatchException Hata) // Burada InputMismatchException kodlarinin import edilmesi gerekir. Yoksa hata alirsin
        {

            System.out.println("Lütfen Sayı Değeri Giriniz. Girilen Harf Belirtilen İşlemi Yapmak İçin Uygun Değildir.");
        }
    }
}
