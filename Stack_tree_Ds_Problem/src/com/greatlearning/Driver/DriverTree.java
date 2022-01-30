package com.greatlearning.Driver;

import java.util.ArrayList;

import com.greatlearning.service.FindLongerPath;
import com.greatlearning.service.Node;

public class DriverTree {
	
	static FindLongerPath findlongerpath = new FindLongerPath();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	Node root = newNode(100);
	root.leftnode = newNode(20);
	root.rightnode = newNode(130);
	root.leftnode.leftnode = newNode(10);
	root.leftnode.rightnode = newNode(50);
	root.leftnode.rightnode.rightnode = newNode(6);
	
	ArrayList<Integer> output = FindLongerPath.longestPath(root);
	
	int n = output.size();
	System.out.print(output.get(n-1));
	for(int i = n-2;i>=0;i--) {
		System.out.print("-> " + output.get(i));
	}

	}

	private static Node newNode(int i) {
		// TODO Auto-generated method stub
			Node temp = new Node();
			temp.nodedata = i;
			temp.leftnode =null;
			temp.rightnode =null;
			return temp;
		}
	}



