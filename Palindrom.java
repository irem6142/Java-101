
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
public class Palindrom 
{
    public static boolean isPalindrom(String s)
    {
        //Burada da kontrol ettik aynısı mı diye
        String s1=TersCevir(s);
        if(s1.equals(s)==true)
            return true;
        else
            return false;
    }
     public static String TersCevir(String s)
     {
         //Bu metotlarla ters çevirme işlemi yaptık
         StringBuilder str=new StringBuilder(s);
         return str.reverse().toString();
     }
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.println("Cümle ya da metin girebilirsiniz :");
        String s=input.nextLine();
        if(isPalindrom(s))
        {
            System.out.println("Palindrom");
        }
        else
            System.out.println("Palindrom değil");
        
        
        
      }
      
    
}
