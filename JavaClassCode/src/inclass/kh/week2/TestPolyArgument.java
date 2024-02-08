package inclass.kh.week2;

public class TestPolyArgument { // 그저 실행 시키는 메소드
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Chair()); // 의자 객체를 새로 생성해서 구매 but, 정적으로 들어갈때는 부모로 들어감
		b.buy(new Desk()); // 부모로 들어가는 이유는 자식의 종류를 다양하게 받게하기위함
		b.buy(new Light());
	}
}

// default인 class를 추가로 만들 수 있음
// 자바 파일은 파일명과 똑같은 클래스가 필요함 -> 무조건 public 클래스
// 이외의 클래스를 더 만들 수 있음 -> 하지만 public 클래스는 하나만 존재해야함
class Furniture {
	private int price; // 제품가격

	public Furniture(int price) { // 가격을 들고와야 Furniture를 생성함
		this.setPrice(price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

//부모 -> 가격 공간있음
//자식 -> 이름 공간, 부모에 가격을 입력하는 생산자 공간
class Chair extends Furniture {
	public Chair() {
		super(100); // 부모 클래스의 생성자 호출
	}

	@Override
	public String toString() {
		return "Chair";
	}

	public void chairMethod() {
		System.out.println("배송해드리겠습니다.");
	}
}

// toString()의 역할
// public override string ToString() {} 메서드를 구현하고 문자열을 반환하면 
// 그에 해당하는 문자열을 재정의하여 기본 개체를 출력할 수 있습니다
// 기본개체 -> f 를 출력한다면 toString()에 넣은 값이 나옴
class Desk extends Furniture {
	public Desk() {
		super(200);
	}

	@Override
	public String toString() {
		return "Desk";
	}

	public void deskMethod() {
		System.out.println("배송해드리겠습니다. 배송비가 20원입니다.");
	}
}

class Light extends Furniture {
	public Light() {
		super(200);
	}

	@Override
	public String toString() {
		return "Light";
	}

	public void lightMethod() {
		System.out.println("배송불가. 직접 들고가야합니다.");
	}
}

class Buyer {
	private int money = 500;

	public void buy(Furniture f) { // 다형성
		if (money < f.getPrice()) { // f.price로 접근불가(private 이기때문)
			// getter, setter를 설정하거나 접근제한자를 변경해주면 됨
			System.out.println("잔액부족!");
			return;
		}
		money -= f.getPrice();
		System.out.println(f + " 구매성공! 잔액: " + money + " 만원");

		// pseudo- code : 완벽히 코딩된 상대가 아니라 만들어 가는 과정 ex) f가 Desk라면
		/*
		 * if((f.toString()).equals("Desk")) { ((Desk)f).deskMethod(); }else
		 * if((f.toString()).equals("Chair")) { ((Chair)f).chairMethod(); }else
		 * if((f.toString()).equals("Light")) { ((Light)f).lightMethod(); }
		 */

		// instanceof 사용 : ==, != 와 동일한 급
		// class exception을 방지하기 위해 사용
		if (f instanceof Desk) {
			((Desk) f).deskMethod();
		} else if (f instanceof Chair) {
			((Chair) f).chairMethod();
		} else if (f instanceof Light) {
			((Light) f).lightMethod();
		}
	}
}
