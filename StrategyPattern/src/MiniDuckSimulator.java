
public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck mallardDuck = new MallardDuck();
		ModelDuck modelDuck = new ModelDuck();
		RubberDuck rubberDuck = new RubberDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		modelDuck.performFly();
		modelDuck.performQuack();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		rubberDuck.performFly();
		rubberDuck.performQuack();
	}

}
