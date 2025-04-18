package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	
	private final String employeeId;
    private final EmployeeInfo EmployeeInfo;
    private final FamilyInfo familyInfo;
    private final EmploymentInfo employmentInfo;
    
	public Employee(EmployeeInfo EmployeeInfo, EmploymentInfo employmentInfo) {
        this.employeeId = "";
		this.EmployeeInfo = EmployeeInfo;
		this.familyInfo = new FamilyInfo();
        this.employmentInfo = employmentInfo;
    }
	
	public void addChild(ChildInfo child) {
		FamilyInfo familyInfo2 = new FamilyInfo();
		familyInfo2.addChild(child);
	}
	
	public int getAnnualIncomeTax(Salary salary) {
	    return TaxFunction.calculateTax(
	        salary.getMonthlySalary(),
	        salary.getOtherMonthlyIncome(),
	        EmploymentInfo.getMonthsWorkedThisYear(),
	        salary.getAnnualDeductible(),
	        familyInfo.hasSpouse(),
	        familyInfo.getNumberOfChildren()
	    );
	}
}
