package Threading;

public class SpiralMatrix {

	public static void main(String[] args) {
	int[][] a = {{1,2,3,4}
				,{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
	int minr =0;
	int minc=0;
	int maxr =a.length-1;
	int maxc= a[0].length-1;
	int st=0;
	int end = (a.length)*(a[0].length);
	
	
	while(st<end) {
		//Top row
		for(int i=minr , j=minc; j<=maxc;j++) {
			System.out.println(a[i][j]);
			st++;
		}
		minr++;
		//right row
		for(int i=minr , j=maxc; i<=maxr;i++) {
			System.out.println(a[i][j]);
			st++;
		}
		maxc--;
		//bottom row
		for(int i=maxr , j=maxc; j>=minc;j--) {
			System.out.println(a[i][j]);
			st++;
		}
		maxr--;
		//left row
		for(int i=maxr , j=minc; i>=minr;i--) {
			System.out.println(a[i][j]);
			st++;
		}
		minc++;
	}
	

	}

}
