package com.deadlight.soict.hust.backend.services;

import com.deadlight.soict.hust.backend.entities.Forms;
import com.deadlight.soict.hust.backend.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormServiceImpl implements FormService{

    @Autowired
    private FormRepository formRepository;

    @Override
    public List<Forms> getAllForms() {
        return formRepository.findAll();
    }

    @Override
    public void saveForm(Forms forms) {
        formRepository.save(forms);
    }

    @Override
    public Forms findFormById(Integer fId) {
        return formRepository.findById(fId).get();
    }

    @Override
    public Forms deleteForm(Integer fId) {
        formRepository.deleteById(fId);
        return null;
    }
}
