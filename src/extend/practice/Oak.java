package extend.practice;

import extend.simple.Rand;

public class Oak extends Monster {
	public Oak() {
		this.name = "オーク";
		this.hp = 300;
		this.offensive = 40;
		this.means = "槍";
		this.damage = this.offensive * Rand.get(10);// 相手の守備力に関係なくダメージ量が決まるためここで記載
	}

	public void attack(Living target) {
		System.out.println(this.name + "が" + this.means + "で攻撃！" + target.name + "に" + this.damage + "のダメージを与えた。");
		target.hp -= this.damage;
	}

}