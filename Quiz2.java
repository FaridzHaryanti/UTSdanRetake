/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pbo;
import java.util.Scanner;
public class Quiz2 {
    public static void main(String []args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the prhase: ");
        String value = myObj.nextLine();
        System.out.println("\nOutput :" +value);
        myObj.close();
    }
    
}
