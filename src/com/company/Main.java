package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Stack<Integer> s;

        int x = 1;
        int y = 1;
        int choice = 0;
        Scanner kboard = new Scanner(System.in);
        while (y == 1){ //Pre-loop for choosing stack type

            System.out.println("Please select which type of stack you would like to use");
            System.out.println("1. Array Stack");
            System.out.println("2. Linked Stack");
            choice = kboard.nextInt();

            if(choice == 1){
                y = 0;
                s = new ArrayStack<>();
                String input;
                while (x == 1){
                    System.out.println("Please either input a number or an operation");
                    input = kboard.next();

                    try{
                        choice = Integer.parseInt(input);
                        System.out.println("Detected Integer");
                        s.push(choice);
                        System.out.println("Top of stack contains "+s.top());
                    }catch(NumberFormatException e){
                        System.out.println("Did not detect integer, assuming mathematical operator");
                        int a = 0;
                        int b = 0;
                        a = s.top();
                        s.pop();
                        b= s.top();
                        s.pop();
                       switch(input.charAt(0)){
                           case '*':
                               s.push(a * b);
                               System.out.println(a + " * " + b);
                               break;
                           case '+':
                               s.push(a + b);
                               System.out.println(a + " + " + b);
                               break;
                           case '-':
                               s.push(a - b);
                               System.out.println(a + " - " + b);
                               break;
                           case '/':
                               s.push(a / b);
                               System.out.println(a + " / " + b);
                               break;
                       }
                        System.out.println("Answer: "+s.top());

                    }

                }
            }else if (choice == 2){
                y = 0;
                s = new LinkedStack<>();
                String input;
                while (x == 1){
                    System.out.println("Please either input a number or an operation");
                    input = kboard.next();
                    try{
                        choice = Integer.parseInt(input);
                        System.out.println("Detected Integer");
                        s.push(choice);
                        System.out.println("Top of stack contains " + s.top());;
                        System.out.println(s.toString());
                    }catch(NumberFormatException e){
                        System.out.println("Did not detect integer, assuming mathematical operator");
                        int a = 0;
                        int b = 0;
                        a = s.top();
                        s.pop();
                        b= s.top();
                        s.pop();
                        switch(input.charAt(0)){
                            case '*':
                                s.push(a * b);
                                System.out.println("Answer: " + s.top());
                                break;
                            case '+':
                                s.push(a + b);
                                System.out.println("Answer: " + s.top());
                                break;
                            case '-':
                                s.push(a - b);
                                System.out.println("Answer: " + s.top());
                                break;
                            case '/':
                                s.push(a / b);
                                System.out.println("Answer: " + s.top());
                                break;
                        }

                    }
                }
            }else{

                System.out.println("Please try picking a stack again, you messed up!");
            }
        }


    }
}
