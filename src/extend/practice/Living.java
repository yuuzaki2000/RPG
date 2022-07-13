package extend.practice;

public abstract class Living {
	protected String name;
	protected int hp;
	protected int offensive;
	protected String means; // 攻撃方法
	protected int damage;// 相手に与えるダメージ量

	public abstract void attack(Living target);// ターゲットに攻撃するメソッド

}
