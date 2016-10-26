package hw;

import java.util.*;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new  Scanner(System.in);
		int x = scn.nextInt();
		double q = 0  ;
		int y = 2*x;
		for(int i = 2;i<=y;i+=2){
			float v1=0;
			v1=(float) 1/(float) ((i-1)*i);
			q=q+v1;
			//System.out.println("i="+i);
			//System.out.println("v1="+v1);
			System.out.println("q="+q);
		}
		//System.out.println((float) 1/(0*(0-1)));
	}

}
