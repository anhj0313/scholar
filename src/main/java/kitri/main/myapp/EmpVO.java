package kitri.main.myapp;

public class EmpVO {
	String user_id;
	String register_check;
	int amount;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRegister_check() {
		return register_check;
	}
	public void setRegister_check(String register_check) {
		this.register_check = register_check;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return user_id + " : " + register_check + " : " + amount;
	}
	
	
	
	
}
