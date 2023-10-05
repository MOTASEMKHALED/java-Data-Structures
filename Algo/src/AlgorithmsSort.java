package Algo;
import java.util.Arrays;
interface Algo{
    void bubble();
    void quickSort();
    void insertion();
    void selectionSort();
    void linearSearch();
    void binarySearch();
}
 public abstract class AlgorithmsSort<A> {
    protected int length = 10;
    protected Object[] Arr = {};
    protected int size = 0;

    public void bubble(){
        int i,j;
        A temp;
        for(i = 0 ; i < length ; i++){

            for(j = 0;j < length - i ; j++){

                if(Arr[j] > Arr[j + 1] ){

                     temp = Arr[j];

                    Arr[j] = Arr[j + j];

                    Arr[j] = temp;

                }
            }
        }
    }

}
