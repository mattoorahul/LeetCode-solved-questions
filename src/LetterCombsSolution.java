
// 17. Letter Combinations of a Phone Number
class LetterCombsSolution {
    public List<String> letterCombinations(String digits) {
        return letterCombinations(digits,0);  
    }
    
    private List<String> letterCombinations(String digits, int i) {
        if(digits.length() == 0)
            return new ArrayList<String>();
        
        if(i == digits.length())
            return new ArrayList<String>();
        
        List<String> combinations = letterCombinations(digits, i+1);
        List<String> finalCombinations = new ArrayList<String>();
        String options = chars(digits.charAt(i));
        
        for(int j=0; j<options.length() ;j++){
            for(int k=0; k<combinations.size(); k++){
                finalCombinations.add(options.substring(j,j+1) + combinations.get(k));    
                    
            }
            
            if(combinations.size() ==0){
                 finalCombinations.add(options.substring(j,j+1));
            }
        }
        
        return finalCombinations;
    }
    
    private static String chars (char ch){
        
        switch(ch){
            case '2' : return "abc";
                
            case '3' : return "def";
                
            case '4' : return "ghi";
                
            case '5' : return "jkl";      
                
            case '6' : return "mno";     
                
            case '7' : return "pqrs";   
                
            case '8' : return "tuv"; 
                
            case '9' : return "wxyz";     
                
        }
        
        return "";
    }
}