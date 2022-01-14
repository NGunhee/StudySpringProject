package study;

import java.util.ArrayList;
import java.util.Random;

class Lotto{
	Random rd = new Random();
	ArrayList<Integer> number;
	
	public Lotto() {
		number=new ArrayList<Integer>();
	};
	
	public void generate() {
		for(int i=0;i<6;i++) {
			number.add(rd.nextInt(44)+1);
			
			for(int j=0;j<i;j++) {
				if(number.get(i)==number.get(j)) {
					i--;
					break;
			}
		}
			
			
	}
			
}
	public void generate(int num1,int num2,int num3) {
		number.add(num1);
		number.add(num2);
		number.add(num3);
		for(int i=3;i<6;i++) {
			number.add(rd.nextInt(44)+1);
		}
		
		
	}
	public void getNumbers() {
		for(int i=0;i<6;i++) {
			System.out.print(" "+number.get(i));
		}
	}
	
	
		
	}
	



public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto l = new Lotto();
		l.generate();
		
		
	}

}
