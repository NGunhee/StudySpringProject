package st;

public class Employee {
	private int empno;
	private String name;
	private String dept;
	private String level;
	private int age;
	private int pay;
	private String phone;
	private String address;
	
	public Employee(int empno, String name , String dept,String level) {
		this.empno=empno;
		this.name=name;
		this.dept=dept;
		this.level=level;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		
		
			this.pay = pay;
		
		
		
		
		
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int realPay() {
		return (int)(pay/12)-(int) ((pay/12)*0.08);
	}
	

}
