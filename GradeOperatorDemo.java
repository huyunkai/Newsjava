public class GradeOperatorDemo 
{
	public static void main(String[] args) 
	{
		int score=60;//分数为95分.
		if(score>=90)
		{
			sop("优");
		}else{
			if(score>=80)
			{
				sop("良");
			}else{
				if(score>=70)
				{
					sop("中");
				}else
				{
					sop("及格");
				}
			}
		}
		//第二种方式
		if(score>=90)
		{
			sop("优");
		}
		else if(score>=80&&score<90)
		{
			sop("优");
		}
		else if(score>=70&&score<80)
		{
			sop("中");
		}else{
			sop("多多努力");
		}
		sop("-----------------------");
		int today=1;
		if(today==1)
		{
			sop("周1");
		}
		else if(today==2)
		{
			sop("周2");
		}
	    else if(today==3)
		{
			sop("周3");
		}
		else if(today==4)
		{
			sop("周4");
		}
		else if(today==5)
		{
			sop("周5");
		}
		else if(today==6)
		{
			sop("周6");
		}
		else if(today==7)
		{
			sop("周日");
		}else{
			sop("亲,没有这一天");
		}
		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
