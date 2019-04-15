package application;

public class BackGrounds extends ImageCollector {

	public BackGrounds(int index) {
		super(index);
	}

	@Override
	public boolean Range() {
		if (getIndex() >= 0 && getIndex() <= 5) {
			return true;
		} else {
			return false;
		}
	}

}
