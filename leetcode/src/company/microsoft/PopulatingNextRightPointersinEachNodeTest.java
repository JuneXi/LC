package company.microsoft;

public class PopulatingNextRightPointersinEachNodeTest {
	public static void main(String[] args){
		PopulatingNextRightPointersinEachNode app = new PopulatingNextRightPointersinEachNode();
		TreeLinkNode node = new TreeLinkNode(1);
		node.left = new TreeLinkNode(2);
		node.right = new TreeLinkNode(3);
		//node.left.left = new TreeLinkNode(4);
		app.connect(node);
		System.out.println(node.left.next.val);
		
	}

}
