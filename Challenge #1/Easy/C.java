improt java.util.Scanner;
class C
	{
		public static void main(String[] args)
		{
			int n;
			System.out.println("enter the value");
			Scanner r=new Scanner(System.in);
			n=r.nextInt();
			if(n%2==0)
				{ 
					System.out.print("odd");
				}
			else
				{
					System.out.print("even");
				}
		}
}
		
	
	