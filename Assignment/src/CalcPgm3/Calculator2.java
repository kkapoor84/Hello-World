package CalcPgm3;

public class Calculator2 {
    
    private int num1;
    private int num2;
    private String String1;
    private String String2;
    private int check;
    
    
    public Calculator2(int a, int b){
        num1=a;
        num2=b;
        check = 0;
    }
    public Calculator2(String x, String y){
        String1=x;
        String2=y;
        check = 1;
    }
    
    public void add()
    {
    	if (check == 0)
    	{
        int result;
        result= num1+num2;
        System.out.println(result);
    	}
    	else
    	{ 
    		String result;
        result= String1+' '+String2;
        System.out.println(result);
    		
    	}
            }
    

    
    
    public void devide()
    {
        try {
        int result;
        result= num1/num2;
        System.out.println(result);
        
        }
        
        catch (ArithmeticException A)
       {
    	 System.out.println("exception caught but not stop " +A);  
       }
        
          finally{}
    }
    
    
}

