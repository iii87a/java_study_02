package kr.or.yi.java_study_02.ch05;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);//5삽입
		v.add(4);
		v.add(-1);
		
		//벡터 중간에 삽입하기
		v.add(2, 100);
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size()); //크기:3
		System.out.println("벡터의 현재 용량 : " + v.capacity()); //용량 : 10
		
		//모든 요소 정수 출력하기
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		
		//벡터 속의 모든 정수 더하기
		int sum=0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i); //벡터의 i번째 정수
			sum += n;
		}
		
		System.out.println("벡터에 있는 정수 합 : " + sum);

	}

}
