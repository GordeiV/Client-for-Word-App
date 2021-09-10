package main;

import domain.Checker;
import domain.FindVocabularyResponse;
import entity.Vocabulary;
import entity.VocabularyStatus;
import exceptions.CheckerException;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws CheckerException {
        Checker checker = new Checker();
        FindVocabularyResponse t = checker.findVocabularyWithQueryParam("weather");
        FindVocabularyResponse s = checker.findVocabularyWithObject(new Vocabulary("weekdays",
                LocalDateTime.now(),
                LocalDateTime.now(),
                VocabularyStatus.FIFTH_REPEAT,
                3L));
        System.out.println(t);
        System.out.println(s);
    }
}
