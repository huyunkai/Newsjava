//�����������:String��
public class StringDemo 
{
	public static void main(String[] args) 
	{
		//��ʾ����:���ƿ�NB
		String username="���ƿ�NB";//�ַ�����˫����ӡ����.
		sop("����:"+username);
		int age=23;
		sop("����="+age);
		//ת�������ϰ�����"���ʦ��";
		sop("\"���ʦ��\"");
		sop(1+2+"hello");
		sop("hello"+1+2);
		sop(1+"hello"+2);
		int x='A';
		sop(x);
	}
	public static void sop(Object obj)
	{ 
		System.out.println(obj);
	}
}
