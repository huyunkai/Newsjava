public class IWOR 
{
	public static void main(String[] args) 
	{
		/*
		����һ����ԣ���һ�������ǹ����գ���������
		Ϊ��Ϣ��.��switch����ӡ�������պ���Ϣ��
		*/
		int day=20;
		switch(day%7)
		{
			case 1:
			case 2:
			case 3:
			case 4:
		    case 5:
				System.out.println("������!");
			break;
			case 6:
			case 0:
				System.out.println("��Ϣ��!");
			break;
			default:
				System.out.println("û����һ��");
			}
	}
}
