#include <bits/stdc++.h>
using namespace std;

using namespace std::chrono;



bool isPalindrome(string s, int first, int last){
    if(first > last) return false;
    while(first < last){
        if(s[first++] != s[last--]) return false;
    }
    return true;
}

void print(string s, int start, int end){
    for(int i = start ; i <= end; i++){
        cout << s[i];
    }cout << endl;
}

void checkThreePalindrome(string s){
    int n = s.length();
    if(n < 3) {
        cout << "Impossible";
        return;
    }
    // int left = 0;
    // int right = n - 1;

    // while(left < right){
    //     if((s[0] == s[left] && isPalindrome(s, 0, left )) && 
    //         (s[left+1] == s[right - 1] && isPalindrome(s, left + 1, right - 1)) && 
    //         (s[right] == s[n - 1] && isPalindrome(s, right, n - 1))){

    //         print(s, 0, left);
    //         print(s, left + 1, right - 1);
    //         print(s, right, n - 1);
    //         return;

    //     }
    //     left++;
    //     right--;
    //     while(left < n && s[0] != s[left] && !isPalindrome(s, 0, left)) left++; 
    //     while( right > 0 && s[right] != s[n - 1] && !isPalindrome(s, right, n - 1)) right--;
    // }

    for(int left = 0 ; left < n ; left++){
        if(s[0] != s[left] || !isPalindrome(s, 0, left)) continue; 

        for(int right = n - 1 ; right > left ; right--){
            // if(right < left + 1) break;
            cout << "left : " << left << " right : " << right << endl;
            if(s[right] != s[n - 1] || !isPalindrome(s, right, n - 1)) continue;
            if(isPalindrome(s, left + 1, right - 1)) {
                print(s, 0, left);
                print(s, left + 1, right - 1);
                print(s, right, n - 1);
                return;
            }
        }
    }

    cout << "Impossible";


}


void printRange(int start , int end){
    if(start > end){
        // cout << start << " ";
        return;
    }
    printRange(start + 2, end);
    cout << start << " ";
}
void printRangeReverse(int end){
    if(end < 0){
        // cout <<  << " ";
        return;
    }
    cout << end << " ";
    printRangeReverse(end - 2);
}


void revAddNum(int num, int & ans, int i, int j){
    if(i > log10(num) + 1|| j < 0) return;

    int len = log10(num) + 1;
    int mod = pow(10, i + 1);
    int exp = pow(10, j);
    int first = num % mod;
    // cout << "First : " << first << endl;
    first /= (mod / 10);
    cout << "First : " << first << endl;

    int last = num / exp;
    last = last % 10;
    cout << "Last : " << last << endl;
    int sum = first + last;

    ans *= 10;
    ans += sum;

    revAddNum(num, ans, i + 1, j - 1);



}

void prefixSumRec(vector<int> & nums, int i, int n){
    if(i == n) return;
    // if(i == 0) return;
    nums[i] = nums[i] + nums[ i - 1 ];
    prefixSumRec(nums, i + 1, n);
}


void rightPrefixSumRec(vector<int> & nums, int i, int sum){
    if(i < 0) return;
    int temp = nums[i];
    nums[i] = sum;
    sum += temp;
    rightPrefixSumRec(nums, i - 1, sum);
}

void printSeqNegPos(int n, int final){
    if(n < 0) {
        cout << n << " ";
        return;
    }
    cout << n << " ";
    printSeqNegPos(n - 5, final);
    cout << n << " ";
}

bool isPrime(int n, int i){
    if(n % 2 == 0 || n % 3 == 0) return false;
    if(n % i == 0) return false;
    if(i > sqrt(n)) return true;

    if(isPrime(n, i) && isPrime(n, i + 2)) return true;

    // for(int i = 5 ; i <= sqrt(n) ; i += 6){
    //     if(n % i == 0 && n % (i + 2) == 0) return false;
    // }
    return true;
}

int findNextPrimeNo(int n){
    while(true){
        if(isPrime(n, 5)) return n;
        // if(isPrime(n + 2)) return n + 2;
        n++;
    }
}

void recursive_while(int & n, int prime_no){
    if(n % prime_no) return;
    cout << prime_no << " ";
    n /= prime_no;
    recursive_while(n, prime_no);
}


void printPrimeFactors(int n, int prime_no){
    if(!n) return;
    // int count = 0;
    // while(n % prime_no == 0){
    //     cout << prime_no << " ";
    //     n /= prime_no;
    //     // count++;
    // }
    recursive_while(n, prime_no);
    prime_no = findNextPrimeNo(prime_no + 1);
    printPrimeFactors(n, prime_no);
    // if(prime_no == 2){
    //     printPrimeFactors(n , 3);
    // }else if(prime_no == 3){
    //     printPrimeFactors(n , 5);
    // }else{
    // }

}




void taylorSeries(double up, double down, int count, double & ans, int first, int second){
    if(count < 0) return ;
    ans +=(double) up / (double) down;


    cout << "Up / Down : " << up / down << "       Up : " << up << "     Down : " << down << "        Sum : " << ans << endl;
    // cout << second << endl;
    // cout << " Sum : " << ans << endl;
    
    taylorSeries(up * first, down * (second), count - 1, ans, first, second + 1);

}




bool containsDuplicates(string s, int i, int n){
    if(i == n) return false;
    if(i > 0 && s[i] == s[i - 1]) return true;
    if(containsDuplicates(s, i + 1, n)) return true;
    return false;
}

void removeDuplicatesHelper(string & s, string & temp, int idx, int n){
    if(idx == n){
        // reverse(temp.begin(), temp.end());
        s = temp;
        return;
    }
    if( (idx != n - 1 && s[idx] == s[idx + 1]) || (idx > 0 && s[idx] == s[idx - 1])) removeDuplicatesHelper(s, temp, idx + 1, n);
    else{
        temp += s[idx];
        removeDuplicatesHelper(s, temp, idx + 1, n);
    }
}

void removeDuplicates(string s){
    if(containsDuplicates(s, 0, s.length())){
        string temp = "";
        // cout << temp << endl;
        
        removeDuplicatesHelper(s, temp, 0, s.length());
        removeDuplicates(s);
        // cout << temp << endl;
    }
    cout << s << endl;
}


int main(){

    // string s;
    // cin >> s;
    // int m, n;
    // cin >> m >> n;
    
    
    // int n;
    // cin >> n;
    // int ans = 0;
    // revAddNum(n, ans, 0, log10(n));
    // cout << ans ;
    
    
    // vector<int> nums = {1,2,3,4,5};
    // prefixSumRec(nums, 1, nums.size());
    
    // rightPrefixSumRec(nums, nums.size() - 2, nums[nums.size() - 1]);
    // nums[nums.size() - 1] = 0;
    // for(_int i : nums) cout << i << " ";
    // cout << endl;
    
    
    // int n = 50;
    // cout << n << " ";
    // printSeqNegPos(n, n);
    // cout << n;
    
    // for(int i = 5 ; i < 100 ; i++){
        //     cout << i << " -> ";
        //     printPrimeFactors(i, 2);
        //     cout << endl;
        // }
        
        
        // if((n - m) % 2) m--;
        // printRange(m, n);
        // if(n % 2) n--;
        // printRangeReverse(n);
        
        
        // checkThreePalindrome(s);
        
        // double ans = 1.0;
        // double first;
        // double second;
        // cin >> first >> second;
        // taylorSeries(first, 1, second - 1, ans, first, 2);
        // cout << ans;

        string s;
        cin >> s;
        removeDuplicates(s);
        return 0;
    }









