package menudriven;

import java.util.Scanner;
import java.util.Stack;

public class Expression extends Calculator {
	
	public int  evaluate() 
     { 
		String expression;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the expression");
        expression=input.next();
        char[] tokens = expression.toCharArray(); 
        
        Stack<Integer> values = new Stack<Integer>(); // Stack for numbers: 'values' 

        Stack<Character> ops = new Stack<Character>(); // Stack for Operators: 'ops'

        for (int i = 0; i < tokens.length; i++) 

        { 
        	// Current token is a whitespace, skip it 
           if (tokens[i] == ' ') 
        	   continue; 
            // Current token is a number, push it to stack for numbers 
           if (tokens[i] >= '0' && tokens[i] <= '9') 
               { 
                    StringBuffer stringbuf = new StringBuffer(); 

                // There may be more than one digits in number 

                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') 

                    stringbuf.append(tokens[i++]); 

                values.push(Integer.parseInt(stringbuf.toString())); 

            } 

            // Current token is an opening brace, push it to 'ops' 
            else if (tokens[i] == '(') 

                ops.push(tokens[i]); 

              // Closing brace encountered, solve entire brace 

            else if (tokens[i] == ')') 

            { 

                while (ops.peek() != '(') 

                  values.push(applyOp(ops.pop(), values.pop(), values.pop())); 

                ops.pop(); 

            } 

            
            else if (tokens[i] == '+' || tokens[i] == '-' ||    //check for he operator

                     tokens[i] == '*' || tokens[i] == '/') 

            { 

                
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) 

                  values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
                
                ops.push(tokens[i]); // Push current token to 'ops'. 

            } 

        } 

        while (!ops.empty()) 

            values.push(applyOp(ops.pop(), values.pop(), values.pop())); 

        // Top of 'values' contains result, return it 

        return values.pop();

    } 

    public static boolean hasPrecedence(char op1, char op2) 

    { 

        if (op2 == '(' || op2 == ')') 

            return false; 

        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 

            return false; 

        else

            return true; 

    } 

     public static int applyOp(char op, int b, int a) 

    { 
        switch (op) 
    { 
        case '+': 
        	return a + b; 
        case '-': 
            return a - b;
        case '*': 
            return a * b; 
        case '/':
        	if (b == 0) 
        		throw new

                UnsupportedOperationException("Cannot divide by zero"); 

            return a / b; 

        } 

        return 0; 
            

    }
     
	}
	


	


