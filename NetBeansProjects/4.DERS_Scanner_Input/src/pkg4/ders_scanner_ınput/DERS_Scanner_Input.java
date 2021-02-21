/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.ders_scanner_ınput;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.I;

/**
 *
 * @author user
 */
public class DERS_Scanner_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Lütfen yaşınızı giriniz :");
        if(scanner.hasNextInt())
                {
        int yas=scanner.nextInt();
        System.out.println("Yaşınız :"+yas);
    }
        else 
        {
            System.out.println("Lütfen sayı giriniz : ");
        } 
        */
         
        int yas1=scanner.nextInt();
        int yas2=scanner.nextInt();
        int yas3 =scanner.nextInt();
        
        System.out.println("yas1= "+yas1+"  yas2= "+yas2+"  yas3= "+yas3);
    }
    
}
