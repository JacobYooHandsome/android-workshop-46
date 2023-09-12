package com.example.demo_2340;



public class Dot {
    private float x, y;
    private int radius;
    private boolean isVisible;
    private static final long MAX_LIFETIME = 10000; // Time out after 10 seconds
    private long visibleStartTime;

    public Dot(float x, float y, int radius, long visibleStartTime) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isVisible = true;

        // TODO Record the time when the dot becomes visible
        this.visibleStartTime = visibleStartTime;

    }

    public boolean isExpired(long timer) {
        if (timer - this.visibleStartTime > MAX_LIFETIME) {
            return true;
        }
        return false;
        // TODO Check if the dot has exceeded its max lifetime
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setInvisible() {
        isVisible = false;
        radius = 0;
    }
}
