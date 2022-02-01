/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iremu
 */
import java.util.Scanner;

public class SayiDonusumleri {
    static void menu()
    {
        System.out.println("1-On tabanından ikilik tabana dönütürme \n2-İkilik tabandan onluk tabana dönüştürme\n3-Sekizlik tabandan onluk tabana dönüştüme\n4-Onluk tabandan sekizlik tabana dönüştürme\n5-Çıkış\n");
    }
    
    static void SekizdenOnluk(int sayi)
    {
        int Sekizlik=0,i=0;
        int kalan=0;
        while(sayi !=0)
        {
            kalan=sayi%10;
            sayi/=10;
            Sekizlik+=kalan*Math.pow(8, i);
            ++i;
        }
        System.out.println("=="+Sekizlik+"==");
    }
    static void iKilikOnluk(int sayi)
    {
        int Onluk=0,i=0;
        int kalan=0;
        while(sayi!=0)
        {
            
            kalan=sayi%10;
            sayi/=10;
            Onluk+=kalan*Math.pow(2,i);
               ++i;
        }
        System.out.println("=="+Onluk+"==");
        
    }

    static void OndaniKilik(int sayi) {
        int index = 0;
        int binary[] = new int[100];
        while (sayi > 0) {
            binary[index++] = sayi % 2;
            sayi /= 2;
        }
        System.out.println("=======");
        for (int i = index - 1; i >= 0; i--) {
           
            System.out.print(binary[i]+"\n");
         
        }
        System.out.println("=======");
        System.out.println("");
       

    }
    static void OndanSekizlik(int sayi)
    {
        int index=0;
        int Sekizlik[]=new int [40];
        while(sayi>0)
        {
            Sekizlik[index++]=sayi%8;
            sayi/=8;
        }
         System.out.println("=======");
        for(int i=index-1;i>=0;i--)
        {
           
            System.out.print(Sekizlik[i]);
            
           
        }
        System.out.println("\n=======");
            System.out.println("");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int dizi[] = new int[100];
        System.out.println("==Sayı dönüştürme programına hoş geldiniz!==");
        int secim;

        do {
            menu();
           System.out.print("İşlem seçiniz:");
        secim = input.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("Sayı girin:");
                    num = input.nextInt();
                    OndaniKilik(num);
                    break;
                case 2:
                    System.out.print("Sayı girin:");
                     num = input.nextInt();
                   iKilikOnluk(num);
                    break;
                case 3:
                    System.out.print("Sayı girin:");
                     num = input.nextInt();
                   SekizdenOnluk(num);
                    break;
                case 4:
                    System.out.print("Sayı girin:");
                     num = input.nextInt();
                OndanSekizlik(num);
                    break;
                case 5:
                    System.out.println("Güle güle");
                    break;
                default:
                    System.out.println("Yanlış seçim");
            }

        } while (secim != 5);

    }

}
