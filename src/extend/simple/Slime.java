package extend.simple;

public class Slime extends Monster{
	public Slime() {
		super.name = "スライム";
		super.hp = 200;
		super.offensive=10;
		super.means ="体当たり";
	}
	
	public void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		this.offensive = offensive*Rand.get(10);
		System.out.println(this.name + "が" + this.means + "で攻撃！"+ this.offensive + "のダメージを与えた。");
		target.hp -= this.offensive;
	}
	


}
