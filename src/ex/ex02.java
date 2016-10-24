package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 104021074 楊永聖
 */

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int x = scn.nextInt();
		int i = 1;
		int sum = 1;
		while(i<=x){
			sum=sum*i;
			i++;
		}System.out.println(sum);
	}

}
