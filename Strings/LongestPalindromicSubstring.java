public class LongestPalindromicSubstring{

    public static void main(String[] args) {

    }

    public String longestPalindrome(String a) {
        int i,j;
        int n=A.length();
        int p,q,l=0;
        int start,end =0;

        if(n==1){
            return A;
        }


        String B="";

        for(i=0; i<n-1; i++){
            p=i;
            q=i;
            while(p>=0 && q<n && A.charAt(p)==A.charAt(q)){
                if(q-p+1 > l){
                    l=q-p+1;
                    start=p;
                    end=q;
                }
                p--;q++;
            }
            if(B.length()<l){
                B="";
                for(j=start;j<=end;j++)
                    B+=A.charAt(j);
            }
            if(A.charAt(i)==A.charAt(i+1)){
                p=i;q=i+1;
                while(p>=0 && q<n && A.charAt(p)==A.charAt(q)){
                    if(q-p+1 > l){
                        l=q-p+1;
                        start=p;
                        end=q;
                    }
                    p--;q++;
                }
                if(B.length()<l){
                    B="";
                    for(j=start;j<=end;j++)
                        B+=A.charAt(j);
                }
            }
        }
        return B;
    }


}