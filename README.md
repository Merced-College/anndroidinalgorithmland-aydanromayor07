[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23154059)
# AnnDroidInAlgotihmLand
a sample project to practice sorting and searching

🎵 Download Required Audio File

This project uses an audio file that is too large to store directly in the GitHub repository.
Please download the file from Google Drive before running the program.

Download the audio file here:

➡️ Download the required audio file from Google Drive

Instructions

Open the Google Drive folder using the link above.

Download the ZIP file that contains the audio file.

Extract (unzip) the file on your computer.

Place the extracted audio file into the project folder named content.

Download all of the whole content folder, and put this in your project.

<br>

Aydan Romayor

3/16/2026

Project setup and ran

Project setup completed successfully.

## Code Exploration

1. The src folder contains the actual java code of the program.

2. The content folder seems to contain assets like images for the program.

3. The uml file seems to contain a visualization of the structure of the program.

4. Projects often separate code and assets to make the files look cleaner and more readable for the user.


1. The main class contains the main method

2. When the program first runs, it opens a main menu for the player. It allows the player to either play the game or view the leaderboards.

3. When the program begins, objects that are created includes a JFrame and AppRouter


1. The LeaderboardPanel, MainMenuPanel and RabbitGamePanel classes seem to be responsible for drawing graphics.

2. The AppRouter and Assets class seem to be responsible for loading files/content.

3. The MainMenuPanel and RabbitGamePanel classes seem to be responsible for updating the graphics on screen. They call various functions called by the game logic.


1. The UML diagram shows a visualization of the structure of the program. It shows how the classe and assets interact with each other.

2. The AppRouter class seems to be the central class.

3. The AppRouter class "owns" the panel classes. The menu and game classes use assets, while the leaderboard class uses algorithms that parse score data.


1. The leaderboard.csv file holds the scores. 

2. Strings and integers are used to store the scores and the associated user.

3. The LeaderboardAlgorithms file seems to be the most logical place to implement the sorting algorithms.

## Sorting

1. The sorting code was added to the LeaderboardAlgorithms class.

2. The location was chosen because there were empty sorting functions that needed to be defined.

3. An ArrayList.


1. Selection Sort

2. The algorithm searches the array for the maximum score. It then swaps the current score with the maxmimum score, and then increments an index. It continues until it gets to the end of the array.

3. To verify, the program was ran, the scores were loaded, and "Top 20 (by score)" was selected in the leaderboards menu.

4. Same algorithm was used for the username sort. Verified with the "sort by username" button in the leaderboards menu.