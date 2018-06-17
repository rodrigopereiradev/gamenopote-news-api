package br.com.gamenopote.gamenopotenewsapi.domains;

import br.com.gamenopote.gamenopotenewsapi.domains.commons.BaseEntity;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table
public class News extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "subtitle")
    private String subtitle;

    @Column(name = "news_created_in")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdIn;

    @Column(name = "news_updated_in")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedIn;

    @Column(name = "news_text", columnDefinition = "TEXT")
    private String text;

    @Column(name = "news_type")
    private NewsType type;

    @ManyToOne
    @JoinColumn
    private User user;

    @OneToMany(mappedBy = "news")
    private List<Comment> comments;

    @OneToMany
    @JoinColumn(name = "news_id")
    private List<Media> medias;

    @ElementCollection
    @Column(name = "news_tag_names")
    private List<String> tags;

    public News(String title, String subtitle, Date createdIn, Date updatedIn, String text, NewsType type, User user,
                List<Comment> comments, List<Media> medias, List<String> tags) {
        this.title = title;
        this.subtitle = subtitle;
        this.createdIn = createdIn;
        this.updatedIn = updatedIn;
        this.text = text;
        this.type = type;
        this.user = user;
        this.comments = comments;
        this.medias = medias;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public NewsType getType() {
        return type;
    }

    public void setType(NewsType type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;
        if (!super.equals(o)) return false;

        News news = (News) o;

        if (title != null ? !title.equals(news.title) : news.title != null) return false;
        if (subtitle != null ? !subtitle.equals(news.subtitle) : news.subtitle != null) return false;
        if (createdIn != null ? !createdIn.equals(news.createdIn) : news.createdIn != null) return false;
        if (updatedIn != null ? !updatedIn.equals(news.updatedIn) : news.updatedIn != null) return false;
        if (text != null ? !text.equals(news.text) : news.text != null) return false;
        if (type != news.type) return false;
        if (user != null ? !user.equals(news.user) : news.user != null) return false;
        if (comments != null ? !comments.equals(news.comments) : news.comments != null) return false;
        if (medias != null ? !medias.equals(news.medias) : news.medias != null) return false;
        return tags != null ? tags.equals(news.tags) : news.tags == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (subtitle != null ? subtitle.hashCode() : 0);
        result = 31 * result + (createdIn != null ? createdIn.hashCode() : 0);
        result = 31 * result + (updatedIn != null ? updatedIn.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (medias != null ? medias.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", createdIn=" + createdIn +
                ", updatedIn=" + updatedIn +
                ", text='" + text + '\'' +
                ", type=" + type +
                ", user=" + user +
                ", comments=" + comments +
                ", medias=" + medias +
                ", tags=" + tags +
                '}';
    }
}
