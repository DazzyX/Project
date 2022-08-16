package com.stream.setuphelper.models.dtos;

import javax.persistence.Column;
import javax.validation.constraints.*;

public class CreateTemplateDTO {

    @NotBlank
    @Size(min = 3, max = 50)
    private String name;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String img;

    public CreateTemplateDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
