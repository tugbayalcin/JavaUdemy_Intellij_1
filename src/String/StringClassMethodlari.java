package String;

public class StringClassMethodlari // googledan aldim, güzelce incele
{
    public static void main(String[] args)
    {
        //1.String Sınıfı Uzunluğu bulmak
        String string="TeknoKafe.Net Java'da String Sınıf Metodları";
        int strUzunluk=string.length();
        System.out.println("(1).Stringimizin katar uzunluğu:"+strUzunluk+"\n");

        //2.+ operatörü ile string birleştirmek
        String s1="TeknoKafe.Net";
        String s2="Java Yazılım";
        String s3=s1+s2;
        System.out.println("(2)."+s3+"\n");

        //3.Concat metodu ile string birleştirmek
        String k1="TeknoKafe.Net";
        String k2="Java'da String";
        String k3=k1.concat(k2);
        System.out.println("(3)."+k3+"\n");

        //4.String ifadeleri karşılaştırma equals ve equalsıgnoreCase metodları ile
        //equals: Büyüklük küçüklük hassasiyeti vardır.
        //egualsIgnoreCase: Büyüklük küçüklük hassasiyeti yoktur.
        String d1="Ardahan";
        String d2="İstanbul";
        String d3="ARDAHAN";
        String d4="İstanbul";
        System.out.println("(4)."+d2+"-"+d4+"="+d2.equals(d4));
        System.out.println("    "+d1+"-"+d3+"="+d1.equals(d3));
        System.out.println("    "+d1+"-"+d4+"="+d1.equals(d4));
        System.out.println("    "+d1+"-"+d3+"="+d1.equalsIgnoreCase(d3)+"\n");

        //5.String ifadeleri büyüklük kontrolü compareTo ve compareIgnoreCase metodları ile
		/*compareTo: Sözlük sıralamalarına göre büyüklük(se pozitif sayı) ve küçüklük(se negatif
         sayı) kontrolü yapar. Büyük harf hassasiyeti vardır.
	     compareToIgnoreCase: compareTo gibidir. Büyük harf hassasiyeti yoktur.*/
        String i1="Selim";
        String i2="Selin";
        String i3="SELİM";
        String i4="SELİN";
        System.out.println("(5)."+i1+" < "+i2+" = "+i1.compareTo(i2));
        System.out.println("    "+i3+" = "+i1+" = "+i3.compareToIgnoreCase(i1));
        System.out.println("    "+i1+" < "+i4+" = "+i1.compareToIgnoreCase(i4));
        System.out.println("    "+i3+" > "+i1+" = "+i1.compareTo(i3)+"\n");

        //6.regionMatches ile belli bir bölge Karşılaştırmak
        String j1="Ardahan Türkiye'nin Kaz eti başkentidir.";
        String j2="Türkiye";
        boolean b;
        b=j1.regionMatches(8, j2, 0, j2.length());
        if (b==true) {
            System.out.println("(6). "+j1+". içerisinde "+j2+" bulundu.\n");
        }else System.out.println("(6). İçersinde bi şey bulunamadı.\n");

        //7.StartsWith ve EndsWith metodları ile başlangıç ve bitiş kontrolü
        String stringD="TeknoKafe.Net OOP'ye devam";
        boolean a;
        System.out.println("(7). "+(a=stringD.startsWith("TeknoKafe.Net")));
        System.out.println("     "+(a=stringD.startsWith("kafe.Net",5)));//başlangıç 5 katardan mı başladığı
        System.out.println("     "+(a=stringD.endsWith("dev")));
        System.out.println("     "+(a=stringD.endsWith("devam"))+"\n");

        //8.getChars metodu ile string içerisindeki bir bölümü elde etme.
        String stringE="TeknoKafe.Net String Metodlarına devam";
        char[] yeni = new char[13];
        stringE.getChars(0, 13, yeni, 0);
        System.out.print("(8). ");
        System.out.println(yeni);System.out.println();

        //9.charAt metodu ile karaktere erişmek
        System.out.println("(9). "+stringE.charAt(9)+"\n");

        //10.toCharArray metodu ile string ifadesini karakter dizisine dönüştürmek
        char[] karakterD=new char[stringE.length()];
        karakterD=stringD.toCharArray();
        System.out.print("(10).");
        for (int i = 0; i < karakterD.length; i++) {
            System.out.print(karakterD[i]);}
        System.out.println("\n");

        //11.IndexOf ve LastIndexOf metodları ile baştan ve sondan Karakter arama
        String stringIL="TeknoKafe.Net sitesini cümle icerisinde arama";
        System.out.println("(11).e karakteri için ilk index: "+stringIL.indexOf("e"));
        System.out.println("     e karakteri için son index: "+stringIL.lastIndexOf("e"));
        System.out.println("     b karakteri için ilk index: "+stringIL.indexOf("b"));//bulunmayan karakter için -1 değer
        System.out.println("     TeknoKafe.Net kelimesi için ilk index: "+stringIL.indexOf("TeknoKafe.Net"));
        System.out.println("     e karakteri 7 indexden sonraki ilk index'i icin:"+stringIL.indexOf("e",7));
        System.out.println("     e karakteri 37 indexden önceki son index'i icin:"+stringIL.lastIndexOf("e",37)+"\n");

        //12.substring metodu ile string içerisinden herhangi bir bölüm seçme
        String stringSub="Substring ile string de bir bölüm seçme";
        String stringSub1="";
        System.out.println("(12)."+(stringSub1=stringSub.substring(14,21))+"\n");

        //13.replace metodu ile string içerisindeki herhangi bir karakteri değiştirme
        String stringRep="Replace ile stringde karakter değiştirme";
        System.out.println("(13)."+stringRep.replace("e", "i")+"\n");

        //14.trim metodu ile bir string ifadesinin yanındaki boşukları silme
        String stringTrim="             Trim metodu ile boşluk silme";
        System.out.println("(14)."+stringTrim.trim()+"\n");

        //15.toUpperCase ve toLowerCase metodları ile stringi büyük veya küçük yazdırma
        String stringUp="Büyük harfe çevirme";
        String stringLo="Küçük harfe çevirme";
        System.out.println("(15)."+stringUp.toUpperCase());
        System.out.println("     "+stringLo.toLowerCase()+"\n");

        //16.valueOf metodu ile veri tiplerini string ifadeye çevirmek ivin kullanırız
        int in=12; float fl=12.f; double dou=12.d; long lo=120000000; char ch='c';
        boolean bo=true; Object ob=new String("String");  String stringValOf="";
        stringValOf=String.valueOf(in)+"-"+String.valueOf(fl)+"-"+String.valueOf(dou)+"-"+
                String.valueOf(lo)+"-"+String.valueOf(ch)+"-"+String.valueOf(bo)+"-"+String.valueOf(ob);
        System.out.println("(16)."+stringValOf+"\n");


    }
}
