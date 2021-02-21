
class Hayvan{
private String isim;

    public Hayvan(String isim) { //cunstroctor
        this.isim = isim;
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
    
    public String Konus() {
    
    return " Hayvan Konuşuyor ...";
    }

}
class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String Konus() {
        return this.getIsim() + " Miyavlıyor .... "; 
    }
   
}
class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String Konus() {
        return this.getIsim() + " Havlıyor ... " ; //To change body of generated methods, choose Tools | Templates.
    }
}
class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String Konus() {
        return this.getIsim() + " Kişniyor .." ; //To change body of generated methods, choose Tools | Templates.
    }

}


public class main {
     public static void main(String[] args) {
         Hayvan hayvan1 =new At("Limon");
         Hayvan hayvan2=new Kopek("fındık");
         Hayvan hayvan3=new Kedi("çukulata");
         System.out.println(hayvan3.Konus());
         System.out.println(hayvan1.Konus());
         System.out.println(hayvan2.Konus());
         
    }
}
