public class TypeConverDemo 
{
	public static void main(String[] args) 
	{
		//自动类型转换
		byte  b=17;
		short s=b;
		sop(s);
		double d1=123+1.1F+99L+3.14;
		sop(d1);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
