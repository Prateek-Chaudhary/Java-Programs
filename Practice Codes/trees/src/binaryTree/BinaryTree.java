package binaryTree;

import java.util.*;

public class BinaryTree {
	
	private Scanner sc = new Scanner(System.in);
	public Node binaryTree() {
		Node root;
		System.out.println("Enter the element : ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter the left of "+data);
		root.left = binaryTree();
		System.out.println("Enter the right of "+data);
		root.right = binaryTree();
		
		return root;
	}
	
	public void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public void preOrder(Node root) {
		if(root == null) return;
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	public void levelOrder(Node root) {
		if(root == null) return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node current = q.poll();
			System.out.print(current.data+" ");
			if(current.left != null)
				q.add(current.left);
			if(current.right != null)
				q.add(current.right);
		}
	}
	
	public int height(Node root) {
		if(root == null) return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}
	
	public int size(Node root) {
		if(root == null) return 0;
		return size(root.left) + size(root.right) + 1;
	}
	
	private static void addLeftElement(Node root, Map<Integer, Integer> map, int level) {
		if(root == null) return;
		map.putIfAbsent(level, root.data);
		addLeftElement(root.left, map, level+1);
		addLeftElement(root.right, map, level+1);
	}
	
	public ArrayList<Integer> leftOrder(Node root) {
		if(root == null) return null;
		Map<Integer, Integer> map = new HashMap<>();
		addLeftElement(root, map, 0);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> m : map.entrySet())
			list.add(m.getValue());
		
		return list;
		
	}
	
	private static void addRightElement(Node root, Map<Integer, Integer> map, int level) {
		if(root == null) return;
		map.putIfAbsent(level, root.data);
		addRightElement(root.right, map, level+1);
		addRightElement(root.left, map, level+1);
	}
	
	public ArrayList<Integer> rightOrder(Node root) {
		if(root == null) return null;
		Map<Integer, Integer> map = new HashMap<>();
		addRightElement(root, map, 0);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> m : map.entrySet())
			list.add(m.getValue());
		
		return list;
		
	}
	
	public void topView(Node root) {
		if(root == null) return;
		Queue<Pair> q = new LinkedList<Pair>();
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		q.add(new Pair(0, root));
		while(!q.isEmpty()) {
			Pair p = q.poll();
			map.putIfAbsent(p.hd, p.node.data);
			if(p.node.left != null)
				q.add(new Pair(p.hd-1, p.node.left));
			if(p.node.right != null)
				q.add(new Pair(p.hd+1, p.node.right));
		}
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			System.out.print(m.getValue()+" ");
		}
	}
	
	public void bottomView(Node root) {
		if(root == null) return;
		Queue<Pair> q = new LinkedList<Pair>();
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		q.add(new Pair(0, root));
		while(!q.isEmpty()) {
			Pair p = q.poll();
			map.put(p.hd, p.node.data);
			if(p.node.left != null)
				q.add(new Pair(p.hd-1, p.node.left));
			if(p.node.right != null)
				q.add(new Pair(p.hd+1, p.node.right));
		}
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			System.out.print(m.getValue()+" ");
		}
	}
	
	public int max(Node root) {
		if(root == null) return 0;
		return Math.max(root.data, Math.max(max(root.left), max(root.right)));
	}
	
	public int lowestAncestor(Node root, int n1, int n2) {
		if(root == null) return 0;
		if(root.data == n1 || root.data == n2) return root.data;
		int l = lowestAncestor(root.left, n1, n2);
		int r = lowestAncestor(root.right, n1, n2);
		if(l == 0) return r;
		if(r == 0) return l;
		return root.data;
	}
	private int diameter = 0;
	public int diameter(Node root) {
		if(root == null) return 0;
		return Math.max(diameter, (height(root.left) + height(root.right) + 1));
	}
}
