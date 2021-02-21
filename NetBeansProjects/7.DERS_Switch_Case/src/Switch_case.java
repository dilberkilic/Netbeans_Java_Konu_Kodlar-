
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
public class Switch_case {
    public static void main(System[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı gir(1-4 arası)");
        int sayı = scanner.nextInt();
        switch(sayı)
        {
            case 1:
                System.out.println("Bir girdin");break;
            case 2:
                System.out.println("İki girdin ");break;
            case 3:
                System.out.println("Üç girdin");break;
            case 4:
                System.out.println("Dört girdin ");break;
                default:
                    System.out.println("Say aralığında girmedin ki :( ");break;
        }
        
        
        
        
    }
    
    
}
