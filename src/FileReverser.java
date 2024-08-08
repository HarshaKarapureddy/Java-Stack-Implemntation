/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */

import java.util.Scanner;
import java.io.*; 

public class FileReverser{
    public static void main (String [] args)throws IOException{
        
        Stack myStack = new Stack();
        File input1 = new File("READDOCS.txt");
        PrintWriter outputFile1 = new PrintWriter("WRITEDOC.txt");
        String Basket;
        
        if(!input1.exists()){
            System.out.println("File Does not exist");    
        }
        else{
            int it =0;
            Scanner read1 = new Scanner(input1);
            
            

            while(read1.hasNextLine()){
                Basket = read1.nextLine();
                
                boolean HasALine = read1.hasNextLine();
                
                if(HasALine){
                    Basket += "\n";
                }
                for(int i = 0; i<Basket.length();i++){
                char single = Basket.charAt(i);
                String pusher1 = Character.toString(single);
                myStack.push(pusher1);
            }
           }
          while(!myStack.isEmpty()){
                String temp = myStack.pop();
                outputFile1.print(temp);
          
        }
outputFile1.close();
          read1.close();
    }

}
}