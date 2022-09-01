package assigment1;

public class Patternstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//i for rows and j for columns
		// height denotes the number of rows we want print
		int i,j,row =5;
		//outer loop for rows 
		for(i=0;i<row;i++) {
			//inner  loop for columns
			for(j=0;j<=i;j++) {
				// star print
				System.out.print("*");
			}
			//throws the cursor in a newline after printing eachline 
			System.out.println();
		}
		
	}

}
