package com.deadlight.soict.hust.backend.services;

import com.deadlight.soict.hust.backend.entities.Forms;

import java.util.List;

public interface FormService {
    public List<Forms> getAllForms();
    public void saveForm(Forms forms);
    public Forms findFormById(Integer fId);
    public Forms deleteForm(Integer fId);
}
