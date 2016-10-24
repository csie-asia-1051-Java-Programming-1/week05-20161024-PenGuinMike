package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[]={105021078,105021045,105021096,105021027,105021077,105021033,105021059,105021087,105021044};
		int a =0;
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data.length-1;j++){
				if(data[i]<data[j]){
					a=data[i];
					data[i]=data[j];
					data[j]=a;
				}
			}
		}
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"\t");
			
		}
	}

}
