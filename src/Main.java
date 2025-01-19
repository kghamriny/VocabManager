public class Main {

    public static void main(String[] args) {
       DoublyLinkedList dll = new DoublyLinkedList();
       SinglyLinkedList wordsList = new SinglyLinkedList();

        // Add words to the list
        wordsList.add("Red");
        wordsList.add("Green");
        wordsList.add("Blue");

        Vocab coloursVocab = new Vocab("Colours", wordsList);
        Processor.loadFromFile("A3_input_file.txt", dll);

        Vocab words = dll.findVocab("#Colours");
        dll.addBefore("#Colours", coloursVocab);

        coloursVocab.getWords().printList();
        SinglyLinkedList words2 = coloursVocab.getWords();
        System.out.println(dll.searchWord("Red"));
        coloursVocab.getWords().printList();


        int [] AA = {1,2,3};
        boolean done=true;

        for(int i=0; i<AA.length && !done; i++){
            System.out.println(AA[i]);
        }


    }
}
