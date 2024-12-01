package memento;

public class Star {
    private StarType starType;
    private int ageYears;
    private int massTons;

    public Star(StarType starType, int ageYears, int massTons){
        this.starType = starType;
        this.ageYears = ageYears;
        this.massTons = massTons;
    }

    public void timePasses(){
        ageYears *= 2;
        massTons *= 8;
        switch (this.starType){
            case SUN -> this.starType = StarType.RED_GIANT;
            case RED_GIANT -> this.starType = StarType.WHITE_DWARF;
            case SUPERNOVA -> this.starType = StarType.DEAD;
            case WHITE_DWARF -> this.starType = StarType.SUPERNOVA;
            case DEAD -> {
                ageYears *= 2;
                massTons = 0;
            }
        }
    }

    StarMemento getMemento(){
        var state = new StarMementoInternal();
        state.setAgeYears(this.ageYears);
        state.setStarType(this.starType);
        state.setMassTons(this.massTons);
        return state;
    }

    void setMemento(StarMemento starMemento){
        var state = (StarMementoInternal) starMemento;
        this.starType = state.getStarType();
        this.ageYears = state.getAgeYears();
        this.massTons = state.getMassTons();
    }


}
