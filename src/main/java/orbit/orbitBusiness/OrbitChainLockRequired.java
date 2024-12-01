package orbit.orbitBusiness;


import java.util.Map;
import java.util.Base64;


public class OrbitChainLockRequired implements Orbit {


    private Orbit orbit;
    private OrbitDecider orbitDecider;


    public void setOrbitChainLockRequired(Orbit orbit, OrbitDecider orbitDecider) {
        this.orbit = orbit;
        this.orbitDecider = orbitDecider;
    }


    @Override
    public void orbitChain(Map<String, Object> values) {
        boolean containValue = values.containsKey("LockRequired");

        if (containValue) {setLockRequired(values);}

        if (orbitDecider.checkResults(values)) {orbit.orbitChain(values);}
    }

    private void setLockRequired(Map<String, Object> values) {
        values.putIfAbsent("LockRequired", Base64.getUrlEncoder());
    }

}
