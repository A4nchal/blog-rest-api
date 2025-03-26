package com.aanchal.blog_rest_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "posts",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = { "title" }
                )
        }
)
public class Post {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @NotEmpty(message = "title should not be null or empty")
    @Size(min=3, max=100, message = "title should be between 3 to 100 characters")
    @Column(name = "title", nullable = false)
    private String title;

    @NotEmpty(message = "description should not be null or empty")
    @Size(min=10, message = "description should be minimum 3 characters")
    @Column(name = "description", nullable = false)
    private String description;

    @NotEmpty(message = "content should not be null or empty")
    @Column(name = "content", nullable = false)
    private String content;


    @OneToMany(
            mappedBy = "post",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Comment> comments = new HashSet<>();
}
