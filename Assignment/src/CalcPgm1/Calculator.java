package CalcPgm1;

public class Calculator {
	

	Calculator()
	{
		System.out.println("This is default constructor");
	}
	
	public int add(int num1, int num2)
	{
		int result;
		result= num1+num2;
		return result;				
				
		//System.out.println(num1+num2);
	}
	
  public void add (String a, String b)
  {

	System.out.println(a+' '+b);
  }

  public void divide(float a, float b)
  {
	  System.out.println(a/b);
  }


	
}
