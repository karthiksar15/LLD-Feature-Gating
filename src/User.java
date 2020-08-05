
public class User {
	private String name;
	private int age;
	private String gender;
	private UserAddress address;
	private UserPaymentBank paymentBank;
	private UserPaymentHistory paymentHistory;
	private UserType userType;
	
	public UserPaymentBank getPaymentBank() {
		return paymentBank;
	}
	public void setPaymentBank(UserPaymentBank paymentBank) {
		this.paymentBank = paymentBank;
	}
	public UserPaymentHistory getPaymentHistory() {
		return paymentHistory;
	}
	public void setPaymentHistory(UserPaymentHistory paymentHistory) {
		this.paymentHistory = paymentHistory;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public UserAddress getAddress() {
		return address;
	}
	public void setAddress(UserAddress address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
