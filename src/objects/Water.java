package objects;

import javafx.scene.canvas.GraphicsContext;

public class Water extends Object {


	public Water(int x_pos, int y_pos) {
		super(x_pos, y_pos);
		// TODO Auto-generated constructor stub
	}

	/**
	 * throws error is the right object is not ontop
	 */
	public void onTop (Stone object) {
		try {
			if (object != null) {
				// change to stone
			}
		} catch(IllegalArgumentException e) {
			System.out.println("Wrong object");
		}

	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}



}
