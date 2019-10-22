package com.geely.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * 手记备忘录管理者
 */
public class ArticleMementoManager {

    /**
     * 用栈保存备忘录，先进后出
     */
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();

    /**
     * 时间最近的先出栈
     */
    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento) {
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }

}
