package movie;

public class Movie {

	// 필드

	String movieName;// 영화명

	int price;// 금액

	int age;// 나이

	int money;// 실구매금액

	double rate;// 할인율

	String way;// 구매방법

	public Movie(String movieName, int price, int age, String way) {

		// 매개변수로 값을 받아서 멤버변수에 넣기

		this.movieName = movieName;

		this.price = price;

		this.age = age;

		this.way = way;

	}

	void rateCal() {
		rate = 0;
		if (age < 20) {
			rate = rate + 0.25;
		} else if (age >= 20 && age < 30) {
			rate = rate + 0.20;
		} else if (age > 30) {
			rate = rate + 0.15;
		}
		switch (way) {
		case "인터넷":
			rate = rate + 0.05;
			break;
		case "쿠폰":
			rate = rate + 0.10;
			break;
		case "현장":
			rate = rate + 0.00;
			break;

		}
	}

	void moneyCal() {
		money = (int) (price - (price * rate));
	}

	void titlePrint() {
		String p = String.format("%s %14s %12s %18s", "영화명", "금액", "나이", "실구매금액");
		System.out.println(p);
		System.out.println();
	}

	void dataPrint() {
		System.out.println(movieName + "\t\t" + price + "\t\t" + age + "\t\t" + money);
		System.out.println();
	}
}
