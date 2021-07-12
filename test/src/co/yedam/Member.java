package co.yedam;

public class Member {
 private String StudentNo;
 private String Studentname;
 private String eScore;
 private String mScore;

public Member(String studentNo, String studentname, String eScore, String mScore) {
	super();
	this.StudentNo = studentNo;
	this.Studentname = studentname;
	this.eScore = eScore;
	this.mScore = mScore;
}


public Member(String string, String e, String m) {
}


public String getStudentNo() {
	return StudentNo;
}

public void setStudentNo(String studentNo) {
	StudentNo = studentNo;
}

public String getStudentname() {
	return Studentname;
}

public void setStudentname(String studentname) {
	Studentname = studentname;
}

public String geteScore() {
	return eScore;
}

public void seteScore(String eScore) {
	this.eScore = eScore;
}

public String getmScore() {
	return mScore;
}

public void setmScore(String mScore) {
	this.mScore = mScore;
}

public String showInfo() {
	String info = "학번: "+ StudentNo+"\t 이름: "+Studentname+"\t 영어점수: "+eScore+"\t 수학점수: "+mScore; 
	return info;
}

}

