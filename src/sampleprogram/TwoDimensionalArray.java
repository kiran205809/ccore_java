package sampleprogram;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
		
		int[][] i=new int[2][3];
		i[0][0]=1;
		i[0][1]=2;
		i[0][2]=3;
		
		i[1][0]=4;
		i[1][1]=5;
		i[1][2]=6;
		
		for(int a=0;a<2;a++) {
			for(int b=0;b<3;b++) {
				
				System.out.println(i[a][b]);
			}
		}
		
	}
}
