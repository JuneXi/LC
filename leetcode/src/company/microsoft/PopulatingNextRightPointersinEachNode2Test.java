
package company.microsoft;

public class PopulatingNextRightPointersinEachNode2Test {
	public static void main(String[] args){
		PopulatingNextRightPointersinEachNode2 app = new PopulatingNextRightPointersinEachNode2();
		TreeLinkNode node = new TreeLinkNode(1);
		node.left = new TreeLinkNode(2);
		node.right = new TreeLinkNode(3);
		node.left.right = new TreeLinkNode(4);
		node.right.right = new TreeLinkNode(5);
		app.connect(node);
		System.out.println(node.left.right.next.val);
	}

}
