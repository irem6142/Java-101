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
public class HesapMakinesi 
    
{
    static  void menu()
    {
       System.out.println("1-Toplama\n2)Çıkarma\n3)Bölme\n4)Çarpma\n5)Üs Alma\n6)Çıkış"); 
    }
    public static void main(String[] args) 
    {
      Scanner input=new Scanner(System.in);
     int sec;
       
           
            
      do
      {
           menu();
           System.out.print("İşlem seçiniz :");
           sec=input.nextInt();
           switch(sec)
      {
              
          case 1:
              System.out.println("Sayıları giriniz");
              int a=input.nextInt();
              int b=input.nextInt();
              System.out.println("Toplamları :"+ a+b);
              break;
              case 2:
              System.out.println("Sayıları giriniz");
              int c=input.nextInt();
              int d=input.nextInt();
              int s=c-d;
              System.out.println("Farkları :"+ s);
              break;
              case 3:
              System.out.println("Sayıları giriniz");
              double e=input.nextInt();
              double f=input.nextInt();
              if(f!=0)
              System.out.println("Bölümleri:"+e/f);
              else
                  System.out.println("Bir sayı  sıfıra bölünmez");
              break;
              case 4:
              System.out.println("Sayıları giriniz");
              int g=input.nextInt();
              int h=input.nextInt();
              System.out.println("Çarpımları :"+g*h);
              break;
              case 5:
              System.out.println("Taban değerini giriniz");
              int i=input.nextInt();
               System.out.println("Üs değerini giriniz");
              int j=input.nextInt();
              System.out.println("Sonuç :"+Math.pow(i, j));
              break;
              case 6:
                   System.out.println("Güle güle");
                   break;
              default:
                  System.out.print("Yanlış seçim\n");
                  break;
      }
      }while(sec!=6);
     
      
      
      
      }
   
      
}
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
