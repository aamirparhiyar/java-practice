package statePattern;

public class StateMain {
	public static void main(String [] args) {
		Canvas canvas = new Canvas();
		canvas.setCurrentTool(new EraserTool());
		canvas.mouseDown();
		canvas.mouseUp();
	}
}
