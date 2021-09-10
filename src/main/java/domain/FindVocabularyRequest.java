package domain;

public class FindVocabularyRequest {
    private String pattern;

    public FindVocabularyRequest() {
    }

    public FindVocabularyRequest(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
