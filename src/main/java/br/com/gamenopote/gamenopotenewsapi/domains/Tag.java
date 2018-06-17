package br.com.gamenopote.gamenopotenewsapi.domains;

import br.com.gamenopote.gamenopotenewsapi.domains.commons.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "news_tag")
public class Tag extends BaseEntity {

    @Column(name = "tag_name")
    private String name;
}
