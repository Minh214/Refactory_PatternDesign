public class Main {
    public static void main(String[] args) {
        ArrayList<Country> countries = new ArrayList<Country>();
	  countries.add(new Country("USA", "Washington D.C.", 328_200_000));
	  countries.add(new Country("Canada", "Ottawa", 37_000_000));
	  countries.add(new Country("Mexico", "Mexico City", 126_200_000));
	  countries.add(new Country("Brazil", "Brasília", 213_800_000));

        Country usa = countries.get(0);
        System.out.println(usa.getName()); // prints "USA"
        System.out.println(usa.getCapital()); // prints "Washington D.C."
        System.out.println(usa.getPopulation()); // prints 328200000
    }
}