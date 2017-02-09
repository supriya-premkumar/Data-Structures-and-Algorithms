
public class ImplementBinaryTree{
    ImplementBinaryTree left;
    ImplementBinaryTree right;
    int data;


    public ImplementBinaryTree(int data){
        this.data = data;
    }
    public static void main(String[] args){

    }

    public void insert(int value){
        if(value <= data){
            if(left == null){
                left = new ImplementBinaryTree(value);
            }else{
                left.insert(value);
            }
        }else{
            if(right == null){
                right = new ImplementBinaryTree(value);
            }else{
                right.insert(value);
            }
        }
    }

    public boolean contains(int value){
        if(value == data){
            return true;
        }
        else if(value < data){
            if(left == null){
                return false;
            }else{
                left.contains(value);
            }

        }else{
            if(right == null){
                return false;
            }else{
                right.contains(value);
            }
        }

    }

    //left -> root -> right
    public void printInorder(int data){
        if(left! = null){
            left.printInorder();
        }
        System.out.println(data);
        if(right!= null){
            right.printInorder();
        }

    }


}