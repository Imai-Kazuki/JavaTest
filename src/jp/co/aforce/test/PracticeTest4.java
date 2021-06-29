package jp.co.aforce.test;

import java.util.Arrays;

public class PracticeTest4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題１
		//②でコーティングするのが適切、Javaの仕様上、文字列の
		//比較の際はequalsを使うべきだから。
		
		//練習問題２
		String[] animals = {"犬","猫","うさぎ","へび"};
		
		//練習問題３
		String animal = "犬";
		
		if (Arrays.asList(animals).contains(animal)) {
			System.out.println(animal + "はリストに含まれています");
		}else {
			System.out.println(animal + "はリストに含まれていません");
		}
		
		int month = 9;
		switch(month) {
		case 1:
			System.out.println("元日、成人の日");
			break;
		case 2:
			System.out.println("建国記念の日、天皇誕生日");
			break;
		case 3:
			System.out.println("春分の日");
			break;
		case 4:
			System.out.println("昭和の日");
			break;
		case 5:
			System.out.println("憲法記念日、みどりの日、こどもの日");
			break;
		case 6:
			System.out.println("なし");
			break;
		case 7:
			System.out.println("海の日、スポーツの日");
			break;
		case 8:
			System.out.println("山の日");
			break;
		case 9:
			System.out.println("敬老の日、春分の日");
			break;
		case 10:
			System.out.println("なし");
			break;
		case 11:
			System.out.println("文化の日、勤労感謝の日");
			break;
		case 12:
			System.out.println("なし");
			break;
		}
		//switch文にした理由
		//条件が値のみなのでぱっとみてわかりやすいと思ったため。
	}

}
