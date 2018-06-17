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
    private Date created_in;

    @Column(name = "comment_updated_in")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_in;

    @Column(name = "comment_is_enabled")
    private Boolean isEnabled;

    @ManyToOne()
    @JoinColumn()
    private User user;

    @ManyToOne
    @JoinColumn
    private News news;

    public Comment(String text, Date created_in, Date updated_in, Boolean isEnabled, User user, News news) {
        this.text = text;
        this.created_in = created_in;
        this.updated_in = updated_in;
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

    public Date getCreated_in() {
        return created_in;
    }

    public void setCreated_in(Date created_in) {
        this.created_in = created_in;
    }

    public Date getUpdated_in() {
        return updated_in;
    }

    public void setUpdated_in(Date updated_in) {
        this.updated_in = updated_in;
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
        if (created_in != null ? !created_in.equals(comment.created_in) : comment.created_in != null) return false;
        if (updated_in != null ? !updated_in.equals(comment.updated_in) : comment.updated_in != null) return false;
        if (isEnabled != null ? !isEnabled.equals(comment.isEnabled) : comment.isEnabled != null) return false;
        if (user != null ? !user.equals(comment.user) : comment.user != null) return false;
        return news != null ? news.equals(comment.news) : comment.news == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (created_in != null ? created_in.hashCode() : 0);
        result = 31 * result + (updated_in != null ? updated_in.hashCode() : 0);
        result = 31 * result + (isEnabled != null ? isEnabled.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (news != null ? news.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                ", created_in=" + created_in +
                ", updated_in=" + updated_in +
                ", isEnabled=" + isEnabled +
                ", user=" + user +
                ", news=" + news +
                '}';
    }
}
