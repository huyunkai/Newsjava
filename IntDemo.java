import java.lang.Math;
import java.lang.StringBuilder;
public class IntDemo 
{
	public static void main(String[] args) 
	{
		//int max=2147483648;
		//sop(max);
		int arr[]={1,2,3,4,4};
		sop(arr.toString());
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			sb.append(arr[i]);
		}
		sop(sb.toString());
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
