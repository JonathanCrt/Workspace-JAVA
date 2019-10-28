package fr.upem.concurrence.exam;

public class Point {
    private int x;
    private int y;
    private final Object lock = new Object();

    public Point(int x, int y) {
        synchronized (lock) {
            this.x = x;
            this.y = y;
        }
    }

    public boolean isOrigin() {
        return x == 0 && y == 0;
    }

    public void addX(int dx) {
        synchronized (lock) {
            x = x + dx;
        }
    }

    public void addY(int dy) {
        synchronized (lock) {
            y = y + dy;
        }
    }

    public int getX() {
        synchronized (lock) {
            return x;
        }
    }

    public int getY() {
        synchronized (lock) {
            return y;
        }
    }

    @Override
    public String toString() {
        synchronized (lock) {
            return "(" + x + "," + y + ")";
        }
    }

    public static void main(String[] args) {
        Point p = new Point(0, 0);
        new Thread(() -> {
            for (;;) {
                synchronized (p.lock) {
                    p.addX(1);
                    p.addY(1);
                }
            }
        }).start();

        new Thread(() -> {
            for (;;) {
                synchronized (p.lock) {
                    p.addX(-1);
                    p.addY(-1);
                }
            }
        }).start();

        for (;;) {
            if (p.getX() != p.getY()) {
                System.out.println("C'est étrange, non?");
            }
            if (p.isOrigin()) {
                System.out.println("Retour à la case départ : " + p);
            }
        }
    }
}
