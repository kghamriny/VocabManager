
public class SinglyLinkedList {

    private class Node{
        Node next;
        String word;

        public Node(){
            this.next = null;
            this.word = null;
        }

        public Node(Node next, String word){
            this.next = next;
            this.word = word;
        }
    }

    private Node head;
    public SinglyLinkedList(){
        head=null;
    }

    public void add(String word){
        Node wordNode = new Node(null, word);

        if(head==null){
            head = wordNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = wordNode;
        }
    }

    public void remove(String word){

        if(head == null){
            System.out.println("The list is empty!");
        }
        if(head.word.equals(word)){
            head=head.next;
        }

        Node current = head;
        while(current.next!=null){
            if(current.next.word.equals(word)){
                current.next=current.next.next;
            }
            current=current.next;
        }
        System.out.println("Word is not found!");
    }

    public void change(String oldWord, String newWord){

        if(head==null){
            System.out.println("Empty list!");
        }

        Node current=head;
        while(current!=null){
            if(current.word.equals(oldWord)){
                current.word=newWord;
            }
            current=current.next;
        }
        System.out.println("Word is still not found to be replaced!");
    }

    public void printList(){
        Node temp = head;

        while(temp!=null){
            System.out.println("Node " + temp.word);

            temp = temp.next;
        }
    }

    public boolean findWord(String word){
        Node temp = head;

        while(temp!=null){
            if(temp.word.equals(word)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

}
