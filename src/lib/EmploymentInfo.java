package lib;
import java.time.LocalDate;

public class EmploymentInfo {
	private int yearJoined;
	
	public int getYearJoined() {
		return yearJoined;
	}

	public void setYearJoined(int yearJoined) {
		this.yearJoined = yearJoined;
	}

	public int getMonthJoined() {
		return monthJoined;
	}

	public void setMonthJoined(int monthJoined) {
		this.monthJoined = monthJoined;
	}

	public int getDayJoined() {
		return dayJoined;
	}

	public void setDayJoined(int dayJoined) {
		this.dayJoined = dayJoined;
	}

	public int getMonthWorkingInYear() {
		return monthWorkingInYear;
	}

	public void setMonthWorkingInYear(int monthWorkingInYear) {
		this.monthWorkingInYear = monthWorkingInYear;
	}

	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;
	
	public EmploymentInfo(int yearJoined, int monthJoined, int dayJoined, int monthWorkingInYear) {
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.dayJoined = dayJoined;
        this.monthWorkingInYear = monthWorkingInYear;
    }
	
	public int getMonthsWorkedThisYear() {
        LocalDate now = LocalDate.now();
        return (now.getYear() == yearJoined) ? now.getMonthValue() - monthJoined : 12;
    }
}
