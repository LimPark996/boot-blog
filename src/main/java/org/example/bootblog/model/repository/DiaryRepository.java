package org.example.bootblog.model.repository;

import org.example.bootblog.model.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, String> {
    // uuid -> 자동정렬이 이상할 것 -> createdAt...
}
