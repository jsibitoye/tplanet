package duplicateremove;

import java.util.Arrays;

/**
 *
 * @author Josh
 */
public class ThreeDimsionArray implements ArrayInterface {

    @Override
    public String removeDuplicate(Object obj) {
        
         var arrayData = (String[][][])obj;
         String [][][]uniqueArray = Arrays.copyOf(arrayData, arrayData.length);
         int k =-1;
         for (String [][] Toparraydata: arrayData){
             k++;
         int j = -1;
         for (String [] arraydata: Toparraydata){
             j++;
            for(String eachData:arraydata){
               int count = 0; 
                for(int i = 0; i < uniqueArray[k][j].length; i++){
                    if (eachData.trim().equals(uniqueArray[k][j][i].trim()) && count ==1){  
                           uniqueArray[k][j][i] = "0";
                    }
                    else if (eachData.equals(uniqueArray[k][j][i]) && count ==0)
                        count = 1;
                }
            } 
         }
         }
         
         return Arrays.deepToString(uniqueArray);
    }

    @Override
    public void printTest() {
        System.out.println("Result of Three Dimentional array");
    }
    
}
