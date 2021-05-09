
public class CountVowelString1641 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		System.out.println(countVowelStrings(n));
		System.out.println(countVowelStringsMem(n));
	}

	public static int countVowelStrings(int n) {
		return countVowelStrings(n, "");
	}

	public static int countVowelStrings(int n, String input) {
		if (n == 0) {
			return 1;
		}
			
//		if (n == 1)
//			return 5;

		int sum = 0;
		String output = "";
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (char ch : vowels) {
			if(input.length() == 0) {
				sum += countVowelStrings(n - 1, input + ch);
			}else if (input.charAt(input.length() - 1) - ch <= 0) {
				sum += countVowelStrings(n - 1, input + ch);
			}

		}

		return sum;
	}
	
	public static int countVowelStringsMem(int n) {
		
        int storage[][] = new int[5][n+1];
        
        for(int i=0;i<5;i++){
        	for(int j=0;j<=n;j++) {
        		if(i==0 || j==0 || j==1) {
        			storage[i][j] = 1;
        		} else {
        			storage[i][j] = storage[i-1][j] + storage[i][j-1];
        		}
        		
        	}
            
        }
        
        return storage[4][n];
    }

	
	
//	public static int countVowelStrings_dp(int n) {
//		if (n == 0) {
//			
//			return 1;
//		}
//
//		int sum = 0;
//		String output = "";
//		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
//		for (char ch : vowels) {
//			if(input.length() == 0) {
//				sum += countVowelStrings(n - 1, input + ch);
//			}else if (input.charAt(input.length() - 1) - ch <= 0) {
//				sum += countVowelStrings(n - 1, input + ch);
//			}
//
//		}
//
//		return sum;
//	}

}
