package com.quiz.model;

import javax.persistence.*;

/**
 * Created by Tomasz on 28.08.2016.
 */
@Entity
@Table(name = "test2", catalog = "sql8132645")
public class SampleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "x")
    private String x;
    @Column(name = "y")
    private String y;

    public SampleModel(String y, String x) {
        this.y = y;
        this.x = x;
    }

    public SampleModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "SampleModel{" +
                "id=" + id +
                ", x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}';
    }
}
