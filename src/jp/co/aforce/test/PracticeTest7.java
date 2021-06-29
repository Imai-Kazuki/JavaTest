package jp.co.aforce.test;

class Airplane {
	void fly() {
		System.out.println("飛行します");
	}
}
class Fighter extends Airplane{
	void fight() {
		System.out.println("戦闘します");
	}
}

public class PracticeTest7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題１
		Airplane airplane = new Airplane();
		Fighter fighter = new Fighter();
		
		//飛行機が飛行する
		airplane.fly();
		//戦闘機が飛行する
		fighter.fly();
		//戦闘機が戦闘する
		fighter.fight();
	}

}
