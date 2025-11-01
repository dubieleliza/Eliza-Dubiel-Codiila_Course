package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    private Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord> englishWords =
                dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord, Collections.emptyList());
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> allWords = dictionary.getOrDefault(polishWord, Collections.emptyList());
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord word : allWords) {
            if (word.getPartOfSpeech().equals(partOfSpeech)) {
                result.add(word);
            }
        }
        return result;
    }

    public int size() {
        return dictionary.size();
    }
}
