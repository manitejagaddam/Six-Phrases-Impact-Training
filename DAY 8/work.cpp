
#include <bits/stdc++.h>
#include <iostream>
using namespace std;



// void print_n_to_1(int n){
//     if(n == 0) return;
//     cout << n << " ";
//     if(n < 0) print_n_to_1(n + 1);
//     else print_n_to_1(n - 1);
// }


// int fact_help(int n){
//     if(n == 2) return 2;
//     return n * fact_help(n - 1);
// }

// int fact(int n){
//     if(n < 0) return 0;
//     if(n == 1 || n == 0) return 1;
//     return fact_help(n);
// }

// int sum_digit(int n){
//     if(n == 0) return 0;
//     return (n % 10) + sum_digit(n / 10);
// }

// int sum_digit_wrapper(int n){
//     if(n < 0) n = -n;
//     if(n < 10) return n;
//     return sum_digit(n);
// }


// int power_helper(int base, int exp){
//     if(exp == 1) return base;
//     if(exp % 2 == 0){
//         return 1 * power_helper(base * base, exp / 2);
//     }else{
//         return base * power_helper(base * base, exp / 2);

//     }
// }

// double power(int base, int exp){
//     // bool flagBase = false;
//     bool flagExp = false;
//     if(exp < 0){
//         flagExp = true;
//         exp = -exp;
//     }
//     if(exp == 0) return 1;
//     if(exp == 1) return base;
//     if(base == 0 || base == 1) return base;
//     int ans = power_helper(base, exp);
//     if(flagExp) return (double)1 / ans;
//     else return ans;
//     // return power_helper(base, exp);
// }


// long long multiply_helper(int m, int n){
//     if(n == 0) return 0;
//     return m + multiply_helper(m, n - 1);
// }

// long long multiply(int m, int n){
//     int neg = 0;
//     if(m < 0) {
//         neg++; 
//         m = -m;
//     }
//     if(n < 0){
//         neg++; 
//         n = -n;
//     } 
//     if(m == 1) return n;
//     if(n == 1) return m;
//     if(m == 0 || n == 0) return 0;
//     long long ans = multiply_helper(m, n);
//     if(neg == 1) return -ans;
//     return ans;
// }


long long smallestNum(long long num){
    vector<int> freq(10, 0);
    long long copy_num = num;
    while(copy_num){
        freq[copy_num % 10]++;
        copy_num /= 10;
    }
    long long ans = 0;
    if(freq[0]){
        for(int i = 1 ; i < 10 ; i++){
            if(freq[i]){
                ans = i;
                freq[i]--;
                break;
            }
        }
    }

    for(int i = 0 ; i < 10 ; i++){
        while(freq[i]){
            ans *= 10;
            ans += i;
            freq[i]--;
        }
    }
    return ans;
}



// int no_digit(int n){
//     if(n == 0) return 0;
//     return 1 + no_digit(n / 10);
// }

// int no_digit_wrapper(int n){
//     if(n < 0) n = -n;
//     if(n == 0) return 0;
//     if(n < 10) return 1;
//     return no_digit(n);
// }


// void no_digit(int n, int & digits){
//     if(n == 0)return;
//     digits++;
//     no_digit(n / 10, digits);
// }

// int no_digit_wrapper(int n){
//     if(n < 0) n *= -1;
//     if(n < 10) return 1;
//     int digits = 0;
//     no_digit(n, digits);
//     return digits;
// }

int main(){
    // int n;
    // cin >> n;
    // print_n_to_1(n);
    
    // cout << sum_digit_wrapper(n);
    // int base, exp;
    // cout << "Enter the base : " ;
    // cin >> base;
    // cout << endl << "Enter the exp : ";
    // cin >> exp;
    // cout << endl;

    // cout << power(base, exp);
    // int m, n;
    // cin >> m >> n;
    // cout << multiply(m, n);

    long long num;
    cin >> num;
    cout << smallestNum(num);
    
    
    // int ans = fact(n);
    // ans != 0 ? cout << ans : cout << "Not Possible";
    return 0;
}



