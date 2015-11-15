import java.util.Scanner;
public class TernaryOperatorDemo 
{
	public static void main(String[] args) 
	{
	
		double num=2.33;
		//整数部分
		int iNum=(int)num;
		//小数部分
		double dNum=num-iNum;
			System.out.println(dNum>=0.5?iNum+1:iNum);
			int x=30;
			int y=50;
			//求出x,y的最大值;
			int max=x>=y?x:y;
			System.out.println(max);
			int num1=101;
			String name= num1%2==0?"偶数":"奇数";
			System.out.println(name);
			int totalCount=46;
			int pageSize=10;
			int totalPage=totalCount%pageSize==0?totalCount /pageSize :totalCount /pageSize+1;
			int currentPage=5;
			int frontpage=(currentPage-1)>=1?currentPage-1:currentPage;
			int nextpage=(currentPage+1)<=totalPage?currentPage+1:currentPage;
			System.out.println(frontpage);
			System.out.println(nextpage);
			
	}
}
