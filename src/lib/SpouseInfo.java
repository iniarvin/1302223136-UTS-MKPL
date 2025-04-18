package lib;

public class SpouseInfo {
	private String name;
	public String getName() {
		return name;
	}

	public String getIdNumber() {
		return idNumber;
	}

	private String idNumber;

	public SpouseInfo(String name, String idNumber) {
		this.name = name;
        this.idNumber = idNumber;
	}
	
}
