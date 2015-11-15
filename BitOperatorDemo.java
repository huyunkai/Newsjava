//二进制的位运算符
public class BitOperatorDemo 
{
	public static void main(String[] args) 
	{
		int a=5;
		int b=3;
		sop(a&b);//a与b的按位与.
		/*
		a：0b00000101
		b：0b00000011
		--------------
		   0b00000001  1
		*/
		sop(a|b);//a与b的按位或.
		/*
	    a：0b00000101
		b：0b00000011
		--------------
		   0b00000111  7
		*/
		sop(a^b);//a与b的按位异或
		/*
	    a：0b00000101
		b：0b00000011
		--------------
		   0b00000110  6
		*/
		sop(~a);
		/*
		a：0b00000101
		!a:0b11111010 -(2+4)=-6;
		*/
		sop(~-5);
		//操作负数:得到源码-->反码-->补码
		/*
		源码0b00000101
		反码0b11111010
		补码0b11111011
		~-5：0b00000100 4
		*/
		sop("===========================");
		//交换两个变量值练习.
		int x=10;
		int y=20;
		System.out.println("x="+x+" "+"y="+y);
		//操作
		/*
		int z=x;
		    x=y;
			y=z;
			*/
			/*
			x^y
			x：00001010
			y: 00010100
			------------
            x  00011110 
			   00010100
			------------
			y  00001010 10
               00011110
			-------------
			   00010100 4+16=20 
			*/
			x=x^y;
			y=x^y;
			x=y^x;
		System.out.println("x="+x+" "+"y="+y);
		sop("==============================");
		int number=2;
		/*
		number:0b00000010
		左移:  0b00000100 2*2=4;
		左移3位 2*2*2*2=16;
		右移:  0b00000001 2/2=1;
		*/
		int number1=2<<3;
		sop(number1);
		int number2=number1>>2;
		sop(number2);


	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
