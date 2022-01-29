
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iremu
 */
public class MatrisTranspozu 
{
    
    
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j;
        int arr[][]=new int[2][3];
        int arr1[][]=new int[3][2];
         
    for (i = 0; i < 2; i++) {
            for(j=0;j<3;j++)
            {
                
                System.out.print("["+i+"]"+"["+j+"]"+"=");
               arr[i][j]=input.nextInt();
            }            
        }
     System.out.println(" Girdiğiniz Matris");
          for (i = 0; i < 2; i++) {
            for( j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }   
              System.out.println("\n");
        }
          for(i=0;i<2;i++)
          {
              for(j=0;j<3;j++ )
              {
                 arr1[j][i]= arr[i][j];
              }
          }
          System.out.println("Matris Transpozu");
        for(i=0;i<3;i++)
          {
              for(j=0;j<2;j++ )
              {
                  System.out.print(arr1[i][j]+"  ");
              }
              System.out.println("\n");
          }
      }
}

