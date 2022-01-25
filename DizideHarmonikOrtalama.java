/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziler;

/**
 *
 * @author iremu
 */
import java.util.Scanner;
public class DizideHarmonikOrtalama 
{
    public static void main(String[] args)
    {
        int i;
        double sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz :");
        int sayi;
         sayi=input.nextInt();
        double a[]=new double[sayi];
        
       
        for( i=0;i<a.length;i++)
        {
            System.out.print(i+1+".sayı:");
           a[i]=input.nextInt();
        }
        for(i=0;i<a.length;i++)
         {
             sum+=1/a[i];    
             
           }
        System.out.println(sum);
        
        
        
        
        
        
        
        
    }
    
}
