#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;



int sumOfRemainders(int num, int divisor){
    // int sum_of_no_till_num = (divisor * (divisor - 1)) / 2;
    
    // return sum_of_no_till_num * (num / divisor);

    int grp_sum = (divisor * (divisor - 1)) / 2;
    int no_groups = num / divisor;

    int remainder = num % divisor;

    int rem_sum = (remainder * (remainder + 1)) / 2;

    return (grp_sum * no_groups) + rem_sum;
}

int main(){
    int num, divisor;
    cout << "Enter the Number : ";
    cin >> num;
    cout << endl;
    cout << "Enter the Divisor : ";
    cin >> divisor;
    cout << endl;

    int sum_of_rem = sumOfRemainders(num, divisor);

    cout << "THE SUM OF REMAINDERS OF THE NUMBER " << num << " DIVISIBLE BY " << divisor << " IS " << sum_of_rem;
    return 0;
}