package Tree;

public class BinaryTree_01_26 {
	
static	class Node{
		
		int data;
		Node left;
		Node right;
		
	     Node(int data){
	    	 this.data= data;
	    	 this.left=null;
	    	 this.right=null;
	     }
	}
	
     static class BinaryTree{
    	 
    static int idx=-1;
    	 
    	 public static Node buildTree(int nodes[]) {
    		 idx++;
    		 
    		 if(idx>= nodes.length || nodes[idx] == -1) {
    			 return null;
    		 }
    		 
    		 Node newNode = new Node(nodes[idx]);
    		 
    		 newNode.left= buildTree(nodes);
    		 newNode.right= buildTree(nodes);
    		 
    		 return newNode;
    		 
    	 }
     }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
