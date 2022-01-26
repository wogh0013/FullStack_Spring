package com.woori.myhome.score;

public class ScoreDto {
	private int id=1;
	private String name="";
	private int kor=0;
	private int eng=0;
	private int mat=0;
	private int total=0;
	private int avg=0;
	
	public void calc()
	{
		this.total = this.kor + this.eng + this.mat;
		this.avg = this.total/3;
	}
	
	public ScoreDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ScoreDto(int id, String name, int kor, int eng, int mat) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		this.total = this.kor + this.eng + this.mat;
		this.avg = this.total/3;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	
		
}
