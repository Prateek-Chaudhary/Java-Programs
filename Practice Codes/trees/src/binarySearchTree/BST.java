package binarySearchTree;

import java.util.Scanner;

public class BST {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = null;
//		Scanner sc = new Scanner(System.in);
//		for(int i = 1; i <= 7; i++) {
//			System.out.println("Enter the element :");
//			int n = sc.nextInt();
//			root = tree.insert(root, n);
//		}
		root = bst.insert(root, 40);
        root = bst.insert(root, 30);
        root = bst.insert(root, 35);
        root = bst.insert(root, 25);
        root = bst.insert(root, 23);
        root = bst.insert(root, 28);
        root = bst.insert(root, 50);
        root = bst.insert(root, 45);
        root = bst.insert(root, 43);
        root = bst.insert(root, 47);
        root = bst.insert(root, 60);
        root = bst.insert(root, 58);
        root = bst.insert(root, 63);
/*		bst.inOrder(root);
		System.out.println(bst.search(root, 35));
		root = bst.delete(root, 45);
		bst.inOrder(root);
*/
		System.out.println(bst.isBST(root));
		System.out.println(bst.ceilValue(root, 26));
	}
}
