package movie;

import java.util.Scanner;

class Menu {
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;

	void menu(String name) {
		switch (name) {
		case ("짬뽕"):
			a = a + 1;
			break;
		case ("짜장면"):
			b = b + 1;
			break;
		case ("볶음밥"):
			c = c + 1;
			break;
		case ("외"):
			d = d + 1;
			break;

		}
	}

	void menuPrint() {
		System.out.println("짬뽕은 : " + a);
		System.out.println("짜장면은 : " + b);
		System.out.println("볶음밥은 : " + c);
		System.out.println("그외 : " + d);
	}
}

public class MenuResearch {

	public static void main(String[] args) {
		Menu n = new Menu();
		Scanner m = new Scanner(System.in);
		for (int i = 0; i <= 16; i++) {
			System.out.print("메뉴를 입력하세요 : ");
			String me = m.next();
			n.menu(me);
		}
		n.menuPrint();
	}

}
