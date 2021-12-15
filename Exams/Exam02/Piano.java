/*
 * CSCE 145 Exam02 Question04
 * Provided code. Do not alter the code that says "Do not alter"
 */
//Do not alter-----------------------------------------------------------------------
public class Piano 
{
	private int numberOfKeys;
	
	public Piano()
	{
		this.numberOfKeys = 88;
	}
	public Piano(int aN)
	{
		if(aN > 0 && aN <= 88)
			this.numberOfKeys = aN;
		else
			this.numberOfKeys = 88;
	}
	public int getNumberOfKeys() 
	{
		return numberOfKeys;
	}
	public boolean equals(Piano aP)
	{
		return aP != null &&
				this.numberOfKeys == aP.getNumberOfKeys();
	}
}
//-----------------------------------------------------------------------------------
