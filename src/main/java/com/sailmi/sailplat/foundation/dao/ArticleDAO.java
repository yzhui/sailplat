package com.sailmi.sailplat.foundation.dao;

import com.sailmi.sailplat.core.base.GenericDAO;
import com.sailmi.sailplat.foundation.domain.Article;

import org.springframework.stereotype.Repository;

@Repository("articleDAO")
public class ArticleDAO extends GenericDAO<Article>
{
}
