import java.io.*;
public class fundsException extends Exception
{
	private double account;
	public fundsException(double s)
	{
		this.account = s;
	}

	public double getAccount()
	{
		return account;
	}
}

