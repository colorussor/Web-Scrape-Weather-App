package application;

public class Icons extends ImageCollector{

	public Icons(int index) {
		super(index);
	}

	@Override
	public boolean Range() {
		if(getIndex() >= 6 && getIndex() <= 16) {
			return true;
		} else {
			return false;
		}
	}

}
