package extend.simple;

public abstract class Living {
	protected String name;
	protected int hp;
	protected int offensive;
	protected String means;

	
	public abstract void attack(Living target);

}
