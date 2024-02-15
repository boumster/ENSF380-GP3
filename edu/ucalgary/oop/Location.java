package edu.ucalgary.oop;

public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;
    private int occupantCount = 0;
    private int supplyCount = 0;

    public Location(String name, String address, int occupantCapacity, int supplyCapacity) {
        this.name = name;
        this.address = address;
        this.occupants = new DisasterVictim[occupantCapacity];
        this.supplies = new Supply[supplyCapacity];
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DisasterVictim[] getOccupants() {
        return this.occupants;
    }

    public void addOccupant(DisasterVictim victim) {
        if (occupantCount < occupants.length) {
            this.occupants[occupantCount++] = victim;
        } else {
            System.out.println("No more space for occupants");
        }
    }

    public void removeOccupant(DisasterVictim victim) {
        for (int i = 0; i < occupantCount; i++) {
            if (occupants[i].equals(victim)) {
                // Shift all elements to the left
                System.arraycopy(occupants, i + 1, occupants, i, occupantCount - i - 1);
                occupantCount--;
                break;
            }
        }
    }

    public Supply[] getSupplies() {
        return this.supplies;
    }

    public void addSupply(Supply supply) {
        if (supplyCount < supplies.length) {
            this.supplies[supplyCount++] = supply;
        } else {
            System.out.println("No more space for supplies");
        }
    }

    public void removeSupply(Supply supply) {
        for (int i = 0; i < supplyCount; i++) {
            if (supplies[i].equals(supply)) {
                // Shift all elements to the left
                System.arraycopy(supplies, i + 1, supplies, i, supplyCount - i - 1);
                supplyCount--;
                break;
            }
        }
    }
}