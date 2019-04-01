
public class Peon implements Figura {

	String color;
	int posicionX;
	int posicionY;

	




	public Peon(String color, int posicionX, int posicionY) {
		super();
		this.color = color;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	@Override
	public void Nombre() {
		System.out.println("Esto es un peon");
		
	}

	@Override
	public void Mover() {
		System.out.println("1 casilla y 2 en el primer movimiento, hacia delante");
		
	}

	@Override
	public void Capturar() {
		System.out.println("En diagonal");
	}
    
	@Override
	public void Colocar() {
		if(this.posicionX !=1 || this.posicionY !=2){
			System.out.println("Error");
		}
		else{
			System.out.println("Colocado");
		}	}
     

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
