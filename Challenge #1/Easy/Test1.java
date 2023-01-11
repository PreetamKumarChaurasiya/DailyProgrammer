class A
{
	int a; String name;
	A()
	{
		a=11;
		name= "bishnu";
	}
	void Show()
		{
			System.out.println(a+" "+name);
		}
	}
}
class Demo6
{
	public static void main(String[] args)
	{
		A r=new A();
		r.Show();
	}
}
	