public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() > 3 &&
                name.length() < 19 &&
                name.contains(" ") &&
                name.charAt(0) != ' ' &&
                name.charAt(name.length() - 1) != ' ') {
            return true;
        } else {
            return false;
        }
    }
}
