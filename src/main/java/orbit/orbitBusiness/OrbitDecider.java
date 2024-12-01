package orbit.orbitBusiness;


import java.util.Map;
import java.util.Arrays;
import java.util.Objects;


public class OrbitDecider {


    private Orbit orbit;
    private OrbitConstructor orbitConstructor;


    public void orbitCaller(Map<String, Object> essentialRequirement){
        orbit.orbitChain(essentialRequirement);
    }


    public boolean checkResults(Map<String, Object> essentialRequirement) {
        return essentialRequirement.containsValue(null) || orbitConstructorCaller(essentialRequirement);
    }


    private boolean orbitConstructorCaller(Map<String, Object> essentialRequirement) {
        Object[] results = getValues(essentialRequirement);
        if (Arrays.stream(results).noneMatch(value -> Objects.deepEquals(value, null))){
            return orbitConstructor.result(results);
        }
        return Boolean.TRUE;
    }


    private Object[] getValues(Map<String, Object> essentialRequirement) {
        Object benefit = essentialRequirement.get("BenefitRequired");
        Object locked = essentialRequirement.get("LockRequired");
//        Object chained = essentialRequirement.get("ChainRequired");

        return new Object[]{benefit, locked};
    }


    public void setOrbitDecider(OrbitConstructor orbitConstructor, Orbit orbit) {
        this.orbit = orbit;
        this.orbitConstructor = orbitConstructor;
    }


}
