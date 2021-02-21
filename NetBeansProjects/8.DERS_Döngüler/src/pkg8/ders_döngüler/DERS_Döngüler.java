/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.ders_döngüler;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DERS_Döngüler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* 
                                               FOR DÖNGÜSÜ         
        for(int i=0;i<=5;i++)
        {
            System.out.println("DİLBER");
        }*/
       
      /*int i=0;
      int j=10;
      for(;i<10 && j>0 ; i++ , j--)
      {
          System.out.println("i= "+i);
          System.out.println("j= "+j);

      }*/
      
      Scanner scanner=new Scanner(System.in);
      /*int faktöriyel =1;
        System.out.println("Lütfen faktörüleyini istediğiniz sayıyı giriniz :");
        int fak=scanner.nextInt();
        for(int i=1;i<=fak;i++)
        {
            faktöriyel*=i;
        }
        System.out.println(fak+" Faktöriyeli= "+faktöriyel);*/
      
      
                                           //WHİLE DÖNGÜSÜ
       /* System.out.println("BİR SAYI GİRİNİZ:");
        int sayı=scanner.nextInt();
        int fak=1;
       while(sayı>0)
       {
          fak*=sayı;
          sayı--;  
       }
        System.out.println("Faktöriyel="+fak);
        
      
                                           //DO WHİLE DÖNGÜSÜ
        System.out.println("Bir sayı giriniz:");
         int i=scanner.nextInt();
         int toplam=0;
        do {   
            toplam+=i%10;
            i/=10;
            
        } while (i>0);
        System.out.println("Rakamları toplamı = "+toplam);
      
   */ 

                                    //BERAK VE CONTİNUE ANAHTAR KELİMESİ 
                                   /* while (true) {            
            int islem=scanner.nextInt();
                                        if (islem==-1) {
                                            System.out.println("Döngüden çıkıldı.");
                                            break;
                                        }
                                        System.out.println("İslem değeri: "+islem);
    
 
                                        
        }
      */
      
      
    }
    
}

