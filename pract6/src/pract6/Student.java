package pract6;

import java.util.Random;

public class Student {
	
	private String Name;
	private int age;
	private int iDNumber;
	
	public Student() {
		this.Name="Unknown";
		this.age=20;
		this.iDNumber=1;
	}
	
	public static void main(String[] args) {
		
		Student[] arr = new Student[10];
		String[] Name = {"Garry", "Larry", "John", "Elizabeth", "Irene"};
		
		Random rng = new Random(System.currentTimeMillis());		
		
		for (int i=0;i<arr.length;i++)
		{
			
			arr[i] = new Student(Name[rng.nextInt(4)], rng.nextInt(30), rng.nextInt(100));
			System.out.println(arr[i]);
		}
		System.out.println();
		
		for (int i=0;i<arr.length-1;i++)
			for (int j=0;j<arr.length-1;j++)
				if (arr[j].getID()>arr[j+1].getID())
				{
					Student tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
		
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}
	
	public Student(String Name, int age, int iDNumber)
	{
		setName(Name);
		setage(age);
		setID(iDNumber);
	}
	
	public int getID()
	{
		return this.iDNumber;
	}
	
	public void setStudent(String Name, int age, int iDNumber) {
		this.Name=Name;
		this.age=age;
		this.iDNumber=iDNumber;
	}
	
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	
	public void setID(int iDNumber) {
		this.iDNumber=iDNumber;
	}
	
	@Override
	public String toString() {
		return "["+this.iDNumber+"]"+this.Name+" - "+this.age+" years";
	}
	
	
}
