package model;

public class Turbo {

	private double ff;
	private boolean turboOn;

	public Turbo(double ff) {
		this.ff = ff;
	}
	
	/**
	 * S�tter p� Turbo
	 */
	public void setTurboOn() {
		turboOn = true;
	}
	
	/**
	 * St�nger av Turbo
	 */
	public void setTurboOff() {
		turboOn = false;
	}

	/**
	 * Ger turbos v�rde
	 * @return
	 */
	public double getTurboFactor() {
		if (turboOn)
			return ff;
		else
			return 1;
	}

}
