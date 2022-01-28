
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
public class DiziFrekans 
{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,count=0;
        
        int arr[]={10, 20, 20, 10, 10, 20, 5, 20};
        int bes=0;
        int yirmi=0;
        int on=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==10)
            {
                 on++;
            }
            else if(arr[i]==20)
                    {
                    yirmi++;
                    }
            else if(arr[i]==5)
            {
                bes++;
            }
            
        }
        
         System.out.println("10 sayısı "+ on+" kere tekrar edildi.");
        System.out.println("20 sayısı "+ yirmi+" kere tekrar edildi.");
         System.out.println("5 sayısı "+ bes +" kere tekrar edildi.");
        
     }
    
}
