package vip.dreamaker.kktest.offer;

import java.util.Stack;

/**
 * @author kaituo #date 2020/3/15 22:22
 */
public class Offer {

  public static void main(String[] args) {
    printListReversinglyIteratively();
    
  }

  public static void printListReversinglyIteratively( ) {
    Stack<String> stack = new Stack<>();
    stack.push("a");
    stack.push("b");
    String pop = stack.pop();
    System.out.println(pop);

  }
}
