package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class DictionaryTestSuite {

    @Test
    public void testAddWord() {
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");

        dictionary.addWord(polishWord, englishWord);

        assertEquals(1, dictionary.size());
    }

    @Test
    public void testFindEnglishWords() {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.VERB, "play"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));

        List<EnglishWord> result = dictionary.findEnglishWords("gra");

        assertEquals(2, result.size());
        assertTrue(result.contains(new EnglishWord(PartOfSpeech.NOUN, "game")));
        assertTrue(result.contains(new EnglishWord(PartOfSpeech.VERB, "play")));
    }

    @Test
    public void testFindEnglishWords_withPartOfSpeech() {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("brat", new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.VERB, "take"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));

        List<EnglishWord> result = dictionary.findEnglishWords("brać", PartOfSpeech.NOUN);

        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));

        assertEquals(expectedList, result);
    }
}
