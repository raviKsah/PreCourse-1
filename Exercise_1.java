class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1)
        return true;

        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here

        top++;
        if(top<(MAX))
        {
            
            a[top]=x;
            return true;
        }
        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;

        }
        int poppedElement=a[top];
        top--;
        return poppedElement;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty())
        {
            return 0;

        }
        return a[top];
    } 
     
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
