package kitri.main.myapp;

public class ExtraAdminVO {
	private String user_id;
	private String type;
	private String extra_major;
	private String reportingdate;
	private String memo;
	private String major;
	private int request_id;
	private int accept;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getExtra_major() {
		return extra_major;
	}
	public void setExtra_major(String extra_major) {
		this.extra_major = extra_major;
	}
	public String getReportingdate() {
		return reportingdate;
	}
	public void setReportingdate(String reportingdate) {
		this.reportingdate = reportingdate;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	public int getAccept() {
		return accept;
	}
	public void setAccept(int accept) {
		this.accept = accept;
	}
	@Override
	public String toString() {
		return "ExtraAdminVO [user_id=" + user_id + " major= "+major+", extra_major=" + extra_major + ", reportingdate=" + reportingdate
				+ ", memo=" + memo + ", type="+type+", requestid="+request_id+"]";
	}
	
	
}
