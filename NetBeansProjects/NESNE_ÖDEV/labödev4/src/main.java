
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
          String secim,islemler;
          
          Musteri musteri = new Musteri("Dilber","KILIC");
          bakiye_goster bakiye_goster=new bakiye_goster();
          Scanner scanner=new Scanner(System.in);
          
           System.out.println("***************İşlemler*************");
           islemler="1.müşteri Bilgilerini Göster \n"
                  + "2.Müşteri Bilgisini Değiştir \n"
                  + "3.Bakiye Öğrenme \n"
                  + "4.Çıkış";
          System.out.println(islemler);
         
          while (true) { 
              
             System.out.println("Lütfen işlemlerden birini seçiniz : (1-4)");
             secim=scanner.nextLine();
             
             if(secim.equals("1"))
                     {
                         System.out.println("İsim: "+musteri.getIsim()+"\n"
                                 +"Soyisim: "+musteri.getSoyisim()+"\n"
                                 +"Bakiye: "+bakiye_goster.getbakiye()); 
                     }
             if(secim.equals("2"))
                     {
                         
                         musteri.musteri_bilgi_degisimi();
               
                     }
             if(secim.equals("3"))
                     {
                         System.out.println("Bakiyeniz: "+bakiye_goster.getbakiye()); 
                     }
             if(secim.equals("4"))
             {
                        System.out.println("Çıkış yapıldı.");
                        return;
             }   
        }
    }
}
