#include <bits/stdc++.h>
using namespace std;

vector<int> convertNumToArray(int n){
    vector<int> arr;
    while(n){
        arr.push_back(n % 10);
        n /= 10;
    }
    reverse(arr.begin(), arr.end());
    arr.push_back(0);
    return arr;
}



bool checkKeith(int n, vector<int> nums){
    int idx = 0;
    int len = nums.size();
    int sum = 0;
    for(int i : nums) sum += i;
    nums[nums.size() - 1] = sum;

    while(sum < n){
        int temp = nums[idx % len];
        sum *= 2;
        sum -= temp;
        nums[idx % len] = sum;
        idx++;
        for(int i : nums) cout << i << " ";
        cout << endl;
    }
    return sum == n;
}


int main(){
    int n;
    cin >> n;
    
    vector<int> nums = convertNumToArray(n);
    if(checkKeith(n, nums)) cout << "Keith Number";
    else cout << "Not a Keith Number";

}
