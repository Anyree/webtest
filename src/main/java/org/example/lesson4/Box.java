package org.example.lesson4;

public class Box {
    private Integer ballsCounter;

    public Box() {
        ballsCounter = 0;
    }

    public void addBall() {
        ballsCounter++;
    }

    public void removeBall() {
        if (ballsCounter == 0) {
            throw new NullPointerException("Мячей уже ноль!");
        }
        ballsCounter--;
    }

    public void shuffleBalls() throws ZeroBallsCountException {
        if (ballsCounter == 0) {
            throw new ZeroBallsCountException();
        }

        System.out.println("Мячи перемешаны");
    }

    public Integer getBallsCounter() {
        return ballsCounter;
    }
}
