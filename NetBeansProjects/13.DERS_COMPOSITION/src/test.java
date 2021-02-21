
import javax.management.monitor.Monitor;


public class test {
    public static void main(String[] args) {
        Resolution resolution=new Resolution(1920, 1080);
        monitor Monitor=new monitor("V5197DE", "ASUS", "18.5", resolution);
               kasa Kasa =new kasa("Shadow Slade", "Shadow", "emperli Cam");
               anakart Anakart=new anakart("B250-PRO", "ASUS", 10, "Windows 10");
               bilgisayar pc=new bilgisayar(Monitor, Kasa, Anakart);
               pc.getKasa().bilgisayar_ac();
    
               
    }
}
