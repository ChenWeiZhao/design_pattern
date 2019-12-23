package com.chenwz.design.pattern.behavioral.memento;

/**
 * 手记
 */
public class Article {

    private String title;
    private String content;
    private String imgs;

    public Article(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    /**
     * 把当前实体转换为备忘录
     */
    public ArticleMemento saveToMemento() {
        return new ArticleMemento(this.title, this.content, this.imgs);
    }

    /**
     * 回退操作
     *
     * @param articleMemento 备忘录
     */
    public void undoFromMemento(ArticleMemento articleMemento) {

        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.imgs = articleMemento.getImgs();
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }
}
