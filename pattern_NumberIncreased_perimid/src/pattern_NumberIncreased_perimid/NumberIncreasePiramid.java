package pattern_NumberIncreased_perimid;



public class NumberIncreasePiramid {
	
	
	// static function 
	public static  void patternprint(int n ) {
		
		//outer loop for print number of row 
		for (int i = 1 ; i<=6 ;i++ ) {
			// inner loop logic for print number print on column 
			
			for (int j = 1 ; j<=i ;j++) {
				System.out.print(j +" ");
			}
			
			 System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		int n = 6 ;
		
		// directly call static function without object  else error occure when  we not make function static 
		patternprint(n);
		

	}

}
