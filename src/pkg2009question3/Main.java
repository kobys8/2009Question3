/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2009question3;

/**
 *
 * @author kms080
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BatteryCharger priusPrius = new BatteryCharger();
    }
}

class BatteryCharger 
{ 
    public BatteryCharger() {
        
    }
    /** rateTable has 24 entries representing the charging costs for hours 0 through 23. */ 
    private int[] rateTable = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60}; 
    /** Determines the total cost to charge the battery starting at the beginning of startHour. 
    * @param startHour the hour at which the charge period begins
    * Precondition: 0 ≤ startHour ≤ 23 
    * @param chargeTime the number of hours the battery needs to be charged
    * Precondition: chargeTime > 0 
    * @return the total cost to charge the battery
    */
    private int getChargingCost(int startHour, int chargeTime) {
        int totalCost = 0;
        for(int i = startHour; i < (startHour + chargeTime); i++) {
            totalCost += rateTable[i % 24];
        }
        System.out.println("The total cost for charging your battery from Hour " + startHour 
                + " to Hour " + (startHour + chargeTime) + " (which is a charge time of " + chargeTime + " hours), cost $" + totalCost);
        return totalCost;
    }
    /** Determines start time to charge the battery at the lowest cost for the given charge time. 
    * @param chargeTime the number of hours the battery needs to be charged
    * Precondition: chargeTime > 0 
    * @return an optimal start time, with 0 ≤ returned value ≤ 23 
    */ 
    public int getChargeStartTime(int chargeTime) {
        
    }
    // There may be instance variables, constructors, and methods that are not shown.
}