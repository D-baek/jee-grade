package com.grade.web.domains;
import java.io.Serializable;

public class GradeBean implements Serializable {
	private static final long seriaLversionUID = 1L;
	private String hakbun, ssn, name, kor, eng, math, society ;
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getSociety() {
		return society;
	}
	public void setSociety(String society) {
		this.society = society;
	}
	public String toString() {
		return "학생정보[학번 =  "+ hakbun
				+ "이름 = " + name
				+ "국어점수 = " + kor
				+ "영어점수 = " + eng
				+ "수학점수 = " + math
				+ "사회점수 = "  + society+"]";
				
	}
}
