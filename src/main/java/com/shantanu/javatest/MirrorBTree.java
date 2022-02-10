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
public class MirrorBTree
{
    public static void main(String[] args)
    {
        
        TreeNode tree1 = new TreeNode(1);//        1
        tree1.left = new TreeNode(2);//           / \
        tree1.right = new TreeNode(3);//         2   3
        tree1.left.left = new TreeNode(4);//    /
                                         //    4

        TreeNode outputTree = new TreeNode(tree1.data);
        
        MirrorBTree btree = new MirrorBTree();
        btree.mirrorTree(tree1, outputTree);
        
        StringBuilder sb = new StringBuilder();
        btree.inorderTraversal(outputTree, sb);
        System.out.println(sb.toString());
    }
    
    public void inorderTraversal(TreeNode node, StringBuilder sb)
    {
        if(node == null)
            return;
        
        inorderTraversal(node.left, sb);
        
        sb.append(node.data).append(",");
        
        inorderTraversal(node.right, sb);
    }
    
    public void mirrorTree(TreeNode node, TreeNode output)
    {
        if(node == null)
            return;
                
        if(node.left != null)
            copyToRight(node, output);
        if(node.right != null)
            copyToLeft(node, output);
        
        mirrorTree(node.left, output);
        
        
        mirrorTree(node.right, output);
    }
    
    private void copyToLeft(TreeNode nodeToCopy, TreeNode desTreeNode){
        desTreeNode.left = new TreeNode(nodeToCopy.right.data);
    }
    private void copyToRight(TreeNode nodeToCopy, TreeNode desTreeNode){
        desTreeNode.right = new TreeNode(nodeToCopy.left.data);
    }
    
}