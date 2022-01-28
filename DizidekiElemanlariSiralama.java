
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
public class DizidekiElemanlariSiralama 
{
      public static void main(String[]args)
    {
         Scanner input = new Scanner(System.in);
        int i;
        
       
        System.out.print("Kaç elemanlı bir dizi olsun ?:");
        int sayi = input.nextInt();
        int arr[] = new int[sayi];
        for (i = 0; i < sayi; i++) {
            System.out.print(i + 1 + ".elemanı giriniz :");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
         for (i = 0; i < sayi; i++) {
            System.out.println(i + 1 + ".elemanı:"+arr[i]);
          
        }
    }
}
