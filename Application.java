package com.findsum.dfs;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeConstruction construction=new TreeConstruction();
		NodeInfo rootNode = construction.constructTree();//creates tree structure with 8 levels.
		
		TreeTraversalSumHelper helper=new TreeTraversalSumHelper();
		helper.getAllNodes(rootNode);
		helper.gettingSol(rootNode, 57 ,0,true);

	}

}
