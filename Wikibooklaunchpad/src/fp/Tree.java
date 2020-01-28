/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp;

/**
 *
 * @author logan
 */
import java.util.List;
import java.util.ArrayList;

public class Tree<E> {
    private int size;
  //variable for the root of the tree
  private TNode<E> root;

  //default constructor
  public Tree(){
    size = 0;
    root = null;
  }

  //sets the root of the tree to given node
  public Tree(TNode<E> r){
    size = 1;
    root = r;
  }

  //returns the size of the tree
  public int size() { return size; }

  //checks to see if the tree is empty
  public boolean isEmpty(){return size == 0;}

  //returns the root of the tree
  public TNode<E> root(){return root;}


  //gets the root of the tree
  public TNode<E> getRoot(TNode<E> v) {return v.getParent();}

  //adds a root to the tree
  public TNode<E> addRoot(E e){
    TNode<E> newroot = new TNode<E>(e ,null);
    root = newroot;
    size++;
    return newroot;
  }

}
