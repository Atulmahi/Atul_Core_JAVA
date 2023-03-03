package ATUL_PACKAGE;
import java.util.*;
import java.util.jar.Attributes.Name;

import org.w3c.dom.Node;


public class counts {
	public static int sumofNode(Name root){
		if(root == null) {
	           return 0;
	       }


	       int leftNodes = countOfNodes(root.left);
	       int rightNodes = countOfNodes(root.right);
	       return leftNodes + rightNodes + 1;

		
	}

	public static void main(String[] args) {
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
	       counts tree = new counts();
	      
	       Node root = tree.buildTree(nodes);
	       
	       System.out.println(root.data);

		
	}

	private Node buildTree(int[] nodes) {
		// TODO Auto-generated method stub
		return null;
	}

}
