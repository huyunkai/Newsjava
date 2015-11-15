public class IWOR 
{
	public static void main(String[] args) 
	{
		/*
		需求：一般而言，周一到周五是工作日，周六周日
		为休息日.用switch语句打印出工作日和休息日
		*/
		int day=20;
		switch(day%7)
		{
			case 1:
			case 2:
			case 3:
			case 4:
		    case 5:
				System.out.println("工作日!");
			break;
			case 6:
			case 0:
				System.out.println("休息日!");
			break;
			default:
				System.out.println("没有这一天");
			}
	}
}
