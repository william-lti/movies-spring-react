package com.wmachado.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="reviews")
@Data //lombok
@AllArgsConstructor //lombok
@NoArgsConstructor //lombok
public class Review {
    private ObjectId id;
    private String body;
}
