
public class bilgisayar {
    private monitor Monitor;
    private kasa Kasa;
    private anakart Anakart;

    public bilgisayar(monitor Monitor, kasa Kasa, anakart Anakart) {
        this.Monitor = Monitor;
        this.Kasa = Kasa;
        this.Anakart = Anakart;
    }

    /**
     * @return the Monitor
     */
    public monitor getMonitor() {
        return Monitor;
    }

    /**
     * @param Monitor the Monitor to set
     */
    public void setMonitor(monitor Monitor) {
        this.Monitor = Monitor;
    }

    /**
     * @return the Kasa
     */
    public kasa getKasa() {
        return Kasa;
    }

    /**
     * @param Kasa the Kasa to set
     */
    public void setKasa(kasa Kasa) {
        this.Kasa = Kasa;
    }

    /**
     * @return the Anakart
     */
    public anakart getAnakart() {
        return Anakart;
    }

    /**
     * @param Anakart the Anakart to set
     */
    public void setAnakart(anakart Anakart) {
        this.Anakart = Anakart;
    }
    
}
