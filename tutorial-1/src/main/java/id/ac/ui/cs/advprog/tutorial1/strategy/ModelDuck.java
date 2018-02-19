package id.ac.ui.cs.advprog.tutorial1.strategy;

public class ModelDuck extends Duck{
    // TODO Complete me!
	public ModelDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	public void display(){}
	public void swim(){}
}
