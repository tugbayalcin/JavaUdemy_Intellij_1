package Section1_GeneralJavaInfo;

public class  CompilerMantigi {//sadece 1 tane public makine class olur

    public static void main(String[] args) {//main methodu

        //Tugba classina gittim/ icindeki main methodu calistirdim/ main methodu da tugbaInfo methodunu calistirdi
        Tugba.main(new String[]{"1"});
        //16 e gitti/22ye gitti/23 calisti/24 calismasi icin 18'e gitti/19 i yazdi
        //20 ye gitti method bitti ve geldigi yere 24'e geri gitti/25'te main method bitti/27'ye classin sonuna gidicek/sonra satir 8 e geri donecek
        Tugba.tugbaInfo();//simdi 8 den 11 e atladi/. icine gir demek 17/18 e git methoda gir/
        //methodun icindeki 20. satiri calistir/21'de method bitti/28de class'tan cikicak
        //tekrardan satir 11'e gelecek


        Emre.emreInfo();//1.88
        System.out.println(new Emre().yas);//24
    }//ana public class'in main methodunu sonu

}////ana public class'inin sonu

class Tugba{//public olamazlar
    public static void tugbaInfo(){
        System.out.println("tugba 1.66");//tugba 1.66   -2
    }

    public static void main(String[] args) {//tugba class'inin motoru
        System.out.println(1);//1  -1
        tugbaInfo();//tugba 1.66   -2
    }

}//class'in sonu - CompilerMantigi.java dosyasinin icinde

class Emre{

    public int yas=24;//emre calss'inin property'si

    public  static void emreInfo(){
        System.out.println("emre 1.80");
    }
}
