/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irem
 */
import com.sun.imageio.plugins.jpeg.JPEG;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     
     
        System.out.println("===Sisteme hoş geldiniz===");
        String islemler="1-Yazılım işlemleri\n"+
                        "2-Yönetici İşlemleri\n"+
                        "3-Çıkış için q'ya basınız";
                
       
        
      
        
        
        while(true)
        {
             System.out.println("************************");
             System.out.println(islemler);
             System.out.println("************************");
         System.out.print("İşlem seçiniz: ");
        String islem=input.nextLine();
            if(islem.equals("q"))
            {
                System.out.println("Programdan çıkış yaptınız");
                break;
            }
            else if(islem.equals("1"))
            {
              software software=new software("İrem","sofware",80000,1,"java,js,c++,c");
              String yazilim_islemleri="1-Format At\n"+
                                       "2-Bilgileri Göster \n"+
                                       "3-Çıkış için q ya basın" ;
                
              while(true)
              {
                System.out.println("***********************");
                System.out.println(yazilim_islemleri);
                System.out.println("***********************");
                  System.out.println("İşlem seçiniz");
                  String sec=input.nextLine();
                  if(sec.equals("q")){
                      System.out.println("Çıkış yaptınız");
                      break;
                  }
                  else if(sec.equals("2")){
                      software.showInfo();
                  }
                  else if(sec.equals("1")){
                      System.out.println("Hangi işletim sistemi?");
                      String operating_system=input.nextLine();
                      software.FormatAt(operating_system);
                  }
                  
              }
                
            }
           //İkinci else if
             else if(islem.equals("2"))
            {
              Manager manager=new Manager("A","manager",50000,578,15);
              String yonetici_islemleri="1-Zam bilgileri\n"+
                                       "2-Bilgileri Göster \n"+
                                       "3-Çıkış için q ya basın" ;
               
              while(true)
              {
                System.out.println("***********************");
                System.out.println(yonetici_islemleri);
                System.out.println("***********************");
                  System.out.println("İşlem seçiniz");
                  String sec=input.nextLine();
                  if(sec.equals("q")){
                      System.out.println("Çıkış yaptınız");
                      break;
                  }
                  else if(sec.equals("2")){
                      manager.showInfo();
                  }
                  else if(sec.equals("1")){
                      System.out.println("Ne kadar zam yapsın ?");
                      int zam=input.nextInt();
                     manager.zam_Yap(zam);
                  }
                  
              }
            }
             else{
                 System.out.println("===Geçersiz İşlem===");
             }
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
    }
    
}
