package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Stack<Integer> s;
        Stack<Character> t = new ArrayStack<Character>();

            t.push('+');
            t.push('-');
            t.push('*');
            t.push('/');

        int x = 1;
        int y = 1;
        int choice = 0;
        Scanner kboard = new Scanner(System.in);
        while (y == 1){

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
                        for(int a = 0; a<3;a++){

                            if(t.getLoc(a) == input.charAt(0) ){
                                System.out.println("Mathematical Expression Detected Proceeding with operation");
                                System.out.println("Top of stack contains "+s.top());
                                Integer num1 = s.top();
                                Integer num2 = s.getLoc(1);
                                System.out.println(num1 + " + " + num2);

                                System.out.println(num1 + input.charAt(0) + num2 +" = ");
                                break;

                            }
                        }
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
                    }catch(NumberFormatException e){
                        System.out.println("Did not detect integer, assuming mathematical operator");
                        for(int a = 0; a<3;a++){

                            if(t.getLoc(a) == input.charAt(0) ){
                                System.out.println("Mathematical Expression Detected Proceeding with operation");
                                System.out.println("Top of stack contains "+s.top());
                                Integer num1 = s.top();
                                Integer num2 = s.getLoc(1);
                                System.out.println(num1 + input + num2);



                                break;
                            }
                        }
                    }
                }
            }else{

                System.out.println("Please try picking a stack again, you messed up!");
            }
        }


    }
}
