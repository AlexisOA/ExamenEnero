package test;

public class CampoBatalla {
    public static String survivor(String campo) {
        if (campo.indexOf('#') == -1) return campo.replaceAll("[\\[\\]\\s]", "");
        return getRefugeesSaved(campo);
    }

    private static String getRefugeesSaved(String campo) {
        int corcheteInit = campo.indexOf("[");
        int corcheteFin = campo.indexOf("]");
        return campo.substring(corcheteInit + 1, corcheteFin);
    }
}
