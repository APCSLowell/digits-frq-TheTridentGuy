import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
		digitList = new ArrayList<Integer>();
		if (num == 0) {
			digitList.add(0);
			return;
		}
		while(num >= 1) {
			digitList.add(0, num % 10);
			num = num / 10;
		}
	}

	public boolean isStrictlyIncreasing()
	{
		int last = digitList.get(0);
		for (int i = 1; i < digitList.size(); i++) {
			if (digitList.get(i) <= last) {
				return false;
			}
			last = digitList.get(i);
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
