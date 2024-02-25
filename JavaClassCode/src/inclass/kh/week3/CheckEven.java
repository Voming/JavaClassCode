package inclass.kh.week3;

public class CheckEven {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int printEven(int number) throws EvenException {
		this.number = number;
		if(number %2 != 0) {
			throw new EvenException(number);
		}else {
			return number;
		}
	}
}
