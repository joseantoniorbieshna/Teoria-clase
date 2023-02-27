package model;

public class Rectangulo {
	public Coordinate leftUp,rightDown;

	public Rectangulo(Coordinate leftUp, Coordinate rightDown) {
		super();
		//programacion por contrato
		assert leftUp!=null&&rightDown!=null:"donde vas tu";
		this.leftUp = leftUp;
		this.rightDown = rightDown;
	}
	
	public void move(int horizontal,int vertical) {
		this.leftUp.move(horizontal, vertical);
		this.rightDown.move(horizontal, vertical);
	}
}
