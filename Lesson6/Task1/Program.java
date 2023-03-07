package Lesson6.Task1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
//        TreeNode tr = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));
        TreeNode tr = new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)), new TreeNode(7, new TreeNode(6), new TreeNode(8)));
        System.out.println(preorderTraversal(tr));
    }
    static List<Integer> preorderTraversal(TreeNode tr){
        List<Integer> result = new ArrayList<>();
        if (tr != null){
            result.add(tr.val);
            result.addAll(preorderTraversal(tr.left));
            result.addAll(preorderTraversal(tr.right));
        }
        return result;
    }
}
