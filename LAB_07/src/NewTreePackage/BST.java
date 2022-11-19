/*
Lab-07, created by Jonathan M 


Implementing a inorder traversal, without recursing. 

Implementing using a stack instead of recursion, and write a test program 
to prompt user to enter in 15 integers, store them in the BST, and then invoke 
the inorder method. 
 */
package NewTreePackage;

import NewTreePackage.AbstractTree; 
import NewTreePackage.NewStack; 
// importing the created Abstract tree and the newStack java files. 

import java.util.*; 
// utility class imported. 

public abstract class BST<E extends Comparable<E>>extends AbstractTree<E>{
    protected TreeNode<E> root; 
    protected int size = 0; 
    
       @Override
    public void inorder() {
        // If node is null return
       NewStack<TreeNode<E>> stack = new NewStack<>();
        // Initialize root node
        TreeNode<E> current = root;
        while (current != null || stack.getSize() > 0) {
            // Find the left most Node of the current Node
            while (current != null) {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left sub-tree */
                stack.push(current);
                current = current.left;
            }

            /* Current must be NULL at this point */
            current = stack.pop();
            // Display node value
            System.out.print(current.element + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            current = current.right;
        }
    }

    
}