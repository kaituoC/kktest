package vip.dreamaker.kktest.thread;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mortbay.util.ajax.JSON;

/**
 * @author kaituo #date 2020/3/9 20:11
 */
public class Solution {

  public static void main(String[] args) {
    TreeNode node11 = new TreeNode(11, null, null);
    TreeNode node10 = new TreeNode(10, null, null);
    TreeNode node9 = new TreeNode(9, null, null);
    TreeNode node8 = new TreeNode(8, null, null);
    TreeNode node7 = new TreeNode(7, null, null);
    TreeNode node6 = new TreeNode(6, node10, node11);
    TreeNode node5 = new TreeNode(5, null, null);
    TreeNode node4 = new TreeNode(4, node8, node9);
    TreeNode node3 = new TreeNode(3, node6, node7);
    TreeNode node2 = new TreeNode(2, node4, node5);
    TreeNode node1 = new TreeNode(1, node2, node3);
    ArrayList<ArrayList<Integer>> print = print(node1);
    System.out.println(JSON.toString(print));
  }

  public static ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    if (pRoot == null) {
      return result;
    }
    ArrayList<TreeNode> printList = new ArrayList<>();
    printList.add(pRoot);
    int count = 1;
    while (!printList.isEmpty()) {
      ArrayList<TreeNode> tmpList = new ArrayList<>();
      ArrayList<Integer> tmp = new ArrayList<>();
      for (TreeNode node : printList) {
        tmp.add(node.val);
        if (node.left != null) {
          tmpList.add(node.left);
        }
        if (node.right != null) {
          tmpList.add(node.right);
        }
      }
      System.out.println(count + ",," + JSON.toString(tmp));
      ArrayList<Integer> tmpResult = new ArrayList<>();
      if (count % 2 == 0) {
        for (int i = tmp.size(); i > 0; i--) {
          tmpResult.add(tmp.get(i - 1));
        }
      } else {
        tmpResult = tmp;
      }
      // System.out.println("aaa"+tmp);
      result.add(tmpResult);
      printList = tmpList;
      count++;
    }
    return result;
  }

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public static class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

//    public TreeNode(int val) {
//      this.val = val;
//
//    }

  }
}
