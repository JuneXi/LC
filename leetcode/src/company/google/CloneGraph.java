package company.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*OJ's undirected graph serialization:
Nodes are labeled uniquely.

We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
As an example, consider the serialized graph {0,1,2#1,2#2,2}.

The graph has a total of three nodes, and therefore contains three parts as separated by #.

First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
Second node is labeled as 1. Connect node 1 to node 2.
Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
Visually, the graph looks like the following:

       1
      / \
     /   \
    0 --- 2
         / \
         \_/*/

/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */

//BFS?
public class CloneGraph {
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if(node == null){
			return node;
		}
		
		UndirectedGraphNode newNode = new UndirectedGraphNode(node.label); //save for return
		HashMap<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();
		map.put(newNode.label, newNode);
		
		Queue<UndirectedGraphNode> q = new LinkedList<UndirectedGraphNode>();		
		q.add(node);
		//note: not q != null
		while(!q.isEmpty()){
			UndirectedGraphNode curNode = q.poll();
			for(UndirectedGraphNode neighbor : curNode.neighbors){
				if(!map.containsKey(neighbor.label)){
					UndirectedGraphNode copy = new UndirectedGraphNode(neighbor.label);
					map.put(copy.label, copy);
					q.add(neighbor);
				}
				//note here
				map.get(curNode.label).neighbors.add(map.get(neighbor.label));
				
			}
		}
        return newNode;
    	}

}
