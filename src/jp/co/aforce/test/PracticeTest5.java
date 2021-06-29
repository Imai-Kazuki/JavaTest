package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題１
		Random random = new Random();
		int fortune = (random.nextInt(4) + 1);
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
		}
		
		//練習問題２
		int sum = 0;
		for(int i = 1;i < 101;i++) {
			if(i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println("7の倍数の総合計は" + sum);
		
		//練習問題３
		
		for(int i = 1;i < 10;i++) {
			for(int j = 1;j < 10;j++) {
				if (j * i < 10) {
					System.out.print("  " + (j * i));
				}else {
					System.out.print(" " + (j * i));
				}
			}
			System.out.println("");
		}
	}

}
