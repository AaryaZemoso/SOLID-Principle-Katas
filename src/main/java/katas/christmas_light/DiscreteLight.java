package katas.christmas_light;

public class DiscreteLight implements ILights {

    boolean light[][];

    DiscreteLight() {
        light = new boolean[1000][1000];
    }

    public void on(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] = true;
            }
        }
    }

    public void off(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] = false;
            }
        }
    }

    public void toggle(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] = !this.light[i][j];
            }
        }
    }

    public int countLights() {
        int _count = 0;
        for(int i=0;i<this.light.length;i++) {
            for (int j=0;j<this.light[i].length;j++){
                _count += light[i][j] ? 1 : 0;
            }
        }

        return _count;
    }
}
