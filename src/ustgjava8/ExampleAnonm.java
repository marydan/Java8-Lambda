package ustgjava8;


interface Intervalidate
{
	abstract void checkEven(int a);
	abstract void checkPositiveNumber(int n);
	
	
}

public class ExampleAnonm {
	
	
	public static void main(String args[])
	{
		Intervalidate ivalidate=new Intervalidate()
				{
			
			public void checkPositiveNumber(int num2)
			{
				if(num2<0)
					System.out.println("its negative");
				else
					System.out.println("its positive");
					
			}
			
			public void checkEven(int num1)
			{
				disp();
				if(num1%2==0)
					System.out.println("even");
				else
					System.out.println("odd");
			}
		
			public void disp()
			{
				System.out.println("just to test");
			}
				};
				
		ivalidate.checkEven(14);
		ivalidate.checkPositiveNumber(-90);

		//ivalidate.disp();		
				
				
				
				
	}

}
