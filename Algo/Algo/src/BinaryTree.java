package Binary;
import Method.Methods;

interface BinaryTreeMethod<L>{

}
abstract class Tree<T>{
    protected BinaryTree root = null;
    protected  T Data;

    protected BinaryTree left;
    protected BinaryTree right;

    protected Tree(T d){
        this.Data = d;
        left = null;
        right = null;
    }
    protected abstract  setBinaryTree(T d);
    protected BinaryTree insertLeft(BinaryTree node , B d){
        if(node == null){
            return new BinaryTree(d);
        }

        if(d < node.Data){
            node.left = insertLeft(node.left , d);
        }else if (d >= node.Data){
            node.right = insertRight(node.right , d);
        }

        return  node;
    }

    protected BinaryTree insertRight(BinaryTree node , B d){
        if(node == null){
            return new BinaryTree(d);
        }

        if(d < node.Data){
            node.left = insertLeft(node.left , d);
        }else if (d >= node.Data){
            node.right = insertRight(node.right , d);
        }

        return node;
    }
}
public  class BinaryTree<B> extends Tree<B>  implements Methods<L> ,BinaryTreeMethod<L> {

    public BinaryTree(){};

    @Override
    public BinaryTree insertBinaryEl(B d){
        if(root == null){
            root = Tree(d);
        }

        if(root != null){
            root.left = insertLeft(root.left , d);
        }else if (root.left != null ){
            root.right = insertRight(root.right , d);
        }

        return root;

    }


    public void PrintTree(){;
            System.out.println(root.left.Data + " ");
    }
}
