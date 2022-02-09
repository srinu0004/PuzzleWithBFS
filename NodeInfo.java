package com.findsum.dfs;

public class NodeInfo {
	
	private int value;
	
	private NodeInfo leftNode;
	
	private NodeInfo rightNode;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public NodeInfo getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(NodeInfo leftNode) {
		this.leftNode = leftNode;
	}

	public NodeInfo getRightNode() {
		return rightNode;
	}

	public void setRightNode(NodeInfo rightNode) {
		this.rightNode = rightNode;
	}

}
