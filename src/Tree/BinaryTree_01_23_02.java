package Tree;

public class BinaryTree_01_23_02 {
	
	static class Node{
		
		int data;
		
		Node left;
		Node right;
		
		Node(int data){
			
			this.data= data;
			this.right=null;
			this.left=null;
		}
		
		
	}
	
	static class BinaryTree{
		static int idx=-1;
		
		public static Node buildTree(int nodes[]) {
			
			idx++;
			
			if(idx>= nodes.length || nodes[idx]== -1) {
				return null;
			}
			Node newNode= new Node(nodes[idx]);
			
			newNode.left=buildTree(nodes);
			
			newNode.right=buildTree(nodes);
			return newNode;
			
			
		}
		
		
	}

	public static void main(String[] args) {
		int nodes[]= {1,2,3,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BinaryTree tree= new BinaryTree();
		
		Node root=tree.buildTree(nodes);
		
		System.out.println(root.data);
				
		// TODO Auto-generated method stub

	}

}
