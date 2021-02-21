
public class account {
    private String hesap_no;
    private double bakiye;
    private String isim;
    private String email;
    private String tel_no;
    
    public account(){
       /* this.hesap_no="Bilgi yok";
        this.bakiye=0.0;
        this.isim="Bilgi Yok";
        this.tel_no="Bilgi yok";*/
       
       this("Bilgi yok",0.0, "Bilgi yok", "Bilgi Yok", "Bilgi Yok");
       
    }
     public account(String isim,String email,String tel_no){
       
         /*this.hesap_no=hesap_no="Bilgi Yok";
        this.bakiye=bakiye=0.0;
        this.isim=isim;
        this.email=email;
        this.tel_no=tel_no;*/
         this("Bilgi Yok",0.0,isim,email,tel_no);
    }
    public account(String hesap_no,double bakiye,String isim,String email,String tel_no){
        this.hesap_no=hesap_no;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.tel_no=tel_no;
    }
    
    
    
public void parayatır(double miktar)
{
    bakiye+=miktar;
    System.out.println("Yeni Bakiye: "+bakiye );
    
}
public void paraçekme(double miktar)
{
    if (miktar>1500)
    {
        System.out.println("Bir günde en fazla 1500tl  çekebilirsin.");
    }
    if(bakiye-miktar<0)
    {
        System.out.println("Bakiye yetersiz");
    }
    else{
        bakiye-=miktar;
        System.out.println("Yeni bakiye : "+bakiye);
        
    }
    
    
}

    /**
     * @return the hesap_no
     */
    public String getHesap_no() {
        return hesap_no;
    }

    /**
     * @param hesap_no the hesap_no to set
     */
    public void setHesap_no(String hesap_no) {
        this.hesap_no = hesap_no;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the tel_no
     */
    public String getTel_no() {
        return tel_no;
    }

    /**
     * @param tel_no the tel_no to set
     */
    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }
    
}
