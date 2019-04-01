
public class Rey implements Figura {

	String color;
	int posicionX;
	int posicionY;
	
	

	public Rey(String color, int posicionX, int posicionY) {
		super();
		this.color = color;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	@Override
	public void Nombre() {
		System.out.println("Esto es un rey");		
	}

	@Override
	public void Mover() {
		System.out.println("1 casilla en cualquier direccion");			
	}

	@Override
	public void Capturar() {
		System.out.println("Captura con su movimiento");			
	}

	
	@Override
	public void Colocar() {
		if(this.posicionX !=5 || this.posicionY !=1){
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
