
public class test {
    public static void main(String[] args) {
       araba araba1=new araba();//obje oluşturdu
        /*araba1.renk="kırmızı";
        araba1.kapılar=4;
        araba1.motor="16v";
        araba1.model="renault";
        System.out.println(araba1.renk);*/
       araba1.setmodel("renault"); 
        System.out.println("Arabanın modeli: "+araba1.getmodel());
       araba1.setKapılar(-6);
    }
}
