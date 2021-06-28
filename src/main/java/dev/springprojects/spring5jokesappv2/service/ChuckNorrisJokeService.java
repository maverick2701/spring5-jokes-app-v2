package dev.springprojects.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService {
    @Override
    public String getJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
