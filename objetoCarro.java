package aula8;

public class objetoCarro {
	    public static void main(String[] args) {
	      
	        Carro carro1 = new Carro("LKS-3213", 123456);
	        Carro carro2 = new Carro("ABC-1234", 987654);
	        Carro carro3 = new Carro("XYZ-0000", 152394);


	        System.out.println("Carro2: " + carro1.getPlaca() + ", Chassi: " + carro1.getNumChassi());
	        System.out.println("Carro2: " + carro2.getPlaca() + ", Chassi: " + carro2.getNumChassi());
	        System.out.println("Carro2: " + carro3.getPlaca() + ", Chassi: " + carro3.getNumChassi());
	         }
	}


