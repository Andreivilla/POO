package dados;

import interfaces.Motor;

public enum PotenciaMotor {
    MOTOR10(new Motor() {
        @Override
        public double calculaFatorMotor() {
            return 0;
        }
    }),
    MOTOR12(new Motor() {
        @Override
        public double calculaFatorMotor() {
            return 0.06;
        }
    }),
    MOTOR14(new Motor() {
        @Override
        public double calculaFatorMotor() {
            return 0.09;
        }
    }),
    MOTOR16(new Motor() {
        @Override
        public double calculaFatorMotor() {
            return 0.11;
        }
    }),
    MOTOR18(new Motor() {
        @Override
        public double calculaFatorMotor() {
            return 0.14;
        }
    }),
    MOTOR20(new Motor() {
        @Override
        public double calculaFatorMotor() {
            return 0.17;
        }
    });

    private Motor motor;
    PotenciaMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }
}
