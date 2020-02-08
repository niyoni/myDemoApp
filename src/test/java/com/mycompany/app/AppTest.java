package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
	
	public void testCorr1() {
      ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 2, 4,11,12,13));
      ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5, 7, 8, 2,88));
      assertTrue(new App().numberOfOccurences(arr1,arr2,2,3));
    }

	public void testCorr2() {
      ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(5, 5, 5, 4));
      ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5, 7, 8, 2));
      assertTrue(new App().numberOfOccurences(arr1,arr2,5,4));
    }
    public void testNotCorr1() {
      ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(5, 5, 5, 4));
      ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5, 7, 8, 2));
      assertFalse(new App().numberOfOccurences(arr1,arr2,7,2));
    }
	
	public void testNotCorr2() {
      ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5,6));
      ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(9,10));
      assertFalse(new App().numberOfOccurences(arr1,arr2,11,2));
    }

    public void testEmptyArr() {
      ArrayList<Integer> arr1 = new ArrayList<>();
      ArrayList<Integer> arr2 = new ArrayList<>();
      assertTrue(new App().numberOfOccurences(arr1,arr2,3 ,0));
    }

    public void testNullFirst() {
      ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5, 7, 8, 2));
      assertFalse(new App().numberOfOccurences(null,arr2,5, 1));
    }
	
	public void testNullSecond() {
      ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(5, 7, 8, 2));
	  assertFalse(new App().numberOfOccurences(arr1,null, 1,3));
    }


}
