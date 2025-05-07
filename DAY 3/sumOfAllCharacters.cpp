#include<iostream>
#include<algorithm>
#include<cmath>
#include<vector>
#include<string>
using namespace std;



int main() {
    int n;
    cout << "Enter the number :";
    cin >> n;


    // Approach - 01
    // 
    int len = log10(n) + 1;
    int sum = 0;
    int power = 1;

    while (len > 0) {
        int copy = n;
        cout << power << " -> ";
        if (power == 1) {
            while (copy > 0) {
                cout << copy % 10 << " ";
                sum += copy % 10;
                copy /= 10;
            }
            cout << endl;
        }
        else {
            while (copy >= pow(10, power - 1)) {
                cout << copy % int(pow(10, power)) << " ";
                sum += copy % int(pow(10, power));
                copy /= 10;
            }cout << endl;
        }
        power++;
        len--;
    }

    cout << sum;



    // Approach - 02

    // int len = log10(n) + 1;
    // int check_num = n;
    // int sum = 0;
    // while(check_num > 0){
    //     int copy = check_num;
    //     int power = 1;
    //     int inner_check_num = copy;
    //     while(inner_check_num){
    //         sum += copy % int(pow(10, power++));
    //         inner_check_num /= 10;
    //     }
    //     check_num /= 10;
    // }
    // cout << sum;

}