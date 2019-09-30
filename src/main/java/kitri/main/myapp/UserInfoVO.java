package kitri.main.myapp;

public class UserInfoVO {

	String user_id;
	String name;
	String major;
	int semester;
	String student_register;
	String address;
	String phone;
	String password;
	String extra_major;
	int user_code;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getStudent_register() {
		return student_register;
	}
	public void setStudent_register(String student_register) {
		this.student_register = student_register;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getExtra_major() {
		return extra_major;
	}
	public void setExtra_major(String extra_major) {
		this.extra_major = extra_major;
	}
	public int getUser_code() {
		return user_code;
	}
	public void setUser_code(int user_code) {
		this.user_code = user_code;
	}
	
	@Override
	public String toString() {
		return "UserinfoVO [user_id=" + user_id + ", name=" + name + ", major=" + major + ", semester=" + semester
				+ ", student_register=" + student_register + ", address=" + address + ", phone=" + phone + ", password="
				+ password + ", extra_major=" + extra_major + ", user_code=" + user_code + "]";
	}
}
