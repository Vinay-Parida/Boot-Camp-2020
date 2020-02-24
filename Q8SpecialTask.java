package com.company;

class SpecailTask {
    Integer stack[] = new Integer[100];
    int MAX_SIZE = stack.length - 1;
    int top = -1;
    int min = 99999;

    void push(Integer value) {
        if (top == MAX_SIZE) {
            System.out.println("Stack is full");
        } else {
            top += 1;
            if(value< min)
                min = value;
            stack[top] = value;
            System.out.println("Value: " + value + " added at " + top);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is already empty");
        } else {
            System.out.println(stack[top] + " poped");
            if(stack[top] == min){
                for (int i = 0; i < top; i++) {
                    if (stack[i] < min)
                        min = stack[i];
                }
            }

            stack[top] = null;
            top -= 1;
        }
    }

    void getMin() {
        System.out.println(min + " is minimum");
    }

}

public class Q8SpecialTask {
    public static void main(String[] args) {
        SpecailTask specailTask = new SpecailTask();

        specailTask.push(12);
        specailTask.push(11);
        specailTask.push(28);
        specailTask.push(9);
        specailTask.push(2);
        specailTask.pop();
        specailTask.getMin();
        specailTask.push(2);
        specailTask.push(2);
        specailTask.getMin();
        specailTask.pop();


    }
}
