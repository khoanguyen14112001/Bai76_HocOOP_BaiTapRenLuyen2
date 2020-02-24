package communityuni.com.model;

public class Executive extends Employees {
	private double bonus;
	public void awardBonus(double bonus)
	{
		this.bonus = bonus;
		System.out.println("Lãnh bonus " + bonus);

	}
	@Override
	public double pay() {
		return super.pay() + this.bonus;
	}

}
