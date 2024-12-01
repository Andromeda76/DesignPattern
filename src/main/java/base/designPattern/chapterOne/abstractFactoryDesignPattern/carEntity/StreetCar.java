package base.designPattern.chapterOne.abstractFactoryDesignPattern.carEntity;


import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;


@Table(name = "StreetCar", schema = "JDBC")
public final class StreetCar extends CarFactory
                    implements Serializable, Cloneable {

    @Id
    private Long id;

    private String model;

    private String driver;


    @MappedCollection(idColumn = "StreetCar_ID")
    private PersonOwner personOwner;



    public StreetCar() {
        providerInstance(StreetCar.class);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
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

    public PersonOwner getPersonOwner() {
        return personOwner;
    }

    public void setPersonOwner(PersonOwner personOwner) {
        this.personOwner = personOwner;
    }

    public String motorModel() {
        return "STREET_710";
    }


     public String wheelModel() {
        return "WH_STREET_710";
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
