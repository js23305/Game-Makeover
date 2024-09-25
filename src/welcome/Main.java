import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
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
        newStorycharacter.hairColor = GetHairColorForName(name);
        newStorycharacter.eyeColor = GetEyeColorForName(name);
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
        nameCountryMap.put("United Kingdom" , "Alice");
        nameCountryMap.put("United Kingdom" , "Eliza");
        nameCountryMap.put("India" , "Maya");
        nameCountryMap.put("India" , "Mayara");
        nameCountryMap.put("India" , "Aman");
        nameCountryMap.put("India" , "Nikhil");
        nameCountryMap.put("France" , "Louise");
        nameCountryMap.put("France" , "Alba");
        nameCountryMap.put("France" , "Jade");
        nameCountryMap.put("Germany" , "Jonas");
        nameCountryMap.put("Germany" , "Lina");

        // Return the name associated with the country
        return nameCountryMap.getOrDefault(country, "Name not found"); // default to 0 if country not found
        
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

    // Map each name with specific hair color

    public static String GetHairColorForName(String name) {
        
        Map<String, String> hairColorNameMap = new HashMap<>();
        hairColorNameMap.put("Alice", "Light Brown");
        hairColorNameMap.put("Eliza","Burgandy");
        hairColorNameMap.put("Maya","Black");
        hairColorNameMap.put("Mayara", "Dark Brown");
        hairColorNameMap.put("Aman","Black");
        hairColorNameMap.put("Nikhil","Brown");
        hairColorNameMap.put("Louise","Pink");
        hairColorNameMap.put("Alba","Light Brown");
        hairColorNameMap.put("Jade","Dark Brown");
        hairColorNameMap.put("Jonas","Light Brown");
        hairColorNameMap.put("Lina","Brown");

        // Return the hair clor associated with the name
        return hairColorNameMap.getOrDefault(name, "no hair color"); // default to 0 if country not found
        
    }

    // Map each eye color with specific name
    
    public static String GetEyeColorForName(String name) {
        
        Map<String, String> eyeColorNameMap = new HashMap<>();
        eyeColorNameMap.put("Alice", "Light Brown");
        eyeColorNameMap.put("Eliza","Blue");
        eyeColorNameMap.put("Maya","Black");
        eyeColorNameMap.put("Mayara", "Dark Brown");
        eyeColorNameMap.put("Aman","Black");
        eyeColorNameMap.put("Nikhil","Brown");
        eyeColorNameMap.put("Louise","Green");
        eyeColorNameMap.put("Alba","Brown");
        eyeColorNameMap.put("Jade","Dark Brown");
        eyeColorNameMap.put("Jonas","Light Brown");
        eyeColorNameMap.put("Lina","Brown");

        // Return the eye color associated with the name
        return eyeColorNameMap.getOrDefault(name, "no eye color"); // default to 0 if country not found
        
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
   