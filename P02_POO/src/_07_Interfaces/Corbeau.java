package _07_Interfaces;

public class Corbeau extends Animal implements IPeutMarcher, IPeutVoler{

	@Override
	public void decoller() {
		System.out.println("Je suis un corbeau qui décolle");
		
	}

	@Override
	public void atterir() {
		System.out.println("Je suis un corbeau qui attérit");
		
	}

	@Override
	public void marcher() {
		System.out.println("Je suis un corbeau qui marche");
	}

	@Override
	public void courir() {
		System.out.println("Je suis un corbeau qui coure");
	}
}
