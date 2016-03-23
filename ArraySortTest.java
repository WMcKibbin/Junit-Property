
public static int[][] arr;
public static int[][] beforeArr;
public static int[] legnths;
public static final int MAX_SIZE = 300;
public static final int NUM_ARR = 100;
@BeforeClass
public static void beforeAllSetUp(){
{
  Random rand = new Random();
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
public static void arraysSortedTest()
{
  int temp;
  boolean incorrect = false
  min = Integer.MIN_VALUE;
  for(int i = 0; i < NUM_ARR; i++)
  {
    min = arr[i][0]
    for (int j = 0; j < arr[i].length; j++)
    {
      if(min < arr[i][j])
      {
        min = arr[i][j];
        incorrect = true;
      }
    }
  }
  assertFalse(incorrect);
}

@Test
public static void arraysLengthTest
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
public static void arraysElementsTest
{
  boolean[][] checkBefore;
  boolean[][] checkAfter;
  for(int i = 0; i < NUM_ARR; i++)
  {
    checkBefore[i] = new boolean[beforeArr[i].length];
    checkAfter[i] = new boolean[arr[i].length];
    Arrays.fill(beforeCheck[i], false);
    Arrays.fill(afterCheck[i], false);
    for(int j = 0; j < arr[i].length; j++)
    {
      
    }
  }
}
