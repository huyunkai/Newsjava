public class ifElseDemo 
{
	public static void main(String[] args) 
	{
		//求两个数中的最大的数
		int x=20;
		int y=30;
		if(x>y)
		{
			sop("x最大");
		}else{
			sop("y最大");
		}
		//分页逻辑.
		//需求：给出一共有46天数据,要求每一页最多10条数据.
		//计算:一共多少页.
		int totalCount=46;
		int pageSize=10;
		int totalpage1;
		int totalPage=totalCount % pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
		sop(totalPage);
		if(totalCount %pageSize==0)
		{
			totalpage1=totalCount/pageSize;
		}else{
			totalpage1=totalCount/pageSize+1;
		}
		sop(totalpage1);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
