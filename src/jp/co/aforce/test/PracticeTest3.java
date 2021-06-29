package jp.co.aforce.test;

import java.util.ArrayList;

class Employee {
	private String number;
	private String name;
	private String gender;
	private String age;
	
	//番号を取得するメソッド
	String getNumber() {
		return this.number;
	}
	//名前を取得するメソッド
	String getName() {
		return this.name;
	}
	//性別を取得するメソッド
	String getGender() {
		return this.gender;
	}
	//年齢を取得するメソッド
	String getAge() {
		return this.age;
	}
	void setNumber(String number) {
		this.number = number;
	}
	void setName(String name) {
		this.name = name;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	void setAge(String age) {
		this.age = age;
	}
}

public class PracticeTest3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題１
		String[] tanaka = {"1","田中太郎","男性","27"};
		
		//練習問題２
		System.out.println(tanaka[1]);
		
		//練習問題3
		
		
		//練習問題４
		ArrayList<String> empList = new ArrayList<>();
		Employee emp1 = new Employee();
		emp1.setNumber("1");
		emp1.setName("田中太郎");
		emp1.setGender("男性");
		emp1.setAge("27");
		Employee emp2 = new Employee();
		emp2.setNumber("2");
		emp2.setName("佐藤花子");
		emp2.setGender("女性");
		emp2.setAge("22");
		Employee emp3 = new Employee();
		emp3.setNumber("3");
		emp3.setName("鈴木次郎");
		emp3.setGender("男性");
		emp3.setAge("31");
		empList.add(emp1.getNumber());
		empList.add(emp1.getName());
		//empList.add(emp1.getGender());
		empList.add(emp1.getAge());
		
		empList.add(emp2.getNumber());
		empList.add(emp2.getName());
		//empList.add(emp2.getGender());
		empList.add(emp2.getAge());
		
		empList.add(emp3.getNumber());
		empList.add(emp3.getName());
		//empList.add(emp3.getGender());
		empList.add(emp3.getAge());
		int count = 1;
		for (String output : empList) {
			
			while(count < 10) {
				switch (count) {
				case 1:
				case 4:
				case 7:
					System.out.print("番号は" + output + "、");
					count++;
					break;
				case 2:
				case 5:
				case 8:
					System.out.print("名前は" + output + "、");
					count++;
					break;
				case 3:
				case 6:
				case 9:
					System.out.print("年齢は" + output + "歳です。\n");
					count++;
					break;
				}
			break;
			}//while
		}//for
		//練習問題５
		String[] scoreList = {"国語","90","数学","80","英語","65"};
		count = 1;
		for (String score : scoreList) {
			while (count < 7) {
				switch (count) {
				case 1:
				case 3:
				case 5:
					System.out.print(score + ":");
					count++;
					break;
				case 2:
				case 4:
				case 6:
					System.out.print(score + "\n");
					count++;
					break;
				}
				break;
			}
		//練習問題６
		//シンプルで使いやすいと思ったから。
		//値を入れるコードを別で書く必要がなく、作成と初期化を一度のコードで書けるため。
		}
	}
}