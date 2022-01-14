package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Book{
	private String title;
	
	Book(String title){
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
}
class Beverage{
	String name;
	int price;
	
	Beverage(String name,int price){
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	
	
	
}

class BookCafe{
	String name;
	String address;
	
	ArrayList<Book> booklist;
	ArrayList<Beverage> beverlist;
	
	BookCafe(String name,String address){
		booklist=new ArrayList<Book>();
		beverlist= new ArrayList<Beverage>();
		this.name=name;
		this.address=address;
	}
	
	public void addBook(String title) {
		Book book = new Book(title);
		booklist.add(book);
		
	}
	public void deleteBook(String title) {
		System.out.println("=======책 삭제=========");
		for(int i=0;i<booklist.size();i++) {
			if(booklist.get(i).getTitle().equals(title)) {
				booklist.remove(i);
			}
		}
	}
	
	public void addBever(String name, int price) {
		Beverage beverage = new Beverage(name, price);
		beverlist.add(beverage);
	}
	
	public void deleteBever(String name,int price) {
		System.out.println("=======음료 삭제=========");
		for(int i=0;i<beverlist.size();i++) {
			if(beverlist.get(i).getName().equals(name)) {
				beverlist.remove(i);
			}
		}
	}
	public void showInfo() {
		System.out.println("=======카페 정보========");
		System.out.printf("%s\n",name);
		System.out.printf("%s\n",address);
		System.out.println("보유 서적:");
		for(int i=0;i<booklist.size();i++) {
			System.out.printf("	%s\n",booklist.get(i).getTitle());
		}
		System.out.println("판매 음료:");
		for(int i=0;i<beverlist.size();i++) {
			System.out.printf("	%s - %s원\n",beverlist.get(i).getName(),beverlist.get(i).getPrice());
		}
		
	}
	
}



public class Main {

	public static void main(String[] args) {
		
		BookCafe a = new BookCafe("IT 카페", "신림역 3번출구");
		a.addBook("예제로 배우는 java");
		a.addBever("아메리카노", 2000);
		a.addBook("HTML 웹페이지 만들기");
		a.addBook("슬램덩크");
		a.showInfo();
		a.deleteBook("예제로 배우는 java");
		a.addBever("라떼", 2500);
		a.showInfo();
		
		
	
		
		
	}
}
