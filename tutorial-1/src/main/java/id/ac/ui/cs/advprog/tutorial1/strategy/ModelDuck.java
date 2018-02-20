package id.ac.ui.cs.advprog.tutorial1.strategy;

public class ModelDuck extends Duck{
    // TODO Complete me!
	public ModelDuck() {
		this.setQuackBehavior(new MuteQuack());
		this.setFlyBehavior(new FlyNoWay());
	}
	
	public void display(){}
	public void swim(){}
}
