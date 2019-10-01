package kitri.main.myapp;

public class RegisterAdminVO {
	private String user_id;
	private String student_register;
	private String reportingdate;
	private int semester;
	private String memo;
	private int request_id;
	
	
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getStudent_register() {
		return student_register;
	}
	public void setStudent_register(String student_register) {
		this.student_register = student_register;
	}
	public String getReportingdate() {
		return reportingdate;
	}
	public void setReportingdate(String reportingdate) {
		this.reportingdate = reportingdate;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "RegisterAdminVO [user_id=" + user_id + ", student_register=" + student_register + ", reportingdate="
				+ reportingdate + ", semester=" + semester + ", memo=" + memo + ", request_id=" + request_id + "]";
	}
	
	
	
}
