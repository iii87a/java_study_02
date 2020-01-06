package Chapter07.generic;

public class Main {

	public static void main(String[] args) {
		//exam01();
		
		//generic_exam();
	
	
	}

	private static void generic_exam() {
		Gstack<String> s = new Gstack<String>();
		
	s.push("a");
	s.push("b");
	s.push("c");
	
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	
//범용 사용
	Gstack<Integer> si = new Gstack();
	si.push(5);
	si.push(3);
	si.push(1);
	
	System.out.println(si.pop());
	System.out.println(si.pop());
	System.out.println(si.pop());
	}

	private static void exam01() {
		MyStack st01 = new MyStack();
		st01.prnStack();
		st01.push("a");
		st01.prnStack();
		st01.push("b");
		st01.prnStack();
		st01.push("c");
		st01.prnStack();
		//stack = first in last out 
		//push : a-> b-> c
		//pop : c-> b-> a
		
		System.out.println(st01.pop());
		System.out.println(st01.pop());
		System.out.println(st01.pop());
	}

}
