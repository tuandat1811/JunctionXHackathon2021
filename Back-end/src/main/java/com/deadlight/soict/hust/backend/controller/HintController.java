package com.deadlight.soict.hust.backend.controller;

import com.deadlight.soict.hust.backend.entities.QuestionHint;
import com.deadlight.soict.hust.backend.services.QuestionHintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("api/public/hints")
public class HintController {

    @Autowired
    private QuestionHintService hintService;

    @GetMapping("")
    public List<QuestionHint> findAllHints() {
        return hintService.getAllHint();
    }

    @GetMapping("/{hid}")
    public ResponseEntity<QuestionHint> findHintById(@PathVariable Integer hid) {
        try {
            QuestionHint hint = hintService.findHintById(hid);
            return new ResponseEntity<QuestionHint>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<QuestionHint>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("")
    public void addHint(@RequestBody QuestionHint hint) {
        hintService.saveHint(hint);
    }

    @PutMapping("/{hid}")
    public ResponseEntity<QuestionHint> updateHint(@RequestBody QuestionHint hint, @PathVariable Integer hid) {
        try {
            QuestionHint existingHint = hintService.findHintById(hid);
            hintService.saveHint(hint);
            return new ResponseEntity<QuestionHint>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<QuestionHint>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{hid}")
    public ResponseEntity<QuestionHint> deleteHint(@PathVariable Integer hid) {
        try {
            QuestionHint existingHint = hintService.findHintById(hid);
            hintService.deleteHint(hid);
            return new ResponseEntity<QuestionHint>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<QuestionHint>(HttpStatus.NOT_FOUND);
        }
    }
}
