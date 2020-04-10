package ustgjava8;

@FunctionalInterface
interface InterPerson
{
	 int add(int a,int b);
	
	default void myprintln()
	{
		System.out.println("Just to Check");
	}

 default void checkval(int a)
 { 
	  if(a>5)
		  System.out.println("Good");
	 
 }
}

public class ExampleFun1 {

	public static void main(String ar[])
	{
		InterPerson iobj2=new InterPerson()
				{
			public  int add(int a,int b)
			 {
				 return a+b;
			 }
				public	void myprintln()
					{
						System.out.println("In main method");
					}
				};
				
		System.out.println(iobj2.add(23, 44));
//		iobj2.myprintln();
		
		InterPerson iobj=(x,y)->x+y;
		
		InterPerson iobj1=(int x,int y)->x+y;
		
		System.out.println(iobj.add(10, 20));
	//	iobj.myprintln();
	}
}
