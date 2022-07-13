package extend.practice;

import extend.simple.Rand;

public class Fighter extends Human {

	public Fighter() {
		this.name = "戦士";
		this.hp = 120;
		this.offensive = 30;
		this.means = "斧";
		this.damage = this.offensive * Rand.get(10);// 相手の守備力に関係なくダメージ量が決まるためここで記載
	}

	public void attack(Living target) {
		System.out.println(this.name + "が" + this.means + "で攻撃！" + target.name + "に" + this.damage + "のダメージを与えた。");
		target.hp -= this.damage;
	}
}
