package com.codersee.jwtauth.repository

import com.codersee.jwtauth.model.Article
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class ArticleRepository {

    private val articles = listOf(
        Article(id = UUID.randomUUID(), title = "Article1", content = "Content1"),
        Article(id = UUID.randomUUID(), title = "Article2", content = "Content2")
    )

    fun findAll(): List<Article> = articles
}