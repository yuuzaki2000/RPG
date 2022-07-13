package extend.simple;

public class Brave extends Human{
	
	public Brave() {
		super.name = "勇者";
		super.hp = 100;
		super.offensive=30;
		super.means ="剣";
	}
	


	public void attack(Living target) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		this.offensive = Rand.get(this.offensive);
		System.out.println(this.name + "が" + this.means + "で攻撃！"+target.name+"に"+ this.offensive + "のダメージを与えた。");
		target.hp -= this.offensive;
	}
	

}
