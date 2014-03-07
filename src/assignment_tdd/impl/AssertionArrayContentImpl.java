/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_tdd.impl;

import assignment_tdd.AssertionArrayContent;

/**
 *
 * @author Hannes
 */
public class AssertionArrayContentImpl implements AssertionArrayContent {

    @Override
    public String[] getValues() {
        String[] temp = {"Hello", "goodbye", "a"};
        return temp;
    }
    
}
