/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_tdd.impl;

import assignment_tdd.AssertionException;

/**
 *
 * @author Hannes
 */
public class AssertionExceptionImpl implements AssertionException {

    @Override
    public int getValue() {
        int temp[] = {1,2,3};
        return temp[3];
    }
    
}
