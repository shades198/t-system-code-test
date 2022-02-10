/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shantanu.javatest;

/**
 *
 * @author shantanu
 */
public class BinaryTreeEquality
{
    public static void main(String[] args)
    {
        
        TreeNode tree1 = new TreeNode(1);//        1
        tree1.left = new TreeNode(2);//           / \
        tree1.right = new TreeNode(3);//         2   3
        
        TreeNode tree2 = new TreeNode(3);//        3      
        tree2.left = new TreeNode(1);//           / \
        tree2.right = new TreeNode(4);//         1   4
        
        BinaryTreeEquality btree = new BinaryTreeEquality();
        StringBuilder btreeValue = new StringBuilder();
        StringBuilder btree2Value = new StringBuilder();
        
        btree.inorderTraversal(tree1, btreeValue);
        btree.inorderTraversal(tree2, btree2Value);
        
        System.out.println("Btree1: "+btreeValue);
        System.out.println("Btree2: "+btree2Value);
        
        if(btreeValue.toString().equals(btree2Value.toString()))
            System.out.println("Both btree same");
        else
            System.out.println("btrees are not same");
    }
    
    public void inorderTraversal(TreeNode node, StringBuilder sb)
    {
        if(node == null)
            return;
        
        inorderTraversal(node.left, sb);
        
        sb.append(node.data).append(",");
        
        inorderTraversal(node.right, sb);
    }
    
}

class TreeNode 
{
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data)
    {
        this.data = data;
    }
    
    
}