import mypackage.Test;
public class simpleBank
{
	public static void main( String[] args)
	{		
		/*checkAccount bank = new checkAccount( 111 );

		bank.save();

		try
		{
			bank.get();

		}catch(fundsException e)
		{
			System.out.println("Error, your balance is not enough!" + "\nyour balance is short of : " + e.getAccount());
			e.printStackTrace();
		}*/

		Test s = new Test("bank");
		s.print();
	}
}
