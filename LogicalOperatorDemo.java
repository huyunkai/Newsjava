public class LogicalOperatorDemo 
{
	public static void main(String[] args) 
	{
			//&操作:都为true的时候，结果为true.
			sop(true&true);
			sop(true&false);
			sop(false&true);
			sop(false&false);
			//sop(false &(1/0==0));//证明&不具有短路效果.
			//短路效应
			//&&操作:都为true的时候，结果为true.
			sop(true&&true);
			sop(true&&false);
			sop(false&&true);
			sop(false&&false);
			sop(false &&(1/0==0));//false,没报错，说明（1/0==0）没有执行，若左边操作为false,右边操作不执行，直接返还false.
			//异或
			sop(true^false);//相同为false不同为true; 
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
