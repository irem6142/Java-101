/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author iremu
 */
import java.util.Scanner;

public class MutluSayi{
    static int RakamlarinToplami(int r)
    {
        int top=0;
   
        if(r<10)
        {
            top+=Math.pow(r, 2);
            return top;
        }
      
        else
            
        {
            while(r>0)
            {
                
                int sayi=r%10;
                 top+=Math.pow(sayi, 2);
                r/=10;
            }
           return  RakamlarinToplami(top);
        }
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Bir pozitif tam sayı alalım.\nBu sayının rakamlarının karelerini toplayarak yeni bir sayı elde edelim\nve bu şekilde çıkan her yeni sayıya aynı işlemi uygulayalım.\nEğer çıkan sayılardan sonunda 1’e ulaşıyorsak aldığımız sayı mutludur. ");
        System.out.print("\nSayı giriniz: ");
        int a=input.nextInt();
        int c=RakamlarinToplami(a);
        
        if(c==1)
        {
             System.out.println("Mutlu sayıdır :)");
        }
        else
     System.out.println("Mutlu  sayı değildir :(");
       
        
        
        
        
        
        
        
    }
}

  