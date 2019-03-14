package com.abs.project;

import java.util.*;
abstract class Yag
{
	double z;
	int k;
	Yag(int k)
	{
		this.k=k;
	}
	void cal()
	{
		z=Math.sqrt(k);
	}
	abstract void dis();


}
class Venkat extends  Yag
{
	Venkat(int k)
	{
		super(k);
	}
	void dis()
	{
		System.out.println("sqrt value is =="+k);
	}
}


class Abs  
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter ur k value  ");
		int a=s.nextInt();
		Venkat v=new Venkat(a);
		v.cal();
		v.dis();
		System.out.println("Hello World!");
	}
}
