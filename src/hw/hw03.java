package hw;

import java.util.*;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int x = scn.nextInt();
		int a = x+1;
		int v1;
		for(int i=1;i>=0;i++){
			x=x*(a-1);
			if(x>10000){
				System.out.println(i+1);
				break;
			}
		}
	}

}
