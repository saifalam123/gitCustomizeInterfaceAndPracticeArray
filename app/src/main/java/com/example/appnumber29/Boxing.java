package com.example.appnumber29;

public class Boxing extends Sports {

    private int punchingPowerRequired;
    private int punchingSpeedRequired;
    private int costOfInsurance;

    public Boxing(String name , String rules , String uniform , int speedRequired , int powerRequired , int punchingPowerRequired , int punchingSpeedRequired , int costOfInsurance)
    {
        super(name , rules , uniform , powerRequired , speedRequired);

        this.punchingPowerRequired = punchingPowerRequired;
        this.punchingSpeedRequired = punchingSpeedRequired;
        this.costOfInsurance = costOfInsurance;


    }

    public int getPunchingPowerRequired() {
        return punchingPowerRequired;
    }

    public void setPunchingPowerRequired(int punchingPowerRequired) {
        this.punchingPowerRequired = punchingPowerRequired;
    }

    public int getPunchingSpeedRequired() {
        return punchingSpeedRequired;
    }

    public void setPunchingSpeedRequired(int punchingSpeedRequired) {
        this.punchingSpeedRequired = punchingSpeedRequired;
    }

    // Yeh wala method LifeInsurance ka jo kay Sports class ne implement kara hai tou boxing ne ne Sports Class ko extend kara iss liye wo bhi yeh method use kar sakta hai.
    @Override
    public double evaluteCostOfinsurance() {
        return costOfInsurance;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %d%n%s: %d" , super.toString() , "Punching Power Required" , getPunchingPowerRequired() ,
                "Punching Speed Required" , getPunchingSpeedRequired());
    }
}
