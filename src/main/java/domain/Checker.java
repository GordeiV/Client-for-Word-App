package domain;

import entity.Vocabulary;
import exceptions.CheckerException;
import main.config.Config;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

public class Checker {
    private final static String getUrl = Config.getProperty(Config.FV_GET_URL);
    private final static String postUrl = Config.getProperty(Config.FV_POST_URL);

    public FindVocabularyResponse findVocabularyWithQueryParam(String pattern) throws CheckerException {
        try {
            Client client = ClientBuilder.newClient();
            FindVocabularyResponse response = client.target(getUrl + pattern)
                    .request().get(FindVocabularyResponse.class);
            return response;
        } catch (Exception e) {
            throw new CheckerException(e);
        }
    }

    public FindVocabularyResponse findVocabularyWithObject(Vocabulary vocabulary) throws CheckerException {
        try {
            Client client = ClientBuilder.newClient();
            FindVocabularyResponse response = client.target(postUrl)
                    .request(MediaType.APPLICATION_JSON)
                    .post(Entity.entity(vocabulary, MediaType.APPLICATION_JSON))
                    .readEntity(FindVocabularyResponse.class);
            return response;
        } catch (Exception e) {
            throw new CheckerException(e);
        }
    }
}
