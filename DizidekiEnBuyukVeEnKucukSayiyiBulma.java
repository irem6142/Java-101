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
public class DizidekiEnBuyukSayiyiBulma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
          int   enBuyuk=0;
        System.out.print("Kaç elemanlı bir dizi olsun ?:");
        int sayi = input.nextInt();
        int arr[] = new int[sayi];
        for (i = 0; i < sayi; i++) {
            System.out.print(i + 1 + ".elemanı giriniz :");
            arr[i] = input.nextInt();
        }
        int enKucuk=arr[0];
        for (i = 0; i < arr.length; i++) {
            
            if (enBuyuk <arr[i]) {
                enBuyuk = arr[i];
            }
            if (enKucuk >arr[i]) {
                enKucuk = arr[i];
            }

        }
        System.out.println("En büyük eleman :" + enBuyuk);
         System.out.println("En küçük eleman :" + enKucuk);
    }
}
