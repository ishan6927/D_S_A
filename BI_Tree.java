class BI_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right= null;
            this.left= null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node biuldTree(int nodes[]) {
            idx++;
            if(nodes[idx]== -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = biuldTree(nodes);
            newNode.right = biuldTree(nodes);

            return newNode;
            }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.biuldTree(nodes);
        System.out.println(root.data);
        }      
    }   
    