package view;

import java.util.Scanner;

import controller.CircleController;
import controller.RectangleController;

public class PointMenu {
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		
		
		System.out.println("====메뉴====");
		System.out.println("1.원");
		System.out.println("2.사각형");
		System.out.println("9.끝내기");
		System.out.println("메뉴 번호:");
		int n = sc.nextInt();
		if(n==1) {
			circleMenu();
		}
		else if(n==2) {
			rectangleMenu();
		}
		else if(n==9) {
			return;
		}
		else
			System.out.println("1,2,9 중에 입려하세요.");
		
		
		
	}
	public void circleMenu() {
		System.out.println("====원 메뉴====");
		System.out.println("1.원 둘레");
		System.out.println("2.원 넓이");
		System.out.println("9.메인으로");
		System.out.println("메뉴 번호:");
		int n = sc.nextInt();
		if(n==1) {
			calcCircum();
		}
		else if(n==2) {
			calcCircleArea();
		}
		else if (n==9) {
			mainMenu();
		}
		
		
	}
	public void rectangleMenu() {
		System.out.println("====메뉴====");
		System.out.println("1.사각형 둘레");
		System.out.println("2.사각형 넓이");
		System.out.println("9.메인으로");
		System.out.println("메뉴 번호:");
		int n = sc.nextInt();
		if(n==1) {
			calcPerimeter();
		}
		else if(n==2) {
			calcRectArea();
		}
		else if(n==9) {
			mainMenu();
		}
		else
			System.out.println("1,2,9 중에 입려하세요.");
		
	}
	public void calcCircum() {
		System.out.println("x좌표:");
		int x= sc.nextInt();
		System.out.println("y좌표:");
		int y = sc.nextInt();
		System.out.println("반지름:");
		int radius = sc.nextInt();
		System.out.println(cc.calcCircum(x, y, radius));
		mainMenu();
	}
	public void calcCircleArea() {
		System.out.println("x좌표:");
		int x= sc.nextInt();
		System.out.println("y좌표:");
		int y = sc.nextInt();
		System.out.println("반지름:");
		int radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
		mainMenu();
		
	}
	public void calcPerimeter() {
		System.out.println("x좌표:");
		int x= sc.nextInt();
		System.out.println("y좌표:");
		int y = sc.nextInt();
		System.out.println("가로:");
		int width = sc.nextInt();
		System.out.println("높이:");
		int height = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, height, width));
		mainMenu();
		
	}
	public void calcRectArea() {
		System.out.println("x좌표:");
		int x= sc.nextInt();
		System.out.println("y좌표:");
		int y = sc.nextInt();
		System.out.println("가로:");
		int width = sc.nextInt();
		System.out.println("높이:");
		int height = sc.nextInt();
		System.out.println(rc.calcArea(x, y, height, width));
		mainMenu();
	}
}
