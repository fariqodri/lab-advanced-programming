package id.ac.ui.cs.advprog.tutorial1.strategy;

public class MallardDuck extends Duck {
    // TODO Complete me!]
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		this.setQuackBehavior(new Quack());
		this.setFlyBehavior(new FlyWithWings());
	}
	
	public void display(){}
	public void swim(){}]
}
