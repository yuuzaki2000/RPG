package extend.practice;

public abstract class Monster extends Living {// 人間とモンスターに班分けのためだけの抽象クラス
	public Monster() {

	}

	public abstract void attack(Living target);

}
