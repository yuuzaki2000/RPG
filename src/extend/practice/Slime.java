package extend.practice;

public class Slime extends Monster {
	String means = "体当たり";

	public Slime(String name,int hp,int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}

	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(this.name + "が" + this.means + "で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		target.hp -= damage;
	}

}
