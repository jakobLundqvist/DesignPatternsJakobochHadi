
public class Flatbed {

	private int flatbedAngle;

	/**
	 * H�jer flaket 10 grader
	 */
	public void raiseFlatbed() {

		flatbedAngle += 10;
		if (flatbedAngle > 70)
			flatbedAngle = 70;
	}

	/**
	 * S�nker flaket 10 grader
	 */
	public void lowerFlatbed() {
		flatbedAngle -= 10;
		if (flatbedAngle < 0)
			flatbedAngle = 0;
	}
	
	
	
}
