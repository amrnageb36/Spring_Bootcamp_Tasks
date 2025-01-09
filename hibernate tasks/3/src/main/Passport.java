package main;

import javax.persistence.*;

@Entity
@Table(name="passport")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name="person_id")
    private Person person_id;

    private String passport_number;

    private String expiry_date;

    public Passport(Person person_id, String passport_number, String expiry_date) {
        this.person_id = person_id;
        this.passport_number = passport_number;
        this.expiry_date = expiry_date;
    }

    public Passport() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Person person_id) {
        this.person_id = person_id;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }
}
