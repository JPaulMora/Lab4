package ejercito;

public class Soldado extends Militar {
	
	/**
	 * @return Devuelve las horas de trabajo.
	 */
	public int getHoras() {
		return super.getHoras()*2;
	}
	
	/**
	 * @return Devuelve el salario del soldado.
	 */
	public double getSalario() {
		 return super.getSalario()-10000.0;
	}
	 
	/**
	 * @return Devuelve los dias de vacaciones.
	 */
	public int getDiasVacaciones() {
		return super.getDiasVacaciones()-5;
	}
	
	/**
	 * @return Pide ordenes?
	 */
	public void recibeOrden(){
		System.out.println("Ordene mi General");
	}
}

