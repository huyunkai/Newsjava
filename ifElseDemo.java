public class ifElseDemo 
{
	public static void main(String[] args) 
	{
		//���������е�������
		int x=20;
		int y=30;
		if(x>y)
		{
			sop("x���");
		}else{
			sop("y���");
		}
		//��ҳ�߼�.
		//���󣺸���һ����46������,Ҫ��ÿһҳ���10������.
		//����:һ������ҳ.
		int totalCount=46;
		int pageSize=10;
		int totalpage1;
		int totalPage=totalCount % pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
		sop(totalPage);
		if(totalCount %pageSize==0)
		{
			totalpage1=totalCount/pageSize;
		}else{
			totalpage1=totalCount/pageSize+1;
		}
		sop(totalpage1);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
