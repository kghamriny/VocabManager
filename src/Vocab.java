import java.util.Objects;

public class Vocab {
    private String topic;
    private SinglyLinkedList words;

    public Vocab(String topic, SinglyLinkedList words) {
        this.topic = topic;
        this.words = words;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    public SinglyLinkedList getWords() {
        return this.words;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vocab vocab = (Vocab) o;
        return Objects.equals(topic, vocab.topic) && Objects.equals(words, vocab.words);
    }

    public String toString() {
        return "Vocab{topic='" + this.topic;
    }
}
