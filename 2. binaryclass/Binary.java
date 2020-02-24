
public class Binary {
	private String binaryValue;
	
	public Binary(String binaryValue) {
		this.binaryValue = binaryValue;
	}
	
	public String getBinaryValue() {
		return binaryValue;
	}
	
	public int toDec() {
		int dec = 0;
		int count = 3;
		for(int i = 0; i < 4; i++)
		{
			if (this.binaryValue.charAt(count) == '0') {
				dec += 0 * Math.pow(2, i);
			}else {
				dec += 1 * Math.pow(2, i);
			}
			
			count--;
		}
		
		return dec;
	}
	
	public static int toDec(String value) {
		int dec = 0;
		int count = 3;
		for(int i = 0; i < 4; i++)
		{
			if (value.charAt(count) == '0') {
				dec += 0 * Math.pow(2, i);
			}else {
				dec += 1 * Math.pow(2, i);
			}
			
			count--;
		}
		
		return dec;
	}
	
}