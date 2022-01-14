package study;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자입력하세요");
		String s = sc.next();
		String[] arr= s.split("");
		int a[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("a")||arr[i].equals("e")||arr[i].equals("i")||arr[i].equals("o")||arr[i].equals("u")) {
				a[i]=1;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
