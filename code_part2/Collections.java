import java.util.Random;
import java.util.ArrayList;
import java.util.Vector;

public class Collections {
    
    public static void main(String[] args) {
        int number = 90000000;

        long StartTimeArrayList = System.currentTimeMillis();
        ArrayList<Integer> myNumbers1 = ArrayListFiller(number);
        System.out.println(ArrayListSummation(myNumbers1));
        long SumArrayList = System.currentTimeMillis() - StartTimeArrayList;

        long StartTimeVectorArray = System.currentTimeMillis();
        Vector<Integer> myNumbers2 = VectorArrayFiller(number);
        System.out.println(VectorArraySummation(myNumbers2));
        long SumVectorArray = System.currentTimeMillis() - StartTimeVectorArray;

        long StartTimeOrdinaryArray = System.currentTimeMillis();
        int[] myNumbers3 = OrdinaryArrayFiller(number);
        System.out.println(OrdinaryArraySummation(myNumbers3));
        long SumOrdinaryArray = System.currentTimeMillis() - StartTimeOrdinaryArray;

        System.out.println("Time to process ArrayList: " + SumArrayList);
        System.out.println("Time to process VectorArray: " + SumVectorArray);
        System.out.println("Time to process OrdinaryArray: " + SumOrdinaryArray);
    }

    public static ArrayList<Integer> ArrayListFiller (int size){
        ArrayList<Integer> ArrayListCollection = new ArrayList<Integer>();

        Random rand = new Random();

        for (int i = 0; i < size + 1; i++){
            ArrayListCollection.add(rand.nextInt(10));
        }

        return ArrayListCollection;
    }

    public static int ArrayListSummation (ArrayList<Integer> ArrayListCollection){
        int size = ArrayListCollection.size();
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += ArrayListCollection.get(i);
        }
        return sum;
    }

    public static Vector<Integer> VectorArrayFiller (int size){
        Vector<Integer> VectorArrayCollection = new Vector<>(size);

        Random rand = new Random();

        for (int i = 0; i < size + 1; i++){
            VectorArrayCollection.add(rand.nextInt(10));
        }

        return VectorArrayCollection;
    }

    public static int VectorArraySummation (Vector<Integer> VectorArrayCollection){
        int size = VectorArrayCollection.size();
        int sum = 0;

        for (int i = 0; i < size; i++){
            sum += VectorArrayCollection.get(i);
        }
        
        return sum;
    }

    public static int[] OrdinaryArrayFiller (int size){
        int[] OrdinaryArray = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++){
            OrdinaryArray[i] = rand.nextInt(10);
        }

        return OrdinaryArray;
    }

    public static int OrdinaryArraySummation (int[] OrdinaryArray){
        int size = OrdinaryArray.length;
        int sum = 0;

        for (int i = 0; i < size; i++){
            sum += OrdinaryArray[i];
        }

        return sum;
    }

}
