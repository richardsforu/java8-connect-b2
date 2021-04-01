package com;

import java.util.Arrays;
import java.util.List;
import static java.lang.System.out;

interface T1 {
	void f1();
}

@FunctionalInterface
interface T2 {
	void f2(int x);
}


interface T3{
	void f3(int x,int y);
}

public class C2 {

	public static void main(String[] args) {
		
		
		T1 t1=()->{
			System.out.println(">>>>>>> T1 interface f1 method");
		};
		
		t1.f1();
		
		T2 t2=(x)->System.out.println(x);
		
		t2.f2(100);
		
		
		List<String> names=Arrays.asList("Abc","Xyz","test","Aaa","Bbb");
		
		//names.forEach(name->{
		//	System.out.println(name);
		//});
		
		names.forEach(out::println);
		
		T3 t3=(x,y)->out.println(x+y);
		
		t3.f3(10, 20);
		
		
		
		
		
	}

}
