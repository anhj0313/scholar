package kitri.main.myapp;

public class LectureVO {
	int lecture_code;
	String lecture_title;
	String lecture_time;
	int lecture_unit;
	String professor;
	String lecture_type;
	int lecture_person_num;
	String lecture_plan;
	int lecture_class;
	
	public int getLecture_code() {
		return lecture_code;
	}
	public void setLecture_code(int lecture_code) {
		this.lecture_code = lecture_code;
	}
	public String getLecture_title() {
		return lecture_title;
	}
	public void setLecture_title(String lecture_title) {
		this.lecture_title = lecture_title;
	}
	public String getLecture_time() {
		return lecture_time;
	}
	public void setLecture_time(String lecture_time) {
		this.lecture_time = lecture_time;
	}
	public int getLecture_unit() {
		return lecture_unit;
	}
	public void setLecture_unit(int lecture_unit) {
		this.lecture_unit = lecture_unit;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getLecture_type() {
		return lecture_type;
	}
	public void setLecture_type(String lecture_type) {
		this.lecture_type = lecture_type;
	}
	public int getLecture_person_num() {
		return lecture_person_num;
	}
	public void setLecture_person_num(int lecture_person_num) {
		this.lecture_person_num = lecture_person_num;
	}
	public String getLecture_plan() {
		return lecture_plan;
	}
	public void setLecture_plan(String lecture_plan) {
		this.lecture_plan = lecture_plan;
	}
	public int getLecture_class() {
		return lecture_class;
	}
	public void setLecture_class(int lecture_class) {
		this.lecture_class = lecture_class;
	}
	@Override
	public String toString() {
		
		return lecture_code + ":" + lecture_title + ":" + lecture_time;
	}
	
	
}
