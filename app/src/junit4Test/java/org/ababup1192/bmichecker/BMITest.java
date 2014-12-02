package org.ababup1192.bmichecker;

import com.uphyca.testing.AndroidTestCase;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BMITest extends AndroidTestCase {

    @Test
    public void testGetHeightByCentimeter() throws Exception {
        BMI bmi = BMI.createFromCentimeter(170f, 60.0f);

        assertThat(bmi.getHeight(), is(1.7f));
    }

    @Test
    public void testGetHeightByMeter() throws Exception {
        BMI bmi = BMI.createFromMeter(1.7f, 60.0f);

        assertThat(bmi.getHeight(), is(1.7f));
    }

    @Test
    public void testGetWeightByCentimeter() throws Exception {
        BMI bmi = BMI.createFromCentimeter(170.0f, 60.0f);

        assertThat(bmi.getWeight(), is(60.0f));
    }

    @Test
    public void testGetWeightByMeter() throws Exception {
        BMI bmi = BMI.createFromMeter(1.7f, 60.0f);

        assertThat(bmi.getWeight(), is(60.0f));
    }

    @Test
    public void testGetBMIByCentimeter() throws Exception {
        BMI bmi = BMI.createFromCentimeter(170.0f, 60.0f);

        assertThat(Math.abs(bmi.getBMI() - 20.761245675) < 1.0f, is(true));
    }

    @Test
    public void testGetBMIByMeter() throws Exception {
        BMI bmi = BMI.createFromMeter(1.7f, 60.0f);

        assertThat(Math.abs(bmi.getBMI() - 20.761245675) < 1.0f, is(true));
    }

    @Test
    public void testGetIdealWeightByMeter() throws Exception {
        BMI bmi = BMI.createFromMeter(1.7f, 60.0f);

        assertThat(Math.abs(bmi.getIdealWeight() - (63.58f)) < 1.0f, is(true));
    }

    @Test
    public void testGetIdealWeightByCentimeter() throws Exception {
        BMI bmi = BMI.createFromCentimeter(170.0f, 60.0f);

        assertThat(Math.abs(bmi.getIdealWeight() - (63.58f)) < 1.0f, is(true));
    }

}