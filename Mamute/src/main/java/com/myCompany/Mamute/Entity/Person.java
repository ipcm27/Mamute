package com.myCompany.Mamute.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Person {

    @Id
    private int id;

    private String name;
    private String location;
    private Date birth_date;



    @Override
    public String toString() {
        return "\n Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date_birth=" + birth_date +
                '}';
    }


}
