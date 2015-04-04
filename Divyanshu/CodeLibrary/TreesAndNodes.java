package CodeLibrary;

import java.util.ArrayList;
import java.util.Stack;

public class TreesAndNodes {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	/**
	 * 
	 * @param root
	 * @return arraylist of the preorder traversal
	 */
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();

		if(root == null)
			return returnList;

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);

		while(!stack.empty()){
			TreeNode n = stack.pop();
			returnList.add(n.val);

			if(n.right != null){
				stack.push(n.right);
			}
			if(n.left != null){
				stack.push(n.left);
			}

		}
		return returnList;
	}
	/**
	 * 
	 * @param root
	 * @return inorder traversal of tree
	 */
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.
		ArrayList<Integer> lst = new ArrayList<Integer>();

		if(root == null)
			return lst; 

		Stack<TreeNode> stack = new Stack<TreeNode>();
		//define a pointer to track nodes
		TreeNode p = root;

		while(!stack.empty() || p != null){

			// if it is not null, push to stack
			//and go down the tree to left
			if(p != null){
				stack.push(p);
				p = p.left;

				// if no left child
				// pop stack, process the node
				// then let p point to the right
			}else{
				TreeNode t = stack.pop();
				lst.add(t.val);
				p = t.right;
			}
		}

		return lst;
	}
	/**
	 * 
	 * @param root
	 * @return post order traversal
	 */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
    	 
        ArrayList<Integer> lst = new ArrayList<Integer>();
 
        if(root == null)
            return lst; 
 
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
 
        TreeNode prev = null;
        while(!stack.empty()){
            TreeNode curr = stack.peek();
 
            // go down the tree.
            //check if current node is leaf, if so, process it and pop stack,
            //otherwise, keep going down
            if(prev == null || prev.left == curr || prev.right == curr){
                //prev == null is the situation for the root node
                if(curr.left != null){
                    stack.push(curr.left);
                }else if(curr.right != null){
                    stack.push(curr.right);
                }else{
                    stack.pop();
                    lst.add(curr.val);
                }
 
            //go up the tree from left node    
            //need to check if there is a right child
            //if yes, push it to stack
            //otherwise, process parent and pop stack
            }else if(curr.left == prev){
                if(curr.right != null){
                    stack.push(curr.right);
                }else{
                    stack.pop();
                    lst.add(curr.val);
                }
 
            //go up the tree from right node 
            //after coming back from right node, process parent node and pop stack. 
            }else if(curr.right == prev){
                stack.pop();
                lst.add(curr.val);
            }
 
            prev = curr;
        }
 
        return lst;
    }
    /**
     * 
     * @param root
     * @return max path sum
     */
    public int max = 0;
	public int maxPathSum(TreeNode root) {
		max = (root == null) ? 0 : root.val;
		findMax(root);
		return max;
	}
 
	public int findMax(TreeNode node) {
		if (node == null)
			return 0;
 
		// recursively get sum of left and right path
		int left = Math.max(findMax(node.left), 0);
		int right = Math.max(findMax(node.right), 0);
 
		//update maximum here
		max = Math.max(node.val + left + right, max);
 
		// return sum of largest path of current node
		return node.val + Math.max(left, right);
	}
}
