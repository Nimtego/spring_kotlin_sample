package com.example.spring_kotlin_sample.repository

import com.example.spring_kotlin_sample.model.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ArticleRepository : JpaRepository<Article, Long> {
}