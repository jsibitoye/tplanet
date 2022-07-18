
package duplicateremove;

import java.util.Arrays;

/**
 *
 * @author Josh
 */
public class OneArray implements ArrayInterface{
    @Override
    public String removeDuplicate(Object obj) {
         var arrayData = (String[])obj;
         String []uniqueArray = Arrays.copyOf(arrayData, arrayData.length);
         for(String eachData:arrayData){
            int count = 0; 
             for(int i = 0; i < uniqueArray.length; i++){
                 if (eachData.trim().equals(uniqueArray[i].trim()) && count ==1){  
                        uniqueArray[i] = "0";
                 }
                 else if (eachData.equals(uniqueArray[i]) && count ==0)
                     count = 1;

             }
         }  
         
         return Arrays.toString(uniqueArray);
    }

    @Override
    public void printTest() {
        
        System.out.println("Result of one Dimentional array: ");
    }
    
    
}
