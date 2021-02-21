
public class araba {
    
    private String renk ;
    private int tekerlikler;
    private int kapılar;
    private String motor;
    private String model;
    
    public void setmodel(String model)// String model yerine String moeal yazsaydık gerek kalmıyacaktı thise.
    {
        this.setModel(model);
    }
    
    public String getmodel()
    {
        return this.model;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @param tekerlikler the tekerlikler to set
     */
    public void setTekerlikler(int tekerlikler) {
        this.tekerlikler = tekerlikler;
    }

    /**
     * @param kapılar the kapılar to set
     */
    public void setKapılar(int kapılar) {
if(kapılar<0)
    {
    System.out.println("Kapı sayısı eksi olamaz");

    }
    else 
    {
        this.kapılar=kapılar;
    }
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    
}
