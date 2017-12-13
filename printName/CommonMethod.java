import java.io.File;
public class CommonMethod
{
	int age;

	public CommonMethod( String fun )
	{
		System.out.println("The constructor is : " + fun);
	}

	public void set( int a )
	{
		age = a;		
	}

	public int get()
	{
		return age;
	}

	public void name( String name)
	{
		System.out.println("Name is : " + name);
	}

	public void isDir(String dir)
	{
		String dirname = dir;
		File f = new File(dirname);
		if(f.isDirectory())
		{
			System.out.println("查询目录：" + dirname);
			String[] s = f.list();
			for(int i = 0; i < s.length; i++)
			{
				File f1 = new File(dirname + '/' + s[i]);
				if(f1.isDirectory())
				{
					System.out.println(s[i] + "是一个目录！");
				}
				else
				{
					System.out.println(s[i] + "是一个文件！");
				}
			}
		}
		else
		{
			System.out.println(dirname + "不是一个目录！");
		}
	}
}







