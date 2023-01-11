import java.util.Scanner;
class To
	{
		public static void main(String args[])
			{
				int marks;
				System.out.println("enter the value");
				Scanner r=new Scanner (System.in);
				marks=r.nextInt();
				if(marks>=80)
					{
						System.out.println("Topper");
					}
					else if(marks<=80 && marks>=60)
					{	
						System.out.println("first");
					else
					{
						System.out.println("fail");
					}
					
			}
}

				