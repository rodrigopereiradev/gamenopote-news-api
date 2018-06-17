package br.com.gamenopote.gamenopotenewsapi.domains;

import br.com.gamenopote.gamenopotenewsapi.domains.commons.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "news_comment")
public class Comment extends BaseEntity {

    @Column(name = "comment_text")
    private String text;

    @Column(name = "comment_created_in")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdIn;

    @Column(name = "comment_updated_in")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedIn;

    @Column(name = "comment_is_enabled")
    private Boolean isEnabled;

    @ManyToOne()
    private User user;

    @ManyToOne
    private News news;

    public Comment(String text, Date createdIn, Date updatedIn, Boolean isEnabled, User user, News news) {
        this.text = text;
        this.createdIn = createdIn;
        this.updatedIn = updatedIn;
        this.isEnabled = isEnabled;
        this.user = user;
        this.news = news;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedIn() {
        return createdIn;
    }

    public void setCreatedIn(Date createdIn) {
        this.createdIn = createdIn;
    }

    public Date getUpdatedIn() {
        return updatedIn;
    }

    public void setUpdatedIn(Date updatedIn) {
        this.updatedIn = updatedIn;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;
        if (!super.equals(o)) return false;

        Comment comment = (Comment) o;

        if (text != null ? !text.equals(comment.text) : comment.text != null) return false;
        if (createdIn != null ? !createdIn.equals(comment.createdIn) : comment.createdIn != null) return false;
        if (updatedIn != null ? !updatedIn.equals(comment.updatedIn) : comment.updatedIn != null) return false;
        if (isEnabled != null ? !isEnabled.equals(comment.isEnabled) : comment.isEnabled != null) return false;
        if (user != null ? !user.equals(comment.user) : comment.user != null) return false;
        return news != null ? news.equals(comment.news) : comment.news == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (createdIn != null ? createdIn.hashCode() : 0);
        result = 31 * result + (updatedIn != null ? updatedIn.hashCode() : 0);
        result = 31 * result + (isEnabled != null ? isEnabled.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (news != null ? news.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                ", createdIn=" + createdIn +
                ", updatedIn=" + updatedIn +
                ", isEnabled=" + isEnabled +
                ", user=" + user +
                ", news=" + news +
                '}';
    }
}
