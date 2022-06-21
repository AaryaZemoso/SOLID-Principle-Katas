package katas.christmas_light;

public class VariableLight implements ILights {

    int light[][];

    VariableLight() {
        light = new int[1000][1000];
    }

    public void on(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] += 1;
            }
        }
    }

    public void off(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                if (this.light[i][j] > 0) {
                    this.light[i][j] -= 1;
                }
            }
        }
    }

    public void toggle(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] += 2;
            }
        }
    }

    public int countLights() {
        int _count = 0;
        for(int i=0;i<this.light.length;i++) {
            for (int j=0;j<this.light[i].length;j++){
                _count += light[i][j];
            }
        }

        return _count;
    }
}
