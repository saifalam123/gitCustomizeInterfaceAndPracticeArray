package com.example.appnumber29;

public abstract class Sports implements LifeInsurance { //LifeInsurance contains an abstract method and it give an error if we don't put abstract keyword before class name!

    // to make this class a abstract class there is a reason because the sports it self is not a game, it contains game and the abstract class don't have any object thats why it extends to other class and call by there objects

    private String name;
    private String rules;
    private String uniform;
    int speedRequired;
    int powerRequired;

    public Sports(String name , String rules , String uniform , int speedRequired , int powerRequired)
    {
        this.name = name;
        this.rules = rules;
        this.uniform = uniform;
        this.speedRequired = speedRequired;
        this.powerRequired = powerRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }

    public int getSpeedRequired() {
        return speedRequired;
    }

    public void setSpeedRequired(int speedRequired) {
        this.speedRequired = speedRequired;
    }

    public int getPowerRequired() {
        return powerRequired;
    }

    public void setPowerRequired(int powerRequired) {
        this.powerRequired = powerRequired;
    }


    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %d%n%s: %d" , "Name" , getName() , "Rules" , getRules() ,
                "Uniform" , getUniform() , "Speed Required" , getSpeedRequired() , "Power Required" , getPowerRequired());
    }
}
