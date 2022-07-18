
package duplicateremove;

import java.util.Arrays;

/**
 *
 * @author Josh
 */
public class TwoDimensionArray implements ArrayInterface {

    @Override
    public String removeDuplicate(Object obj) {
        
         var arrayData = (String[][])obj;
         String [][]uniqueArray = Arrays.copyOf(arrayData, arrayData.length);
         
         int j = -1;
         
         for (String [] arraydata: arrayData){
             j++;
            for(String eachData:arraydata){
               int count = 0; 
                for(int i = 0; i < uniqueArray[j].length; i++){
                    if (eachData.trim().equals(uniqueArray[j][i].trim()) && count ==1){  
                           uniqueArray[j][i] = "0";
                    }
                    else if (eachData.equals(uniqueArray[j][i]) && count ==0)
                        count = 1;
                }
            } 
         }
    
         
         return Arrays.deepToString(uniqueArray);
    }

    @Override
    public void printTest() {
                System.out.println("Result of Two Dimentional array");
    }
    
}
