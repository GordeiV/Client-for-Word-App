package domain;

import entity.VocabularyStatus;
import entity.Word;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class FindVocabularyResponse {
    private ArrayList<Word> words = new ArrayList<>();
    private String name;
    @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
    private LocalDateTime date;
    @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
    private LocalDateTime repeatTime;
    private VocabularyStatus vocabularyStatus;
    private Long id;

    public ArrayList<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getRepeatTime() {
        return repeatTime;
    }

    public void setRepeatTime(LocalDateTime repeatTime) {
        this.repeatTime = repeatTime;
    }

    public VocabularyStatus getVocabularyStatus() {
        return vocabularyStatus;
    }

    public void setVocabularyStatus(VocabularyStatus vocabularyStatus) {
        this.vocabularyStatus = vocabularyStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FindVocabularyResponse{" +
                "words=" + words +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", repeatTime=" + repeatTime +
                ", vocabularyStatus=" + vocabularyStatus +
                ", id=" + id +
                '}';
    }
}
