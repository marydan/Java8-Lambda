package ustgjava8;

@FunctionalInterface
interface InterCheck
{
void mytest();
}

public class ExamplefunCase2
{
	void myfun(InterCheck  iobj)
	{
		System.out.println("I am inside main method");
		iobj.mytest();
	}
public static void main(String arg[])
{
	int a, b;
	ExamplefunCase2 exampleobj=new ExamplefunCase2();
	
	// using functional interface as argument 
	
	String name="Mary";

	exampleobj.myfun(()-> {
	   if (name=="Mary")
		   System.out.println("Valid login");
	}
);
	
	
//  Implmenting funcitonal interface / assign and call	
//	InterCheck iobj=()-> {
//	   if (name=="Mary")
//		   System.out.println("Valid login");
//	};
	//	iboj.mytest();

}

	
}
