package lib;

public class ChildInfo {
	private final String name;
    public String getName() {
		return name;
	}

	public String getIdNumber() {
		return idNumber;
	}

	private final String idNumber;

    public ChildInfo(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }
}
