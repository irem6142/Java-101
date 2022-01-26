/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziler;

import java.util.Scanner;

/**
 *
 * @author iremu
 */
public class DizidekiCiftVeTekOgeler
{
    public static void main(String[]args)
    {
    Scanner input=new Scanner(System.in);
        int toplam=0,i;
        System.out.print("Kaç elemanlı bir dizi olsun ?:");
        int sayi=input.nextInt();
        int arr[]= new int[sayi];
        for( i=0;i<sayi;i++)
        {
            System.out.print(i+1+".elemanı giriniz :");
            arr[i]=input.nextInt();
        }
        
            System.out.println("Çift sayilar :");
            for(i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(" "+arr[i]);
                System.out.println("\n");
            }
        }
            System.out.println("Tek sayilar :");
            for(i=0;i<arr.length;i++)
        {
             if(arr[i]%2!=0)
            {
                System.out.print(" "+arr[i]);
                System.out.println("\n");
        
               
            }
        }   
        }
}


