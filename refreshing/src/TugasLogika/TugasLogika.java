/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasLogika;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TugasLogika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a, b;
        
        System.out.print("Input bilangan a = ");
        a = input.nextInt();
        
        System.out.print("Input bilangan b = ");
        b = input.nextInt();
        
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
    

    }
    

