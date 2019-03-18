
public class Turbo {

	private double ff;
	private boolean turboOn;

	public Turbo(double ff) {
		this.ff = ff;
	}

	public void setTurboOn() {
		turboOn = true;
	}

	public void setTurboOff() {
		turboOn = false;
	}

	public double getTurboFactor() {
		if (turboOn)
			return ff;
		else
			return 1;
	}

}
