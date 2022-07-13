package extend.simple;

import java.util.ArrayList;
import java.util.List;

public class RPGMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Human brave = new Brave();
		Human fighter = new Fighter();
		Human wizard = new Wizard();
		Monster slime = new Slime();
		
		List<Human> HumanList = new ArrayList<>();
		HumanList.add(brave);
		HumanList.add(fighter);
		HumanList.add(wizard);
		
		List<Monster> MonsterList = new ArrayList<>();
		MonsterList.add(slime);
		
		
		while(HumanList.size() >0 || MonsterList.size() >0) {
			Human i = HumanList.get(Rand.get(2));
			Monster j = MonsterList.get(Rand.get(1));
			
			System.out.println(i.name + "のターン!");
			i.attack(j);
			if(j.hp<=0) {
				MonsterList.remove(j);
			}
			
			if(MonsterList.size() <= 0) {
				System.out.println( "人間が勝利しました。");
				break;
			}

			
			System.out.println(j.name + "のターン！");
			j.attack(i);
			if(j.hp<=0) {
				MonsterList.remove(j);
			}
			
			if(HumanList.size() <= 0) {
				System.out.println( "モンスターが勝利しました。");
				break;
			}
			
			
		}
	}
}
