
import java.util.Scanner;

public class Musteri {
    private String isim;
    private String soyisim;
    private double bakiye;
    bakiye_goster  bakiye_goster=new bakiye_goster();
    Scanner scanner=new Scanner(System.in);
    public Musteri(String isim,String soyisim){
     this.isim=isim;
     this.soyisim=soyisim;
     bakiye=bakiye_goster.getbakiye();
    }
    
    public void musteri_bilgi_degisimi(){
        System.out.println("Yeni ismi giriniz: ");
        String yeni_isim=scanner.nextLine();
        System.out.println("Yeni soyisimi giriniz: ");
        String yeni_soyisim=scanner.nextLine();
        isim=yeni_isim;
        soyisim=yeni_soyisim;
        System.out.println("Yeni isim :"+isim+" "+"Yeni soyisim: "+soyisim);
    }
   
    public String getIsim() {
        return isim;
    }
   
    public String getSoyisim() {
        return soyisim;
    }

    public double getBakiye() {
        return bakiye;
    } 
    
}
