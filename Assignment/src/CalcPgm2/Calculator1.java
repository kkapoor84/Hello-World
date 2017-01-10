package CalcPgm2;

public class Calculator1 {
    
    private int num1;
    private int num2;
    
    
    public Calculator1(int a, int b){
        num1=a;
        num2=b;
    }
    
    public int add()
    {
        
        int result;
        result= num1+num2;
        return result;
        //System.out.println(result);//==System.out.println(cal.add())
    }
    public float devide()
    {
        
        int result;
        result= num1/num2;
        return result;
    }
}

