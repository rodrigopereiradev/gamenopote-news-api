package br.com.gamenopote.gamenopotenewsapi.domains;

import br.com.gamenopote.gamenopotenewsapi.domains.commons.BaseEntity;
import javax.persistence.*;

@Entity
@Table(name = "media")
public class Media extends BaseEntity {

    @Column(name = "media_url")
    private String url;

    @Column(name = "media_type")
    @Enumerated(EnumType.STRING)
    private MediaType type;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MediaType getType() {
        return type;
    }

    public void setType(MediaType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Media)) return false;
        if (!super.equals(o)) return false;

        Media media = (Media) o;

        if (url != null ? !url.equals(media.url) : media.url != null) return false;
        return type == media.type;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Media{" +
                "url='" + url + '\'' +
                ", type=" + type +
                '}';
    }
}
