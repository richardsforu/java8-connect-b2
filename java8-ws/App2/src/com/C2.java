package com;

interface Calculations {

	static int add(int x, int y) {
		return x + y;
	}
	
	default int mul(int x,int y) {
		return x*y;
	}

	default int div(int x,int y) {
		return x/y;
	}
	
	
}

public class C2 {
	
	public static void main(String[] args) {
		int sum = Calculations.add(100, 200);
		System.out.println("Sum "+sum);
		
		//Calculations ci = null;
		//int d = ci.div(100, 12);
		
		//System.out.println(d);
		
		Calculations ci=new Calculations() {
			
			@Override
			public int div(int x, int y) {
				// TODO Auto-generated method stub
				return Calculations.super.div(x, y);
			}
			
			@Override
			public int mul(int x, int y) {
				// TODO Auto-generated method stub
				return Calculations.super.mul(x, y);
			}
		};
		
		int m = ci.mul(10, 3);
		System.out.println(m);
		
		
		
		
		
	}

}
