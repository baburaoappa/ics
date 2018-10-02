package euclid;

import java.util.Scanner;

public class Euclidean {
	
	public static int gcd(int divisor,int dividend){
		
		if(divisor==0)
		{
			return dividend;
		}
		else
		{
			return gcd(dividend%divisor,divisor);
		}
		
	}

	public static void main(String[] args) {
	
		int n1=0;
		int n2=1;
		int q=0;
		int r=0;
		int t1=0;
		int t2=1;
		int t=0;
		int bn1=0;
		int bn2=0;
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter n1 : ");
		n1 = sc.nextInt();
		System.out.println("\n\nEnter n2 : ");
		n2 = sc.nextInt();
		
		r = gcd(n2,n1);
		
		System.out.println("\n\nGCD Of "+n1+" and "+n2+" is : "+r);
		*/
		
		n1 = 209;
		n2 = 26;
		bn1=n1;
		bn2=n2;
		
		System.out.println("\n\n----------------------------------------------------");
		System.out.println("\nq"+"\t"+"n1"+"\t"+"n2"+"\t"+"r"+"\t"+"t1"+"\t"+"t2"+"\t"+"t\n");
		System.out.println("----------------------------------------------------\n");
		
		while(n2!=0)
		{
			r = n1%n2;
			
			q=n1/n2;
			
			t = t1 - q*t2;
			
			System.out.println(q+"\t"+n1+"\t"+n2+"\t"+r+"\t"+t1+"\t"+t2+"\t"+t+"\n");
			
			n1 = n2;
			
			n2 = r;
			
			t1 = t2;
			
			t2 = t;
			
			
			
		}
		
		System.out.println("----------------------------------------------------\n");
		
		
		if(n1==1)
		{
			if(t1<0)
			{
				t1=t1+bn1;
				System.out.println("\n Multiplicative inverse of "+bn2+" in modulus "+bn1+" arithmetic is : "+t1);
			}
			else
			{
				System.out.println("\n Multiplicative inverse of "+bn2+" in modulus "+bn1+" arithmetic is : "+t1);
			}
			
		}
		
		
		
		
	}



}



//https://www.di-mgt.com.au/euclidean.html