
import java.util.Scanner;


public class odenecek_tutar {
    private double toplam_tutar;
    private double odenen_tutar;
    
     public odenecek_tutar(double toplam_tutar,double odenen_tutar){
     this.toplam_tutar=toplam_tutar;
     this.odenen_tutar=odenen_tutar;
     }
      
     public void hesaplama(double toplam_tutar,double odenen_tutar){
         double kalan;
         int bin=0,yuz=0,on=0,bir=0;
         if(odenen_tutar-toplam_tutar<0)
         {
             System.out.println("Paranız eksik");
         }
         kalan=(odenen_tutar-toplam_tutar)*100;
         bin=(int)(kalan /1000.0);
         yuz=(int)((kalan-bin*1000)/100);
         on=(int)(((kalan-bin*1000)%100)/10);
         bir=(int)kalan%10;
        // System.out.println("kalan:"+kalan+" bin: "+bin+" yuz: "+yuz+" on: "+on+" bir: "+bir);
        if(bin>0 && yuz>0  && on>0 && bir>0)
        {
             System.err.println("Ödenecek Tutar: "+bin+" adet 10 TL "+yuz+" adet 1 TL "+on+" adet 10 KURUŞ "+bir+" adet 1 KURUS");
        }
        else if(bin>0 && yuz==0  && on>0 && bir>0)
        {
             System.err.println("Ödenecek Tutar: "+bin+" adet 10 TL "+on+" adet 10 KURUŞ "+bir+" adet 1 KURUS");
        }
        else if(bin>0 && yuz>0  && on==0 && bir>0)
        {
             System.err.println("Ödenecek Tutar: "+bin+" adet 10 TL "+yuz+" adet 1 TL "+bir+" adet 1 KURUS");
        }
        else if(bin>0 && yuz>0  && on>0 && bir==0)
        {
             System.err.println("Ödenecek Tutar: "+bin+" adet 10 TL "+yuz+" adet 1 TL "+on+" adet 10 KURUŞ ");
        }
        else if(bin==0 && yuz==0  && on==0 && bir==0)
        {
             System.err.println("Ödenecek Tutar : 0 TL");
        }
        else if(bin==0 && yuz==0  && on>0 && bir>0)
        {
             System.err.println("Ödenecek Tutar: "+on+" adet 10 KURUŞ "+bir+" adet 1 KURUS");
        }
         else if(bin==0 && yuz>0  && on==0 && bir>0)
        {
             System.err.println("Ödenecek Tutar: "+yuz+" adet 1 TL "+bir+" adet 1 KURUS");
        }
         else if(bin==0 && yuz>0  && on>0 && bir==0)
        {
             System.err.println("Ödenecek Tutar: "+yuz+" adet 1 TL "+on+" adet 10 KURUŞ ");
        }
         else if(bin>0 && yuz==0  && on==0 && bir>0)
        {
             System.err.println("Ödenecek Tutar: "+bin+" adet 10 TL "+bir+" adet 1 KURUS");
        }
        else if(bin>0 && yuz==0  && on>0 && bir==0)
        {
             System.err.println("Ödenecek Tutar: "+bin+" adet 10 TL "+on+" adet 10 KURUŞ ");
        }
        if(bin>0 && yuz>0  && on==0 && bir==0)
        {
             System.err.println("Ödenecek Tutar: "+bin+" adet 10 TL "+yuz+" adet 1 TL ");
        }
        else if(bin==0 && yuz>0  && on>0 && bir>0)
        {
             System.err.println("Ödenecek Tutar: "+yuz+" adet 1 TL "+on+" adet 10 KURUŞ "+bir+" adet 1 KURUS");
        }
        else if(bin>0 && yuz==0  && on==0 && bir==0)
        {
             System.err.println("Ödenecek Tutar: "+bin+" adet 10 TL");
        }
        else if(bin==0 && yuz>0  && on==0 && bir==0)
        {
             System.err.println("Ödenecek Tutar: "+yuz+" adet 1 TL ");
        }
        else if(bin==0 && yuz==0  && on==0 && bir>0)
        {
             System.err.println("Ödenecek Tutar: "+bir+" adet 1 KURUS");
        }
         
     }  
     
     public static void main(String[] args) {
        double top_tutar,odenen_tut;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen toplam tutarı giriniz: ");
        top_tutar=scanner.nextDouble();
        System.out.println("Lütfen ödenen tutarı gririniz: ");
        odenen_tut=scanner.nextDouble();
        odenecek_tutar od=new odenecek_tutar(top_tutar, odenen_tut);
        od.hesaplama(top_tutar, odenen_tut);
        
        
        
        
    }
     
     
     
}
