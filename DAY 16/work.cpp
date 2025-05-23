#include <bits/stdc++.h>
using namespace std;

using namespace std::chrono;






void sortSortedArrays(vector<int>& nums1, vector<int>& nums2) {
    int m = nums1.size();
    int n = nums2.size();

    vector<int> ans;

    int i = 0;
    int j = 0;

    while (i < m && j < n) {
        if (nums1[i] < nums2[j]) ans.push_back(nums1[i++]);
        else ans.push_back(nums2[j++]);
    }

    while (i < m) ans.push_back(nums1[i++]);
    while (j < n) ans.push_back(nums2[j++]);


    for (int i : ans) cout << i << " ";
    cout << endl;
}


void printVerticalTraversal(vector<vector<int>>& mat) {
    int m = mat.size();
    int n = mat[0].size();
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cout << mat[j][i] << " ";
        }cout << endl;
    }
}



void mergeSolver(vector<int> & nums1, vector<int> & nums2, vector<int> & ans, int m, int n){
    if(m < 0 && n < 0){
        // reverse(ans.begin(), ans.end());   // this is useful for head recursion as we are using tail recurssio we don't need it
        return;
    }
    else if(m < 0){
        // while(n >= 0) ans.push_back(nums2[n--]);
        // return;
        
        cout << "M has been copleted  " << endl;
        cout << "M : " << m << "  N : " << n << endl;
        ans.push_back(nums2[n]);
        mergeSolver(nums1, nums2, ans, m, n - 1);
        return;
        
    }
    else if(n < 0){
        // while(m >= 0) ans.push_back(nums1[m--]);
        // return;

        cout << "N has been copleted  ";
        cout << "M : " << m << "  N : " << n << endl;
        ans.push_back(nums1[m]);
        mergeSolver(nums1, nums2, ans, m - 1, n);
        return;
    }
    if(nums1[m] > nums2[n]){
        cout << "M : " << m << "  N : " << n << endl;
        mergeSolver(nums1, nums2, ans, m - 1, n);
        ans.push_back(nums1[m]);
    }else{
        cout << "M : " << m << "  N : " << n << endl;
        mergeSolver(nums1, nums2, ans, m, n - 1);
        ans.push_back(nums2[n]);
    }

}

void mergeHelper(vector<int> & nums1, vector<int> & nums2){
    int m = nums1.size();
    int n = nums2.size();
    vector<int> ans;
    mergeSolver(nums1, nums2, ans, m - 1, n - 1);

    for(int i : ans) cout << i << " ";
    cout << endl;
    return;
}









// void mergeElements(vector<int> & nums, vector<int> & temp, int m, int n, int mid){
//     // if(m < 0 && n < mid + 1) return;
//     // else if(m < 0){
//     //     mergeElements(nums, temp, m, n - 1, mid);
//     //     temp.push_back(nums[n]);
//     //     return;
//     // }else if(n < 0){
//     //     mergeElements(nums, temp, m - 1, n, mid);
//     //     temp.push_back(nums[m]);
//     //     return;
//     // }

//     // if(nums[m] > nums[n]){
//     //     mergeElements(nums, temp, m - 1, n, mid);
//     //     temp.push_back(nums[m]);
//     // }else{
//     //     mergeElements(nums, temp, m, n - 1, mid);
//     //     temp.push_back(nums[n]);
//     // }


//     if(m < 0 && n < mid + 1){
//         // reverse(ans.begin(), ans.end());   // this is useful for head recursion as we are using tail recurssio we don't need it
//         return;
//     }
//     else if(m < 0){
//         // while(n >= 0) ans.push_back(nums2[n--]);
//         // return;
        
//         // cout << "M has been copleted  " << endl;
//         // cout << "M : " << m << "  N : " << n << endl;
//         mergeElements(nums, temp, m, n - 1, mid);
//         temp.push_back(nums[n]);
//         return;
        
//     }
//     else if(n < mid + 1){
//         // while(m >= 0) temp.push_back(nums[m--]);
//         // return;

//         // cout << "N has been copleted  ";
//         // cout << "M : " << m << "  N : " << n << endl;
//         mergeElements(nums, temp, m - 1, n, mid);
//         temp.push_back(nums[m]);
//         return;
//     }
//     if(nums[m] > nums[n]){
//         // cout << "M : " << m << "  N : " << n << endl;
//         mergeElements(nums, temp, m - 1, n, mid);
//         temp.push_back(nums[m]);
//     }else{
//         // cout << "M : " << m << "  N : " << n << endl;
//         mergeElements(nums, temp, m, n - 1, mid);
//         temp.push_back(nums[n]);
//     }
// }


void mergeElements(vector<int> & nums, vector<int> & temp, int lptr, int rptr, int mid, int end){
    if(lptr > mid && rptr > end){
        return;
    }
    else if(lptr > mid){
        temp.push_back(nums[rptr]);
        mergeElements(nums, temp, lptr, rptr + 1, mid, end);
        return;
    }else if(rptr > end){
        temp.push_back(nums[lptr]);
        mergeElements(nums, temp, lptr + 1, rptr, mid, end);
        return;
    }
    if(nums[lptr] < nums[rptr]){
        temp.push_back(nums[lptr]);
        mergeElements(nums, temp, lptr + 1, rptr, mid, end);
    }else{
        temp.push_back(nums[rptr]);
        mergeElements(nums, temp, lptr, rptr + 1, mid, end);
    }
}

void mergeMixer(vector<int> & nums, int start, int mid, int end){
    cout << "Merge Mixer called" << endl;
    vector<int> temp;
    mergeElements(nums, temp, start, mid + 1, mid, end);
    cout << "Start : " << start << "     mid : " << mid << "   end : " << end << endl;
    cout << "org arr : ";
    for(int i = start ; i <= end ; i++) cout << nums[i] << " ";
    cout << endl;
    cout << "org arr Full Array : ";
    for(int i : nums) cout << i << " ";
    cout << endl;
    // reverse(temp.begin(), temp.end());
    cout << "temp arr : ";
    for(int i : temp ) cout << i << " ";
    cout << endl;
    for(int i = start ; i <= end ; i++){
        nums[i] = temp[i - start];
    }
    temp.clear();
}


void mergeSort(vector<int> & nums, int start, int end){
    if(start >= end) return;
    int mid = (start + end) / 2;
    cout << "Merger sort called with start : " << start  << " end : " << end << endl; 
    mergeSort(nums, start, mid);

    mergeSort(nums, mid + 1, end);

    mergeMixer(nums, start, mid, end);

    for(int i : nums) cout << i << " ";
    cout << endl;
}





// void quickSort(vector<int> nums){

// }




int main() {

    // Sort Sorted Arrays 

    vector<int> nums1 = { 11,22,32,45,66,78 };
    // vector<int> nums2 = { 7, 14, 22, 32, 35, 45};
    vector<int> nums2 = { 7, 14, 35, 41, 45, 67, 89, 91, 96 };
    vector<int> nums = {2,5,3,1,65,22,90,54,11,47};
    // sortSortedArrays(nums1, nums2);
    // mergeHelper(nums1, nums2);
    mergeSort(nums, 0, nums.size() - 1);

    // print Vertivcal traversal
    // vector<vector<int>> mat = {{1,2,3,4}, {5,6,7,8},{}}


}




