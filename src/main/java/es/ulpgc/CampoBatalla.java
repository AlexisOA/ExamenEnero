package es.ulpgc;

public class CampoBatalla {
    public static String survivor(String campo) {
        if (numberOfBombsOrRefugees(campo, "#") == 0) return campo.replaceAll("[\\[\\]\\s]", "");
        if (numberOfBombsOrRefugees(campo, "[") == 1 && numberOfBombsOrRefugees(campo, "#") == 2) return "";
        if(numberOfBombsOrRefugees(campo, "[") >= 2 && numberOfBombsOrRefugees(campo, "#") >= 2) return verifyMoreRefugees(campo);
        return getRefugeesSaved(campo);
    }

    private static String getRefugeesSaved(String camp) {
        int corcheteInit = camp.indexOf("[");
        int corcheteFin = camp.indexOf("]");
        return camp.substring(corcheteInit + 1, corcheteFin);
    }

    public static int numberOfBombsOrRefugees(String camp, String character) {
        int posicion, cont = 0;
        posicion = camp.indexOf(character);
        while (posicion != -1) {
            cont++;
            posicion = camp.indexOf(character, posicion + 1);
        }
        return cont;
    }

    public static String verifyMoreRefugees(String campo) {
        int corcheteFin = campo.indexOf("]");
        String newCamp = campo.substring(corcheteFin+1).trim();
        if(numberOfBombsOrRefugees(newCamp, "#") == 0 || numberOfBombsOrRefugees(newCamp, "#") == 1) return getRefugeesSaved(newCamp);
        return "";
    }

}
