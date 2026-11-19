package sef.module4.activity2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class PersonTest {

        private Person person;

        @Before
        public void setUp() throws Exception {
            person = new Person();
        }

        @After
        public void tearDown() throws Exception {
            person = null;
        }

        @Test
        public void testGettersAndSetters() {
            person.setWeight(70);
            assertEquals(70, person.getWeight());

            person.setHeight(1.75f);
            assertEquals(1.75f, person.getHeight(), 0.001f);
        }

        @Test
        public void testGetBodyMassIndex() {
            // 1. Valid BMI categories
            // Underweight: 45 / (1.70 * 1.70) = 15.57 (< 18.5)
            assertEquals("Underweight", person.getBodyMassIndex(45, 1.70));

            // Normal weight: 65 / (1.70 * 1.70) = 22.49 (18.5 <= BMI < 25)
            assertEquals("Normal weight", person.getBodyMassIndex(65, 1.70));

            // Overweight: 80 / (1.70 * 1.70) = 27.68 (25 <= BMI < 30)
            assertEquals("Overweight", person.getBodyMassIndex(80, 1.70));

            // Obese: 100 / (1.70 * 1.70) = 34.60 (>= 30)
            assertEquals("Obese", person.getBodyMassIndex(100, 1.70));

            // 2. Boundary values (using height = 1.0 so BMI == weight)
            assertEquals("Underweight", person.getBodyMassIndex(18.4, 1.0));
            assertEquals("Normal weight", person.getBodyMassIndex(18.5, 1.0));
            assertEquals("Normal weight", person.getBodyMassIndex(24.9, 1.0));
            assertEquals("Overweight", person.getBodyMassIndex(25.0, 1.0));
            assertEquals("Overweight", person.getBodyMassIndex(29.9, 1.0));
            assertEquals("Obese", person.getBodyMassIndex(30.0, 1.0));

            // Valid upper limits (weight = 600, height = 3.0 -> BMI = 66.67 -> Obese)
            assertEquals("Obese", person.getBodyMassIndex(600, 3.0));

            // 3. Invalid inputs (zero, negative values, > 600 weight, > 3.0 height)
            assertEquals("Invalid input", person.getBodyMassIndex(0, 1.70));
            assertEquals("Invalid input", person.getBodyMassIndex(-50, 1.70));
            assertEquals("Invalid input", person.getBodyMassIndex(601, 1.70));
            assertEquals("Invalid input", person.getBodyMassIndex(70, 0));
            assertEquals("Invalid input", person.getBodyMassIndex(70, -1.70));
            assertEquals("Invalid input", person.getBodyMassIndex(70, 3.1));
        }
    }