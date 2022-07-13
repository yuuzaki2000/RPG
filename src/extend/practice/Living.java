package extend.practice;

public abstract class Living {
	protected String name;
	protected int hp;
	protected int offensive;

	public abstract void attack(Living target);// ターゲットに攻撃するメソッド

}
