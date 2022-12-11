package pt.uma.arq.entities;

import java.util.Comparator;

public class FleetComparatorByDamage implements Comparator<Ship> {
    @Override
    public int compare(Ship ship, Ship otherShip) {
        return ship.getDamage()-otherShip.getDamage();
    }
}
