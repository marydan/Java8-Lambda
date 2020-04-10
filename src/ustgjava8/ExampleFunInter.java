package ustgjava8;


@FunctionalInterface
interface InterFunction
{
	//boolean checkage(int age);
	
	int sqrt(int a);
	
	default void println()
	{
		System.out.println("Welcome to all");
	}
//	void println();

}

public class ExampleFunInter
{

	public static void main(String args[])
	{
//		InterFunction ivalid=new InterFunction() {
//				public boolean checkage(int a)
//				{
//					if(a>18)
//						return true;
//					else
//						return false;
//				}
//		};
		
	//	InterFunction ivalid1=(int x)-> {return (x*x); };
		
		InterFunction ivalid2=(x)->(x*x);
								
					
	System.out.println(ivalid2.sqrt(6));
		
	}
	
	
	
}
