package hw;
import java.util.*;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int data [][]=new int[x][x];
		int a = 1,t = 0;
		while(t<=(x-1)*2){
			if(t<x){
				for(int i =t;i>=0;i--){
					int v1=t-i;
					data[i][v1]=a;
					a++;
				}
			}
			if(t>=x){
				for(int i=t-x+1;i<x;i++){
					int q = t-i;
					data[q][i]=a;
					a++;
					//System.out.print("t="+t);
					//System.out.print("q="+q);
					//System.out.print("i="+i);
				}
			}
			t++;
		}
		
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				System.out.print(data[i][j]+"\t");
			}System.out.println();
		}
	}

}
