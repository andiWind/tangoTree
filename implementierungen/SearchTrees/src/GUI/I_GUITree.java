/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author andreas
 */
public interface I_GUITree {
    I_GUINode getRoot ();
    I_GUINode access (int key);
    String getName();
    

}
