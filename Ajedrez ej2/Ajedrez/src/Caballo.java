
public class Caballo implements Figura{
	
	String color;
	int posicionX;
	int posicionY;

	

	public Caballo(String color, int posicionX, int posicionY) {
		super();
		this.color = color;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	@Override
	public void Nombre() {
		System.out.println("Esto es un caballo");
		
	}

	@Override
	public void Mover() {
		System.out.println("se mueve dos casillas horizontalmente y una casilla verticalmente o dos casillas en posición vertical y una horizontal cuadrada. El movimiento completo por lo tanto, se parece a letra L");
		
	}

	@Override
	public void Capturar() {
		System.out.println("Captura con su movimiento");		
	}

	@Override
	public void Colocar() {
		if(this.posicionX !=2 || this.posicionY !=1){
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
