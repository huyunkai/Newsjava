public class WhileDemo 
{
	public static void main(String[] args) 
	{
		/*
		第一关:输出200句打印语句"帅哥"
		*/
		int  i=1;
		while(i<=200)
		{
			sop("帅哥"+i);
			i++;

		}
		sop("--------------------");
		/*
		第二关:打印出1-100的数.
		*/
		int j=1;
		while(j<=100)
		{
			//sop(j);
			j++;
		}
		/*
		第三关:求100以内正整数和,A算1-25，B算26-50，
		C算51-75,D算76-100
		*/
		/*int k1=1,k2=26,k3=51,k4=76;
		int sum1=0,sum2=0,sum3=0,sum4=0,sum=0;
			while(k1<=25&&k2<=50&&k3<=75&&k4<=100)
			{
				sum1+=k1;
				sum2+=k2;
				sum3+=k3;
				sum4+=k4;
				k1++;
				k2++;
				k3++;
				k4++;
			}
			sum+=sum1+sum2+sum3+sum4;
			sop(sum);
			*/
			/*int sum=QH(100);
			sop(sum);
			*/
			/*
			第四关:求1000以内正整数之和
			A算1-250，B算251-500，C算501-750,D算751-1000
			*/
			/*int k1=1,k2=251,k3=501,k4=751;
		    int sum1=0,sum2=0,sum3=0,sum4=0,sum=0;
			while(k1<=250&&k2<=500&&k3<=750&&k4<=1000)
			{
				sum1+=k1;
				sum2+=k2;
				sum3+=k3;
				sum4+=k4;
				k1++;
				k2++;
				k3++;
				k4++;
			}
			sop(sum1+" "+sum2+" "+sum3+" "+sum4+" ");
			sum+=sum1+sum2+sum3+sum4;
			sop(sum);
			*/
			/*int sum=QH(1000);
			sop(sum);
			*/
			/*
			第五关:求10000
			*/
			int sum=QH(10000);
			sop(sum);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static int QH(int n)
	{
		/*
		求1-n的和：A求1-n/4的和，B求n/4+1-n/2的和，C求n/2+1-3*n/4的和，D求3*n/4+1-n的和
		*/
		int n1=1,n2=n/4+1,n3=n/2+1,n4=(3*n)/4+1;
		int sum1=0,sum2=0,sum3=0,sum4=0,sum=0;
		while(n1<=(n/4)&&n2<=(n/2)&&n3<=(3*n/4)&&n1<=n)
		{
			sum1+=n1;
			sum2+=n2;
			sum3+=n3;
			sum4+=n4;
			n1++;
			n2++;
			n3++;
			n4++;
		}
		sum=sum1+sum2+sum3+sum4;
		return sum;
	}
}
