package com.alura.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alura.api.model.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {}
