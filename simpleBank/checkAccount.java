import java.io.*;
import java.util.*;
import java.text.*;

public class checkAccount
{
	private int number = 111;
	private double balance;	

	Date date = new Date();
	SimpleDateFormat tm = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");

	Scanner scan = new Scanner(System.in);

	public checkAccount(  int num )
	{	
		number = num;
	}

	public void save()
	{	
		System.out.println("当前余额：" + balance + "\n" + "请输入存入金额: ");
		double money = 0.0;
		if(scan.hasNextDouble())
		{
			money = scan.nextDouble();
			balance += money;
			System.out.println("Save money at: " + tm.format(date) + "\nbalance: " + balance);	
		}			
	}

	public void get() throws fundsException
	{
		System.out.println("当前余额：" + balance + "\n" + "请输入取出金额: ");
		double s = 0.0;
		if(scan.hasNextDouble())
		{
			s = scan.nextDouble();
		}

		if(s <= balance)
		{
			balance -= s;
			System.out.println("Get money at: " + tm.format(date) + "余额: " + balance);
		}
		else
		{
			double needs = s - balance;
			throw new fundsException( needs );
		}
	}

	public double getBalance()
	{
		return balance;
	}

	public int getNumber()
	{
		return number;
	}
}