import java.util.Scanner;
public class TernaryDemo1
{
	public static void main(String[] args) 
	{
		int result;
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		int num1=(int)num;
		if(num-num1>=0.5)
		{
			result=num1+1;
		}
		else
		{
			result=num1;
		}
		System.out.println(result);
	}
}
