import java.util.Random;
import java.util.ArrayList;
import java.util.Vector;

public class Collections {
    
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers1 = ArrayListFiller(10000);
        System.out.println(myNumbers1);
        Vector<Integer> myNumbers2 = VectorArrayFiller(10000);
        System.out.println(myNumbers2);
        int[] myNumbers3 = OrdinaryArrayFiller(10000);
        System.out.println(myNumbers3);
    }

    public static ArrayList<Integer> ArrayListFiller (int size){
        ArrayList<Integer> ArrayListCollection = new ArrayList<Integer>();

        Random rand = new Random();

        for (int i = 0; i < size + 1; i++){
            ArrayListCollection.add(rand.nextInt(10));
        }

        return ArrayListCollection;
    }

    public static Vector<Integer> VectorArrayFiller (int size){
        Vector<Integer> VectorArrayCollection = new Vector<>();

        Random rand = new Random();

        for (int i = 0; i < size + 1; i++){
            VectorArrayCollection.add(rand.nextInt(10));
        }

        return VectorArrayCollection;
    }

    public static int[] OrdinaryArrayFiller (int size){
        int[] OrdinaryArray = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++){
            OrdinaryArray[i] = rand.nextInt(10);
        }

        return OrdinaryArray;
    }

}
