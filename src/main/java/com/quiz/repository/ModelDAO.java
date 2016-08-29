package com.quiz.repository;

import com.quiz.model.SampleModel;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Tomasz on 28.08.2016.
 */
@Repository
@Transactional
public class ModelDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void add(SampleModel model) {
        entityManager.persist(model);
    }

    public SampleModel get(int id) {
        return entityManager.find(SampleModel.class, id);
    }

}
