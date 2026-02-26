class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        if (!isLeaf(root)) {
            ans.add(root.data);   // Add root if not leaf
        }

        addLeft(root, ans);      // Left boundary
        addLeaves(root, ans);    // Leaf nodes
        addRight(root, ans);     // Right boundary (reverse)

        return ans;
    }

    // Check leaf
    boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    // Add left boundary (excluding leaf)
    void addLeft(Node root, ArrayList<Integer> ans) {
        Node curr = root.left;

        while (curr != null) {
            if (!isLeaf(curr)) {
                ans.add(curr.data);
            }

            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }

    // Add leaf nodes
    void addLeaves(Node root, ArrayList<Integer> ans) {
        if (root == null) return;

        if (isLeaf(root)) {
            ans.add(root.data);
            return;
        }

        if (root.left != null) {
            addLeaves(root.left, ans);
        }

        if (root.right != null) {
            addLeaves(root.right, ans);
        }
    }

    // Add right boundary (excluding leaf) in reverse
    void addRight(Node root, ArrayList<Integer> ans) {
        Node curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();

        while (curr != null) {
            if (!isLeaf(curr)) {
                temp.add(curr.data);
            }

            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        // Add in reverse order
        for (int i = temp.size() - 1; i >= 0; i--) {
            ans.add(temp.get(i));
        }
    }
}