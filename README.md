
# Calendar Creator Programs Repository

This repository contains multiple implementations of a calendar program that prints the calendar for a given year. The program takes into account leap years and adjusts for the calendar changes that occurred in 1752, when 11 days were skipped in September during the adoption of the Gregorian calendar.

## Programs

The following implementations are provided:

1. **Calendar in Java (Calendar.java)**:
   - Implementation of the calendar in Java.
   - Uses standard input to accept a year from the user and prints the calendar for the year.
   - Handles leap years and the skipped days in September 1752.

2. **Calendar in C (Calendar.c)**:
   - Implementation of the calendar in C.
   - Prompts the user for a year and prints the calendar for that year.
   - Handles leap years and the peculiarities of September 1752.

3. **Calendar in C++ (Calendar.cpp)**:
   - A C++ version of the calendar program.
   - Works similarly to the C and Java implementations with leap year handling and adjustments for 1752.

4. **Calendar in Python (Calendar.py)**:
   - Implementation of the calendar in Python.
   - Accepts the year from the user and prints the calendar month by month, adjusting for leap years and the September 1752 skipped days.

## Usage

### Java
To compile and run the Java program:
```bash
javac Calendar.java
java Calendar
```

### C
To compile and run the C program:
```bash
gcc Calendar.c -o calendar
./calendar
```

### C++
To compile and run the C++ program:
```bash
g++ Calendar.cpp -o calendar
./calendar
```

### Python
To run the Python program:
```bash
python3 Calendar.py
```

## Special Cases

1. **Leap Years**:
   - The programs accurately detect leap years. A leap year occurs:
     - Every year divisible by 4 except for years divisible by 100, unless the year is also divisible by 400.
     - For years before the year 1700, leap year rules are slightly different to account for historical variations.

2. **September 1752**:
   - During the transition from the Julian calendar to the Gregorian calendar, the British Empire (including the American colonies) skipped 11 days in September 1752. The programs reflect this by displaying only 19 days for September 1752.

## Example Output

For **September 1752**, the output would look like:

```
September
Sun	Mon	Tue	Wed	Thu	Fri	Sat
		1	2	14	15	16
17	18	19	20	21	22	23
24	25	26	27	28	29	30
```

## License

This project is open-source and available under the MIT License. You are free to modify and distribute the code as long as you include the original license.
