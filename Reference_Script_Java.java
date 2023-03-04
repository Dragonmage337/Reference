/*This is a comment*/

/*
 * Now a statement is any line of code
 * it can be a comment, or a variable
 * as long as it tells the computer something
 * 
 */
//Now this is a function, or a method in java terms
 public class Reference_Script_Java
 {
    //This means it is an unchanging method, that does not output or recieve data
    public static void main(String []args) 
    {
        //THis is a variable that tells the computer that integer (a number) x is equal to 5
        int x = 5;
        //This is a loop that says while x is greater or equal to 5, print "x is equal to 5" 
        while (x >= 5) 
        {
            //This tells the system to output a line that says x is more than 5.
            System.out.println("x is more than 5");
            //This says that i is equal to i + 1.
            x++;
        }
        // This is a for loop, which means instead of while, which loops as long as a variable is something, it will loop for as long as it is told
        for (int l = 5; l < 5; l++ )
        {
            System.out.println("I is still less than 5.");
        }

        
        //yet another for loop, just with different conditions
        for (int p = 10; p < 10; p++)
        {
            System.out.println("f is false");
        }
        //Its a sorting algorithm that uses all of these structures
        public static void insertionSortImperativeA(int[] input) 
	{
		
		for (int i = 1; i < input.length; i++) 
		{
			//Sets the variables to be sorted
			int key = input[i]; 
			//j is equal to the variable given minus one
			int j = i - 1;
			//This is what does the actual sorting, if j is greater or equal to zero and input j is greater than key
			while (j >= 0 && input[j] > key) 
			{
				//get a new variable + 1 and then that is equal to new input
				input[j + 1] = input[j];
				j = j - 1;
			}
			input[j + 1] = key; 
		}
	//Creates a new method to shift an input to the right	
	public static int[] ShiftRight(int[] arrayE)
	{
		//Sets integer l to the array length
		int l = arrayE.length;
		// 
		int last = arrayE[l-1];
		for(int i = 1; i <=l-1; i++)
		{
			for (int j =0; j <= l-2,i++)
			{
				arrayE[i] = arrayE[j];
			}
	}
    }
 }
