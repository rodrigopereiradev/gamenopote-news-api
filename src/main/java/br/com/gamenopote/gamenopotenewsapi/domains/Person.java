package br.com.gamenopote.gamenopotenewsapi.domains;

import br.com.gamenopote.gamenopotenewsapi.domains.commons.BaseEntity;
import java.util.Arrays;
import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "person_image")
    private Byte[] image;

    @JoinColumn(name = "email_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Email email;

    public Person(String firstName, String lastName, Byte[] image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Person(String firstName, String lastName, Byte[] image, Email email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        if (!super.equals(o)) return false;

        Person person = (Person) o;

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(image, person.image)) return false;
        return email != null ? email.equals(person.email) : person.email == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", image=" + Arrays.toString(image) +
                ", email=" + email +
                '}';
    }
}
