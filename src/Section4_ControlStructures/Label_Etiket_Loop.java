package Section4_ControlStructures;

public class Label_Etiket_Loop
{
    public static void main(String[] args)
    {
        etiket: // label ozelligi
        for(int i=1; i<4; i++)
        {
            System.out.println("Birinci loop govdesi: i= " + i+"\n");
            for(int j=1; j<4; j++)
            {
                System.out.println("Ikinci loop govdesi: j=" + j+"\n");
                for(int k =1; k<4; k++)
                {
                    System.out.println("Ucuncu loop govdesi: k=" + k);
                    if(k==1)
                    {
                        continue ;
                    }
                    if(k==2)
                    {
                        break etiket; // bu demek oluyor ki etiket ismi ile labellandirilmis looptan cik
                    }

                }

            }
        }
    }
}
