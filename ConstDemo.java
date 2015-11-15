//知识点:常量/字面量
public class ConstDemo
{
	private static final int a=12;
	public static void main(String []args)
	{
		sop("a="+a);
		int i=123;
		sop("i="+i);
		sop(123);
		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}