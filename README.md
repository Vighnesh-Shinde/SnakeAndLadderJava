# SnakeAndLadderJava
# 🎲 Snake and Ladder Game in Java

This is a simple yet interactive **Snake and Ladder** game developed using Java. The project simulates the classic board game where players take turns rolling a dice to climb ladders and avoid snakes, aiming to reach the 100th block first.

---

## 📌 Features

- 🎮 Console-based multiplayer gameplay
- 🎲 Random dice roll simulation (1 to 6)
- 🐍 Snakes and 🪜 Ladders logic implemented
- 🔁 Replay chance on rolling a 6 or hitting a ladder
- 🏁 Automatic win detection when a player reaches 100
- 📍 Position updates after every round

---

## 🧠 How the Game Works

1. Players are asked to enter their names.
2. Each player needs to roll a dice by pressing `0` and hitting **Enter**.
3. A dice number is generated using the `Random` class.
4. The player moves forward based on the dice value.
5. Special conditions:
   - Player must roll a **1** to start the game.
   - Landing on a ladder base moves the player up.
   - Landing on a snake mouth sends the player back.
   - Rolling a **6** gives an extra turn.
6. The game continues until one player reaches **exactly 100**.
7. If the dice roll moves a player beyond 100, the move is ignored.
8. The game shows the current position of all players after each round.

---

## 🐍 Snakes and 🪜 Ladders Positions

### 🪜 Ladders (Good Luck!)
| From | To  |
|------|-----|
| 61   | 99  |
| 21   | 82  |
| 19   | 38  |
| 43   | 77  |
| 62   | 96  |
| 36   | 57  |
| 8    | 26  |
| 28   | 53  |
| 54   | 88  |
| 66   | 87  |
| 50   | 91  |

### 🐍 Snakes (Beware!)
| From | To  |
|------|-----|
| 47   | 4   |
| 37   | 7   |
| 52   | 11  |
| 63   | 17  |
| 97   | 27  |
| 58   | 40  |
| 74   | 35  |

---

## 🧾 Code Structure

### `SnakeLadderGame.java`

- **Class `Players`**:
  - Holds player data: name, current position, and start status.
  - `posi_change()` method handles dice rolling, position updates, snakes, and ladders.
  - Uses static method `random_number()` to simulate dice.

- **Class `SnakeLadderGame`**:
  - Accepts number of players and initializes them.
  - Runs the game loop and keeps updating players’ positions.
  - Declares winner and ends game when a player reaches 100.

---

## 📷 Assets

- 🖼️ `snake_ladder_board.png`  
  A visual representation of the Snake and Ladder board used in the game.

---

## 🛠️ How to Run the Program

Make sure Java is installed on your system. Then:

bash
`javac SnakeLadderGame.java
 java SnakeLadderGame`
## 👨‍💻 Author
## Vighnesh Shinde
A passionate Java developer and game logic designer.
This project was created as part of a programming practice session to understand basic game logic, condition checking, and Java OOP concepts.
