#include <bits/stdc++.h>
using namespace std;

void printNum(int n){
    switch (n)
    {
    case 1:
        cout << "one";
        break;
    case 2:
        cout << "two";
        break;
    case 3:
        cout << "three";
        break;
    case 4:
        cout << "four";
        break;
    case 5:
        cout << "five";
        break;
    case 6:
        cout << "six";
        break;
    case 7:
        cout << "seven";
        break;
    case 8:
        cout << "eight";
        break;
    case 9:
        cout << "nine";
        break;
    }
}

void cases(int n, int val){
    switch (n){
        case 1:
            printNum(val);
            break;
        case 2: 
            cout << " double ";
            printNum(val);
            break;
        case 3:
            cout << " triple ";
            printNum(val);
            break;
        case 4:
            cout << " double ";
            printNum(val);
            cout << " double ";
            printNum(val);
            break;
        case 5:
            cout << " double ";
            printNum(val);
            cout << " triple ";
            printNum(val);
            break;
        case 6:
            cout << " triple ";
            printNum(val);
            cout << " triple ";
            printNum(val);
            break;
        case 7:
            cout << " triple ";
            printNum(val);
            cout << " double ";
            printNum(val);
            cout << " double ";
            printNum(val);
            break;
        case 8:
            cout << " triple ";
            printNum(val);
            cout << " triple ";
            printNum(val);
            cout << " double ";
            printNum(val);
            break;
        case 9:
            cout << " triple ";
            printNum(val);
            cout << " triple ";
            printNum(val);
            cout << " triple ";
            printNum(val);
            break;
        case 10:
            cout << " triple ";
            printNum(val);
            cout << " triple ";
            printNum(val);
            cout << " double ";
            printNum(val);
            cout << " double ";
            printNum(val);
            break;    

    }
}


void printNumber(int n){
    int len = log10(n) + 1;
    while(n){
        int curr = n / pow(10, len--);
        int counter = 1;
        while(n / pow(10, len--) == curr){
            counter++;
        }
        cases(counter, curr);
        
    }
}



int main() {
    // int n;
    // cin >> n;
    // vector<int> nums(n);
    // vector<int> nums = {6,9,1,2,4,7};
    // int n = nums.size();

    // for (int i = 0; i < n; i++) {
    //     cin >> nums[i];
    // }
    // for(int i : nums){
    //     cout << i << " ";
    // }cout << endl;

    // int sum = 0;
    // for (int i : nums) {
    //     sum += i;
    // }

    // cout << "\nSum : " << sum << endl;
    // cout << "Average : " << fixed << setprecision(5) << static_cast<float>(sum) / n << endl;

    // for(int i = 0 ; i < n ; i++){
    //     nums[i] = sum - nums[i];
    // }

    // for(int i : nums){
    //     cout << i << " ";
    // }cout << endl;

    // int lsum = 0;
    // for(int i = 0 ; i < n ; i++){
    //     lsum += nums[i];
    //     nums[i] = sum - lsum;
    // }

    // for(int i : nums) cout << i << " ";
    // cout << endl;

    // int rsum = 0;
    // for(int i = n - 1 ; i >= 0 ; i--){
    //     rsum += nums[i];
    //     nums[i] = rsum - nums[i];
    // }

    // for(int i : nums) cout << i << " ";
    // cout << endl;


    long long num;
    cin >> num;
    printNumber(num);


    return 0;
}
