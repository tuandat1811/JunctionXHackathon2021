package com.deadlight.soict.hust.backend.controller;

import com.deadlight.soict.hust.backend.entities.Forms;
import com.deadlight.soict.hust.backend.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("api/public/forms")
public class FormController {

    @Autowired
    private FormService formService;

    @GetMapping("")
    public List<Forms> findAllForm() {
        return formService.getAllForms();
    }

    @GetMapping("/{fid}")
    public ResponseEntity<Forms> findFormById(@PathVariable Integer fid) {
        try {
            Forms forms = formService.findFormById(fid);
            return new ResponseEntity<Forms>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Forms>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("")
    public void addForm(@RequestBody Forms forms) {
        formService.saveForm(forms);
    }

    @PutMapping("/{fid}")
    public ResponseEntity<Forms> updateForm(@RequestBody Forms forms, @PathVariable Integer fid) {
        try {
            Forms ExistingForms = formService.findFormById(fid);
            formService.saveForm(forms);
            return new ResponseEntity<Forms>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Forms>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{fid}")
    public ResponseEntity<Forms> deleteForm(@PathVariable Integer fid) {
        try {
            Forms ExistingForms = formService.findFormById(fid);
            formService.deleteForm(fid);
            return new ResponseEntity<Forms>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Forms>(HttpStatus.NOT_FOUND);
        }
    }
}
