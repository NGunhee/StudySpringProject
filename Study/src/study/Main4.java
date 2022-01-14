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
		
		System.out.println("종류:");
		String kind = sc.next();
		this.kind=kind;
		System.out.println("이름:");
		String name = sc.next();
		this.name=name;
		System.out.println("맛:");
		String tasty=sc.next();
		this.tasty=tasty;
		System.out.println("개수:");
		int num =sc.nextInt();
		this.num=num;
		System.out.println("가격:");
		int price=sc.nextInt();
		this.price=price;
		System.out.println("저장 완료되었습니다.");
		
		
		
	}
	
	public void print() {
		System.out.printf("%s(%s - %s)%d개 %d원",kind,name,tasty,num,price);
	}
	
	public void confrim() {
		
			System.out.println("저장 정보를 확인하시겠습니다?(y/n):");
			String s= sc.next();
			if(s.equals("n")) {
				return;
			}
			else if(s.equals("y")) {
				print();
			}
			else
				System.out.println("y나 n만 입력");
		
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
