package com.example.edl_backend.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "note")

public class note {

    @Id
    private String id;

    private Integer note_1;

    private Integer note_2;

    private Integer note_3;

    private String prof_1;

    private String prof_2;

    private String prof_3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNote_1() {
        return note_1;
    }

    public void setNote_1(Integer note_1) {
        this.note_1 = note_1;
    }

    public Integer getNote_2() {
        return note_2;
    }

    public void setNote_2(Integer note_2) {
        this.note_2 = note_2;
    }

    public Integer getNote_3() {
        return note_3;
    }

    public void setNote_3(Integer note_3) {
        this.note_3 = note_3;
    }

    public String getProf_1() {
        return prof_1;
    }

    public void setProf_1(String prof_1) {
        this.prof_1 = prof_1;
    }

    public String getProf_2() {
        return prof_2;
    }

    public void setProf_2(String prof_2) {
        this.prof_2 = prof_2;
    }

    public String getProf_3() {
        return prof_3;
    }

    public void setProf_3(String prof_3) {
        this.prof_3 = prof_3;
    }

    public note(String id, Integer note_1, Integer note_2, Integer note_3, String prof_1, String prof_2,
            String prof_3) {
        this.id = id;
        this.note_1 = note_1;
        this.note_2 = note_2;
        this.note_3 = note_3;
        this.prof_1 = prof_1;
        this.prof_2 = prof_2;
        this.prof_3 = prof_3;
    }

    public note() {
    }
}
