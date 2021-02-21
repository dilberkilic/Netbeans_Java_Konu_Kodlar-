
public class Abone {
    public String isim;
    public int bakiye;
    public String sehir;
    public void dogalgaz_kullan(int miktar){
    if((this.bakiye-miktar)<0)
    {
        System.out.println("Yeterli Bakiye Yoktur..");
    }
    else
    {
        this.bakiye-=miktar;
    }
    if((this.bakiye-miktar)<=0)
    {
        System.out.println("Bakiyeniz Yeterli Bakiye Yoktur Yükleyiniz "
                + "Kredi Kartı Limit : 200 TL");
    }
    }
    public void bakiye_ogren(){
        System.out.println("Bakiyeniz :"+bakiye);
    }
    
}
