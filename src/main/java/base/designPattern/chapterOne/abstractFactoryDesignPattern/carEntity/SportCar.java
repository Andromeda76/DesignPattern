package base.designPattern.chapterOne.abstractFactoryDesignPattern.carEntity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "SportCar", schema = "JDBC")
public final class SportCar extends CarFactory implements
            Serializable, Cloneable {

    @Id
    @GenericGenerator(name = "sequence_generator",
            strategy = "enhanced-sequence",
            parameters = {
                    @Parameter(
                            name = "sequence_name",
                            value = "SportCar_SEQ"
                    ),
                    @Parameter(
                            name = "initial_value",
                            value = "1"
                    ),
                    @Parameter(
                            name = "increment_size",
                            value = "1"
                    )})
    @GeneratedValue(generator = "sequence_generator")
    private Long id;

    private String model;

    private String driver;


    @Serial
    @Version
    private static final long serialVersionUID = 1L;


    public SportCar() {
        providerInstance(SportCar.class);
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println(serialVersionUID);
        return super.clone();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        System.out.println("Start ...");
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }


    public String motorModel() {
        System.out.println("MOTO_GP_511");
        return "MOTO_GP_511";
    }


    public String wheelModel() {
        System.out.println("MOTO_WH_511");
        return "MOTO_WH_511";
    }



}
