//小数类型（float/double）
public class DecimaDemo 
{
	/*
	小数的常量
			方式1：直接使用小数点表示:如3.14；
			方式2：使用科学计数法.如：3.14E2;
	小数的变量
			默认是double类型.
			表示float类型：在常量之后跟上F,或者f；
	*/
	public static void main(String[] args) 
	{
		sop(3.14);
		sop(3.14E2); 
		float pi=3.14F;
		sop(pi);
		double d=123.456;
		sop(d);
		//无论是double或者float类型，都不能精确的表示一个小数.
		//在开发中,要表示精确的数，如：金钱，在面向对象会讲BigDecimal类来解决.

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
