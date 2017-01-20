
public int strStr(final String haystack, final String needle) {
        for(int i = 0; i < haystack.length(); i++ ) {
        for(int j = 0; j < needle.length() &&
        i+j < haystack.length(); j++ ) {
        if(needle.charAt(j) != haystack.charAt(i+j)) {
        break;
        } else if (j == needle.length()-1) {
        return i;
        }
        }
        }
        return -1;
        }