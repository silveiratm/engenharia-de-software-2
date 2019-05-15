package decorator;

public class DecoratorExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exemplo Decorator Pattern");
		ConcreteComponent cc = new ConcreteComponent();
		ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();
		//Decorando objeto ConcreteComponent cc com ConcreteDecoratorEx_1
		cd_1.setTheComponent(cc);
		cd_1.doJob();
		ConcreteDecorator_Ex2 cd_2 = new ConcreteDecorator_Ex2();
		//Decorando objeto ConcreteComponent cc com ConcreteDecoratorEx_1 e ConcreteDecoratorEx_2
		cd_2.setTheComponent(cd_1);
		cd_2.doJob();
	}

}
