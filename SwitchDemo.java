//��֧���֮switch
public class SwitchDemo 
{
	public static void main(String[] args) 
	{
		int today=14;//�ж�today�Ĳ�ͬ���ֵ�������ͬ������.
		switch(today)
		{
			case 1:
				sop("��һ");
			break;
			case 2:
				sop("�ܶ�");
			break;
			case 3:
				sop("����");
			break;
			case 4:
				sop("����");
			break;
			case 5:
				sop("����");
			break;
			case 6:
				sop("����");
			break;
			case 7:
				sop("����");
			break;
			default:
				sop("�ף�û����һ��!");//����û��Ҫ��break;
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
