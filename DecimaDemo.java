//С�����ͣ�float/double��
public class DecimaDemo 
{
	/*
	С���ĳ���
			��ʽ1��ֱ��ʹ��С�����ʾ:��3.14��
			��ʽ2��ʹ�ÿ�ѧ������.�磺3.14E2;
	С���ı���
			Ĭ����double����.
			��ʾfloat���ͣ��ڳ���֮�����F,����f��
	*/
	public static void main(String[] args) 
	{
		sop(3.14);
		sop(3.14E2); 
		float pi=3.14F;
		sop(pi);
		double d=123.456;
		sop(d);
		//������double����float���ͣ������ܾ�ȷ�ı�ʾһ��С��.
		//�ڿ�����,Ҫ��ʾ��ȷ�������磺��Ǯ�����������ὲBigDecimal�������.

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
