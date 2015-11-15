//引入变量
public class VarDemo
{
	//需求:接到客户的一个需求，求两个操作数6和3的和 差 积 商.
	public static void main(String []args)
	{
		int a=6,b=-3;
		double c=cf(a,b);
		sop(c);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public static  int cj(int a,int b)
	{
		return a*b;
	}
	public static double cf(int a,int b)
	{
		if(b==0)return 0;
		else
		return (a*1.0)/b;
	}
}
