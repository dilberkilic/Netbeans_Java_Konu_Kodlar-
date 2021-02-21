
package ödev6;
public class Ödev6 {
    
    public static void main(String[] args) {
     
    int yedek=0,toplam=0,sayi=20;
        for(int i=0;i<100;i++)
        {
            if(i==0)
            {
                yedek=sayi;
                toplam+=yedek;
                sayi++;
            }
        else
            { 
                yedek=sayi;
                toplam+=yedek;
                sayi++;
            }
        }
        System.out.println("İlk yüz terim toplamı : "+toplam);
    }
    
}
