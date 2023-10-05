package ArrayUs;
import java.util.Arrays;
import Algo.AlgorithmsSort;
interface ArrayMethod<A>{
    A setArray();
    A reverse();
    A removeSpace();
}

public class ArraySet<A> extends AlgorithmsSort<A> {

    public ArraySet(){};
    public void setArray(A[] arr){
        this.Arr = new Object[length];
        for(int i = 0 ; i < arr.length ; i++){
            Arr[i] = arr[i];
        }

        size = this.length;


    }

    public void add(int e) {
        if (size == Arr.length) {
            int newIncreasedCapacity = Arr.length + 1;
            Arr = Arrays.copyOf(Arr, newIncreasedCapacity);
        }

        this.length += 1;

        Arr[size++] = e;
    }

    public int get(int index) {
        return (int) Arr[index];
    }


    public void Print(){
        for(int i = 0 ; i < length ; i++){
            System.out.println(Arr[i] + " ");
        }
    }

}

