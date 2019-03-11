/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasteinaviagem;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class GasteiNaViagem 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double value = 0;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Input the expense quantity desired:");
        Expenses expense = new Expenses();
        value = input.nextDouble();
        expense.calculateTotalExpense(value);
    }
    
}
