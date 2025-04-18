package lib;

public class EmployeeDetails {
	private String address;
	boolean isForeigner;
	private boolean gender; //true = Laki-laki, false = Perempuan
	
	 public EmployeeDetails(String address, boolean isForeigner, boolean gender) {
	        this.address = address;
	        this.isForeigner = isForeigner;
	        this.gender = gender;
    }
}
