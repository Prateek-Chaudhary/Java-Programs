package binarySearchTree;

public class BinarySearchTree {
	public Node insert(Node root, int key) {
		if(root == null) return new Node(key);
		if(key < root.data) root.left = insert(root.left, key);
		if(key > root.data) root.right = insert(root.right, key);
		return root;
	}
	
	public void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public boolean search(Node root, int key) {
		while(root != null) {
			if(root.data == key) return true;
			if(root.data > key) root = root.left;
			else if(root.data < key) root = root.right;
		}
		return false;
	}
	
	private int minValue(Node root) {
		int min = Integer.MAX_VALUE;
		while(root != null) {
			min = root.data;
			root = root.left;
		}
		return min;
	}
	
	public Node delete(Node root, int key) {
		if(root == null) return root;
		if(key < root.data) root.left = delete(root.left, key);
		else if(key > root.data) root.right = delete(root.right, key);
		else {
			if(root.left == null) return root.right;
			else if(root.right == null) return root.left;
			else {
				root.data = minValue(root.right);
				root.right = delete(root.right, root.data);
			}
		}
		return root;
	}
	
	private int maximum(Node root) {
		if(root == null) return Integer.MIN_VALUE;
		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}
	
	private int minimum(Node root) {
		if(root == null) return Integer.MAX_VALUE;
		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}
	
	public boolean isBST(Node root) {
		if(root == null) return true;
		int leftMax = maximum(root.left);
		int rightMin = minimum(root.right);
		if(leftMax < root.data && rightMin > root.data) return true;
		return false;
	}
	/*
	private boolean checkBST(Node root, int min, int max) {
		if(root == null) return true;
		if(root.data < min || root.data > max) return false;
		return checkBST(root.left, min, root.data-1) && checkBST(root.right, root.data+1, max);
	}
	
	public boolean isBST(Node root) {
		if(root == null || (root.left == null && root.right == null)) return true;
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}*/
	/*
	int prev = 0;
	public boolean isBST(Node root) {
		if(root != null) {
			if(!isBST(root.left)) return false;
			else if(prev != 0 && prev >= root.data) return false;
			else {
				prev = root.data;
				return isBST(root.right);
			}
		}
		return true;
	}*/
	
	public int floorValue(Node root, int key) {
		int ans = 0;
		while(root != null) {
			if(root.data == key) return root.data;
			if(root.data > key) root = root.left;
			else {
				ans = root.data;
				root = root.right;
			}
		}
		return ans;
	}
	
	public int ceilValue(Node root, int key) {
		int ans = 0;
		while(root != null) {
			if(root.data == key) return root.data;
			if(root.data > key) {
				ans = root.data;
				root = root.left;
			}
			else root = root.right;
		}
		return ans;
	}
}
