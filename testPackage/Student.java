package mypackage.student;
import mypackage.person.Person;
public class Student
{
	public void print()
	{
		Person s = new Person("zxsoft");
		String name = s.get();
		System.out.println(name);
	}
}