package lib;

public class Salary {
	private int monthlySalary;
	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getOtherMonthlyIncome() {
		return otherMonthlyIncome;
	}

	public void setOtherMonthlyIncome(int otherMonthlyIncome) {
		this.otherMonthlyIncome = otherMonthlyIncome;
	}

	public EmployeeDetails getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDetails employee) {
		this.employee = employee;
	}

	public EmploymentInfo getEmployment() {
		return employment;
	}

	public void setEmployment(EmploymentInfo employment) {
		this.employment = employment;
	}

	public int getAnnualDeductible() {
		return annualDeductible;
	}

	private int otherMonthlyIncome;
	private int annualDeductible;
	private EmployeeDetails employee;
	private EmploymentInfo employment;
	
	public Salary(int monthlySalary, int otherMonthlyIncome, int annualDeductible) {
		this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.annualDeductible = annualDeductible;
	}
	
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	public void setMonthlySalary(EmployeeDetails employee, int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
			if (employee.isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = 5000000;
			if (employee.isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = 7000000;
			if (employee.isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}
	}
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}

}
