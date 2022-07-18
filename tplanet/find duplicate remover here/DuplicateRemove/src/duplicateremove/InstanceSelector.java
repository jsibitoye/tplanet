/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duplicateremove;

/**
 *
 * @author Josh
 */
public class InstanceSelector {
    
    public ArrayInterface getInstance(Object obj) {
        int dimensionCount = 0;
        Class c = obj.getClass(); // getting the runtime class of an object
        while (c.isArray()){ // check whether the object is an array 
         c = c.getComponentType(); // returns the class denoting the component type of the array
         dimensionCount++;
         }
        
        if (dimensionCount == 1)
            return new OneArray();
        if (dimensionCount == 2)
            return new TwoDimensionArray();
        if (dimensionCount == 3)
            return new ThreeDimsionArray();
        return null;
    }
}
