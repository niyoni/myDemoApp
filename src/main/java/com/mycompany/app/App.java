package com.mycompany.app;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public static boolean numberOfOccurences(ArrayList<Integer> arr,ArrayList<Integer> arr2, int key,int no) {

	    if (arr == null || arr2 ==null) return false;
	
	    int counter = 0 ;
		for(int val : arr)
			if(val == key)
				counter++;

		for(int val2 : arr2)
			if(val2 == key)
				counter++;	

        return no == counter ;			
	}
	
	
}
