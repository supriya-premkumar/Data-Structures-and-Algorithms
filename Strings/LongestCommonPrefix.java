public String longestCommonPrefix(ArrayList<String> A) {

        String result = "";
        String lcp;
        int length = Integer.MAX_VALUE;

        for(int i = 0; i < A.size()-1; i++){
        if(length > A.get(i).length())
        length = A.get(i).length();
        }

        if(length == 0)
        return "";
        for(int j = 0; j < length; j++){
        char prev = '0';
        for(int i = 0; i < A.size(); i++){
        if(i == 0){
        prev = A.get(i).charAt(j);
        continue;
        }
        if(A.get(i).charAt(j) != prev)
        result = A.get(i).substring(0, j);
        return result;
        }
        }
        lcp = A.get(0).substring(0, length);
        return lcp;
        }