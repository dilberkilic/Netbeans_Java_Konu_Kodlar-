
package odev9;

import java.util.Scanner;

public class Odev9 {

public static void main(String[] args) {
System.out.print("Kaçıncı Elemana Kadar Gösterilsin :");
Scanner scanner=new Scanner(System.in);
int n =scanner.nextInt();
int[] fibonacci = new int [n];
fibonacci[0] = 0;
fibonacci[1] = 1;
for ( int i = 0; i < n-2; i++ )
{
fibonacci[i+2] = fibonacci[i] + fibonacci[i+1];
}
for ( int i = 0; i < n; i++ )
{
System.out.println( (i+1) + ". eleman : " + fibonacci[i] );
}
    }
    
}
