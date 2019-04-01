
public class Alfil implements Figura {

	
	String color;
	int posicionX;
	int posicionY;
	
	
	

	public Alfil(String color, int posicionX, int posicionY) {
		super();
		this.color = color;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	@Override
	public void Nombre() {
		System.out.println("Esto es un alfil");		
	}

	@Override
	public void Mover() {
		System.out.println("Cualquier casilla en diagonal");			
	}

	@Override
	public void Capturar() {
		System.out.println("Captura con su movimiento");			
	}
	@Override
	public void Colocar() {
		if(this.posicionX !=3 || this.posicionY !=1){
			System.out.println("Error");
		}
		else{
			System.out.println("Colocado");
		}
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	
	
}
