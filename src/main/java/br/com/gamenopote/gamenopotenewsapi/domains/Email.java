package br.com.gamenopote.gamenopotenewsapi.domains;

import br.com.gamenopote.gamenopotenewsapi.domains.commons.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Email extends BaseEntity {

    @Column(name = "email_address")
    private String address;

    @JoinColumn(name = "person_id")
    @OneToOne(mappedBy = "email")
    private Person person;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Email)) return false;
        if (!super.equals(o)) return false;

        Email email = (Email) o;

        if (address != null ? !address.equals(email.address) : email.address != null) return false;
        return person != null ? person.equals(email.person) : email.person == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Email{" +
                "address='" + address + '\'' +
                ", person=" + person +
                '}';
    }
}
