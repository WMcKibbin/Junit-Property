import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;



public class ArraySortTest
{

	public static int[][] arr;
	public static int[][] beforeArr;
	public static int[] lengths;
	public static final int MAX_SIZE = 300;
	public static final int NUM_ARR = 100;

  @BeforeClass
  public static void beforeAllSetUp()
  {
    Random rand = new Random();
		arr = new int[NUM_ARR][];
		beforeArr = new int[NUM_ARR][];
		lengths = new int[NUM_ARR];
    for(int i = 0; i < NUM_ARR; i++)
    {
      arr[i] = new int[rand.nextInt(MAX_SIZE)];
      beforeArr[i] = new int[arr[i].length];
      lengths[i] = arr[i].length;
      for (int j = 0; j < arr[i].length; j++)
      {
          arr[i][j] = rand.nextInt();
          beforeArr[i][j] = arr[i][j];
      }
      Arrays.sort(arr[i]);
    }

  }
  @Test
  public void arraysSortedTest()
  {
    boolean incorrect = false;
    int min = 0;
    for(int i = 0; i < NUM_ARR; i++)
    {
      min = arr[i][0];
      for (int j = 0; j < arr[i].length; j++)
      {
        if(arr[i][j] <  min)
        {
          min = arr[i][j];
          incorrect = true;
        }
      }
    }
    assertFalse(incorrect);
  }

  @Test
  public void arraysLengthTest()
  {
    boolean incorrect = false;
    for(int i = 0; i < NUM_ARR; i++)
    {
      if(lengths[i] != arr[i].length)
      {
        incorrect = true;
      }
    }
    assertFalse(incorrect);
  }
  @Test
  public void arraysElementsTest()
  {
    boolean[][] beforeCheck = new boolean[NUM_ARR][];
    boolean[][] afterCheck = new boolean[NUM_ARR][];
    boolean incorrect = false;
    for(int i = 0; i < NUM_ARR; i++)
    {
      //init boolean check arrays
      beforeCheck[i] = new boolean[beforeArr[i].length];
      afterCheck[i] = new boolean[arr[i].length];
      Arrays.fill(beforeCheck[i], false);
      Arrays.fill(afterCheck[i], false);
      for(int j = 0; j < beforeArr[i].length; j++)
      {
          for(int k = 0; k < arr[i].length; k++)
          {
            if((arr[i][k] == beforeArr[i][j])&&(afterCheck[i][k] != true))
            {
              beforeCheck[i][j] = true;
              afterCheck[i][k] = true;
              break;
            }
          }
      }

      for(int j = 0; j < beforeCheck[i].length; j++)
      {
        if(!beforeCheck[i][j] || !afterCheck[i][j])
        {
          incorrect = true;
					break;
        }
      }
    }
    assertFalse(incorrect);
  }
}
