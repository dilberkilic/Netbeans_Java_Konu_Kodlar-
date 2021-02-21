
public class calisa { //superclass
    private String isim;
    private String depertman;
    private int maas;

    public calisa(String isim, String depertman, int maas) {
        this.isim = isim;
        this.depertman = depertman;
        this.maas = maas;
    }
           
    public void calıs()
    {
        System.out.println("Calışan Çalışıyor...");
    }
    public void bilgileri_goster(){
        System.out.println("isim:"+getIsim());
        System.out.println("Maas:"+getMaas());
        System.out.println("Departman:"+getDepertman());
   }
    public  void depertman_değiştir(String departman){
        System.out.println("Departman değiştiriliyor...");
        this.setDepertman(departman);
        System.out.println("Yeni departman :"+this.getDepertman());
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the depertman
     */
    public String getDepertman() {
        return depertman;
    }

    /**
     * @param depertman the depertman to set
     */
    public void setDepertman(String depertman) {
        this.depertman = depertman;
    }

    /**
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }
            }
