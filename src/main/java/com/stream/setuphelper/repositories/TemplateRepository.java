package com.stream.setuphelper.repositories;

import com.stream.setuphelper.models.TemplateEntity;
import com.stream.setuphelper.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TemplateRepository  extends JpaRepository<TemplateEntity, Long> {
    Optional<TemplateEntity> findByName(String name);
}
