package extend.practice;

public class Dragon extends Monster {
	String means = "炎";

	public Dragon(String name,int hp,int offensive) {
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
