public enum Curso {
    CUARTOA("4°A"),
    CUARTOB("4°B"),
    CUARTOC("4°C"),
    TERCEROA("3°A"),
    TERCEROB("3°B"),
    TERCEROC("3°C"),
    SEGUNDOA("2°A"),
    SEGUNDOB("2°B"),
    SEGUNDOC("2°C"),
    PRIMEROA("1°A"),
    PRIMEROB("1°B"),
    PRIMEROC("1°C"),
    OCTAVOA("8°A"),
    OCTAVOB("8°B"),
    OCTAVOC("8°C"),
    SEPTIMOA("7°A"),
    SEPTIMOB("7°B"),
    SEPTIMOC("7°C");

    private final String nombre;
    Curso(String nombre){this.nombre=nombre;}
    public String toString(){return this.nombre;}
}
