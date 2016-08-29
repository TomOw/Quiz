package com.quiz.controller;

import com.quiz.model.SampleModel;
import com.quiz.repository.ModelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tomasz on 28.08.2016.
 */
@RestController
public class TestController {

    private final ModelDAO modelDAO;

    @Autowired
    public TestController(ModelDAO modelDAO) {
        this.modelDAO = modelDAO;
    }

    @RequestMapping(value = "/test")
    public SampleModel test() {
        SampleModel model = new SampleModel("tevtyavy", "ayscuyabuscy");
        modelDAO.add(model);
        return model;
    }

    @RequestMapping(value = "/{id}")
    public SampleModel get(@PathVariable("id") int id) {
        return modelDAO.get(id);
    }
}
