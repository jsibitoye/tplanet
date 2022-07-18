package duplicateremove;

/**
 *
 * @author Josh
 * PROBLEM SOLVED USING FACTORY DESIGN PARTERN and QUICKSORT METHOD
 */
public class MultidimensionalArrayMain {
    public static void main(String[] args) {
        
    // uncomment to test for one dimensional array. 
    //String[] array = {"funmi","benson","funmi","funmi","benson","funmi"};
   
//   uncomment to  test for two dimensional arrays
//    String[][] array = {{"funmi","benson","funmi"},{"frank","thank you"},{"frank","thank you","frank","thank you"}};

     String[][][] array = {{{"funmi","benson"},{"frank","thank you"}},{{"tope ","man","man"},{"woman","blue skye"}}};
     var selector = new InstanceSelector().getInstance(array);
     selector.printTest();
     System.out.println(selector.removeDuplicate(array));
        // TODO code application logic here
    }
}
