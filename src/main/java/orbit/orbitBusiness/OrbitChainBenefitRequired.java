package orbit.orbitBusiness;


import java.math.BigDecimal;
import java.util.Map;


public class OrbitChainBenefitRequired implements Orbit{

    private Orbit orbit;

    private OrbitDecider orbitDecider;


    public void setOrbitChainBenefitRequired(Orbit orbit, OrbitDecider orbitDecider) {
        this.orbit = orbit;
        this.orbitDecider = orbitDecider;
    }

    @Override
    public void orbitChain(Map<String, Object> values) {
         boolean contain = values.containsKey("BenefitRequired");

         if (contain) {benefitRequired(values);}

         if (orbitDecider.checkResults(values)){
             orbit.orbitChain(values);
         }
    }

    private void benefitRequired(Map<String, Object> values) {
        values.putIfAbsent("BenefitRequired", BigDecimal.valueOf(1000000L));
    }
}
