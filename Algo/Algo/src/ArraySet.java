import java.util.Arrays;
import Method.Methods;
 interface ArrayMethod<A>{
    A setArray();
    A reverse();
    A removeSpace();
}

 interface ArrayAlgorithms<A> {
    A bubble();
    A quickSort();
    A insertion();
    A binaryArray();
    A insertArray();
}
abstract class Array{
    protected int length = 10;
    protected Object[] Arr = {};
    protected int size = 0;
    protected Array(int[] arr){
        this.Arr = new Object[len];

        this.length = len;

        for(int i = 0 ; i < arr.length ; i++){

            Arr[i] = arr[i];

        }

        size = this.length;
    }
}
class ArraySet<A> extends Array<A>  implements Methods<A> , ArrayMethod<A> ,ArrayAlgorithms<A> {

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

