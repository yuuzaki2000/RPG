package extend.practice;

public class Wizard extends Human {
	String means = "魔法";

	public Wizard(String name,int hp,int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}

	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(this.name + "が" + this.means + "で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		target.hp -= damage;
	}

}
