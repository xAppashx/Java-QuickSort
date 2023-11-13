import java.util.Arrays;
  
public class QuickSort {
   
   
   // Setting up parameters
   public static int[] QuickSortStart(int[] ArrayToSort) {
         
         int LenArrayToSort = ArrayToSort.length;
         int[] Array = Arrays.copyOf(ArrayToSort, LenArrayToSort);
         
         int[] SortedArray = QuickSortRecursion(Array, 0, LenArrayToSort - 1);
         return SortedArray;
         
   } // public static int QuickSortStart
   
   
   public static int[] QuickSortRecursion(int Array[], int Low, int High) {
         
         if (Low < High) {
               int Pi = Partitions(Array, Low, High);
               QuickSortRecursion(Array, Low, Pi - 1);
               QuickSortRecursion(Array, Pi + 1, High);
         } // if Low < High
         
         return Array;
         
   } // QuickSortRecursion
   
   
   public static int Partitions(int[] Array, int Low, int High) {
         
         
         int Length = Array.length;
         int Pivot = Array[High];
         int Small = Low - 1;
         int Temp;
         
         for (int Loop = Low; Loop < High; Loop = Loop + 1) {
               
               // Sets up all nums inferior to the pivot to the left of the array
               if (Array[Loop] < Pivot) {
                     Small = Small + 1;
                     Temp = Array[Small];
                     Array[Small] = Array[Loop];
                     Array[Loop] = Temp;
               } // if
               
         } // for loop
         
         // Sets the pivot in its respective spot
         Temp = Array[Small + 1];
         Array[Small + 1] = Array[High];
         Array[High] = Temp;
         
         return Small + 1;
   } // Partitions
   
   
   
   
   public static void main(String[] args) {
         
         
            int[] OriginalArray = {3, 2, 1, 4, 5, 14, 22, 63, 6, 53, 22, 12, 45, 213, 53, 233, 41, 98};
            
            int[] SortedArray = QuickSortStart(OriginalArray);
            
            System.out.println("Original array: " + Arrays.toString(OriginalArray));
            System.out.println("Sorted array: " + Arrays.toString(SortedArray));
         
         
   } // Public Static Void Main

} // Public Class



































// End. 