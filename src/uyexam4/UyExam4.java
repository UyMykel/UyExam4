/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uyexam4;

import static java.util.Collections.list;
import java.util.Scanner;
import java.util.StringJoiner;


public class UyExam4 {


   
    
    
    private class StackNode {
        string data;
        
        int quantity;
        StackNode next;
        
    }
    
    private StackNode top;
    private int size;
    
    private StackNode createNewNode (string productName,int quantity) throws Exception {
        StackNode node = new StackNode();
        if (node == null) {
            throw new Exception ("Memory is full");
        } else {
            node.data = productName;
            node.quantity = quantity;
            node.next = null;
            return node;
        }
    }
    
    public void addProduct(string productName,int quantity) throws Exception {
        StackNode node = createNewNode (productName, quantity);
        if (size == 0){
            top = node;
        } else {
            node.next = top;
            top = node;
        }
        size++;
    }
    
    public string sellProduct() throws Exception {
        
        if (size == 0) {
            throw new Exception("Stack is empty");
            
        }
        string temp = peek();
        top = top.next;
        size--;
        return temp;
    }
    
    public string peek() throws Exception {
        if (size == 0){
            throw new Exception ("Stack is empty");
        }
        return top.data;
    }
    
    public void display () throws Exception{
            if (size == 0) {
                throw new Exception ("Stack is empty");
            }
            StackNode temporary = top;
            
            while (temporary != null){
                System.out.println(temporary.data +" ->");
                temporary = temporary.next;
            }
            System.out.println("NULL");
        }
   
            
    public static void main(String[] args)throws Exception {
        Scanner scn = new Scanner(System.in);
        UyExam4 Stack = new UyExam4 ();
        
        while (true){
            System.out.println("YAMANIYA STORE");
            System.out.println("1. Add Product");
            System.out.println("2. Sell Product");
            System.out.println("3. Display Product");
            System.out.println("4. Exit");
          
            int element;
            int choice = scn.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Add Product");
                    string.item = scn.nextInt();
                    System.out.println("Add Quantity");
                    int quantity = scn.nextInt();
                    break;
                    
                case 2:
                    System.out.println("Sell Product");
                    System.out.println("\n");
                    
                case 3:
                    Stack.display();
                    System.out.println("\n");
                    break;
                    
                case 4:
                   scn.close();
                   System.exit(0);
                   break;
                   
                default :
                    System.out.println("Invalid Choice");
            }
        }
    }  
}
