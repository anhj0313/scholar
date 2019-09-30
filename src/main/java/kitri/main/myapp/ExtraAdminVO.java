package kitri.main.myapp;

public class ExtraAdminVO {
	private String user_id;
	private String extra_major;
	private String reportingdate;
	private String memo;
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
	@Override
	public String toString() {
		return "ExtraAdminVO [user_id=" + user_id + ", extra_major=" + extra_major + ", reportingdate=" + reportingdate
				+ ", memo=" + memo + "]";
	}
	

	
	
}
