#include <iostream>
using namespace std;

int main()
{
    int year;
    cout << "Enter year : ";
    cin >> year;

    if (year < 0)
    {
        cout << "Invalid year\n";
        return 0;
    }

    int s = 0, x = 0, i, j, month, startindex, noofdays = 0, counter, k;
    bool leapyear = false;

    if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0) || (year % 100 == 0 && year <= 1700))
    {
        leapyear = true;
    }

    for (j = min(2017, year); j < max(2017, year); j++)
    {
        if (j == 1752)
        {
            s += 355;
        }
        else if ((j % 400 == 0) || (j % 100 != 0 && j % 4 == 0) || (j % 100 == 0 && j <= 1700))
        {
            s += 366;
        }
        else
        {
            s += 365;
        }
    }

    for (month = 1; month <= 12; month++)
    {
        startindex = 0;
        switch (month)
        {
        case 1:
            cout << "January\n";
            noofdays = 31;
            break;
        case 2:
            cout << "February\n";
            noofdays = leapyear ? 29 : 28;
            break;
        case 3:
            cout << "March\n";
            noofdays = 31;
            break;
        case 4:
            cout << "April\n";
            noofdays = 30;
            break;
        case 5:
            cout << "May\n";
            noofdays = 31;
            break;
        case 6:
            cout << "June\n";
            noofdays = 30;
            break;
        case 7:
            cout << "July\n";
            noofdays = 31;
            break;
        case 8:
            cout << "August\n";
            noofdays = 31;
            break;
        case 9:
            cout << "September\n";
            noofdays = (year == 1752) ? 19 : 30;
            break;
        case 10:
            cout << "October\n";
            noofdays = 31;
            break;
        case 11:
            cout << "November\n";
            noofdays = 30;
            break;
        case 12:
            cout << "December\n";
            noofdays = 31;
            break;
        }

        x = 0;
        switch (month - 1)
        {
        case 12:
            x += 31;
        case 11:
            x += 30;
        case 10:
            x += 31;
        case 9:
            x += (year == 1752 ? 19 : 30);
        case 8:
            x += 31;
        case 7:
            x += 31;
        case 6:
            x += 30;
        case 5:
            x += 31;
        case 4:
            x += 30;
        case 3:
            x += 31;
        case 2:
            x += leapyear ? 29 : 28;
        case 1:
            x += 31;
        }

        if (year < 2017)
        {
            startindex = (0 - s + x) % 7;
        }
        else
        {
            startindex = (s + x) % 7;
        }
        if (startindex < 0)
        {
            startindex = 7 + startindex;
        }

        cout << "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n";
        counter = 1;

        for (i = 1; noofdays != 0; i++)
        {
            for (k = 0; k < 7; k++)
            {
                if (k < startindex || noofdays == 0)
                {
                    cout << "\t";
                }
                else if (k == startindex)
                {
                    startindex = -1;
                    cout << counter++ << "\t";
                    noofdays--;
                }
                else
                {
                    cout << counter++ << "\t";
                    if (year == 1752 && counter == 3 && month == 9)
                    {
                        counter = 14;
                    }
                    noofdays--;
                }
            }
            cout << "\n";
        }
    }
    return 0;
}