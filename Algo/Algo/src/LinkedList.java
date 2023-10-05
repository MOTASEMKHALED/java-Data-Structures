import Method.Methods;
package Linked ;
interface LinkedListMethod<L> {

}


abstract class LinkedListSet<L>{
    protected LinkedListSet head ;
    protected L data ;
    protected LinkedListSet Next;

    protected  LinkedListSet(L d){
        data = d;
        Next = null;
    }

    protected LinkedListSet linkedLisSet(L d){
       return  LinkedListSet(d);
    }

}



 class LinkedList<L> extends  LinkedListSet<L> implements LinkedListMethod<L> , Methods<L>{

    public void addLinkedList(L d){
        LinkedListSet Node = linkedLisSet(d);

        Node.Next = head;
        head = Node;
    }


    public void printLiked(){
        LinkedListSet node = head;
        while(node != null){
            System.out.print(node.data + " ");
            node = node.Next;
        }
    }
}
