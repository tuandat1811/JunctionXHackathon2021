package com.deadlight.soict.hust.backend.services;

import com.deadlight.soict.hust.backend.entities.QuestionHint;

import java.util.List;

public interface QuestionHintService {
    public List<QuestionHint> getAllHint();
    public void saveHint(QuestionHint hint);
    public QuestionHint findHintById(Integer hId);
    public QuestionHint deleteHint(Integer hId);
}
