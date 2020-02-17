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

public class TNode<E> {
  private E element = null;
  private TNode<E> parent;
  //private TNode<E> child;

  public TNode(E e, TNode<E> p){
    element = e;
    parent = p;
    //child = c;
    
  }  

  public String getElement() {return element.toString();}
  public TNode<E> getParent() {return parent;}
  public void setParent(TNode<E> p) {parent = p;}
  

  public String toString(){
    return element+" : "+element+"";
  }


}
