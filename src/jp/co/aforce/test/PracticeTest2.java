package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 10;
		int y = 28;
		double z = 3.14;
		//練習問題１
		System.out.println(x * y);
		
		//練習問題２
		System.out.println(y / x);
		System.out.println(y % x);
		
		//練習問題３
		double decimal = y * z;
		System.out.println(decimal);
		
		//練習問題４
		decimal++;
		System.out.println(decimal);
		
		//練習問題５
		int age = 21;
		Random random = new Random();
		int randomNumber = random.nextInt(101);//1-100の乱数
		if (age > randomNumber) {
			System.out.println("私のほうが年上です");
		}else if (age < randomNumber) {
			System.out.println("私のほうが年下です");
		}else if (age == randomNumber) {
			System.out.println("私と同い年です");
		}
		System.out.println("randomNumber=" + randomNumber);
	}

}
