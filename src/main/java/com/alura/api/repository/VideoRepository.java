package com.alura.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.api.model.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {}
