package com.aanchal.blog_rest_api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
    name="comments"
)
public class Comment {
    @Id
    @GeneratedValue(
                    strategy= GenerationType.IDENTITY
    )
    private Long id;

    @NotEmpty(message = "name should not be null or empty")
    private String name;

    @NotEmpty(message = "email should not be null or empty")
    @Email(message = "email should be valid")
    private String email;

    @NotEmpty(message = "body should not be null or empty")
    @Size(min=10, message = "body should be min 10 characters")
    private String body;

    @JsonIgnore
    @ManyToOne(
            fetch=FetchType.LAZY
    )
    @JoinColumn(
            name="post_id",
            nullable=false
    )
    private Post post;
}
