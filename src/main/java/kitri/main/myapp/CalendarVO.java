package kitri.main.myapp;

public class CalendarVO {

	String cal_date;
	String cal_content;
	
	public String getCal_date() {
		return cal_date;
	}
	public void setCal_date(String cal_date) {
		this.cal_date = cal_date;
	}
	public String getCal_content() {
		return cal_content;
	}
	public void setCal_content(String cal_content) {
		this.cal_content = cal_content;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cal_date+":"+cal_content;
	}

	

	
}
