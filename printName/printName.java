import java.util.*;
import java.text.*;
public class  printName
{
	public static void main( String[] args )
	{
		int age;
		CommonMethod test = new CommonMethod("test");
		test.set( 10 );
		age = test.get();
		test.name("test fun!");
		System.out.println("age: " + age);
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyy.MM.dd 'at' hh:mm:ss zzz");

		System.out.println(ft.format(date));

		System.out.println("\n");

		String dir = "/usr/bin";
		test.isDir(dir);
	}	
}


