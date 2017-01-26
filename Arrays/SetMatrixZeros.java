/*************************************************************
 * *******************DESRCIPTION*****************************
 *
 *
 *
 *
 *
 **************************************************************/





public class SetMatrixZeros{
    public static void main(String[] args){
    }

    public static void setZeros(ArrayList<ArrayList<Integer>> matrix){
        if(matrix.size() == 0 || matrix == null || matrix.get(0).size() ==0){
            return;
        }

        int m = matrix.size();
        int n = matrix.get(0).size();

        List<Boolean> row = new ArrayList<Boolean>();
        List<Boolean> column = new ArrayList<Boolean>();

        for(int i =0 ; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix.get(i).get(j) == 0){
                    row.get(i) = true;
                    row.get(j) = true;
                }
            }
        }

        for(int i = 0; i<m; i++){
            if(row.get(i) == true){
                for(int j = 0; j<n; j++){
                    matrix.get(i).get(j) = 0;
                }
            }
        }

        for(int j = 0; j<n; j++){
            if(column.get(j) == true){
                for(int i = 0; i<m; i++){
                    matrix.get(i).get(j) = 0;
                }
            }
        }

    }


}