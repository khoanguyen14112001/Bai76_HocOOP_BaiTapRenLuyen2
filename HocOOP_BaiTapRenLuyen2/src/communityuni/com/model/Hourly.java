package communityuni.com.model;

public class Hourly extends Employees{
	private int hoursWorked;
	public void addHours (int hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public double pay() {
		return this.hoursWorked*50;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
