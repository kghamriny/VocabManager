import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Processor {


    public static void loadFromFile(String fileName, DoublyLinkedList dll) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String topicLine;
            String vocabLine;
            while ((topicLine = br.readLine()) != null) {
                if (topicLine.startsWith("#")) {
                    SinglyLinkedList sll = new SinglyLinkedList();
                    while ((vocabLine = br.readLine()) != null && !vocabLine.isEmpty()) {
                        sll.add(vocabLine);
                    }
                    Vocab newVocab = new Vocab(topicLine, sll);
                    dll.add(newVocab);
                }
            }
            br.close(); // Close the BufferedReader to release resources
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main_menu(){
        System.out.println("===========================\n" +
                "Vocabulary Control Center\n" +
                "===========================\n" +
                "1 browse a topic\n" +
                "2 insert a new topic before another one\n" +
                "3 insert a new topic after another one\n" +
                "4 remove a topic\n" +
                "5 modify a topic\n" +
                "6 search topics for a word\n" +
                "7 load from a file\n" +
                "8 show all words starting with a given letter\n" +
                "9 save to file\n" +
                "0 exit\n" +
                "===========================\n" +
                "Enter Your Choice:\n");
    }

}
