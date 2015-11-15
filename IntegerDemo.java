//整数类型（byte,int,short,long）
public class IntegerDemo 
{
	/*
		1 二进制整数：0B或者0b开头（java7的新特性）如 int a =0b110;
		2 八进制整数：要求以0开头，如 int a=012;
		3 十进制整数： 如 int a=11;
		4 十六进制整数：要求0X或者0x开头，如int a=0x12;
		java语言的整数常量默认是int型，声明long型变量后加上‘l’或者‘L’,因小写的l容易和1混淆，故建议使用L;
		默认情况下，一个整形的字面量默认是int类型.
	*/
	public static void main(String[] args) 
	{
		//整数的常量表示:
		sop(250);//十进制
		sop(0b11111010);//二进制
		sop(0372);//八进制
		sop(0xFA);//十六进制.
		//整数的变量表示：数据类型  变量名=值；
		byte date=127;//byte -128~127 
		long id=123L;//区分int和Long的常量，带L属于Long的常量.
		sop(id);
		//int 4个字节，有32位.使用范围-2^32~2^32-1;
		/*
		250的二进制的表示:
		0b00000000000000000000000011111010
		*/
		int bin=0b00000000_00000000_00000000_11111010;
		sop(bin);
		//java7 允许数字之间使用_分隔
		sop(1_2_3);
		}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
