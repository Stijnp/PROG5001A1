# PROG5001 A1

## Pseudocode
### Algorithm 1
- Use scanner with prompt “input unit name” and save in unitName variable
- Use scanner with prompt “input student marks” which repeats 25 times and saves in the studentMarks array
- If input is not number between 0 and 100 do show error message, then allow for re-entering the mark
- Print unit name + studentMarks array
- Print max and min from studentMarks array

### Algorithm 2
Take in the studentMarks array
// Calculate mean
- int sum = Loop over values in studentMarks array and add them up
- double mean = sum/studentMarks.length
- Print the mean variable

// Calculate standard deviation
- for each number: subtract the Mean and square the result
- work out the mean of those squared differences
- take the square root of that.
- print the deviation variable