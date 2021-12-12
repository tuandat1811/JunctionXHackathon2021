package com.deadlight.soict.hust.backend.services;

import com.deadlight.soict.hust.backend.entities.QuestionHint;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionHintImpl implements QuestionHintService{
    @Override
    public List<QuestionHint> getAllHint() {
        return null;
    }

    @Override
    public void saveHint(QuestionHint hint) {

    }

    @Override
    public QuestionHint findHintById(Integer hId) {
        return null;
    }

    @Override
    public QuestionHint deleteHint(Integer hId) {
        return null;
    }
}
