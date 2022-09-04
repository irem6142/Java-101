/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author irem
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // TODO code application logic here
        int value=0;
        int bakiye=100;
        int paraYukle,paraCek;
        System.out.println("ATM uygulamasına hoş geldiniz.");
        
         while(value!=4)
         {
         System.out.println("1-Para Yatırma || 2-Para Çekme || 3-Bakiye Sorgulama || 4-Çıkış");
             System.out.print("Seçiminiz :");
         value=input.nextInt();
            switch(value)
            {
         
                case 1:
                
                    System.out.print("Yatıracağınız miktar :");
                    paraYukle=input.nextInt();
                    bakiye+=paraYukle;
                   System.out.println(paraYukle+ " tl hesabınıza yatırılmıştır.");
                    
                    break;
                
                case 2:
                
                    System.out.print("Çekeceğiniz miktar :");
                    paraCek=input.nextInt();
                    if(bakiye>paraCek)
                    {
                          bakiye-=paraCek;
                          System.out.println(paraCek+ " tl hesabınızdan çekilmiştir.");
                    }
                    else
                        System.out.println("Yetersiz Bakiye");
                  
                    break;
                    
                case 3:
                    System.out.println("Bakiyeniz :"+bakiye);
                    break;
                    
                case 4:
                    System.out.println("Sağlıklı Günler");
                    break;
                    
                default:
                {
                    System.out.println("Geçersiz numara");
                }
                    
            }
                
            }
        }
        
   
    
    
    
}
