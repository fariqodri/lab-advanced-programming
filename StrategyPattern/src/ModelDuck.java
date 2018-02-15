
public class ModelDuck extends Duck{
	public ModelDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
}
