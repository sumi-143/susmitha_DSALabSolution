package com.greatlearning.service;

import java.util.ArrayList;

public class FindLongerPath {
	
	public static ArrayList<Integer> longestPath(Node root){
		
		if(root == null) {
			ArrayList<Integer> output = new ArrayList<>();
			return output;
		}
		
		//recursive calls
		
		ArrayList<Integer> right = longestPath(root.rightnode);
		
		ArrayList<Integer> left = longestPath(root.leftnode);
		
		if(right.size() < left.size()) {
			left.add(root.nodedata);
			
		}
		else {
			right.add(root.nodedata);
		}
		
		//return
		return (left.size() > right.size() ? left :right);
		
		
	}
	
}
