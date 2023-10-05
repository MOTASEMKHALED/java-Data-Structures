
import Binary.BinaryTree;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {


        BinaryTree<String> g = new BinaryTree<String>();

        g.insertBinaryEl("jamal");
        g.insertBinaryEl("aldeen");
        g.insertBinaryEl("aldeen");
        g.insertBinaryEl("aldeen");

        g.PrintTree();
    }
}