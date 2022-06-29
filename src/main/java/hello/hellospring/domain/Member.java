package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {
//    @Column(name="username")
    private String name;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
