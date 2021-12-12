package com.deadlight.soict.hust.backend.services;

import com.deadlight.soict.hust.backend.entities.QuestionHint;
import com.deadlight.soict.hust.backend.repository.QuestionHintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionHintImpl implements QuestionHintService{

    @Autowired
    private QuestionHintRepository hintRepository;

    @Override
    public List<QuestionHint> getAllHint() {
        return hintRepository.findAll();
    }

    @Override
    public void saveHint(QuestionHint hint) {
        hintRepository.save(hint);
    }

    @Override
    public QuestionHint findHintById(Integer hId) {
        return hintRepository.findById(hId).get();
    }

    @Override
    public QuestionHint deleteHint(Integer hId) {
        hintRepository.deleteById(hId);
        return null;
    }
}
