package aula8;

public class objetoAnimal {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal(131, "Preto");
		Animal animal2 = new Animal(10, "Rosa");
		Animal animal3 = new Animal(1123, "Cinza");
		
		System.out.println("animal1: " + animal1.getTamanho() + ", Cor: " + animal1.getCor());
        System.out.println("animal2: " + animal2.getTamanho() + ", Cor: " + animal1.getCor());
        System.out.println("animal3: " + animal3.getTamanho() + ", Cor: " + animal1.getCor());
	}

}
