package Tree;

public class BinaryTree_01_28 {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			this.left=null;
			left.right=null;
		}
		
	static	class BinaryTreeYT{
		
		static int idx=-1;
		public static Node buildTree(int nodes[]) {
			
			idx++;
			if(idx>= nodes.length || nodes[idx] == -1) {
				return null;
				
			}
			Node newNode= new Node(nodes[idx]);
			
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			
			return newNode;
			
			
			
		}
	}
	}

	public static void main(String[] args) {
		
		int nodes[]= {1,2,3,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BinaryTree_01_28 tree= new BinaryTree_01_28();
		
		
		
	//	System.out.println(tree.data);
		
		
		// TODO Auto-generated method stub

	}

}
