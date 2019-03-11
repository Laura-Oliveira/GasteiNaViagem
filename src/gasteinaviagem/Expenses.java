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
public class Expenses 
{
    double price;
    String description, category, nameExpense;

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getCategory() 
    {
        return category;
    }

    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getNameExpense() 
    {
        return nameExpense;
    }

    public void setNameExpense(String nameExpense) 
    {
        this.nameExpense = nameExpense;
    }
    
    public double calculateTotalExpense(double quantityExpenses)
    {
        double amount = 0.0, value = 0.0;
        int counter = 0;
        Scanner inputExpenses = new Scanner(System.in);
        
        System.out.println("Input the values of your expenses:");
        for(counter = 0; counter < quantityExpenses; counter++)
        {
            value = inputExpenses.nextDouble();
            amount += value;
        }
        
        System.out.println("Total of expenses: "+ amount);
        return amount; 
    }
    
}
