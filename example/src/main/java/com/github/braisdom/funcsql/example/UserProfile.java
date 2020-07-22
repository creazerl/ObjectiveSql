package com.github.braisdom.funcsql.example;

import com.github.braisdom.funcsql.annotations.DomainModel;
import com.github.braisdom.funcsql.annotations.Relation;
import com.github.braisdom.funcsql.relation.RelationType;
import com.github.braisdom.funcsql.relation.Relationship;
import lombok.Data;

@Data
@DomainModel
public class UserProfile {

    public static final Relationship RBE_USER = Relationship
            .createRelation(UserProfile.class, "user");

    private int id;
    private String name;
    private int userId;

    @Relation(relationType = RelationType.BELONGS_TO)
    private User user;

    @Override
    public String toString() {
        return "UserProfile{" +
                "name='" + name + '\'' +
                '}';
    }
}