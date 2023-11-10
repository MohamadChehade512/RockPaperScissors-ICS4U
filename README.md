# RockPaperScissors-ICS4U

The provided Java code defines a Rock, Paper, Scissors game implemented with the Java Swing framework for graphical user interface development. The `RockPaperScissorsGame` class extends the `JFrame` class, creating a window to host the game's GUI components.

The constructor of the class sets up the JFrame with a title, size, default close operation, and layout. It initializes various GUI components, including buttons for playing against the computer or engaging in local multiplayer, a button for clearing choices, a quit button, a help button, and a label for displaying game results.

The code includes action listeners for each button. The "Play Against Computer" button prompts the user to select a choice through a dialog, generates a random choice for the computer, and displays the result. The "Local Multiplayer" button prompts two players to make choices and displays the outcome. The "Clear" button resets player choices and the result label. The "Quit" button exits the program, and the "Help" button displays a dialog with game instructions.

Two helper methods are present in the code. The `showChoiceDialog` method displays a dialog for player choice, presenting images for Rock, Paper, and Scissors. The `displayResult` method showcases the result of the game based on the choices made by the players.

The main method creates an instance of the `RockPaperScissorsGame` class and makes it visible using the SwingUtilities.invokeLater method. The game window provides users with an interactive interface, allowing them to make choices and receive feedback on the game's outcome. The inclusion of images for choices adds a visual element to the user experience, enhancing the overall design of the Rock, Paper, Scissors game.
