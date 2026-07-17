class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";

        for(String word : words) {
            if (inRow(word, first) || inRow(word, second) || inRow(word, third)) 
                list.add(word);
        }
        return list.toArray(new String[0]);
    } 
    
    private boolean inRow(String s, String row) {
        for(char c : s.toCharArray()) {
            if (row.indexOf(Character.toLowerCase(c)) == -1) return false;
        }
        return true;
    }
}
