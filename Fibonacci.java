/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziler;

/**
 *
 * @author iremu
 */
public class Fibonacci
{
    public static void main(String[]args)
    {
        int fib[]=new int[10];
        fib[0]=1;
        fib[1]=1;
        int i;
        for(i=0;i<8;i++)//8 dedik çünkü ilk iki elemanı tanımladık zaten eğer 10 dersek dizinin boyutunu 12 yapmalıyız.
        {
            fib[i+2]=fib[i+1]+fib[i];//i+2 yazdık,eğer i yazarsak i-1 ile i-2 oluyor bu da -1. eleman ve -2.eleman demek yine eğer böyle yazaksak i yi 2 den başlatmalıyız.
            
        }
        for(i=0;i<10;i++)//Bütün elemanları gezeceğimiz için
                {
                    System.out.println(fib[i]);
                }
       
        
        
        
    }
    
}
