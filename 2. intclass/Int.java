
public class Int {
	private int dec;
	
	public Int(int dec) {
		this.dec = dec;
	}
	
	public String toHex()
	{
		String hex = "";
		int value = this.dec;
		
		while (value != 0)
		{
			int rem = dec % 16;
			if (rem >=0 && rem <= 9)
			{
				hex = rem + hex;
			}else {
				hex = (char)((rem + 'A') - 10) + hex;
			}
			value = value / 16;
		}
		
		return hex;
	}
	
	public String toBinary()
	{
		String binary = "";
		int value = this.dec;
		while (value != 0)
		{
			int rem = value % 2;
			if (rem == 0)
			binary = 0 + binary;
			else 
			binary = 1 + binary;
			value = value / 2;
		}
		
		return binary;
	}
}