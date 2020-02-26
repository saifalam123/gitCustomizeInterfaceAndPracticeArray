package com.example.appnumber29;

public class KickBoxing extends Boxing {

    private int kickPowerRequired;
    private int kickSpeedRequired;

    public KickBoxing(String name , String rules , String uniform , int speedRequired , int powerRequired , int punchingPowerRequired , int punchingSpeedRequired , int kickPowerRequired , int kickSpeedRequired , int costOfinsurance)
    {
        super(name , rules , uniform , speedRequired , powerRequired , punchingPowerRequired , punchingSpeedRequired , costOfinsurance  );
        this.kickPowerRequired = kickPowerRequired;
        this.kickSpeedRequired = kickSpeedRequired;
    }

    public int getKickPowerRequired() {
        return kickPowerRequired;
    }

    public void setKickPowerRequired(int kickPowerRequired) {
        this.kickPowerRequired = kickPowerRequired;
    }

    public int getKickSpeedRequired() {
        return kickSpeedRequired;
    }

    public void setKickSpeedRequired(int kickSpeedRequired) {
        this.kickSpeedRequired = kickSpeedRequired;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %d%n%s: %d" , super.toString() , "Kick power Required" , getKickPowerRequired() , "Kick speed Required" , getKickSpeedRequired());
    }

}
