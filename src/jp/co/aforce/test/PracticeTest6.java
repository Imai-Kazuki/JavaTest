package jp.co.aforce.test;

class MinMax{
	int getMaxValue(int a,int b,int c) {
		int max = a;
		if (max < b) {
			max = b;
		}else if(max < c) {
			max = c;
		}
		return max;
	}
	int getMinValue(int a,int b,int c) {
		int min = a;
		if (min > b) {
			min = b;
		}else if(min > c) {
			min = c;
		}
		return min;
	}
}

public class PracticeTest6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題１
		MinMax minMax = new MinMax();
		int a = 4,b = 2,c = 10;
		System.out.println(a + "と" + b + "と" + c + "のうち、最大のものは" + minMax.getMaxValue(a,b,c));
		System.out.println(a + "と" + b + "と" + c + "のうち、最小のものは" + minMax.getMinValue(a,b,c));
	}

}
