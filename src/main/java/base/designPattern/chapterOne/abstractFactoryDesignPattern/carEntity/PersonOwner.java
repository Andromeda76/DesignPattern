package base.designPattern.chapterOne.abstractFactoryDesignPattern.carEntity;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table(name = "PersonOwner", schema = "JDBC")
public class PersonOwner {


    @Id
    private Integer id;

    private String name;

    private String family;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
