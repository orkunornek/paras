package com.parasticaret.api.model.sitemodels;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class SlideShow {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String photoUrl;
    private String redirectUrl;
    private boolean isActive;

    public SlideShow(Long id, String description, String photoUrl, String redirectUrl, boolean isActive) {
        this.id = id;
        this.description = description;
        this.photoUrl = photoUrl;
        this.redirectUrl = redirectUrl;
        this.isActive = isActive;
    }

    public SlideShow() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlideShow slideShow = (SlideShow) o;
        return isActive == slideShow.isActive && Objects.equals(id, slideShow.id)
                && Objects.equals(description, slideShow.description)
                && Objects.equals(photoUrl, slideShow.photoUrl) && Objects.equals(redirectUrl, slideShow.redirectUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, photoUrl, redirectUrl, isActive);
    }
}
