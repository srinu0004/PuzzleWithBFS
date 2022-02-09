package com.findsum.dfs;

public class TreeConstruction {
	
	public NodeInfo constructTree() {
		
		NodeInfo rootNode=new NodeInfo();//root node creation
		rootNode.setValue(3);
		
		NodeInfo childNode1=new NodeInfo();//two child nodes creation for root
		NodeInfo childNode2=new NodeInfo();
		childNode1.setValue(2);
		childNode2.setValue(6);
		
		rootNode.setLeftNode(childNode1);
		rootNode.setRightNode(childNode2);//Adding ChildNodes with values 2,6 to RootNode.
		
		NodeInfo childNode3=new NodeInfo();
		NodeInfo childNode4=new NodeInfo();
		NodeInfo childNode5=new NodeInfo();
		childNode3.setValue(8);
		childNode4.setValue(5);
		childNode5.setValue(1);
		
		childNode1.setLeftNode(childNode3);//Adding ChildNode with value 8 to ChildNode1.	
		childNode2.setLeftNode(childNode4);
		childNode2.setRightNode(childNode5);//Adding ChildNodes with values 5,1 to ChildNode2.
		
		NodeInfo childNode6=new NodeInfo();
		NodeInfo childNode7=new NodeInfo();
		NodeInfo childNode8=new NodeInfo();
		NodeInfo childNode9=new NodeInfo();
		NodeInfo childNode10=new NodeInfo();
		childNode6.setValue(10);
		childNode7.setValue(11);
		childNode8.setValue(7);
		childNode9.setValue(4);
		childNode10.setValue(9);
		
		childNode3.setLeftNode(childNode6);
		childNode3.setRightNode(childNode7);
		childNode4.setLeftNode(childNode8);
		childNode5.setLeftNode(childNode9);
		childNode5.setRightNode(childNode10);
		
		NodeInfo childNode11=new NodeInfo();
		NodeInfo childNode12=new NodeInfo();
		NodeInfo childNode13=new NodeInfo();
		NodeInfo childNode14=new NodeInfo();
		NodeInfo childNode15=new NodeInfo();
		NodeInfo childNode16=new NodeInfo();
		NodeInfo childNode17=new NodeInfo();
		NodeInfo childNode18=new NodeInfo();
		childNode11.setValue(6);
		childNode12.setValue(3);
		childNode13.setValue(5);
		childNode14.setValue(2);
		childNode15.setValue(7);
		childNode16.setValue(8);
		childNode17.setValue(6);
		childNode18.setValue(4);
		
		childNode6.setLeftNode(childNode11);
		childNode6.setRightNode(childNode12);
		childNode7.setLeftNode(childNode13);
		childNode7.setRightNode(childNode14);
		childNode9.setLeftNode(childNode15);
		childNode9.setRightNode(childNode16);
		childNode10.setLeftNode(childNode17);
		childNode10.setRightNode(childNode18);
		
		NodeInfo childNode19=new NodeInfo();
		NodeInfo childNode20=new NodeInfo();
		NodeInfo childNode21=new NodeInfo();
		NodeInfo childNode22=new NodeInfo();
		NodeInfo childNode23=new NodeInfo();
		NodeInfo childNode24=new NodeInfo();
		NodeInfo childNode25=new NodeInfo();
		NodeInfo childNode26=new NodeInfo();
		NodeInfo childNode27=new NodeInfo();
		NodeInfo childNode28=new NodeInfo();
		NodeInfo childNode29=new NodeInfo();
		NodeInfo childNode30=new NodeInfo();
		childNode19.setValue(6);
		childNode20.setValue(7);
		childNode21.setValue(4);
		childNode22.setValue(12);
		childNode23.setValue(3);
		childNode24.setValue(9);
		childNode25.setValue(6);
		childNode26.setValue(13);
		childNode27.setValue(5);
		childNode28.setValue(4);
		childNode29.setValue(14);
		childNode30.setValue(8);
		
		
		childNode11.setLeftNode(childNode19);
		childNode11.setRightNode(childNode20);
		childNode12.setLeftNode(childNode21);
		childNode13.setLeftNode(childNode22);
		childNode14.setLeftNode(childNode23);
		childNode15.setLeftNode(childNode24);
		childNode15.setRightNode(childNode25);
		childNode16.setLeftNode(childNode26);
		childNode16.setRightNode(childNode27);
		childNode17.setLeftNode(childNode28);
		childNode18.setLeftNode(childNode29);
		childNode18.setRightNode(childNode30);
		
		
		

		NodeInfo childNode31=new NodeInfo();
		NodeInfo childNode32=new NodeInfo();
		NodeInfo childNode33=new NodeInfo();
		NodeInfo childNode34=new NodeInfo();
		NodeInfo childNode35=new NodeInfo();
		NodeInfo childNode36=new NodeInfo();
		NodeInfo childNode37=new NodeInfo();
		NodeInfo childNode38=new NodeInfo();
		NodeInfo childNode39=new NodeInfo();
		NodeInfo childNode40=new NodeInfo();
		NodeInfo childNode41=new NodeInfo();
		NodeInfo childNode42=new NodeInfo();
		NodeInfo childNode43=new NodeInfo();
		NodeInfo childNode44=new NodeInfo();
		NodeInfo childNode45=new NodeInfo();
		NodeInfo childNode46=new NodeInfo();
		childNode31.setValue(4);
		childNode32.setValue(2);
		childNode33.setValue(8);
		childNode34.setValue(11);
		childNode35.setValue(7);
		childNode36.setValue(3);
		childNode37.setValue(5);
		childNode38.setValue(2);
		childNode39.setValue(3);
		childNode40.setValue(9);
		childNode41.setValue(10);
		childNode42.setValue(8);
		childNode43.setValue(11);
		childNode44.setValue(3);
		childNode45.setValue(6);
		childNode46.setValue(1);
		
		childNode19.setLeftNode(childNode31);
		childNode20.setLeftNode(childNode32);
		childNode20.setRightNode(childNode33);
		childNode21.setLeftNode(childNode34);
		childNode22.setLeftNode(childNode35);
		childNode22.setRightNode(childNode36);
		childNode23.setLeftNode(childNode37);
		childNode24.setLeftNode(childNode38);
		childNode25.setLeftNode(childNode39);
		childNode25.setRightNode(childNode40);
		childNode26.setLeftNode(childNode41);
		childNode27.setLeftNode(childNode42);
		childNode28.setLeftNode(childNode43);
		childNode28.setRightNode(childNode44);
		childNode29.setLeftNode(childNode45);
		childNode30.setLeftNode(childNode46);
		
		NodeInfo childNode47=new NodeInfo();
		NodeInfo childNode48=new NodeInfo();
		NodeInfo childNode49=new NodeInfo();
		NodeInfo childNode50=new NodeInfo();
		NodeInfo childNode51=new NodeInfo();
		NodeInfo childNode52=new NodeInfo();
		NodeInfo childNode53=new NodeInfo();
		NodeInfo childNode54=new NodeInfo();
		NodeInfo childNode55=new NodeInfo();
		NodeInfo childNode56=new NodeInfo();
		NodeInfo childNode57=new NodeInfo();
		NodeInfo childNode58=new NodeInfo();
		NodeInfo childNode59=new NodeInfo();
		NodeInfo childNode60=new NodeInfo();
		NodeInfo childNode61=new NodeInfo();
		NodeInfo childNode62=new NodeInfo();
		NodeInfo childNode63=new NodeInfo();
		NodeInfo childNode64=new NodeInfo();
		NodeInfo childNode65=new NodeInfo();
		NodeInfo childNode66=new NodeInfo();
		NodeInfo childNode67=new NodeInfo();
		NodeInfo childNode68=new NodeInfo();
		NodeInfo childNode69=new NodeInfo();
		NodeInfo childNode70=new NodeInfo();
		childNode47.setValue(2);
		childNode48.setValue(7);
		childNode49.setValue(4);
		childNode50.setValue(8);
		childNode51.setValue(3);
		childNode52.setValue(5);
		childNode53.setValue(1);
		childNode54.setValue(6);
		childNode55.setValue(9);
		childNode56.setValue(2);
		childNode57.setValue(5);
		childNode58.setValue(1);
		childNode59.setValue(8);
		childNode60.setValue(7);
		childNode61.setValue(4);
		childNode62.setValue(3);
		childNode63.setValue(6);
		childNode64.setValue(2);
		childNode65.setValue(7);
		childNode66.setValue(9);
		childNode67.setValue(1);
		childNode68.setValue(8);
		childNode69.setValue(5);
		childNode70.setValue(2);
		
		
		childNode31.setLeftNode(childNode47);
		childNode31.setRightNode(childNode48);
		childNode32.setLeftNode(childNode49);
		childNode32.setRightNode(childNode50);
		childNode33.setLeftNode(childNode51);
		childNode33.setRightNode(childNode52);
		childNode34.setLeftNode(childNode53);
		childNode35.setLeftNode(childNode54);
		childNode35.setRightNode(childNode55);
		childNode36.setLeftNode(childNode56);
		childNode37.setLeftNode(childNode57);
		childNode38.setLeftNode(childNode58);
		childNode39.setLeftNode(childNode59);
		childNode39.setRightNode(childNode60);
		childNode40.setLeftNode(childNode61);
		childNode41.setLeftNode(childNode62);
		childNode42.setLeftNode(childNode63);
		childNode42.setRightNode(childNode64);
		childNode43.setLeftNode(childNode65);
		childNode43.setRightNode(childNode66);
		childNode44.setLeftNode(childNode67);
		childNode45.setLeftNode(childNode68);
		childNode46.setLeftNode(childNode69);
		childNode46.setRightNode(childNode70);	
		
		return rootNode;
		
	}

}
