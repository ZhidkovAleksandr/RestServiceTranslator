package com.translator.eng.service;

import com.translator.eng.dictionary.Dictionary;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictFinder implements Finder{

    private Map<String, String> ukrainianToEnglish;
    {
        ukrainianToEnglish = new HashMap<>();
        ukrainianToEnglish.put("привіт", "hello");
        ukrainianToEnglish.put("дякую", "thank you");
        ukrainianToEnglish.put("будь ласка", "please");
        ukrainianToEnglish.put("так", "Yes");
        ukrainianToEnglish.put("ні", "No");
        ukrainianToEnglish.put("добро ранку", "good morning");
        ukrainianToEnglish.put("добрий день", "good day");
        ukrainianToEnglish.put("добрий вечір", "good evening");
        ukrainianToEnglish.put("доброї ночі", "good night");
        ukrainianToEnglish.put("як справи", "how are you?");
        ukrainianToEnglish.put("де", "where");
        ukrainianToEnglish.put("коли", "when");
        ukrainianToEnglish.put("що", "what");
        ukrainianToEnglish.put("чому", "why");
        ukrainianToEnglish.put("якщо можна", "if you please");
        ukrainianToEnglish.put("любов", "love");
        ukrainianToEnglish.put("родина", "family");
        ukrainianToEnglish.put("друзі", "friends");
        ukrainianToEnglish.put("краса", "beauty");
        ukrainianToEnglish.put("Україна", "Ukraine");

    }
    @Override
    public Dictionary find(String ukrWord) {
        String value = (String) ukrainianToEnglish.get(ukrWord);
        if (value.isEmpty()){
            return null;
        }else {
            Dictionary d = new Dictionary();
            d.setUkrWord(ukrWord);
            d.setEngWord(value);
            return d;
        }


    }
}
