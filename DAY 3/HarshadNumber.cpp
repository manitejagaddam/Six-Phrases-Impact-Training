#include <iostream>
#include <algorithm>
using namespace std;

bool checkHarshad(int n){
    int dummy_num = n;
    int sod = 0; // sum of digits
    while(n){
        sod += n % 10;
        n /= 10;
    }
    return dummy_num % sod == 0;
}

int main(){
    int n;
    cout << "Enter the number to check the number is a Harshad's Number : ";
    cin >> n;
    if(checkHarshad(n)){
        cout << "The Number " << n << " is a Harshad's Number";
    }else{
        cout << "The Number " << n << " is not a Harshad's Number";
    }
}