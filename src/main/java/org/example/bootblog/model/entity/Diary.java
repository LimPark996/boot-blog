package org.example.bootblog.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity // JPA
@Data // Lombok - Getter, Setter, 생성자
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String uuid;
    @Column(nullable = false)
    String title;
    @Column(nullable = false, length = 2000)
    String content;
    @CreatedDate
    LocalDateTime createdAt;
}
