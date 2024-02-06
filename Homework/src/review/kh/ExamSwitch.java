package review.kh;

public class ExamSwitch {
	public static void main(String[] args) {
		int month = 12;
		double temperature = 0;
		String season = "";

		switch (month) {
		case 1:
			season = "겨울";
			if (temperature <= -15) {
				season += " 한파 경보";
			} else if (temperature <= -12) {
				season += " 한파 주의보";
			}
			break;
		case 3:
			season = "봄";
			break;
		case 4:
			season = "봄";
			break;
		case 5:
			season = "봄";
			break;
		case 6:
			season = "여름";
			if (temperature >= 35) {
				season += " 폭염 경보";
			} else if (temperature >= 33) {
				season += " 폭염 주의보";
			}
			break;
		case 7:
			season = "여름";
			break;
		case 8:
			season = "여름";
			break;
		case 9:
			season = "가을";
			break;
		case 10:
			season = "가을";
			break;
		case 11:
			season = "가을";
			break;
		case 12:
			season = "겨울";
			break;
		default:
			season = "해당하는 계절이 없습니다.";
			break;
		}

		System.out.println(month + "월은 " + season + "입니다.");
	}
}
