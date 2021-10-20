package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	   extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	   extractedMethod(edgeList, p);
      // other implementation
      return null;
   }

   private <C extends B> void extractedMethod(List<C> items, String p) {
	   for (C item : items) {
		   if (item.contains(p)) {
			   System.out.println(item);
		   }
	   }
   }

}

class B {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}
class Node extends B {}
class Edge extends B {}
