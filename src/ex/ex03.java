package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 104021074 楊永聖
 */

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int x = scn.nextInt();
		long sum = 0;
		long v1;
		for(int i = 1;i<=x ;i++){
			v1=(long) Math.pow(2, i);
			sum=sum+v1;
		}System.out.println(sum);
	}

}
