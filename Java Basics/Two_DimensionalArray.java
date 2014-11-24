
public class Two_Arrays {
	
	public static void main(String[] args) {

	String x [][] = new String[3][4]; {//two dimensional array with 2 rows and 2 columns
	
	x[0][0]= "A";
	x[0][1]= "b";
	x[0][2]= "c";
	x[0][3]= "d";
	
	x[1][0]= "A1";
	x[1][1]= "b1";
	x[1][2]= "C1";
	x[1][3]= "d1";
	
	x[2][0]= "A2";
	x[2][1]= "b2";
	x[2][2]= "C2";
	x[2][3]= "d2";
	
	
		System.out.println("Rows are :" + x.length);
		System.out.println("Cols are :" + x[0].length);
		int rows=x.length;
		int cols=x[0].length;
		
		for(int rowNum=0; rowNum< rows; rowNum++  ) {
		for(int colNum=0; colNum< cols; colNum++  ) {
			System.out.println(x[rowNum][colNum]);
		}
	
}
		//object arrays can store multiple data types. 
		Object ar[] = new Object[4];
		ar[0] = "Hello";
		ar[2] = 012131;
		ar[3] = "333";
		ar[4] = true;
		
		
	}
}
	
}
