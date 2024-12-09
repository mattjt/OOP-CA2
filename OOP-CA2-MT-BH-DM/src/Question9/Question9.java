package org.example.Question9;
import java.util.Stack;
import java.util.Scanner;
/**
 *  Name:Matthew Tomkins
 *  Class Group:Sd2b
 */
public class Question9 {

    /*
        Reads in an equation from the user
     */
    public static void main(String[] args) {
        String equation;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter equation");
        equation = in.nextLine().trim();
        System.out.println("Result: "+calculator(equation));

    }

    public static String calculator(String equation) {
        String result="";
        Stack<Integer> number = new Stack<>();
        Stack<String> operator = new Stack<>();
        boolean done =false;
        String numbers ="0123456789";
        int count=0;
        while(count<equation.length()){
            String input = equation.substring(count,count+1);


            if(equation.charAt(count)==' '){
                count++;
            }
            else if(numbers.contains(input)){
                number.push(Integer.parseInt(input));
                count++;
            }
            else if(equation.charAt(count)=='+'){

                count++;
            }
            else if(equation.charAt(count)=='-'){
                count++;
            }
            else if(equation.charAt(count)=='*' ){
                count++;
            }
            else if(equation.charAt(count)=='/'){
                count++;
            }
            else {

            }


        }
        return result;
    }
}
