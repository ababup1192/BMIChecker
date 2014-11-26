package org.ababup1192.bmichecker;

public class BMI {

    private float height;
    private float weight;

    private BMI(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public static BMI createFromCentimeter(float height, float weight) {
        return new BMI(height / 100.0f, weight);
    }

    public static BMI createFromMeter(float height, float weight) {
        return new BMI(height, weight);
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

    public float getIdealWeight() {
        return 22.0f * height * height;
    }

}
