package org.ababup1192.bmichecker;

public class BMI {

    private float height;
    private float weight;

    public BMI(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public float getBMI() {
        if (height == 0) {
            return 0.0f;
        } else {
            return weight / (height * height);
        }
    }

}
