package ustgjava8;


abstract class Validate
{
	abstract void checkLenght(String a);
	
	void printall()
	{
		System.out.println("Welcome all for new concepts");
	}
	
}

 
public class ExampleAbstract {
	public static void main(String ar[])
	{
		Validate valobj=new Validate()
				{
			      void checkLenght(String name)
			      {
			    	  if(name.length()<6)
			    		  System.out.println("Invalid");
			    	  else
			    		  System.out.println("Valid");
			      }
			      void printall()
			      {
			    	  System.out.println("Anonym Example ....");
			      }
			
				};
				
		valobj.checkLenght("Mary");
		valobj.printall();
	}

}
