package com.abhnin.dsalgojavall.algorithms.recursion;

import java.util.Stack;

public class RecursiveAlgorithms {
    public static long factorial(long num){
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }
    public static long mul(long a, long b){
        if (b == 0)return 0;
        return a + mul(a, b-1);
    }
    public static int countDigits(long num){
        if ( (num / 10) == 0) return 1;
        return 1 + countDigits(num/10);
    }
    public static long sumOfDigits(long num){
        if ( (num /10)  == 0) return num;
        return (num % 10) + sumOfDigits(num/10);
    }
    public static long fib(int num){
        if (num == 1) return 1;
        else if (num == 0) return 0;
        return fib(num -1) + fib(num -2);
    }
    public static void towerOfHanoi(int numOfStacks){
        Stack<Integer> stack1 = initializeTOH(numOfStacks);
        Stack<Integer> stack2 = new Stack();
        Stack<Integer> stack3 = new Stack();
        int steps = 0;
        System.out.println("Initialized with: " + stack1.size() + " disks");
        while ( stack3.size() != numOfStacks ){
            if ( stack3.isEmpty() || (  (!stack1.isEmpty()) && stack3.peek() > stack1.peek() ) ) {
                if (!stack1.isEmpty() && !stack2.isEmpty() && !stack3.isEmpty()){
                    if (stack2.peek() > stack3.peek()){
                        stack2.push(stack3.pop());
                    }
                    else if (stack2.peek() > stack1.peek()){
                        stack3.push(stack2.pop());
                    }

                }else if (stack2.isEmpty() && stack3.isEmpty()){
                    stack2.push( stack1.pop() );
                }else if (stack3.isEmpty() && (stack2.peek() > stack1.peek())){
                    stack2.push(stack1.pop());
                }else if (stack3.isEmpty() && (stack1.peek() > stack2.peek())){
                    stack3.push(stack1.pop());
                }
                else{
                    stack3.push( stack1.pop() );
                }

            }
            else if( (!stack1.isEmpty()) && (stack3.peek() < stack1.peek()) ) {
                if ((stack2.peek() > stack1.peek()) && (!stack3.isEmpty() && (stack3.peek() < stack1.peek()))){
                    stack1.push(stack3.pop());
                }
                else if ( stack2.isEmpty() || ( stack2.peek() > stack1.peek()) ){
                    stack2.push(stack1.pop());
                }else if (stack2.isEmpty() || ( stack2.peek() > stack3.peek() ) ){
                    if (stack1.peek() > stack2.peek()){
                        stack1.push(stack3.pop());
                    }else{
                        stack2.push(stack3.pop());
                    }

                }else if ( stack3.peek() > stack2.peek() ){
                    stack3.push(stack2.pop());
                }
            }else if (stack1.isEmpty() && (stack3.peek() > stack2.peek())){
                stack3.push(stack2.pop());
            }
            else if (stack1.isEmpty()){
                stack1.push(stack2.pop());
            }else if (!stack1.isEmpty() && (stack1.peek() > stack3.peek()) && (stack3.peek() > stack2.peek())){
                stack3.push(stack2.pop());
            }

            steps++;


        }

        System.out.println(steps);

    }

    private static Stack initializeTOH(int num){
        Stack stack = new Stack();
        for (int i=num; i > 0; i--){
            stack.push(i);
        }

        return stack;
    }
}
