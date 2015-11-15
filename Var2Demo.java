//需求：求两个数的和差积商.
//表达式:使用运算符号连接起来的变量、常量.能求得结果值的有意义的语句.
public class Var2Demo
{
	public static void main(String[] args) 
	{
		int num1=6;
		int num2=3;
		//需求：求6和3的和，差，积，商
		sop(num1+num2);
		sop(num1-num2);
		sop(num1*num2);
		sop(num1/num2);
		//需求改变:把操 作数换成8和4

		num1=8;
		num2=4;
		sop(num1+num2);
		sop(num1-num2);
		sop(num1*num2);
		sop(num1/num2);
		//需求改变:把操作数换成10和2

		num1=10;
		num2=2;
		sop(num1+num2);
		sop(num1-num2);
		sop(num1*num2);
		sop(num1/num2);


	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}  

