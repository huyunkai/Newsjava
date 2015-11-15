//分支语句:if语句的第一种写法.
public class ifDemo 
{
	public static void main(String[] args) 
	{
		//如果你是男的，就去男厕所
		boolean isMan=true;
		/*
		if(isMan==true)//判断isMan是否为true
		{
			sop("去男厕所");
		}
		*/
		if(isMan)//判断isMan是否为true
		{
			sop("去男厕所");
		}
		sop("...ending....");
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
