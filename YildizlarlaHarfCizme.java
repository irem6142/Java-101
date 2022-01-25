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
public class YildizlarlaHarfCizme 
{
     public static void main(String[] args)
    {
        
        String letter[][]=new String[7][5];
        for(int i=0;i<letter.length;i++)
        {
            for(int j=0;j<letter[i].length;j++)
            { 
                if(i==0 || i==6 || i==3 )
                //System.out.print("*");
                    letter[i][j]="*";
                else if(j==0 || j==4)
                        //7System.out.print("*");
                    letter[i][j]="*";
                else
                   // System.out.print(" ");
                    letter[i][j]=" ";
            }
          //  System.out.print("\n");
        }
        for(String[]row:letter)
        {
            for(String col:row)

            {
                System.out.print(col);
            }
        System.out.println();
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
     
     
    }
    
    
    
    
    
    
    
    

