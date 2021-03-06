/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        //inOrderPrint(root, 1);
        if (root==null) return true;
        
        return isBSTMinMax(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isBSTMinMax(Node node, int min, int max) {
        if (node==null) return true;
        
        if (node.data < min || node.data > max) return false;
        
        return isBSTMinMax(node.left, min, node.data-1) && isBSTMinMax(node.right, node.data+1, max);
    }

    // prints tree traversing left to right, used to see data
    public void inOrderPrint(Node root, int level) {
        if (root==null) return;
        
        if (root.left!=null) {
            inOrderPrint(root.left, level+1);
        }
        
        System.out.println(level + ": " + root.data);
        
        if (root.right!=null) {
            inOrderPrint(root.right, level+1);
        }
    }

