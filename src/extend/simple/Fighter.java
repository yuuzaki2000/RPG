package extend.simple;

public class Fighter extends Human{
	public Fighter() {
		super.name = "戦士";
		super.hp = 80;
		super.offensive=40;
		super.means ="斧";
	}
	
	
	public void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		this.offensive = Rand.get(this.offensive);
		System.out.println(this.name + "が" + this.means + "で攻撃！"+ this.offensive + "のダメージを与えた。");
		target.hp -= this.offensive;
	}
}
