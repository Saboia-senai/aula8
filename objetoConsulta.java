package aula8;

public class objetoConsulta {

	public static void main(String[] args) {
		
		Consulta consulta1 = new Consulta("10/12/2025", "Julia", "Ronaldo");
		Consulta consulta2 = new Consulta("23/01/2026", "Roger", "Valdirene");
		Consulta consulta3 = new Consulta("15/02/2026", "Paulo", "Carla");
		
		System.out.println("consulta1: " + consulta1.getData() + ", Paciente: " + consulta1.getNomePaciente() + "Dentista: " + consulta1.getNomeDents());
        System.out.println("consulta2: " + consulta2.getData() + ", Paciente: " + consulta2.getNomePaciente() + "Dentista: " + consulta1.getNomeDents());
        System.out.println("consulta3: " + consulta3.getData() + ", Paciente: " + consulta3.getNomePaciente() + "Dentista: " + consulta1.getNomeDents());

	}

}
