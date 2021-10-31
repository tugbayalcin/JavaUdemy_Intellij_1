package Section2_Variables;

public class StringBuilder
{
    public static void main(String[] args)
    {
        // Stringler immutable dir. Yani degistirilemezler
        // Tanimlayip sonradan deger atamasi yaptigimiz her string icin hafizada yeni bir yer acilir
        // Bu durum performans kaybina sebep olur
        // Iste burada devreye StringBuilder ve StringBuffer girer

        // StringBuilder: mutable yani degistirilebilir string elde etmemize olanak tanir
        // Boylece her seferinde hafizada yeni yer acilmaz, var olanin uzerinde degisiklik yapilabilir
        // Hafiza kullanimi acisindan String sinifindan daha avantajlidir
        // Thread-Safe degildir
        // Yani synchronized degildir
        // Thread li bir islemde StringBuilder kullanilmasi guvenli degildir

        // StringBuffer: StringBuilder ile ayni methodlara sahiptir
        // Thread-Safe dir
        // Yani synchronized dir
        // Thread li islemde kullanimi guvenlidir
        // Ancak StringBuilder dan daha yavas calisir

        String name = "tuba";
        name = "tuba2";
        name = "tuba3";
        // su anda string poolda 3 isim olustu stackte ise 1 tane name degiskeni var --->
        // StringBuilder ile 1 obje olusturduk ve hep ayni objenin icine giderek degisiklik yaptik




    }
}
