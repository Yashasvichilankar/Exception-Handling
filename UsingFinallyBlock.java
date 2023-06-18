
public class UsingFinallyBlock
	{
	public static void main(String[] args)
	  {
	    int a[] = new int[2];
	    try
	    {
	      System.out.println("Access invalid element"+ a[3]);
	      /* the above statement will throw ArrayIndexOutOfBoundException */
	    }
	    catch(ArrayIndexOutOfBoundsException e) {
	      System.out.println("Exception"+e);
	    }
	    finally
	    {
	      System.out.println("finally is always executed ,exception is handled or not.");
	    }
	  }
}
