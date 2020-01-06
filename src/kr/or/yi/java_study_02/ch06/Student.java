package kr.or.yi.java_study_02.ch06;

public class Student implements Comparable<Student>{
	private int stdNo;
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int stdNo) {
		this.stdNo = stdNo;
	}

	public Student(int stdNo, String name, int kor, int eng, int math) {
		this.stdNo = stdNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getStdNo() {
		return stdNo;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	@Override
	public int hashCode() {
		return stdNo;
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return stdNo == other.stdNo;
	}
	

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return String.format("Student [stdNo=%s, name=%s, kor=%s, eng=%s, math=%s]", stdNo, name, kor, eng, math);
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.stdNo - o.stdNo;
	}

}
