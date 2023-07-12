# 21 Card Game  
This repository contains a Java implementation of the 21 card game, also known as "Three-Card Trick" or "Three-Card Monte."  
In this game, a player is asked to select a card from three stacks of cards, three times, until the program figures out the chosen card.  

## Components  
The program consists of the following classes:  

- **Main**: This is the main class which orchestrates the whole game. It initializes a deck, distributes cards, accepts player input, and writes game logs.  
- **Card**: Class representing a playing card with a rank and suit.  
- **Deck**: Singleton class representing a deck of cards. It handles deck initialization, shuffling of cards, distributing cards and arranging them based on user choice.  
- **Queue**: A generic queue data structure implementation.  
- **Stack**: A generic stack data structure implementation.  

## Gameplay  
The game starts by displaying 21 random cards divided into three columns. The player is then asked to choose a card mentally and identify the column in which the card is located. This process is repeated three times, after which the program will determine the chosen card.  

## Logs  
All the game events are logged into a file. The log file name is a timestamp indicating the time the game started.  

## How to Run  
You must have Java installed to run this application. To compile and run, use the following commands:  

_javac Main.java_  
_java Main_   

You will be interacted through console prompts. Follow the prompts to play the game.  

## Future Work  
- Converting the console-based game into a graphical user interface (GUI) application using JavaFX. This will improve the user experience and make the game more interactive and visually appealing.  

##  Screenshots
### First pass
![First pass](./Screenshots/.png)
### Second pass
![Second pass](./Screenshots/.png)
### Thirs pass
![Third pass](./Screenshots/.png)
### Log file
![Log file](./Screenshots/.png)

## Contributions  
Contributions are welcome! Please fork this repository and open a pull request to add more features or fix issues.  

## License
__MIT__ © _Qosay Al-Shatel_
