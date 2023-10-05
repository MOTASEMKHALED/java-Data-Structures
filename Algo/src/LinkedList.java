import LinkedAlgo.AlgorithmsLinkedList;
interface LinkedListMethod<L> {

}

 class LinkedList<L> extends AlgorithmsLinkedList<L>  implements LinkedListMethod<L> {
     protected L data ;
     protected LinkedList Next;

     private  LinkedList(L d){
         data = d;
         Next = null;
     }


     public void addLinkedList(L d){
         LinkedList Node = new LinkedList(d);

        Node.Next = head;
        head = Node;
    }


    public void printLiked(){
        LinkedList node = head;
        while(node != null){
            System.out.print(node.data + " ");
            node = node.Next;
        }
    }
}
