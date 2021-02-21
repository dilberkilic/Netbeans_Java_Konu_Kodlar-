/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.ders_metodlar;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DERS_Metodlar {

    /**
     * @param args the command line arguments
     */
   public static void selamlama() {
        System.out.println("Selamlar");
        System.out.println("Napıyorsun");
        
    }
    public static void fak(){
        System.out.println("Faktöriyeli hesaplanacak sayıyı giriniz:");
        Scanner scanner=new Scanner(System.in);
        int sayı=scanner.nextInt();
        int faktöriyel=1;
        while (sayı>0) {            
            faktöriyel*=sayı;
            sayı--;
        }
        System.out.println("Faktöriyeli: "+faktöriyel);
    }
    public static void selam(String isim){
        System.out.println("Selamlar "+isim);
    }
    public static void toplam(int a,int b, int c) {
        System.out.println("Toplam ="+(a+b+c));
    }
    public static int sayısaldöndür(int a,int b,int c) {
        return(a+b+c);//değer döndürür.
    }
    public static int ikikat(int a) {
        return a*2;
    }
     public static int ikitopla(int a) {
        return a+2;
    }
      public static int ikiçıkar(int a) {
        return a-2;
    }
     public static int çıktı(int a) {
         System.out.println("Çıktı veriliyor..");
         return a+2;
    }
     public static void skor(String[] args) {
        
    }
     
     
     
     
     
     
     
     
     
    
    public static void main(String[] args) {
        // TO-"DO code application logic here
        //fak();
        //selam("murat");
        //toplam(5,6,9);
        //System.out.println("Çıktı değeri :"+sayısaldöndür(5, 9, 6));
       // System.out.println("İKİ KAT ÇARPIM "+ikikat(5));
       // System.out.println("Sayının iki ile toplanıp daha sonra iki ile çarpılıp üstünden iki çıkarılması:"+ikiçıkar(ikikat(ikitopla(5))));
        //System.out.println(çıktı(4));
        
    }
    
} 