package hw;
import java.util.*;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int data [][]=new int[x][x];
		int a =1;
		for(int i=0;i<x;i++){
			for(int j=0;j<i;j++){
				data[j][i]=a;
				a++;
			}
		}
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				System.out.print(data[j][i]);
			}System.out.println();
		}
	}

}
