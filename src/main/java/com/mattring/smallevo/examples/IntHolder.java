
package com.mattring.smallevo.examples;

/**
 * Wraps an int, for use in lambdas, anonymous classes.
 * @author mring
 */
public class IntHolder {
    
    private int val = 0;
    public void incr(int i) {
        val += i;
    }
    public int decr(int i) {
        val -= i;
        return val;
    }
    public int getVal() {
        return val;
    }
    
}
