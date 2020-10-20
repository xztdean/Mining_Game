package ca.cmpt276.as3.model;

public class GameConfig {
    private static GameConfig instance;

    private int mineNumber;
    private int width;
    private int height;

    public static GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }

    private GameConfig() {
    }

    public int getMineNumber() {
        return mineNumber;
    }

    public void setMineNumber(int mineNumber) {
        if (mineNumber <= 0) {
            throw new IllegalArgumentException("Number of Mine should be positive");
        }
        this.mineNumber = mineNumber;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width should be positive");
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height should be positive");
        }
        this.height = height;
    }
}
