
class SolutionNo6 {
    public String convert(String s, int numRows) {
        
        if(numRows == 1) return s;
        
        List<StringBuilder> rows = new ArrayList<>();
        for(int i=0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());
        
        int curRow = 0;
        boolean goingDown = false;
        
        for(char ch: s.toCharArray()){
            rows.get(curRow).append(ch);
            if(curRow ==0 || curRow == numRows -1) goingDown =!goingDown;
            curRow += goingDown?1:-1;
        }
        
        StringBuilder ret = new StringBuilder();
        for(StringBuilder row: rows) ret.append(row);
        return ret.toString();
    }
}