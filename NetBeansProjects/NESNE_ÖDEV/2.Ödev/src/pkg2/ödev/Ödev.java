/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.ödev;

import javax.swing.JOptionPane;

public class Ödev {

    public static void main(String[] args) {
       
     double value =Double.parseDouble(   JOptionPane.showInputDialog("FAHRENHEİT DEĞERİ GİRİNİZ :"));
        double donusum=(value -32)*(5.0/9);
       JOptionPane.showMessageDialog(null,donusum, "DERECE", 1);
        
    }
    
}
