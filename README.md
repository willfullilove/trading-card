# TradingCardProject

In this project, you will practice using the List interface, the Comparable interface and the ArrayList class to manage a group of collectable trading cards.

Card.java

I. Design a class called Card in a file called Card.java. This class will hold four private fields, a constructor, and two public methods. This class will implement the Comparable interface with a Card generic. You should define your own class with a main method to test the methods that you write in Card.java.

II. Create four private fields for your class (name, nationality, yearBorn, yearDied). The descriptions of these variables are provided below. 

a.	The name variable is a String. It holds the name of the computer scientist featured on this card. 

b.	The nationality variable is a String. It holds a descriptor for the country of origin for the computer scientist featured on this card. 

c.	The yearBorn variable is an integer. It holds the year of birth of the computer scientist featured on this card. 

d.	The yearDied variable is an integer. It holds the year of death of the computer scientist featured on this card, or -1 if the computer scientist is still living. 

III. Write a simple constructor for the Card class. It should take in one argument for each field defined in the class, and then set them accordingly. 

IV. Write the following methods for the Card class.

a.	The compareTo method should take a Card object as an argument and return an integer. If the two Card objects being compared (this and the argument) have the same name value, return 0. If this is greater than the argument alphabetically, return 1. If this is less than the argument alphabetically, return -1. 

b.	The equals method should compare this Card to another Card and return a boolean. Its results should be consistent with compareTo. 

c.	The toString method takes no arguments and returns a String. The format of the String should be as appears in the examples below, and in general follow the pattern "name (yearBorn-yearDied) - nationality"

CardCollection.java

I.Design a class called CardCollection in a file called CardCollection.java. This class will hold two private fields, a constructor, and five public methods. You should define your own class with a main method to test the methods that you write in CardCollection.java, or use the test file provided at the end of this document. 

II. Create two private fields for your class (owner, myCollection). The descriptions of these variables are provided below.

a.	The owner variable is a String. It holds the name of the individual that owns the card collection. 

b.	The myCollection variable is a List of Card objects. It will hold all of the cards in an individual's card collection. 

III. Write a simple constructor for the CardCollection class. It should take in one String argument for the owner of the card collection, and set it accordingly. It should also declare a new ArrayList of Card objects and store that in the myCollection List.

IV. Write the following methods for the CardCollection class. 

a. The addCard method should take a Card object as an argument and return a boolean. This method should attempt to add the input Card to the current collection in the position that would put it in alphabetical order (hint: use the compareTo method that you wrote for Card). If the Card is not found in the collection, insert it in place and return true. If it is already in the collection, do not insert it and return false.

b. The removeCard method takes an integer argument and returns nothing. This method should simply remove the card specified by the integer index that has been provided as an input.

c.  The getSize method takes no arguments and returns an integer. This method should simply return the number of items in the current card collection.

d. The mergeCollections method takes a CardCollection argument and returns a List of Card objects. This method should remove items from the collection provided as an argument and attempt to insert them into the current collection. If the Card is not in the current collection, insert it in the proper position alphabetically. If it is already in the current collection, place it in a List of duplicate Card objects. This List should be returned after the input collection has been emptied.

e. The toString method takes no arguments and returns a String. The String produced should print the name of the owner underlined by one dash for each character in the owner's name. On a new line, the current card collection should be output, one Card description per line. An example has been shown below both as it should appear on screen, and as it should be stored in the output String. 
