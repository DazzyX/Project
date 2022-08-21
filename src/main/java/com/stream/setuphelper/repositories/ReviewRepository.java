package com.stream.setuphelper.repositories;

import com.stream.setuphelper.models.ReviewEntity;
import com.stream.setuphelper.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository  extends JpaRepository<ReviewEntity, Long> {
}
