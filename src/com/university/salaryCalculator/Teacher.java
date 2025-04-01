package com.university.salaryCalculator;

class Teacher extends Faculty {
	private String qualification;

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Teacher(String name, float basicSalary, String qualification) {
		super(name, basicSalary);

		this.qualification = qualification;
	}

	public double calculateSalary() {
		float additionalPay = 0;
		if (qualification.equals("Doctoral")) {
			additionalPay = 20000.0f;
		} else if (qualification.equals("Masters")) {
			additionalPay = 18000.0f;
		} else if (qualification.equals("Bachelors")) {
			additionalPay = 15500.0f;
		} else if (qualification.equals("Associate")) {
			additionalPay = 10000.0f;
		} else {
			additionalPay = 0.0f;
		}
		return super.getBasicSalary() + super.getBonusPercentage() + super.getCarAllowancePercentage() + additionalPay;
	}
}
