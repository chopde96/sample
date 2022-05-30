import java.util.*;

class Stack{
	int n=5;
	int top=-1;
	int a[]=new int[n];
	
	
	void push(int data){
	if(top==(n-1)){
	System.out.print("overflow condition");}
		else
		
		//System.out.print("enter array elements");
		
		//int i=sc.nextInt();
		top=top+1;
		a[top]=data;
		System.out.print(data+" is item inserted");
	}
	void pop(){
	if(top==-1)
	System.out.print("underflow condition");
	else
	top=top-1;
	System.out.print("item deleted");
	
	
	}
	void display(){
		System.out.println("array elements are:");
	for(int j=top;j>=0;j--)
	System.out.println(" "+a[j]);
	}
	
}
class Stackarray{
	public static void main(String args[]){
	Stack s1=new Stack();
	Scanner sc =new Scanner(System.in);
	s1.push(sc.nextInt());
	s1.push(sc.nextInt());
	s1.push(sc.nextInt());
	s1.push(sc.nextInt());
	s1.display();
	
	}
}