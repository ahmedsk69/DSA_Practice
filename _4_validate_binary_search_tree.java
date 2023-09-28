import model.TreeNode;
public class _4_validate_binary_search_tree {
      private static long minval= Long.MIN_VALUE;
        public static void main(String[] args) {
            System.out.println(isValidBST(new TreeNode(0)));
        }
    private static boolean isValidBST(TreeNode root) {
          if(root ==null) return true;
      if(!isValidBST(root.left)) return false;

      if(minval>=root.val) return false;

      minval=root.val;
      
      if(!isValidBST(root.right)) return false;

      return true;
    } 
    
}