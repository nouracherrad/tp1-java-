# LAP1 poo java

## Table of Contents
1. [Introduction](#introduction)
2. [Exercise 1: Student Grades Management](#exercise-1-student-grades-management)
   - [Class: `gerernote`](#class-gerernote)
3. [Exercise 2: Verb Conjugation](#exercise-2-verb-conjugation)
   - [Class: `conjugaison`](#class-conjugaison)
4. [Exercise 3: String Operations](#exercise-3-string-operations)
   - [Class: `operationSurChaine`](#class-operationsurchaine)
5. [Exercise 4: Letter Occurrences](#exercise-4-letter-occurrences)
   - [Class: `OccurrenceLettres`](#class-occurrencelettres)
6. [Conclusion](#conclusion)

## Introduction
This document outlines the implementation of various Java programs designed to perform specific operations related to student grades and string manipulations. Each program is structured in a class format, with distinct methods that encapsulate the functionalities required for the exercises.

## Exercise 1: Student Grades Management

### Class: `gerernote`

This class is responsible for managing student grades. It contains methods to sort grades, calculate the average grade, find the maximum and minimum grades, and count the number of  grades entered by the user.

#### Methods:
1. **`trierAfficher(float[] tab)`**: 
   - This method accepts an array of grades, sorts it in ascending order using `Arrays.sort()`, and returns the sorted array.
   
2. **`noteMoy(float[] tab)`**: 
   - It calculates and returns the average grade by summing all the grades in the array and dividing the sum by the number of grades.

3. **`affichermax(float[] tab)`**: 
   - This method iterates through the grades to find and return the maximum grade in the array.

4. **`affichermin(float[] tab)`**: 
   - Similar to `affichermax`, this method identifies and returns the minimum grade in the array.

5. **`nbrEtudiant(float[] tab)`**: 
   - It counts and returns the number of students who have non-zero grades entered in the array.

### Class: `Main`

This is the main class where the program execution starts. It prompts the user to enter grades, invokes the methods from the `gerernote` class to perform operations on the grades, and displays the results.



## Exercise 2: Verb Conjugation

### Class: `conjugaison`

This class is designed to handle the conjugation of regular French verbs of the first group (ending in "er"). It includes a method to conjugate the verb in the present tense.

#### Method:
1. **`conjuguer(String verbe)`**: 
   - This method checks if the entered verb ends with "er". If it does, it removes the "er" ending and constructs the present tense conjugation, displaying it for all pronouns. If the verb does not end with "er", it informs the user that the verb is not a first-group verb.

### Class: `Main`

In this class, the user is prompted to input a verb. The conjugation method from the `conjugaison` class is then called to display the present tense forms of the verb.



## Exercise 3: String Operations

### Class: `operationSurChaine`

This class provides various operations on a user-input string, including input, display, reversal, and word counting.

#### Methods:
1. **`saisir()`**: 
   - This method prompts the user to enter a string and stores it in the class variable. It confirms that the string has been successfully stored.

2. **`afficher()`**: 
   - It displays the currently stored string. If no string has been entered, it notifies the user accordingly.

3. **`inverser()`**: 
   - This method reverses the string and displays the reversed version. If no string is stored, it informs the user.

4. **`nbrMots()`**: 
   - It counts and returns the number of words in the string, treating spaces as separators. The method handles multiple consecutive spaces appropriately.

### Class: `Main`

This is the entry point of the program, providing a menu for the user to choose different string operations. Based on the user’s selection, it calls the appropriate methods from the `operationSurChaine` class and displays results.



## Exercise 4: Letter Occurrences

### Class: `OccurrenceLettres`

This class is designed to count the occurrences of each letter of the alphabet in a user-provided string, ignoring case differences.

#### Method:
1. **`compterOccurrences(String ch)`**: 
   - This method converts the input string to uppercase to ensure that letter case does not affect the count. It initializes an array to store the occurrences of each letter (from 'A' to 'Z'). It iterates through the string, updating the count for each letter found. Finally, it displays the count of each letter that appears at least once.

### Class: `Main`

In this class, the user is prompted to enter a line of text. The letter occurrence counting method from the `OccurrenceLettres` class is then called to display the occurrences of each letter in the input.


## Conclusion

The Java programs developed serve distinct purposes in managing student grades and performing string operations. Each program is structured into well-defined classes and methods, promoting modularity and reusability. This approach enhances the clarity and maintainability of the code.







