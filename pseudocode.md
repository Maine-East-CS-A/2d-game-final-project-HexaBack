# pseudocode

> for every item in the end of the row towards the beginning, if it's a zero, ignore it and move on, otherwise if it is a number, only move it back if there is a zero behind it. HOWEVER, if there is an identical number behind it, replace the current cell with a zero and multiply the cell behind by 2.

> The direction of traversing through the array's rows and columns will depend on the direction pressed on the keyboard, bc that's how 2048 works, but it is always in order of 'beginning of direction to end of direction', like AE keyframes.

> ~~after every move, check if ANY moves are possible anymore, and if impossible, flick the GameOver bool to TRUE, which then triggers the MainActivity loop to end and present the game over screen~~ after every move, Main will invoke Game's CheckForGameOver method, which as the name implies, checks if any more moves in any direction are possible (in one fell swoop by checking if any zeroes exist in the 2d array/matrix/table/nested array).