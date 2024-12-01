package base.designPattern.chapterOne.abstractFactoryDesignPattern.airPlaneEntity;

public non-sealed class Airbus extends AirPlaneFactory {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Airbus(){
        providerInstance(Airbus.class);
    }


}
