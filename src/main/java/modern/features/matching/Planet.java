package modern.features.matching;

public class Planet {

    enum SingleUsePlastic{
        CUP,STRAW,BOTTLE
    }

    int getDamageToPlanetWithoutPattern(SingleUsePlastic plastic){
        int damage = -1;
        switch (plastic){
            case CUP:
                damage = 100;
                break;
            case STRAW:
                damage = 200;
                break;
            case BOTTLE:
                damage = 300;
                break;
        }
        return damage;
    }

    int getDamageToPlanetWithPattern(SingleUsePlastic plastic){
        return switch (plastic){
            case CUP, STRAW -> 100;
           case BOTTLE -> 300;
        };
    }
}
