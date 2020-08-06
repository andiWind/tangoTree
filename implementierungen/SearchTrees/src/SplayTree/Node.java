/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SplayTree;


/**
 *
 * @author andreas
 */
public class Node  {
    private Node left;
    private Node right;
    private Node parent;
    private int key;
    boolean keyFinal;
    
    Node (int k, Node l, Node r, Node p ){
        left = l;
        right = r;
        parent = p;
        key = k; 
        keyFinal = true;
    }
    Node (int k ){
        key = k;
        keyFinal = true;
    }
     Node (){  
         keyFinal = false;
    }
    int getKey (){
        return key;
    }
    void setKey(int k){
        if (!keyFinal)
            key = k;
    }
    Node getLeft(){
        return left;
    }
     Node getRight(){
        return right;
    }
    Node getParent(){
        return parent;
    } 
    void setLeft(Node l){
        left =l;
    }
    void setRight(Node r){
        right = r;
    }
    void setParent(Node p){
        parent = p;
    } 


}
