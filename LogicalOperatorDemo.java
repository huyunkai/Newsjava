public class LogicalOperatorDemo 
{
	public static void main(String[] args) 
	{
			//&����:��Ϊtrue��ʱ�򣬽��Ϊtrue.
			sop(true&true);
			sop(true&false);
			sop(false&true);
			sop(false&false);
			//sop(false &(1/0==0));//֤��&�����ж�·Ч��.
			//��·ЧӦ
			//&&����:��Ϊtrue��ʱ�򣬽��Ϊtrue.
			sop(true&&true);
			sop(true&&false);
			sop(false&&true);
			sop(false&&false);
			sop(false &&(1/0==0));//false,û����˵����1/0==0��û��ִ�У�����߲���Ϊfalse,�ұ߲�����ִ�У�ֱ�ӷ���false.
			//���
			sop(true^false);//��ͬΪfalse��ͬΪtrue; 
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
