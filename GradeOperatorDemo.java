public class GradeOperatorDemo 
{
	public static void main(String[] args) 
	{
		int score=60;//����Ϊ95��.
		if(score>=90)
		{
			sop("��");
		}else{
			if(score>=80)
			{
				sop("��");
			}else{
				if(score>=70)
				{
					sop("��");
				}else
				{
					sop("����");
				}
			}
		}
		//�ڶ��ַ�ʽ
		if(score>=90)
		{
			sop("��");
		}
		else if(score>=80&&score<90)
		{
			sop("��");
		}
		else if(score>=70&&score<80)
		{
			sop("��");
		}else{
			sop("���Ŭ��");
		}
		sop("-----------------------");
		int today=1;
		if(today==1)
		{
			sop("��1");
		}
		else if(today==2)
		{
			sop("��2");
		}
	    else if(today==3)
		{
			sop("��3");
		}
		else if(today==4)
		{
			sop("��4");
		}
		else if(today==5)
		{
			sop("��5");
		}
		else if(today==6)
		{
			sop("��6");
		}
		else if(today==7)
		{
			sop("����");
		}else{
			sop("��,û����һ��");
		}
		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
