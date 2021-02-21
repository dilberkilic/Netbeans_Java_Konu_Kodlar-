
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class If_Else {
    
    public static void main(String[] args)
    {
    Scanner scanner=new Scanner(System.in);
   /* System.out.println("YAS GİR");
    int yas=scanner.nextInt();
    if(yas<18)
    {
        System.out.println("Bu mekana giremezsiniz !"); 
        
    } 
    else
    {
        System.out.println("girebilirsin");
    }
*/
   
        System.out.println("Notunuzu giriniz= ");
        int not=scanner.nextInt();
        if(not>=90)
        {
            System.out.println("Dersiniz AA"); 
        }
        else if(not>=80 && not<90)
        {
            System.out.println("Dersiniz BA");
        }
        else if(not>=70 && not<80)
        { 
            System.out.println("Dersiniz BB");
        } 
        else if(not>=60 && not<70)
        { 
            System.out.println("Dersiniz BC");
        } 
        else if(not>=50 && not<60)
        { 
            System.out.println("Dersiniz CC");
        } 
        else if(not>=40 && not<50)
        { 
            System.out.println("Dersiniz CD");
        } 
        else if(not>=30 && not<40)
        { 
            System.out.println("Dersiniz DD");
        } 
    }
    
}
