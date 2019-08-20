import java.util.*;
public class MaxProductSubArray {
	
	static int HighestNumInArray(int [] inp_array)
	{
		int max=0;
		for(int i=0;i<5;i++)
			if(inp_array[i]>max)
			{
				max=inp_array[i];
				System.out.println("max number from array: " + max);
				return max;
			}
	}
	static int [] StackToIntBuff (Stack<Integer> int_stack)
	{ 
		int [] inp_array = int_stack.toArray();
		return int_stack;
	}
	static Stack<Integer> ArrayToStack (int [] inp_array)
	{
		List <Integer> list = Arrays.asList(inp_array);
		Stack <Integer> int_stack= new Stack <Integer>();
		int_stack.addAll(list);	
		return int_stack;
	}
	public static void main(String args [])
	{
			
		int [] inp_array= {6,8,4,3,2};
		int product;
		
		// convert the array to stack
		Stack<Integer> inp_stack = ArrayToStack(inp_array);
		
		// get the maximum number from the full set
		int max1 = HighestNumInArray(inp_array);
		
		// remove the max element from the stack
		int ind = inp_stack.lastIndexOf(max1);
		// inp_stack = inp_stack.remove(inp_stack.lastIndexOf(max1));
		// inp_stack = inp_stack.remove(ind);
		System.out.println("current stack 1 " + inp_stack);
		
		// convert the new stack to array
		int [] inp_new_array = StackToArray(inp_stack);
		
		// get the maximum number from the new array
		int max2 = HighestNumInArray(inp_new_array);
	
		// get the max product 
		product = max1*max2;
		System.out.println("Max product is:  " + product + " yields from pair : {" + max1 + "," + max2 + "}");
		
	}
}
		