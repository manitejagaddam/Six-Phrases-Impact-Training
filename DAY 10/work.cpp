#include <iostream>
#include <vector>
#include <algorithm>
#include <random>
#include <unordered_set>
using namespace std;


void replaceDuplicates(vector <int> nums){
    // int n = nums.size();
    // for(int i = 0 ; i < n ; i++){
    //     for(int dup = i + 1 ; dup < n ; dup++){
    //         if(nums[dup] == -1) continue;
    //         if(nums[dup] == nums[i]) nums[dup] = -1;
    //     }
    // }

    // for(int i : nums) cout << i << " ";
    // cout << endl;

    // int dup = 0;
    // for(dup = 1 ; dup < n ; dup++){
    //     if(nums[dup] == -1) break;
    // }
    // cout << "Dup : " << dup << endl;
    // if(dup == n) return ;
    // for(int correct = dup + 1 ; correct < n ; correct++){
    //     if(nums[correct] != -1){
    //         swap(nums[correct], nums[dup]);
    //         dup++;
    //     }
    // }

    // for(int i : nums) cout << i << " ";
    // cout << endl;



    unordered_set<int> st;
    int corrIdx = 0;
    int n = nums.size();
    for(int idx = 0 ; idx < n ; idx++){
        if(st.find(nums[idx]) == st.end()){
            st.insert(nums[idx]);
            nums[corrIdx++] = nums[idx]; 
        }
    }

    int negMark = st.size();
    for(; negMark < n ; negMark++){
        nums[negMark] = -1;
    }

    for(int i : nums) cout << i << " ";
    cout << endl;
}


void rearrangeArray(vector<int> nums){
    vector<int> dup;
    for(int i : nums){
        if(i % 2 == 0) dup.push_back(i);
    }
    for(int i : nums){
        if(i % 2) dup.push_back(i);
    }
    for(int i : dup) cout << i << " ";
    cout << endl;
}


int main(){
    int n ;
    cin >> n;
    vector<int> nums(n);
    // int nums [10];
    
    for(int i = 0 ; i < n ; i++){
        nums[i] = rand() % 101;
    }
    
    for(int i : nums) cout << i << " ";
    cout << endl;
    
    // replaceDuplicates(nums);

    rearrangeArray(nums);

    // for(int i : nums) cout << i << " ";
    // cout << endl;

}