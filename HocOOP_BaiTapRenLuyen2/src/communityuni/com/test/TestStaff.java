package communityuni.com.test;

import communityuni.com.model.Employees;
import communityuni.com.model.Executive;
import communityuni.com.model.Staff;

public class TestStaff {

	public static void main(String[] args) {
		Staff st = new Staff();
		
		Employees teo = new Employees();
		teo.setName("Nguyễn Văn Tèo");
		teo.setAddress("Quận 1");
		teo.setPhone("123123123");
		teo.setPayRate(0.12);
		teo.setSocialSecurityNumber("SE123");
		
		st.addStaffMember(teo);
				
		Employees ty = new Employees();
		ty.setName("Tý Nhọ");
		ty.setAddress("Quận 12");
		ty.setPhone("143432");
		ty.setPayRate(0.11);
		ty.setSocialSecurityNumber("SE12223");
		
		st.addStaffMember(ty);
		
		Executive an = new Executive();
		an.setName("Hồ Văn An");
		an.setAddress("Quận Thủ Đức");
		an.setPhone("09090129");
		an.setPayRate(0.233);
		an.setSocialSecurityNumber("SE2311");
		
		st.addStaffMember(an);
		st.payDay();

	}

}
