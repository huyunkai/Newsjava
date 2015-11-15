//最常用引用类型:String类
public class StringDemo 
{
	public static void main(String[] args) 
	{
		//表示名字:胡云凯NB
		String username="胡云凯NB";//字符串用双引号印出来.
		sop("名字:"+username);
		int age=23;
		sop("年龄="+age);
		//转义符号练习：输出"你好师姐";
		sop("\"你好师姐\"");
		sop(1+2+"hello");
		sop("hello"+1+2);
		sop(1+"hello"+2);
		int x='A';
		sop(x);
	}
	public static void sop(Object obj)
	{ 
		System.out.println(obj);
	}
}
