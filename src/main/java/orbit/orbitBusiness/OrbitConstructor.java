package orbit.orbitBusiness;


import java.util.Map;
import java.util.HashMap;
import orbit.entity.SubstantialRequirement;


public class OrbitConstructor {


    private final OrbitDecider orbitDecider;


    public void orbitObjectGenerator(SubstantialRequirement requirement) {
        Map<String, Object> serviceMap = new HashMap<>();
        if (requirement.getHasBenefit()){
            serviceMap.put("BenefitRequired", null);
        }
        if (requirement.getHasLocked()){
            serviceMap.put("LockRequired", null);
        }
        if (!requirement.getIsChained()){
            serviceMap.put("ChainRequired", null);
        }

        orbitDecider.orbitCaller(serviceMap);
    }


    public boolean result(Object[] objects) {
        for (Object object : objects) {
            System.out.println(object);
        }
        System.out.println("\s");
        System.out.println("END OF ORBIT CHAIN <GOOD_LOCK>");
        return Boolean.FALSE;
    }

    private OrbitConstructor(OrbitDecider orbitDecider){
        this.orbitDecider = orbitDecider;
    }

    public static OrbitConstructor getInstance(OrbitDecider orbitDecider){
        return new OrbitConstructor(orbitDecider);
    }

}
