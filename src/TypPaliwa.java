// TypPaliwa.java

interface TypPaliwa {
    String getTypPaliwa();
}

class Diesel implements TypPaliwa {
    @Override
    public String getTypPaliwa() {
        return "Diesel";
    }
}

class Benzyna implements TypPaliwa {
    @Override
    public String getTypPaliwa() {
        return "Benzyna";
    }
}

class Elektryk implements TypPaliwa {
    @Override
    public String getTypPaliwa() {
        return "Elektryk";
    }
}
