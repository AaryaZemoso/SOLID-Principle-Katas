package katas.christmas_light;

public interface ILights {
    void on(int startRow, int startColumn, int endRow, int endColumn);
    void off(int startRow, int startColumn, int endRow, int endColumn);
    void toggle(int startRow, int startColumn, int endRow, int endColumn);
    int countLights();
}
