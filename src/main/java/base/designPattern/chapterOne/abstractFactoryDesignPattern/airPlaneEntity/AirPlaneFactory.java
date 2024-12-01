package base.designPattern.chapterOne.abstractFactoryDesignPattern.airPlaneEntity;


import base.designPattern.chapterOne.abstractFactoryDesignPattern.type.Provider;


public sealed class AirPlaneFactory extends Provider permits Airbus {


    @Override
    public <T extends Provider> void providerInstance(Class<T> model) {
        System.out.println(model.getSimpleName());
    }


}
