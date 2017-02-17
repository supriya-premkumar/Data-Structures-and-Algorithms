public class Solution {
	public ArrayList<String> generateParenthesis(int a) {
	    ArrayList<String> result = new ArrayList<String>();
        for(int i =1; i <= a; i++)
            Parenthesis("", 0, 0, i, result, a);

        return result;
	}

	private static void Parenthesis(String output, int openParam, int closeParam, int pairs, ArrayList<String> result, int a){
        if(openParam == pairs && closeParam == pairs && output.length() == 2*a){
            result.add(output);
        }
        else{
            if(openParam < pairs){
                Parenthesis(output + "(", openParam + 1, closeParam, pairs, result, a);
            }
            if(closeParam < openParam){
                Parenthesis(output + ")", openParam, closeParam + 1, pairs, result, a);
            }
        }
    }
}
