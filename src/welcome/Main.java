import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello there and welcome to jasmine makeover");

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter username"); 

        String userName = newScanner.nextLine();
        System.out.println("Welcome "+ userName);

        newScanner.close();
        
        // Initilizing the class story
        
        Story newStory = new Story();
        String country = GetRandomCountry();
        newStory.country = country ;
        newStory.year = GetYearForCountry(country); ;
        newStory.numberOfCharacters = GetAmountOfCharacterForCountry(country);

        System.out.println("Welcome to " + newStory.country + " in the year " + newStory.year + " the number of characters in the country is " + newStory.numberOfCharacters );

       // Initilizing the class storyCharacter

        StoryCharacter newStorycharacter = new StoryCharacter();
        String name = GetNameForCountry(country);
        newStorycharacter.name = name ;
        newStorycharacter.gender = GetGenderForName(name) ;
        newStorycharacter.hands = 2;
        newStorycharacter.legs = 2;
        newStorycharacter.height = GetHeightForName(name);
        newStorycharacter.hairColour = GetHairColourForName(name);
        newStorycharacter.eyeColour = GetEyeColourForName(name);
        newStorycharacter.bodyType = BodyTypeForName(name);
        newStorycharacter.skinTone = GetSkinToneForName(name);
        
        // Set clothing style based on gender
        if (newStorycharacter.gender.equals("Male")) {
        newStorycharacter.clothingStyle = "white shirt and white shorts";}
        else if (newStorycharacter.gender.equals("Female")) {
        newStorycharacter.clothingStyle = "white skirt";}
        else {
        newStorycharacter.clothingStyle = "white skirt";} // Optional: Handle other cases or defaults

        System.out.println("Name of the character is " + newStorycharacter.name + " and " + newStorycharacter.name);

        UserInput.main(args);

    }

    // Creating function to get random country

    public static String GetRandomCountry() {
        
        ArrayList<String> possibleCountries = new ArrayList<String>();
        possibleCountries.add("United Kingdom");
        possibleCountries.add("India");
        possibleCountries.add("France");
        possibleCountries.add("Germany");
        
        Random random = new Random();
        int index = random.nextInt(possibleCountries.size());
        
        return possibleCountries.get(index);
    }

    // Map each country to a specific year
    
    public static int GetYearForCountry(String country) {
        Map<String, Integer> countryYearMap = new HashMap<>();
        countryYearMap.put("United Kingdom", 2012);
        countryYearMap.put("India", 2013);
        countryYearMap.put("France", 2014);
        countryYearMap.put("Germany", 2015);

        // Return the year associated with the country
        return countryYearMap.getOrDefault(country, 0); // default to 0 if country not found
    }

    // Map each country to a specific amount of character
    public static int GetAmountOfCharacterForCountry(String country) {
        
        Map<String, Integer> countryAmountOfCharacterMap = new HashMap<>();
        countryAmountOfCharacterMap.put("United Kingdom", 2);
        countryAmountOfCharacterMap.put("India", 4);
        countryAmountOfCharacterMap.put("France", 3);
        countryAmountOfCharacterMap.put("Germany",2);

        // Return the amount of character associated with the country
        return countryAmountOfCharacterMap.getOrDefault(country, 0); // default to 0 if country not found
    }

    // Map each name with specific country

    public static String GetNameForCountry(String country) {
        
        Map<String, String> nameCountryMap = new HashMap<>();
        nameCountryMap.put("United Kingdom", new ArrayList<>(List.of("Alice", "Eliza")));
    nameCountryMap.put("India", new ArrayList<>(List.of("Maya", "Mayara", "Aman", "Nikhil")));
    nameCountryMap.put("France", new ArrayList<>(List.of("Louise", "Alba", "Jade")));
    nameCountryMap.put("Germany", new ArrayList<>(List.of("Jonas", "Lina")));
    
    Random random = new Random();
    ArrayList<String> names = nameCountryMap.getOrDefault(country, new ArrayList<>());
   
    // Return the name  with the country
    return names.isEmpty() ? "Name not found" : names.get(random.nextInt(names.size()));
 }

}

    // Map each name with gender
    
    public static String GetGenderForName(String name) {
        
        Map<String, String> genderNameMap = new HashMap<>();
        genderNameMap.put("Alice", "Female");
        genderNameMap.put("Eliza","Female");
        genderNameMap.put("Maya","Female");
        genderNameMap.put("Mayara", "Female");
        genderNameMap.put("Aman","Male");
        genderNameMap.put("Nikhil","Male");
        genderNameMap.put("Louise","Female");
        genderNameMap.put("Alba","Female");
        genderNameMap.put("Jade","Male");
        genderNameMap.put("Jonas","Male");
        genderNameMap.put("Lina","Female");
        
        // Return the gender associated with the name
        return genderNameMap.getOrDefault(name, "no gender found"); // default to 0 if country not found
        
    }

    // Map each height with specific name

    public static Double GetHeightForName(String name) {
        
        Map<String ,Double> nameCountryMap = new HashMap<>();
        nameCountryMap.put("Alice", 5.4);
        nameCountryMap.put("Eliza", 5.5);
        nameCountryMap.put("Maya", 5.1);
        nameCountryMap.put("Mayara",5.2);
        nameCountryMap.put("Aman",5.7);
        nameCountryMap.put("Nikhil",5.6);
        nameCountryMap.put("Louise",5.7);
        nameCountryMap.put("Alba",5.7);
        nameCountryMap.put("Jade",5.9);
        nameCountryMap.put("Jonas",5.10);
        nameCountryMap.put("Lina",5.5);

        // Return the height associated with the name
        return nameCountryMap.getOrDefault(name, (double) 0); // default to 0 if country not found
        
    }

    // Map each name with specific hair colour

    public static String GetHairColourForName(String name) {
        
        Map<String, String> hairColourNameMap = new HashMap<>();
        hairColourNameMap.put("Alice", "Light Brown");
        hairColourNameMap.put("Eliza","Burgandy");
        hairColourNameMap.put("Maya","Black");
        hairColourNameMap.put("Mayara", "Dark Brown");
        hairColourNameMap.put("Aman","Black");
        hairColourNameMap.put("Nikhil","Brown");
        hairColourNameMap.put("Louise","Pink");
        hairColourNameMap.put("Alba","Light Brown");
        hairColourNameMap.put("Jade","Dark Brown");
        hairColourNameMap.put("Jonas","Light Brown");
        hairColourNameMap.put("Lina","Brown");

        // Return the hair clor associated with the name
        return hairColourNameMap.getOrDefault(name, "no hair colour"); // default to 0 if country not found
        
    }

    // Map each eye colour with specific name
    
    public static String GetEyeColourForName(String name) {
        
        Map<String, String> eyeColourNameMap = new HashMap<>();
        eyeColourNameMap.put("Alice", "Light Brown");
        eyeColourNameMap.put("Eliza","Blue");
        eyeColourNameMap.put("Maya","Black");
        eyeColourNameMap.put("Mayara", "Dark Brown");
        eyeColourNameMap.put("Aman","Black");
        eyeColourNameMap.put("Nikhil","Brown");
        eyeColourNameMap.put("Louise","Green");
        eyeColourNameMap.put("Alba","Brown");
        eyeColourNameMap.put("Jade","Dark Brown");
        eyeColourNameMap.put("Jonas","Light Brown");
        eyeColourNameMap.put("Lina","Brown");

        // Return the eye colour associated with the name
        return eyeColourNameMap.getOrDefault(name, "no eye colour"); // default to 0 if country not found
        
    }

    // Map each body type with specific name

    public static String BodyTypeForName(String name) {
        
        Map<String, String> bodyTypeNameMap = new HashMap<>();
        bodyTypeNameMap.put("Alice", "Slim");
        bodyTypeNameMap.put("Eliza","Slim");
        bodyTypeNameMap.put("Maya","Skinny");
        bodyTypeNameMap.put("Mayara", "Slim");
        bodyTypeNameMap.put("Aman","Skinny");
        bodyTypeNameMap.put("Nikhil","Fat");
        bodyTypeNameMap.put("Louise","Skinny");
        bodyTypeNameMap.put("Alba","Slim");
        bodyTypeNameMap.put("Jade","Fat");
        bodyTypeNameMap.put("Jonas","Skinny");
        bodyTypeNameMap.put("Lina","Slim");


        // Return the body type associated with the name
        return bodyTypeNameMap.getOrDefault(name, "no body typegiven"); // default to 0 if country not found
        
    }

    // Map each skin tone with specific name

    public static String GetSkinToneForName(String name) {
        
        Map<String, String> skinToneNameMap = new HashMap<>();
        skinToneNameMap.put("Alice", "White");
        skinToneNameMap.put("Eliza","White");
        skinToneNameMap.put("Maya","Fair");
        skinToneNameMap.put("Mayara", "Dusky Brown");
        skinToneNameMap.put("Aman","Brown");
        skinToneNameMap.put("Nikhil","Brown");
        skinToneNameMap.put("Louise","White");
        skinToneNameMap.put("Alba","Fair");
        skinToneNameMap.put("Jade","White");
        skinToneNameMap.put("Jonas","Fair");
        skinToneNameMap.put("Lina","White");


        // Return the skin tone associated with the name
        return skinToneNameMap.getOrDefault(name, "no skin tone given"); // default to 0 if country not found
        
    }
}    
   