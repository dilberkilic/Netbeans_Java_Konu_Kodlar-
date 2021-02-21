
package ödev7;

import java.util.Scanner;

public class Ödev7 {

    public static void main(String[] args) {
        
        Scanner aldi=new Scanner(System.in);
       
        String ders_adi;
        
        
        int degerlendirme_adeti,toplam_yuzde=0;
       
        System.out.print("Dersin Adını Giriniz : ");
        ders_adi=aldi.nextLine();
        
        System.out.print("Derse Ait Kaç Adet Değerlendime Kriteri Var : ");
        degerlendirme_adeti=aldi.nextInt();
        
        int [] kriter_yuzde_etki = new int [degerlendirme_adeti];
        String [] kriter_adi = new String [degerlendirme_adeti];
        int [] not = new int [degerlendirme_adeti];
        double [] ortalama = new double [degerlendirme_adeti];
        
        for(int i=0;i<degerlendirme_adeti;i++)
        {
            System.out.print((i+1)+".Kriterin Adını Giriniz : ");
            kriter_adi[i]=aldi.next();
            
            System.out.print((1+i)+".Kriterin Yüzde Etkisini Giriniz : ");
            kriter_yuzde_etki[i]=aldi.nextInt();
            toplam_yuzde+=kriter_yuzde_etki[i];
             if(toplam_yuzde>100)
                    {
                        System.out.print("TOPLAM YÜZDE 100 Ü AŞAMAZ LÜTFEN TEKRAR GİRİNİZ ! ");
                    }
        }
        
        System.out.println("*************************************************");
        
        System.out.print("Kaç adet öğrenci gireceksiniz : ");
        int sayi=aldi.nextInt();
        
        String [] ogrenci_ad =new String[sayi];
        String [] ogrenci_soyad =new String[sayi];
        
        for (int i=0;i<degerlendirme_adeti;i++)
        {

        }
         
     for(int i=0;i<sayi;i++)
     {
        System.out.print((i+1)+". Öğrencinin Adı Soyadı  : ");
        ogrenci_ad[i]=aldi.next();
        ogrenci_soyad[i]=aldi.next();
        double ort=0;
            for(int j=0;j < degerlendirme_adeti;j++)
            {
            System.out.print("Öğrencinin "+kriter_adi[j]+" Notu : ");
            not[j]=aldi.nextInt();
            double hesap=(int)not[j]*( kriter_yuzde_etki[j]/100.0);
            ort+=hesap;
            }
            ortalama[i] =ort;
             System.out.println("Öğrenci Adı Soyadı  : "+ogrenci_ad[i]+" "+ogrenci_soyad[i]);
        
        for(int j=0;j<degerlendirme_adeti;j++)
        {
            System.out.println(" "+kriter_adi[j]+" : "+not[j]);
        } 
         System.out.println("Ortalama : " +ortalama[i]);
     }
    
    }
    
}
