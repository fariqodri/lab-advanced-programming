package id.ac.ui.cs.advprog.tutorial1.strategy;

public class MallardDuck extends Duck {
    // TODO Complete me!
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display(){}
	public void swim(){}
}
