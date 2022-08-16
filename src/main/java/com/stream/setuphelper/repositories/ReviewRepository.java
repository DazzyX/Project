package com.stream.setuphelper.repositories;

import com.stream.setuphelper.models.ReviewEntity;
import com.stream.setuphelper.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository  extends JpaRepository<ReviewEntity, Long> {
}
