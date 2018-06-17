package br.com.gamenopote.gamenopotenewsapi.domains;

import br.com.gamenopote.gamenopotenewsapi.domains.commons.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Email extends BaseEntity {

    @Column(name = "email_address")
    private String address;

    @Column(name = "person_id")
    @OneToOne(mappedBy = "email")
    private Person person;


}
