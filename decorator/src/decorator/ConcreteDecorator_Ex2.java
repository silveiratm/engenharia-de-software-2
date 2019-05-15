package decorator;

public class ConcreteDecorator_Ex2 extends AbstractDecorator {
	public void doJob() {
		System.out.println();
		System.out.println("*** Inicio Ex_2 ***");
		super.doJob();
		//Ações adicionais
		System.out.println("Sou o DecoratorEx_2");
		System.out.println("*** Fim Ex_2 ***");
	}
}
