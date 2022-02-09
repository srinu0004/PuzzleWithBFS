package com.findsum.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeTraversalSumHelper {
	
	private List<Integer> nodesVisited =new ArrayList<Integer> ();
	private List<Integer> allNodes =new ArrayList<Integer> ();
	private Map<Integer,List<Integer>> map= new HashMap<Integer,List<Integer>>();
	
	public List<Integer> getAllNodes(NodeInfo rootNode){
		if(null!=rootNode) {
			allNodes.add(rootNode.getValue());
			if(null!=rootNode.getLeftNode()) {
				getAllNodes(rootNode.getLeftNode());
			}
			if(null!=rootNode.getRightNode()) {
				getAllNodes(rootNode.getRightNode());
			}
		}
		return allNodes;
	}
	
	
	public void gettingSol(NodeInfo currentTreeNode,int sumValue,int currentSum,boolean isRootNode) {
		

		if(null != currentTreeNode) {
			int val=currentTreeNode.getValue();
			nodesVisited.add(val);
			if(null!= currentTreeNode.getLeftNode()) {
				int value=currentTreeNode.getLeftNode().getValue();	
				if(isRootNode) {
					if(val+value < sumValue) {
						map.put((val+currentTreeNode.getLeftNode().getValue()), Arrays.asList(val,value));
						gettingSol(currentTreeNode.getLeftNode(), sumValue,(val+currentTreeNode.getLeftNode().getValue()), false);
					}else if(val+value == sumValue) {
						map.put((val+currentTreeNode.getLeftNode().getValue()), Arrays.asList(val,value));
						System.out.println("the tracing path for "+sumValue+"is: "+map.get(sumValue));
					}
				}else {
					List<Integer> list = map.get(currentSum);
					List<Integer> abc=new ArrayList<Integer>(list);		
					abc.add(value);
					if(currentSum+value < sumValue) {
						map.put(currentSum+value, abc);
						gettingSol(currentTreeNode.getLeftNode(), sumValue,(currentSum+currentTreeNode.getLeftNode().getValue()), false);
					}else if(currentSum+value == sumValue) {
						map.put(currentSum+value, abc);
						System.out.println("the tracing path for "+sumValue+"is: "+map.get(sumValue));
					}
				}
				
			}
			if(null!=currentTreeNode.getRightNode()) {
				int value=currentTreeNode.getRightNode().getValue();
				if(isRootNode) {
					if (val + value < sumValue) {
						map.put((val+currentTreeNode.getRightNode().getValue()), Arrays.asList(val,value));
						gettingSol(currentTreeNode.getRightNode(), sumValue,(val+currentTreeNode.getRightNode().getValue()), false);
					}else if(val+value == sumValue) {
						map.put((val+currentTreeNode.getLeftNode().getValue()), Arrays.asList(val,value));
						System.out.println("the tracing path is: "+map.get(sumValue));
					}
				}else {
					List<Integer> list = map.get(currentSum);
					List<Integer> abc=new ArrayList<Integer>(list);		
					abc.add(value);
					if(currentSum+value < sumValue) {
						map.put(currentSum+value, abc);
						gettingSol(currentTreeNode.getRightNode(), sumValue,(currentSum+currentTreeNode.getRightNode().getValue()), false);
					}else if(currentSum+value == sumValue) {
						map.put(currentSum+value, abc);
						System.out.println("the tracing path for "+sumValue+"is: "+map.get(sumValue));
					}
				}
				
			}
			
			if(null==currentTreeNode.getLeftNode() && null==currentTreeNode.getRightNode()) {
				List<Integer> list = map.get(currentSum);
				if(!list.contains(val)) {
					List<Integer> abc=new ArrayList<Integer>(list);		
					abc.add(val);
					if(currentSum+val < sumValue) {
						map.put(currentSum+val, abc);
						if(nodesVisited.containsAll(allNodes) && nodesVisited.size()==allNodes.size()) {
							System.out.println("the tracing path does not exist for given sum value :"+sumValue);
						}
					}else if(currentSum+val == sumValue) {
						map.put(currentSum+val, abc);
						System.out.println("the tracing path for "+sumValue+"is: "+map.get(sumValue));
					}else {
						if(nodesVisited.containsAll(allNodes) && nodesVisited.size()==allNodes.size()) {
							System.out.println("the tracing path does not exist for given sum value :"+sumValue);
						}
					}
				}else {
					if(nodesVisited.containsAll(allNodes) && nodesVisited.size()==allNodes.size()) {
						System.out.println("the tracing path does not exist for given sum value :"+sumValue);
					}
				}
			}
			
		}
	}

}
