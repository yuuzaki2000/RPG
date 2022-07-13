package extend.practice;

public class Oak extends Monster {
	String means = "槍";

	public Oak(String name,int hp,int offensive) {
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
