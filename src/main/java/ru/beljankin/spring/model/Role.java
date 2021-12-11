package ru.beljankin.spring.model;



import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "rolesName")
    private String rolesName;

//    @ManyToMany(mappedBy = "roles")
//    private Set<Person> person;
//    @Transient
//    @ManyToMany(mappedBy = "t_role")

    @Transient
    @ManyToMany(mappedBy = "roleSet")
    @Column(name = "personSet")
    private Set<Person> personSet;

    public Role() {
    }

    public Role(String rolesName) {
        this.rolesName = rolesName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoles() {
        return rolesName;
    }

    public void setRoles(String rolesName) {
        this.rolesName = rolesName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rolesName='" + rolesName + '\'' +
                '}';
    }

    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void setPersonSet(Set<Person> person) {
        this.personSet = person;
    }

}
