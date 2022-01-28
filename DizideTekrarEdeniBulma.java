
import java.util.Arrays;
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
public class DizideTekrarEdeniBulma
{
    static  boolean isFind(int []arr,int value)
    {
        for(int i:arr){
            if(i==value){
                 return true;
            }
        }   
        return false;
    }
    public static void main(String[]args)
    {
         Scanner input = new Scanner(System.in);
        int i;
        
       
        System.out.print("Kaç elemanlı bir dizi olsun ?:");
        int sayi = input.nextInt();
        int arr[] = new int[sayi];
        int duplicate[]=new int[arr.length];
        int startIndex=0;
        for (i = 0; i < sayi; i++) {
            System.out.print(i + 1 + ".elemanı giriniz :");
            arr[i] = input.nextInt();
        }
       for(i=0;i<sayi;i++)
       {
           for(int j=0;j<sayi;j++)
           {
               if(i!=j && arr[i]==arr[j]&&arr[j]%2==0)
               {
                   if(!isFind(duplicate,arr[i])){
                       duplicate[startIndex++]=arr[i];
                   }
                   
                
               
               break;
               }
           }
       }
    
       for(int value:duplicate)
       {
             if(value!=0)
             {
                 System.out.println(value);
             }
               
       }
         
         
        
    }
    
}
