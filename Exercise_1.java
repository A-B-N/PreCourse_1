class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
    	return(top<0);
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top>=MAX-1)
    	{
    		System.out.println("stack OverFlow");
    		return false;
    	}
    	else
    	{
    		a[++top]=x;
    		System.out.println(x +"pushed into the stack");
    		return true;
    	}
    		
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top<0)
    	{
    		System.out.println("stack underflow");
    		return 0;
    	}
    	else 
    	{
    		int b = a[top--];
    		return b;
    	}
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(top<0)
    	{
    		System.out.println("stack underflow");
    		return 0;
    	}
    	else
    	{
    		int b =a[top];
    		return b;
    	}
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
