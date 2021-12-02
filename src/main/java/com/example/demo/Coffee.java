package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Coffee {
    @Id
    private String id;
    private String name;
    public Coffee(String id, String name) {
      this.id = id;
      this.name = name;
    }
    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }
    public Coffee() {}
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
