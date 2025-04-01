package university;

class OfficeStaff extends Faculty {
	
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}

	public double calculateSalary() {
		float additionalPay = 0;
		if (designation.equals("Accountant")) {
			additionalPay = 10000.0f;
		} else if (designation.equals("Peon")) {
			additionalPay = 7000.0f;
		} else if (designation.equals("Clerk")) {
			additionalPay = 4500.0f;
		} else {
			additionalPay = 0.0f;
		}
		return super.getBasicSalary() + super.getBonusPercentage() + super.getCarAllowancePercentage() + additionalPay;
	}
}
