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
        String operators ="+-*/";
        int count=0;
        while(count<equation.length()){
            String input = equation.substring(count,count+1);


            if(equation.charAt(count)==' '){// - space
                //System.out.println("char: "+input);
                count++;
            }
            else if(numbers.contains(input)){// -  num
                number.push(Integer.parseInt(input));//push to num stack
                //System.out.println("char: "+input);
                count++;
            }
            else if(equation.charAt(count)=='('){// - open bracket
                //System.out.println("char: "+input);
                operator.push(equation.substring(count,count+1));//push open bracket to op stack
                count++;
            }
            else if(operators.contains(input)){// - operator
                //System.out.println("char: "+input);
                //while(//the top of the stack has higher precedence){
                    //evaluate the top
                //}
                operator.push(equation.substring(count,count+1));//push op to op stack
                count++;
            }
            else if(equation.charAt(count)==')'){// - close bracket
                //System.out.println("char: "+input);
                while(!operator.equals("(")){
                    //evaluate the top
                }
                operator.pop();
                count++;
            }
            else {
                while(!operator.isEmpty()){
                    //evaluate the top
                }

                count++;
            }


        }
        return result;
    }
}
