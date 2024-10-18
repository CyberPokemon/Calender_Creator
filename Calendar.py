def print_calendar(year):
    if year < 0:
        print("Invalid year")
        return

    s = 0
    leapyear = False

    if (year % 400 == 0) or (year % 100 != 0 and year % 4 == 0) or (year % 100 == 0 and year <= 1700):
        leapyear = True

    for j in range(min(2017, year), max(2017, year)):
        if j == 1752:
            s += 355
        elif (j % 400 == 0) or (j % 100 != 0 and j % 4 == 0) or (j % 100 == 0 and j <= 1700):
            s += 366
        else:
            s += 365

    for month in range(1, 13):
        startindex = 0
        noofdays = 0

        if month == 1:
            print("January")
            noofdays = 31
        elif month == 2:
            print("February")
            noofdays = 29 if leapyear else 28
        elif month == 3:
            print("March")
            noofdays = 31
        elif month == 4:
            print("April")
            noofdays = 30
        elif month == 5:
            print("May")
            noofdays = 31
        elif month == 6:
            print("June")
            noofdays = 30
        elif month == 7:
            print("July")
            noofdays = 31
        elif month == 8:
            print("August")
            noofdays = 31
        elif month == 9:
            print("September")
            noofdays = 19 if year == 1752 else 30
        elif month == 10:
            print("October")
            noofdays = 31
        elif month == 11:
            print("November")
            noofdays = 30
        elif month == 12:
            print("December")
            noofdays = 31

        x = 0
        if month > 1:
            if month - 1 >= 12: x += 31
            if month - 1 >= 11: x += 30
            if month - 1 >= 10: x += 31
            if month - 1 >= 9: x += 19 if year == 1752 else 30
            if month - 1 >= 8: x += 31
            if month - 1 >= 7: x += 31
            if month - 1 >= 6: x += 30
            if month - 1 >= 5: x += 31
            if month - 1 >= 4: x += 30
            if month - 1 >= 3: x += 31
            if month - 1 >= 2: x += 29 if leapyear else 28
            if month - 1 >= 1: x += 31

        if year < 2017:
            startindex = (0 - s + x) % 7
        else:
            startindex = (s + x) % 7
        if startindex < 0:
            startindex += 7

        print("Sun\tMon\tTue\tWed\tThu\tFri\tSat")
        counter = 1

        while noofdays > 0:
            for k in range(7):
                if k < startindex or noofdays == 0:
                    print("\t", end="")
                elif k == startindex:
                    startindex = -1
                    print(f"{counter}\t", end="")
                    counter += 1
                    noofdays -= 1
                else:
                    print(f"{counter}\t", end="")
                    if year == 1752 and counter == 2 and month == 9:
                        counter = 14
                    else:
                        counter += 1
                    noofdays -= 1
            print()

year = int(input("Enter year: "))
print_calendar(year)