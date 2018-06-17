package br.com.gamenopote.gamenopotenewsapi.domains;

import br.com.gamenopote.gamenopotenewsapi.domains.commons.BaseEntity;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "user_type")
    @Enumerated(EnumType.STRING)
    private UserType type;

    @Column(name = "user_created_in")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdIn;

    @Column(name = "user_updated_in")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_in;

    @Column(name = "user_is_enabled")
    private Boolean isEnabled;

    @JoinColumn(name = "person_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    @OneToMany(mappedBy = "user")
    @JoinColumn(name = "user_id")
    private List<Comment> comments;

    @OneToMany(mappedBy = "user")
    @JoinColumn(name = "user_id")
    private List<News> news;

    public User(String userName, String password, UserType type, Date createdIn, Date updated_in,
                Boolean isEnabled, Person person, List<Comment> comments, List<News> news) {
        this.userName = userName;
        this.password = password;
        this.type = type;
        this.createdIn = createdIn;
        this.updated_in = updated_in;
        this.isEnabled = isEnabled;
        this.person = person;
        this.comments = comments;
        this.news = news;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public Date getCreatedIn() {
        return createdIn;
    }

    public void setCreatedIn(Date createdIn) {
        this.createdIn = createdIn;
    }

    public Date getUpdated_in() {
        return updated_in;
    }

    public void setUpdated_in(Date updated_in) {
        this.updated_in = updated_in;
    }

    public Boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (type != user.type) return false;
        if (createdIn != null ? !createdIn.equals(user.createdIn) : user.createdIn != null) return false;
        if (updated_in != null ? !updated_in.equals(user.updated_in) : user.updated_in != null) return false;
        if (isEnabled != null ? !isEnabled.equals(user.isEnabled) : user.isEnabled != null) return false;
        if (person != null ? !person.equals(user.person) : user.person != null) return false;
        if (comments != null ? !comments.equals(user.comments) : user.comments != null) return false;
        return news != null ? news.equals(user.news) : user.news == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (createdIn != null ? createdIn.hashCode() : 0);
        result = 31 * result + (updated_in != null ? updated_in.hashCode() : 0);
        result = 31 * result + (isEnabled != null ? isEnabled.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (news != null ? news.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", createdIn=" + createdIn +
                ", updated_in=" + updated_in +
                ", isEnabled=" + isEnabled +
                ", person=" + person +
                ", comments=" + comments +
                ", news=" + news +
                '}';
    }
}
