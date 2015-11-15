/*字符型类型（char）(0-65535)*/
public class CharDemo 
{
	public static void main(String[] args) 
	{
		//char的常量表示
		sop('A');	
		sop((char)65);
		//使用16进制打印97a
			char aa='\u0061';
		sop(aa);
		//char的变量表示
	
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
