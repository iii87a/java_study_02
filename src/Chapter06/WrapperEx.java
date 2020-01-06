package Chapter06;

import java.util.Calendar;

public class WrapperEx {
	public static void main(String[] args) {
		//Ex01();
		//Ex02();
		//stringEx();
		
	}

	private static void stringEx() {
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil"); //문자열 붙이기
		System.out.println(sb);
		
		sb.insert(7, " my");// "my"를 삽입 7번쨰 자리 이후에
		System.out.println(sb);
		
		sb.replace(8, 10, "your");// 8~10번에 위치한 my를 your로 변경
		System.out.println(sb);
		
		sb.delete(8, 13);// 8~13번째까지 삭제
		System.out.println(sb);
		
		sb.setLength(4); // 입력한 숫자로 문자열길이 수정
		System.out.println(sb);
	}

	private static void Ex02() {
		System.out.println(Character.toLowerCase('A'));//소문자로 변환
		
		char c1 ='4';
		char c2 ='F';
		if(Character.isDigit(c1)); //c1이 숫자이면 true
			System.out.println(c1+" 는 숫자");
		if(Character.isAlphabetic(c2)); // c2가 영문자이면 true
			System.out.println(c2+" 는 알파벳");
		
		System.out.println(Integer.parseInt("-123")); //"-123"을 10진수로 변환
		System.out.println(Integer.toHexString(28)); // 정수 28을 2진수 문자열로 변환
		System.out.println(Integer.toBinaryString(28));//28d을 16진수 문자열로 변환
		System.out.println(Integer.bitCount(28)); // 28을 2진수로 변환했을때 1의 개수
		
		System.out.println("===========================");
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());//Double을 문자열 "3.14"로 변환
		System.out.println(Double.parseDouble("3.14")); //문자열을 실수 3.14로 변환
		
		System.out.println("===========================");
		boolean b=(4>3); //b는 true
		System.out.println(Boolean.toString(b));//true를 문자열"true"로 변환
		System.out.println(Boolean.parseBoolean("false"));//문자열을 false로 변환
	}

	private static void Ex01() {
		Integer i = 31;// autoboxing
		Integer i2 = Integer.valueOf(31);
		Integer i3 = new Integer(31);
		Integer i4 = Integer.valueOf("31");

		System.out.printf("%d %d %d %d %n", i, i2, i3, i4);

		System.out.println(Integer.bitCount(10)); // 31을 2진수로 변환후 1의 개수
		System.out.println(Integer.toHexString(31));
		System.out.println(Integer.toBinaryString(31));
		System.out.println(Integer.toOctalString(31));
		
		System.out.println("===========");
		System.out.println(i2.floatValue());
		System.out.println(i2.doubleValue());
		
		String str = i2.toString();
		System.out.println(str);
	}
}
