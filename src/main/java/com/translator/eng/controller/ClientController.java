package com.translator.eng.controller;

import com.translator.eng.dictionary.Dictionary;
import com.translator.eng.service.DictFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private final DictFinder dictFinder;

    @Autowired
    public ClientController(DictFinder dictFinder) {
        this.dictFinder = dictFinder;
    }

    @GetMapping("translate")
    public ResponseEntity<Dictionary> findTranslate(String ukrWord){
        final Dictionary d = dictFinder.find(ukrWord);
        return d != null
                ? new ResponseEntity<>(d, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
