package model;

public class Turbo {

	private double ff;
	private boolean turboOn;

	public Turbo(double ff) {
		this.ff = ff;
	}
	
	/**
	 * Sätter på Turbo
	 */
	public void setTurboOn() {
		turboOn = true;
	}
	
	/**
	 * Stänger av Turbo
	 */
	public void setTurboOff() {
		turboOn = false;
	}

	/**
	 * Ger turbos värde
	 * @return
	 */
	public double getTurboFactor() {
		if (turboOn)
			return ff;
		else
			return 1;
	}

}
