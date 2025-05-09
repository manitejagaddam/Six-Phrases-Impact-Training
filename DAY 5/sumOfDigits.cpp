#include <iostream>
using namespace std;

int main(){
    long n;
    cout << "Enter the number : ";
    cin >> n;
    int sum_of_digits = 0;
    long copy_num = n;
    while(copy_num){
        sum_of_digits += copy_num % 10;
        copy_num /= 10;
    }

    cout << "The sum of all the digits of the number " << n  << " is " << sum_of_digits;
}