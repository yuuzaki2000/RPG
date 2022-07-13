package extend.simple;

public class Wizard extends Human{
	public Wizard() {
		super.name = "魔法使い";
		super.hp = 60;
		super.offensive=20;
		super.means ="魔法";
	}
	
	
	public void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		this.offensive = Rand.get(this.offensive);
		System.out.println(this.name + "が" + this.means + "で攻撃！"+ this.offensive + "のダメージを与えた。");
		target.hp -= this.offensive;
	}
	

}
