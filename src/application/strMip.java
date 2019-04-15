package application;

public class strMip {
	private String OGString;
	private String strMip;
	private String replace = "";

	public strMip(String OGString, String strMip) {
		this.OGString = OGString;
		this.strMip = strMip;
	}

	private void editStr(String test) {
		OGString = test.replaceAll(strMip, replace);
		if (strMip.contains("|")) {
			deleteRC();
		}
	}

	private void deleteRC() {
		if (OGString.contains("|")) {
			int count = 0;
			count = OGString.length();
			OGString = OGString.substring(0, count - 1);
		}
	}

	public void setReplace(String input) {
		replace = input;
	}

	public String getString() {
		return OGString;
	}

	public String toString() {
		editStr(OGString);
		return OGString;
	}
}