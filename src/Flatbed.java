
public class Flatbed {

	private int flatbedAngle;
	private boolean open;

	public Flatbed() {
		open = false;
		flatbedAngle = 0;
	}

	/**
	 * Höjer flaket 10 grader
	 */
	public void raiseFlatbed() {
		flatbedAngle += 10;
		if (flatbedAngle > 70)
			flatbedAngle = 70;
	}

	/**
	 * Sänker flaket 10 grader
	 */
	public void lowerFlatbed() {
		flatbedAngle -= 10;
		if (flatbedAngle < 0)
			flatbedAngle = 0;
	}

	public int getAngle() {
		return flatbedAngle;
	}

	public void open() {
		open = true;
	}

	public void close() {
		open = false;
	}

	public boolean isClosed() {
		return !open;
	}

	public boolean isOpen() {
		return open;
	}

}
