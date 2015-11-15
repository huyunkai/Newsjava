//算术运算符
public class ArithmeticOperatorsDemo 
{
	public static void main(String[] args) 
	{
		/*int a=2,b,c;
		b=a++;//结果 a=3 b=2 ++后缀时.
		sop("a="+a+"  "+"b="+b);	
		c=++a;//结果 a=4 c=4 ++前缀时：表示a先递增1，此时-->a=4;
		sop("a="+a+" "+"c="+c);
		*/
		int num1=1;
		num1=num1++;
		sop(num1);
		int num2=1;
		num2=++num2;
		sop(num2);
		short s=2;
		s+=2;
		sop(s);//隐式类型转换.
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
