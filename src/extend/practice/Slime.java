package extend.practice;

import extend.simple.Rand;

public class Slime extends Monster {

	public Slime() {
		this.name = "スライム";
		this.hp = 200;
		this.offensive = 10;
		this.means = "体当たり";
		this.damage = this.offensive * Rand.get(10);// 相手の守備力に関係なくダメージ量が決まるためここで記載
	}

	public void attack(Living target) {
		System.out.println(this.name + "が" + this.means + "で攻撃！" + target.name + "に" + this.damage + "のダメージを与えた。");
		target.hp -= this.damage;
	}

}
