import java.util.*;

/**
 *  Implements a Binary Search Tree
 *
 * @author     G. Peck
 * @created    July 2, 2003
 *
 * Modified by Jason Quesenberry and Nancy Quesenberry
 * February 9, 2006
 */

public class BinarySearchTree3{
    // create private TreeNode called myRoot
    private TreeNode myRoot;
    public BinarySearchTree3(){
        myRoot = null;
    }

    public void insert(Comparable next){
        // post: next added to tree so as to preserve binary search tree
        //
        myRoot = insertHelper(myRoot, next);
    }

    private TreeNode insertHelper(TreeNode root, Comparable next){
        // pre : root points to a binary search tree
        // post: next added to tree so as to preserve binary search tree
        //
        if(root == null)
            return new TreeNode(next, null, null);
        else if(next.compareTo(root.getValue()) < 0) {
            if(root.getLeft() == null) {
                root.setLeft(new TreeNode(next, null, null));
                return root;
            }
            else {
                root.setLeft(insertHelper(root.getLeft(), next));
                return root;
            }
        }
        else{
            if(root.getRight() == null) {
                root.setRight(new TreeNode(next, null, null));
                return root;
            }
            else {
                root.setRight(insertHelper(root.getRight(), next));
                return root;
            }
        }
    }

    public Object find(Comparable target){
        return findHelper(myRoot, target);
    }

    private Object findHelper(TreeNode root, Comparable target){
        if(root == null)
        {
            return null;
        }
        else if(target.compareTo(root.getValue()) == 0)
        {
            return root.getValue();
        }
        else if(findHelper(root.getLeft(), target) != null)
        {
            return(findHelper(root.getLeft(), target));
        }
        else
        {
            return findHelper(root.getRight(), target);
        }

    }

    public int countNodes(){
        return countNodesHelper(myRoot);
    }

    private int countNodesHelper(TreeNode root){
        if(root != null) {
            return 1 + countNodesHelper(root.getLeft()) + countNodesHelper(root.getRight());
        }
        return 0;
    }

    public void printInorder(){
        // post: prints the data fields of the tree, one per line
        //
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode temp = myRoot;
        do{
            while(temp != null)
            {
                stk.push(temp);
                temp = temp.getLeft();
            }
            if(!stk.isEmpty())
            {
                temp = stk.pop();
                System.out.print(temp.getValue());
                temp = temp.getRight();
            }
        }while(   !(temp == null) || !stk.isEmpty());
    }


    public void printPreOrder(){
        // post: prints the data fields of the tree, one per line
        //
        printPreOrderHelper(myRoot);
    }

    private void printPreOrderHelper(TreeNode root){
        // pre : root points to a binary search tree
        // post: prints the data fields of the tree using an inorder traversal
        //
        if(root != null) {
            System.out.print((root.getValue()));
            printPreOrderHelper(root.getLeft());
            printPreOrderHelper(root.getRight());
        }
    }

    public void printPostOrder(){
        // post: prints the data fields of the tree, one per line
        //
        printPostOrderHelper(myRoot);
    }

    private void printPostOrderHelper(TreeNode root){
        // pre : root points to a binary search tree
        // post: prints the data fields of the tree using an inorder traversal
        //
        if(root != null) {
            printPostOrderHelper(root.getLeft());
            printPostOrderHelper(root.getRight());
            System.out.print((root.getValue()));
        }
    }


    public void delete(Comparable target){
        // post: deletes a node with data equal to target, if present,
        //       preserving binary search tree property
        //
        myRoot = deleteHelper(myRoot, target);
    }

    private TreeNode deleteHelper(TreeNode node, Comparable target){
        // pre : node points to a non-empty binary search tree
        // post: deletes a node with data equal to target, if present,
        //       preserving binary search tree property
        if (node == null) {
            System.out.println("Not Removed");
            return null;
        }
        else if (target.equals(node.getValue())){
            System.out.println("Node Removed");
            return deleteTargetNode(node);
        }
        else if (target.compareTo(node.getValue()) < 0) {
            node.setLeft(deleteHelper(node.getLeft(), target));
            return node;
        }
        else{ //target.compareTo(root.getValue()) > 0
            node.setRight(deleteHelper(node.getRight(), target));
            return node;
        }

    }

    private TreeNode deleteTargetNode(TreeNode target){
        if (target.getRight() == null) {
            return target.getLeft();
        }
        else if (target.getLeft() == null) {
            return target.getRight();
        }
        else if (target.getRight().getLeft() == null) {
            target.setValue(target.getRight().getValue());
            target.setRight(target.getRight().getRight());
            return target;
        }
        else{ // left child has right child

            TreeNode marker = target.getRight();
            while (marker.getLeft().getLeft() != null)
                marker = marker.getLeft();
            target.setValue(marker.getLeft().getValue());
            marker.setLeft(marker.getLeft().getRight());
            return target;
        }
    }

    public int countLeaves(){
        return countLeaves(myRoot);
    }

    private int countLeaves (TreeNode root){
        if(root != null)
        {
            if(root.getLeft() == null && root.getRight() == null)
                return 1;
            else
                return countLeaves(root.getRight()) + countLeaves(root.getLeft());
        }
            return 0;
    }

    public int height(){
        return height(myRoot);
    }

    private int height (TreeNode root){
        if(root != null)
        {
            if(root.getLeft() == null && root.getRight() == null)
                return 1;
            else if(root.getLeft() == null)
                return 1 + height(root.getRight());
            else if(root.getRight() == null)
                return 1 + height(root.getLeft());
            else
                return Math.max(height(root.getLeft()) + 1, height(root.getRight()) + 1);
        }
        return 0;
    }

    public int width(){
        return width(myRoot);
    }

    private int width (TreeNode root){
        if(root!= null)
        {
            int leftWidth = width(root.getLeft());
            int rightWidth = width(root.getRight());
            int height = height(root.getRight()) + height(root.getLeft()) + 1;
            return maximum(leftWidth, rightWidth, height);
        }
        return 0;
    }

    private int maximum (int a, int b, int c)
    {
        if(a >= b && a >= c)
            return a;
        else if(b >= a && b >=c )
            return b;
        else
            return c;
    }


    public void clearTree()
    {
        myRoot = null;
    }

    public void interchange()
    // post: tree becomes a mirror image of itself
    {
        interchange(myRoot);
    }

    private void interchange(TreeNode root)
    {
        if(root != null)
        {
            interchange(root.getLeft());
            interchange(root.getRight());
            TreeNode temp = root.getLeft();
            root.setLeft(root.getRight());
            root.setRight(temp);

        }
    }

    public boolean isAncestor(Comparable ancestor, Comparable descendant){
        // post: returns true if descendant is a "child" of ancestor; false otherwise
        //       i.e., true if descendant belongs to ancestor's subtree
        return isAncestor(myRoot, ancestor, descendant);
    }

    public boolean isAncestor(TreeNode root, Comparable a, Comparable d){
        if (findPtr(findPtr(root, a), d) != null && a.compareTo(d) != 0)
            return true;
        else
            return false;
    }

    private TreeNode findPtr(TreeNode root, Comparable target){
        if(root != null)
        {
            if(target.compareTo(root.getValue()) == 0)
                return root;
            else if(target.compareTo(root.getValue()) < 0)
                return findPtr(root.getLeft(),target);
            else
                return findPtr(root.getRight(), target);
        }
        else
            return null;

    }

    public void printLevel()
    // post: prints the data fields of the tree, one per line
    {
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        TreeNode temp = myRoot;
            que.add(temp);
            while (!que.isEmpty()) {
                temp = que.remove();
                if(temp != null) {
                    que.add(temp.getLeft());
                    que.add(temp.getRight());
                    System.out.print(temp.getValue());
                }
            }
    }


}