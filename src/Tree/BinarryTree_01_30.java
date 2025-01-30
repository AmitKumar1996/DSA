package Tree;

import java.util.*;

public class BinarryTree_01_30 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        public static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;

            // Stack Trace: Print the recursion depth and current index
            System.out.println(" ".repeat(idx * 2) + "Calling buildTree with idx = " + idx + ", value = " + (idx < nodes.length ? nodes[idx] : "OUT OF BOUNDS"));

            if (idx >= nodes.length || nodes[idx] == -1) {
                System.out.println(" ".repeat(idx * 2) + "Returning NULL (idx = " + idx + ")");
                return null;
            }

            // Create new node
            Node newNode = new Node(nodes[idx]);
            System.out.println(" ".repeat(idx * 2) + "Created Node: " + newNode.data);

            // Recursively build left subtree
            newNode.left = buildTree(nodes);
            System.out.println(" ".repeat(idx * 2) + "Back from left subtree of " + newNode.data);

            // Recursively build right subtree
            newNode.right = buildTree(nodes);
            System.out.println(" ".repeat(idx * 2) + "Back from right subtree of " + newNode.data);

            System.out.println(" ".repeat(idx * 2) + "Returning Node: " + newNode.data);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 3, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Root Node: " + root.data);
    }
}
