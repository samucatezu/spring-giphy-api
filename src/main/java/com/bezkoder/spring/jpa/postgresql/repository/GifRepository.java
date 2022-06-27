package com.bezkoder.spring.jpa.postgresql.repository;

import java.util.List;

import com.bezkoder.spring.jpa.postgresql.model.Gif;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GifRepository extends JpaRepository<Gif, Long> {
  List<Gif> findByTitleContaining(String title);

}
