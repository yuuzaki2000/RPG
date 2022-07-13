package extend.practice;

public abstract class Human extends Living {// 人間とモンスターに班分けのためだけの抽象クラス
	public Human() {

	}

	public abstract void attack(Living target);

}
