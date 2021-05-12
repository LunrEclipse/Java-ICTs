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

public class BinarySearchTree{
    // create private TreeNode called myRoot
    private TreeNode myRoot;
    public BinarySearchTree(){
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
        else if(target.compareTo(root.getValue()) < 0)
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
        printInorderHelper(myRoot);
    }

    private void printInorderHelper(TreeNode root){
        // pre : root points to a binary search tree
        // post: prints the data fields of the tree using an inorder traversal
        //
        if(root != null) {
            printInorderHelper(root.getLeft());
            System.out.println((root.getValue()));
            printInorderHelper(root.getRight());
        }
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
            System.out.println((root.getValue()));
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
            System.out.println((root.getValue()));
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
            throw new NoSuchElementException();
        }
        else if (target.equals(node.getValue())){
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




}