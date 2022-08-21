package com.stream.setuphelper.service;

import com.stream.setuphelper.models.TemplateEntity;
import com.stream.setuphelper.models.dtos.CreateTemplateDTO;
import com.stream.setuphelper.repositories.TemplateRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TemplateService {

    private TemplateRepository templateRepository;

    public boolean post(CreateTemplateDTO createTemplateDTO) {

        Optional<TemplateEntity> byName = this.templateRepository.findByName(createTemplateDTO.getName());

        if (byName.isPresent()) {
            return false;
        }

        TemplateEntity template = new TemplateEntity();

        if (!template.getName().contains("/")) {
            return false;
        }

        template.setName(createTemplateDTO.getName());
        template.setImg(createTemplateDTO.getImg());

        this.templateRepository.save(template);

        return true;
    }

    public List<TemplateEntity> getAllLocations() {
        List<TemplateEntity> templates  = new ArrayList<>();

        templateRepository.findAll()
                .forEach(templates::add);

        return templates;
    }
}
