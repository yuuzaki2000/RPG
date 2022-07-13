package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class RPGMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Human brave = new Brave();
		Human fighter = new Fighter();
		Human wizard = new Wizard();
		Monster slime = new Slime();
		Monster oak = new Oak();
		Monster dragon = new Dragon();

		List<Human> HumanList = new ArrayList<Human>();
		HumanList.add(brave);
		HumanList.add(fighter);
		HumanList.add(wizard);

		List<Monster> MonsterList = new ArrayList<Monster>();
		MonsterList.add(slime);
		MonsterList.add(oak);
		MonsterList.add(dragon);

		while (HumanList.size() > 0 || MonsterList.size() > 0) {
			
			Human i = HumanList.get(Rand.get(HumanList.size()));
			Monster j = MonsterList.get(Rand.get(MonsterList.size()));

			System.out.println(i.name + "のターン!");
			i.attack(j);
			if (j.hp <= 0) {
				MonsterList.remove(j);
				if (MonsterList.size() <= 0) {
					System.out.println("人間が勝利しました。");
					break;
				} else {
					//System.out.println("戦いは続きます。");
				}

			} else {
				//System.out.println("何とか持ちこたえました。");
			}

			System.out.println(j.name + "のターン！");
			j.attack(i);
			if (i.hp <= 0) {
				HumanList.remove(i);
				if (HumanList.size() <= 0) {
					System.out.println("モンスターが勝利しました。");
					break;
				} else {
					//System.out.println("戦いは続きます。");
				}

			} else {
				//System.out.println("何とか持ちこたえました。");
			}

		}

	}

}
