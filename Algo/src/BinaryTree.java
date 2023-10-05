package Binary;

interface BinaryTreeMethod<L>{

}

public  class BinaryTree<B> implements BinaryTreeMethod<B> {

    private BinaryTree<B> root = null;
    private  B Data;

    private BinaryTree<B> left;
    private BinaryTree<B> right;
    private BinaryTree(B Data){
        this.Data = Data;
        left = null;
        right = null;
    }
    public BinaryTree(){};

    public BinaryTree<B> insertBinaryEl(B Data){
        if(root == null){
            return new BinaryTree(Data);
        }


        if((B)root.Data > Data){
            root.left = insertLeft(root.left , Data);
        }
        else if ((B)root.Data <= Data){
            root.right = insertRight(root.right , Data);
        }

        return root;

    }

    private BinaryTree insertLeft(BinaryTree<B> node , B Data){
        if(node == null){
            return new BinaryTree(Data);
        }

        if(Data < node.Data){
            node.left = insertLeft(node.left , Data);
        }else if (Data >= node.Data){
            node.right = insertRight(node.right , Data);
        }

        return  node;
    }

    private BinaryTree insertRight(BinaryTree<B> node , B Data){
        if(node == null){
            return new BinaryTree(Data);
        }

        if(Data < node.Data){
            node.left = insertLeft(node.left , Data);
        }else if (Data >= node.Data){
            node.right = insertRight(node.right , Data);
        }

        return node;
    }



    public void PrintTree(){;
            System.out.println(root.left.Data + " ");
    }
}
