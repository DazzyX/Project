package com.stream.setuphelper.repositories;

import com.stream.setuphelper.models.TemplateEntity;
import com.stream.setuphelper.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TemplateRepository  extends JpaRepository<TemplateEntity, Long> {
    Optional<TemplateEntity> findByName(String name);
}
