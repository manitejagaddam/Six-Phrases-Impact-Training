#include <iostream>
#include <vector>
#include <algorithm>
#include <random>
using namespace std;




int main(){
    int n;
    cin >> n;
    vector<int> nums(n);
    for(int i = 0 ; i < n ; i++){
        nums[i] = rand() % 11;
    }
    
    for(int i : nums) cout << i << " ";
    cout << endl;
    for(int i = 0 ; i < n ; i++){
        for(int dup = i + 1 ; dup < n ; dup++){
            if(nums[dup] == -1) continue;
            if(nums[dup] == nums[i]) nums[dup] = -1;
        }
    }

    for(int i : nums) cout << i << " ";
    cout << endl;

    int dup = 0;
    for(dup = 1 ; dup < n ; dup++){
        if(nums[dup] == -1) break;
    }
    cout << "Dup : " << dup << endl;
    if(dup == n) return 0;
    for(int correct = dup + 1 ; correct < n ; correct++){
        if(nums[correct] != -1){
            swap(nums[correct], nums[dup]);
            dup++;
        }
    }

    for(int i : nums) cout << i << " ";
    cout << endl;

}