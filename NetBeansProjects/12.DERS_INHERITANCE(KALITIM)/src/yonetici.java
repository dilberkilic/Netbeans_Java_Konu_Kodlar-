
public class yonetici extends calisa{ //subclass
    private int sorumlu_kisi;
    public yonetici(String isim, String departman,int maas,int sorumlu_kisi){
        super(isim, departman, maas);
        this.sorumlu_kisi=sorumlu_kisi;
       
    }
    public void zam_yap(int zam_miktarı){
    System.out.println("Çalışanlara"+zam_miktarı+"TL zam yapıldı");
    }
    public void bilgileri_goster(){
        /*System.out.println("İsim:"+getIsim());
        System.out.println("Departman: "+getDepertman());
        System.out.println("Maas:"+getMaas());*/
        super.bilgileri_goster();
        System.out.println("Sorumlu olduğu kişi: "+this.sorumlu_kisi);
    }
}
