
public class kasa {
    private String model;
    private String uretici;
    private String malzeme;

    public kasa(String model, String uretici, String malzeme) {
        this.model = model;
        this.uretici = uretici;
        this.malzeme = malzeme;
    }
public void bilgisayar_ac(){
    System.out.println("Bilgisayar AÇILIYOR...");
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
     * @return the malzeme
     */
    public String getMalzeme() {
        return malzeme;
    }

    /**
     * @param malzeme the malzeme to set
     */
    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }
    
    
}
