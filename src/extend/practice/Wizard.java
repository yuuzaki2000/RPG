package extend.practice;

import extend.simple.Rand;

public class Wizard extends Human {
	public Wizard() {
		this.name = "魔法使い";
		this.hp = 100;
		this.offensive = 15;
		this.means = "魔法";
		this.damage = this.offensive * Rand.get(10);// 相手の守備力に関係なくダメージ量が決まるためここで記載
	}

	public void attack(Living target) {
		System.out.println(this.name + "が" + this.means + "で攻撃！" + target.name + "に" + this.damage + "のダメージを与えた。");
		target.hp -= this.damage;
	}

}
