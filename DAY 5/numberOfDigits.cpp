#include <iostream>
#include <cmath>
using namespace std;


int main(){
    long n;
    cout << "Entered Number : ";
    cin >> n;
    // Using While Loop
    long copy_num = n;
    int length = 0;
    while(copy_num){
        length++;
        copy_num /= 10;
    }
    cout << "The Length of the Number entered " << n << " is " << length;
    cout << endl;
    
    
    // using Formula 
    int log_length = log10(n) + 1;
    cout << "The Length of the Number entered " << n << " is " << log_length;

}