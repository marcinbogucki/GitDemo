public class TableOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num="Number : ";
		String square= "   Square : ";
		int number=1;
		
		TableOfSquares table=new TableOfSquares();
		table.loopFor(num,square, number);
		table.loopWhile(num,square, number);
		table.doWhileLoop(num,square, number);
	}
	
	public void loopFor(String num,String square,int number)
	{
		System.out.println("-----Using for Loop--------");
		for (int i=1;i<=5;i++)
		{
			System.out.println(num+i+square+Math.pow(i, 2));
			
		}
	}

	public void loopWhile(String num,String square,int number)
	{
		int i=1;
		System.out.println("-----Using While loop-----");
		while (i<=5)
		{
			System.out.println(num+i+square+Math.pow(i, 2));
			i++;
		}
			
	}
	public void doWhileLoop(String num,String square,int number)
	{
		int i=1;
		System.out.println("-----Using do..while loop---");
		do
		{
			System.out.println(num+i+square+Math.pow(i, 2));
			i++;
		}while (i<=5);
	}
	
}
