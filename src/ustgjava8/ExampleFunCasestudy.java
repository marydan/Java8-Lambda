package ustgjava8;

//passing lambda as function argument

class Book
{
	String bookname;
	int price;
}

@FunctionalInterface
interface InterCheckprice1
{
	String checkPrice(Book book);
}


@FunctionalInterface
interface InterCheckprice
{
	boolean checkPrice(Book book);
}


public class ExampleFunCasestudy {
	
	
	static String bookCheck(Book book,InterCheckprice1 interobj1)
	{
		return interobj1.checkPrice(book);
	}
	
	
	static boolean bookType(Book book,InterCheckprice interobj1)
	{
		return interobj1.checkPrice(book);
	}
	
	public static void main(String arg[])
	{
		Book book=new Book();
		book.bookname="Asp.net";
		book.price=150;
		
		String ans=bookCheck(book,(bk)->{ 
						if(bk.price<160)
							return "Normal";
						else
							return "Costly";
						} );
		
		boolean result=bookType(book,(bk)->bk.price<150);
		
		
		System.out.println("Book name is" + book.bookname );
		System.out.println("Price is" + ans);
		
		
	}

}
