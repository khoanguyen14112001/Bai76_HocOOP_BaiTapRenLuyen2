package communityuni.com.model;

public class Employees extends StaffMember {

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return 500;
	}
	protected double payRate;
	protected String socialSecurityNumber;
	@Override
	public String toString() {
		return super.toString() + " - " + socialSecurityNumber + " - " + payRate;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	

}
