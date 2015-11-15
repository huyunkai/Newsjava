//变量的分类/作用域/使用注意
public  class Var3Demo
{
	static String name="go";//直接定义在类中，应当是成员变量
	public static void main(String[] args) 
	{
		/*
			变量分类：（变量的定义的位置不同而已）
			成员变量：直接定义在类中的变量.
			局部变量：变量除了成员变量，就是局部变量.
		*/
		String name="huyunkai";
		sop(name);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
