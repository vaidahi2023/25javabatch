package oop;

import java.util.Iterator;
import java.util.Scanner;

class Student{
	int Rno;
	String name, gender;

	public Student() {
		System.out.println("Student Default Const");
	}
	public Student(int Rno, String name, String gender) {
		this.Rno = Rno;
		this.name = name;
		this.gender = gender;
	}
	public int getRno() {
		return Rno;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
}

class Result extends Student{
	
	float pct, sum;
	int a[] = new int[5];
	Result(int Rno, String name, String gender, int a[]) {
		super(Rno, name, gender);
		this.a = a;
	
	for(int i = 0; i < 5; i++) {
		sum = sum + a[i];		
	}
	pct = (sum * 100)/500;
	}
	void dispData() {

		System.out.println(getRno() + " " + getName() + " " + getGender() + " ");
		if(pct < 100 && pct > 0) {
			if (pct <= 100 && pct >= 80) {
				System.out.println("A");
			} else if (pct <= 79 && pct >= 50) {
				System.out.println("b");
			} else if (pct <= 49 && pct >= 33) {
				System.out.println("c");
			} else if (pct <= 32 && pct >= 0) {
				System.out.println("bhai you are napas");
			}
			
		}  else {
			System.out.println("Check again.");
		}

	}
	
}

public class GradeSystem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int mak[] = new int[5];
		System.out.println("Enter the five subject marks:");
		for(int i = 0; i < 5; i++) {
			mak[i] = sc.nextInt();
		}
		
		Result obj = new Result(1, "Raja", "Male", mak);
		obj.dispData();
	}
}
