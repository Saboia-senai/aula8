package aula8;

	public class Consulta {
	    private String data;
	    private String nomePaciente;
	    private String nomeDents;

	    public Consulta(String data, String nomePaciente, String nomeDents) {
	        this.data = data;
	        this.nomePaciente = nomePaciente;
	        this.nomeDents = nomeDents;
	    }

	    public String getData() {
	        return data;
	    }

	    public String getNomePaciente() {
	        return nomePaciente;
	    }

	    public String getNomeDents() {
	        return nomeDents;
	    }
	}
