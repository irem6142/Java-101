
import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iremu
 */
public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        
        int yedek;
        System.out.print("Kaç elemanlı bir dizi olsun ?:");
        int sayi1 = input.nextInt();
        int arr[] = new int[sayi1];
        for (i = 0; i < sayi1; i++) {
            System.out.print(i + 1 + ".elemanı giriniz :");
            arr[i] = input.nextInt();
        }
     int length=arr.length;
     System.out.println("Sayi gir :");
        int sayi = input.nextInt();
        
        Arrays.sort(arr);//Diziyi sıraladık.
        //Neden minMax sayıdan küçük en büyük sayı
        //Neden maxMin sayıdan büyük  en küçük sayı
        int minMax = arr[0];//Sıralı olduğu için en küçük sayıyı minMax a atadık
        int maxMin = arr[length-1];//Sıralı olduğu için en büyük sayıyı maxMin e atadık
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < sayi) {//Sayı dizideki elemandan daha büyük olacak
                if (minMax < arr[i]) {//En büyüğünü buluyoruz
                    minMax = arr[i];

                }
            }
                if (arr[i] > sayi) {//Sayı dizideki elemandan daha küçük olacak
                    if (maxMin> arr[i]) {//En küçüğü buluyoruz.
                    maxMin = arr[i];

                }

                }

            

        }
        System.out.println("Sayıdan küçük en yakın sayı :"+minMax);
        
   System.out.println("Sayıdan büyük en yakın sayı:"+maxMin);

}
}
