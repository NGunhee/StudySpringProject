package study;

import java.util.Scanner;

class Snack{
	String kind;
	String name;
	String tasty;
	int num;
	int price;
	Scanner sc= new Scanner(System.in);
	
	public void setSanck() {
		
		System.out.println("����:");
		String kind = sc.next();
		this.kind=kind;
		System.out.println("�̸�:");
		String name = sc.next();
		this.name=name;
		System.out.println("��:");
		String tasty=sc.next();
		this.tasty=tasty;
		System.out.println("����:");
		int num =sc.nextInt();
		this.num=num;
		System.out.println("����:");
		int price=sc.nextInt();
		this.price=price;
		System.out.println("���� �Ϸ�Ǿ����ϴ�.");
		
		
		
	}
	
	public void print() {
		System.out.printf("%s(%s - %s)%d�� %d��",kind,name,tasty,num,price);
	}
	
	public void confrim() {
		
			System.out.println("���� ������ Ȯ���Ͻðڽ��ϴ�?(y/n):");
			String s= sc.next();
			if(s.equals("n")) {
				return;
			}
			else if(s.equals("y")) {
				print();
			}
			else
				System.out.println("y�� n�� �Է�");
		
	}
}




public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack s = new Snack();
		s.setSanck();
		s.confrim();
		
	}

}
