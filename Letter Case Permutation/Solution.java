import java.util.*;
class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        helper(S, 0, result);
        return result;
    }

    public void helper(String S, int position, List<String> result){
        if(position == S.length()){
            result.add("");           
        }
        else {
            helper(S, position+1, result);
            
           int listSize = result.size();
            for(int i=0;i<listSize;i++){

                
                if(Character.isDigit(S.charAt(position))){
                    String temp = result.get(0);
                    result.remove(0);
                    temp = S.charAt(position) + temp; 
                    result.add(temp);             
                }
                else {                    
                    String temp = result.get(0);
                    result.remove(0);
                    String lower = (S.charAt(position)+"").toLowerCase();
                    String upper = (S.charAt(position)+"").toUpperCase();                   
                    result.add(lower + temp);          
                    result.add(upper + temp);      
                }                
            }              
        }
    }
}

class Solution {
    public static void main(String[] args){
        System.out.println("LetterCasePermutation");
        LetterCasePermutation obj = new LetterCasePermutation();
        String S = "3z4";
        System.out.println(obj.letterCasePermutation(S));
    }
}