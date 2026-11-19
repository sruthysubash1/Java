package sef.module4.activity2;

    public class Person {

        private int weight;
        private float height;

        // TODO: Create getters and setters for weight and height
        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public float getHeight() {
            return height;
        }

        public void setHeight(float height) {
            this.height = height;
        }

        /**
         * TODO: Complete getBodyMassIndex(double weight, double height)
         * 1. Return "Invalid input" if weight <= 0, weight > 600, height <= 0, or height > 3.0
         * 2. Calculate BMI using: weight / (height * height)
         * 3. Return classification:
         *    - BMI < 18.5             -> "Underweight"
         *    - 18.5 <= BMI < 25       -> "Normal weight"
         *    - 25 <= BMI < 30         -> "Overweight"
         *    - BMI >= 30              -> "Obese"
         */
        public String getBodyMassIndex(double weight, double height) {
            if (weight <= 0 || weight > 600 || height <= 0 || height > 3.0) {
                return "Invalid input";
            }

            double bmi = weight / (height * height);

            if (bmi < 18.5) {
                return "Underweight";
            } else if (bmi < 25) {
                return "Normal weight";
            } else if (bmi < 30) {
                return "Overweight";
            } else {
                return "Obese";
            }
        }
    }