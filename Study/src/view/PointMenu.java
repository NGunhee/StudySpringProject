package view;

import java.util.Scanner;

import controller.CircleController;
import controller.RectangleController;

public class PointMenu {
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		
		
		System.out.println("====�޴�====");
		System.out.println("1.��");
		System.out.println("2.�簢��");
		System.out.println("9.������");
		System.out.println("�޴� ��ȣ:");
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
			System.out.println("1,2,9 �߿� �Է��ϼ���.");
		
		
		
	}
	public void circleMenu() {
		System.out.println("====�� �޴�====");
		System.out.println("1.�� �ѷ�");
		System.out.println("2.�� ����");
		System.out.println("9.��������");
		System.out.println("�޴� ��ȣ:");
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
		System.out.println("====�޴�====");
		System.out.println("1.�簢�� �ѷ�");
		System.out.println("2.�簢�� ����");
		System.out.println("9.��������");
		System.out.println("�޴� ��ȣ:");
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
			System.out.println("1,2,9 �߿� �Է��ϼ���.");
		
	}
	public void calcCircum() {
		System.out.println("x��ǥ:");
		int x= sc.nextInt();
		System.out.println("y��ǥ:");
		int y = sc.nextInt();
		System.out.println("������:");
		int radius = sc.nextInt();
		System.out.println(cc.calcCircum(x, y, radius));
		mainMenu();
	}
	public void calcCircleArea() {
		System.out.println("x��ǥ:");
		int x= sc.nextInt();
		System.out.println("y��ǥ:");
		int y = sc.nextInt();
		System.out.println("������:");
		int radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
		mainMenu();
		
	}
	public void calcPerimeter() {
		System.out.println("x��ǥ:");
		int x= sc.nextInt();
		System.out.println("y��ǥ:");
		int y = sc.nextInt();
		System.out.println("����:");
		int width = sc.nextInt();
		System.out.println("����:");
		int height = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, height, width));
		mainMenu();
		
	}
	public void calcRectArea() {
		System.out.println("x��ǥ:");
		int x= sc.nextInt();
		System.out.println("y��ǥ:");
		int y = sc.nextInt();
		System.out.println("����:");
		int width = sc.nextInt();
		System.out.println("����:");
		int height = sc.nextInt();
		System.out.println(rc.calcArea(x, y, height, width));
		mainMenu();
	}
}
