//分支语句之switch
public class SwitchDemo 
{
	public static void main(String[] args) 
	{
		int today=14;//判断today的不同结果值，输出不同的内容.
		switch(today)
		{
			case 1:
				sop("周一");
			break;
			case 2:
				sop("周二");
			break;
			case 3:
				sop("周三");
			break;
			case 4:
				sop("周四");
			break;
			case 5:
				sop("周五");
			break;
			case 6:
				sop("周六");
			break;
			case 7:
				sop("周日");
			break;
			default:
				sop("亲，没有这一天!");//这里没必要加break;
		}
		String ch="ABC";
		switch(ch)
		{
			case "ABC":
				System.out.println("AA");
			break;
			case "BCD":
				System.out.println("BB");
			break;
			default:
				System.out.println("CC");
		}

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
