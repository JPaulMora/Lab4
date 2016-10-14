package ejercito;

public class MDriver {
	public static void main(String[] args) {
		Militar m = new Militar();
		Teniente t = new Teniente();
		Coronel c = new Coronel();
		General g = new General();
		Soldado s = new Soldado();
		
		
		System.out.println("La clase Militar contiene toda la informacion que un militar necesita:");
		System.out.println("Un Militar trabaja "+m.getHoras()+" horas.\n gana $"+m.getSalario()+" al anio.\n tiene "+m.getDiasVacaciones()+" dias de vacaciones.\n y debe usar el formulario "+m.getFormularioVacaciones()+".");

		System.out.println("\nHeredando de esta clase creamos todas las clases militares individuales como el Coronel, el Teniente y el Soldado");
		System.out.println("Gracias a esto podemos hacer cambios sutiles como el sueldo del Soldado:\nSoldado.getSalario()="+s.getSalario()+"\ny aun asi dejar el codigo irrelevante:\nSoldado.getFormularioVacaciones()="+s.getFormularioVacaciones());
		
		System.out.println("En seguida estan todas las clases..");
		System.out.println("Teniente:\n trabaja "+t.getHoras()+" horas.\n gana $"+t.getSalario()+" al anio.\n tiene "+t.getDiasVacaciones()+" dias de vacaciones.\n y debe usar el formulario "+t.getFormularioVacaciones()+".");
		System.out.println("\nCoronel:\n trabaja "+c.getHoras()+" horas.\n gana $"+c.getSalario()+" al anio.\n tiene "+c.getDiasVacaciones()+" dias de vacaciones.\n y debe usar el formulario "+c.getFormularioVacaciones()+".");
		System.out.println("\nGeneral:\n trabaja "+g.getHoras()+" horas.\n gana $"+g.getSalario()+" al anio.\n tiene "+g.getDiasVacaciones()+" dias de vacaciones.\n y debe usar el formulario "+g.getFormularioVacaciones()+".");
	}

}
