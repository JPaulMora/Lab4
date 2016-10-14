package alarma;
public class AlarmaEmergencia extends Alarma{

	public void m1(){
		System.out.println("emergencia 1");
	}
	public void m2(){
		super.m1();
		System.out.println("timbre 1");
	}
	
	public String toString() {
		return "emergencia "+super.toString();
	}
}
