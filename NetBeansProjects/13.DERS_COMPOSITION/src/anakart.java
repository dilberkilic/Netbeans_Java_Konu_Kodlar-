
public class anakart {
    private String model;
    private String  uretici;
    private int yuva_say;
    private String isletim_sistemi;

    public anakart(String model, String uretici, int yuva_say, String isletim_sistemi) {
        this.model = model;
        this.uretici = uretici;
        this.yuva_say = yuva_say;
        this.isletim_sistemi = isletim_sistemi;
    }
    public void isletim_sistemi(){
        System.out.println("İşletim sistemi yüklendi :"+isletim_sistemi);
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the uretici
     */
    public String getUretici() {
        return uretici;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    /**
     * @return the yuva_say
     */
    public int getYuva_say() {
        return yuva_say;
    }

    /**
     * @param yuva_say the yuva_say to set
     */
    public void setYuva_say(int yuva_say) {
        this.yuva_say = yuva_say;
    }

    /**
     * @return the isletim_sistemi
     */
    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    /**
     * @param isletim_sistemi the isletim_sistemi to set
     */
    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }
    
}
