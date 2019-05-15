package decorator;

public class ConcreteComponent extends Component {
	public void doJob() {
		System.out.println("Sou do ComcreteComponent "
				+ "- Estou fechado para modificações.");
	}
}
