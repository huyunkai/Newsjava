//���������
public class ArithmeticOperatorsDemo 
{
	public static void main(String[] args) 
	{
		/*int a=2,b,c;
		b=a++;//��� a=3 b=2 ++��׺ʱ.
		sop("a="+a+"  "+"b="+b);	
		c=++a;//��� a=4 c=4 ++ǰ׺ʱ����ʾa�ȵ���1����ʱ-->a=4;
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
		sop(s);//��ʽ����ת��.
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
