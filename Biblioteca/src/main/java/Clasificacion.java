public enum Clasificacion {
    FILOSOFIA("Filosofía y Psicología"),
    RELIGION("Religión"),
    CIENCIASOCIALES("Ciencias Sociales"),
    LENGUA("Lengua"),
    MATEMATICA("Matemática"),
    CSNaturales("Ciencias Naturales"),
    TECNOLOGIA("Tecnología"),
    ARTE("Artes"),
    LITERATURA("Literatura"),
    HISTORIAGEOGRAFIA("Historia y Geografía");

    private final String nombre;
    Clasificacion(String nombre){this.nombre=nombre;}
    public String toString(){return this.nombre;}


}
