public class DoublyLinkedList {
    private Node head = null;
    private Node tail = null;

    private class Node {
        Node next;
        Node prev;
        Vocab vocab;

        Node(Vocab vocab) {
            this.vocab = vocab;
            this.prev = null;
            this.next = null;
        }
    }

    public DoublyLinkedList() {
    }

    public void add(Vocab vocab) {
        Node vocabNode = new Node(vocab);
        if (this.head == null) {
            this.head = vocabNode;
        } else {
            this.tail.next = vocabNode;
            vocabNode.prev = this.tail;
        }

        this.tail = vocabNode;
    }
    //Find vocab, then specify the words (sll). Next, edit the sll using its methods. so now go and make the methods for sll
    public Vocab findVocab(String topic){
        Node current=head;

        while(current!=null){
            if(current.vocab.getTopic().equals(topic) && current.vocab!=null){
                return current.vocab;
            }
            current=current.next;
        }
        return null;
    }
    public Node findNode(String topic){
        Node current=head;

        while(current!=null){
            if(current.vocab.getTopic().equals(topic) && current.vocab!=null){
                return current;
            }
            current=current.next;
        }
        return null;
    }
    public void addToStart(Vocab vocab) {
        Node vocabNode = new Node(vocab);
        if (this.head != null) {
            this.head.prev = vocabNode;
        } else {
            this.tail = vocabNode;
        }

        this.head = vocabNode;
    }

    public void addAfter(String topic, Vocab vocab) {
        Node prevNode = findNode(topic);
        if (prevNode == null) {
            System.out.println("There is no topic.");
        } else {
            Node vocabNode = new Node(vocab);
            vocabNode.next = prevNode.next;
            prevNode.next = vocabNode;
            if (vocabNode.next == null) {
                this.tail = vocabNode;
            } else {
                vocabNode.next.prev = vocabNode;
            }
        }
    }

    public void addBefore(String topic, Vocab vocab) {
        Node nextNode = findNode(topic);
        if (nextNode == null) {
            System.out.println("There is no topic.");
        } else {
            Node vocabNode = new Node(vocab);
            vocabNode.prev = nextNode.prev;
            nextNode.prev = vocabNode;
            vocabNode.next = nextNode;
            if (vocabNode.prev == null) {
                this.head = vocabNode;
            } else {
                vocabNode.prev.next = vocabNode;
            }
        }

    }

    public void displayList() {
        for(Node temp = this.head; temp != null; temp = temp.next) {
            System.out.println("Topic: " + temp.vocab.getTopic());
        }
    }

    public void removeNode(String topic){
        Node currentNode = findNode(topic);
        if(currentNode == null){
            System.out.println("There is no topic!");
        }
        else{
            currentNode.next.prev = currentNode.prev;
            currentNode.prev.next = currentNode.next;
        }
    }

    public String searchWord(String word){
        Node current = head;
        String found = "Word found!";

        while(current!=null){
            if((current.vocab.getWords().findWord(word))){
                return found;
            }
            current=current.next;
        }
        return null;
    }



    /*
    1 (done)
    2 (done)
    3 (done)
    4 (done)
    5 (done)
    6 (done)
    7 (done)
    8 ....
    9 ....
     */

}

