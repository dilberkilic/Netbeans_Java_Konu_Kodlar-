
package odev8;
import java.util.Scanner;
public class Odev8 {
    
   public static  int[][] Ort(int[][] dizi)
{
    int n =dizi.length;
    int m =dizi[0].length;
    
   int [] [] yeni_dizi=new int [n][m+1];
   
   
   for(int row =0;row < dizi.length;row++)
   {
          int toplam =0;
           for(int col=0;col<dizi[0].length;col++)
           {
               yeni_dizi[row][col]=dizi[row][col];
               toplam =toplam + dizi[row][col];
           }
          yeni_dizi[row][m]=toplam/m;
   }

    return yeni_dizi; 

}
    public static void main(String[] args) {
      
     Scanner scanner= new Scanner(System.in);
        System.out.print("Lütfen girmek istediğiniz n x m matrixiniz değerini giriniz : ");
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int [] [] matrix= new int [n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            System.out.print((i+1)+".Satır ve "+(j+1)+".Sütünda ki değeri giriniz :");
            matrix[i][j]=scanner.nextInt();
                    }
        }
        System.out.println( n+"x"+m+" matrixiniz :");
        
        for(int i=0;i < matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++)
           {
               System.out.println((i+1)+".Satır "+(j+1)+".Sütundaki değer :"+matrix[i][j]);
               
           }     
   }
       
       System.out.println( n+"x"+(m+1)+" matrixiniz :");
       int [][] yeni=Ort(matrix);
       
        for(int i=0;i < yeni.length;i++)
        {
           for(int j=0;j<yeni[0].length;j++)
           {
               System.out.println((i+1)+".Satır "+(j+1)+".Sütundaki değer :"+yeni[i][j]);
               
           }     
        }
             
     
    }
    
}
