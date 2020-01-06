package kr.or.yi.java_study_02.ch07Work02;

public class Students {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	
	
	public Students(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (getTotal()/3f);
	}

	@Override
	public String toString() {
		return String.format("Students [name=%s, ban=%s, no=%s, kor=%s, eng=%s, math=%s]", name, ban, no, kor, eng,
				math);
	}

	
}
