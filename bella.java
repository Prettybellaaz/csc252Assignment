// Declare and initialize an array of integers
int[] numbers = {1, 2, 3, 4, 5};


// Declare and initialize a 2D array of strings
String[][] names = {
    {"John", "Mmesoma"},
    {"Kingsley", "Chibuzor"},
    {"Alice", "Bella"}
};


// Traverse a one-dimensional array
int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// Traverse a two-dimensional array
int[][] names = {
    {"John", "Mmesoma"},
    {"Kingsley", "Chibuzor"},
    {"Alice", "Bella"}
};
for (int i = 0; i < names.length; i++) {
    for (int j = 0; j < names[i].length; j++) {
        System.out.println(names[i][j]);
    }
}

// Concatenate elements of a string array into a single string
String[] words = {"Hello", "this", "is", "csc252", "assignment"};
StringBuilder concatenatedString = new StringBuilder();
for (String word : words) {
    concatenatedString.append(word).append(" ");
}
System.out.println(concatenatedString.toString().trim());
