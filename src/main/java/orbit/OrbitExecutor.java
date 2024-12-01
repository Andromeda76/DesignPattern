package orbit;


import orbit.entity.SubstantialRequirement;
import orbit.orbitBusiness.*;


public class OrbitExecutor {


    public static void main(String[] args) {
        OrbitDecider orbitDecider = new OrbitDecider();
        SubstantialRequirement substantialRequirement = new SubstantialRequirement();
        OrbitChainLockRequired orbitChainLockRequired = new OrbitChainLockRequired();
        OrbitChainBenefitRequired orbitChainBenefitRequired = new OrbitChainBenefitRequired();

        OrbitConstructor orbitConstructor = OrbitConstructor.getInstance(orbitDecider);
        orbitDecider.setOrbitDecider(orbitConstructor, orbitChainBenefitRequired);

        orbitChainLockRequired.setOrbitChainLockRequired(orbitChainBenefitRequired, orbitDecider);
        orbitChainBenefitRequired.setOrbitChainBenefitRequired(orbitChainLockRequired, orbitDecider);

        substantialRequirement.setHasLocked(Boolean.TRUE);
        substantialRequirement.setIsChained(Boolean.TRUE);
        substantialRequirement.setHasBenefit(Boolean.TRUE);
        orbitConstructor.orbitObjectGenerator(substantialRequirement);

    }

}
