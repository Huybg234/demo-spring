package entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @Column(nullable = false)
    int id;

    @Column(name = "full_name", nullable = false)
    String fullName;

    @Column(name = "birthday", nullable = false)
    Date birthday;

    @Column(name = "hometown", nullable = false)
    String hometown;

    @Column(name = "class_name", nullable = false)
    String className;

    @Column(name = "gender", nullable = false)
    String gender;
}
