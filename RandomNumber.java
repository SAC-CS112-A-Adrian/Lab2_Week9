
public class RandomNumber {

	public int GetANumber(int high) {
		
		int computerNum = 1 + (int) ( Math.random() * high );
		return computerNum;
	}
}
